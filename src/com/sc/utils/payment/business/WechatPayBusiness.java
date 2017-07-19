package com.sc.utils.payment.business;

import static java.lang.Thread.sleep;

import java.io.UnsupportedEncodingException;

import org.apache.http.entity.StringEntity;
import org.slf4j.LoggerFactory;
import com.sc.utils.RequestUrlTool;
import com.sc.utils.payment.common.Configure;
import com.sc.utils.payment.common.Log;
import com.sc.utils.payment.common.Signature;
import com.sc.utils.payment.common.Util;
import com.sc.utils.payment.data.WCPayQueryReqData;
import com.sc.utils.payment.data.WCPayQueryResData;
import com.sc.utils.payment.data.WCPayReqData;
import com.sc.utils.payment.data.WCPayResData;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;

public class WechatPayBusiness {
	
    private static Log log = new Log(LoggerFactory.getLogger(WechatPayBusiness.class));
	
	public static WCPayResData unifiedorder(WCPayReqData wcPayReqData) throws UnsupportedEncodingException{
		
		
        //解决XStream对出现双下划线的bug
        XStream xStreamForRequestPostData = new XStream(new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_")));
        xStreamForRequestPostData.alias("xml",wcPayReqData.getClass());
        //将要提交给API的数据对象转换成XML格式数据Post给API
        String postDataXML = xStreamForRequestPostData.toXML(wcPayReqData);

        StringEntity postEntity = new StringEntity(postDataXML, "UTF-8");

        String result=RequestUrlTool.post("text/xml",Configure.Unifiedorder_API,postEntity);
        
        WCPayResData wcPayResData = (WCPayResData) Util.getObjectFromXML(result, WCPayResData.class);
        
        return wcPayResData;
//        return null;
	}
    public static WCPayQueryResData doPayQueryLoop(int loopCount, String outTradeNo,String appid,String mchid,String key) throws Exception {
    	//至少查询一次
        if (loopCount == 0) {
            loopCount = 1;
        }
        //进行循环查询
        WCPayQueryResData wcPayQueryResData=null;
        for (int i = 0; i < loopCount; i++) {
        	wcPayQueryResData=doOnePayQuery(outTradeNo,appid,mchid,key);
            if (wcPayQueryResData!=null) {
                return wcPayQueryResData;
            }
        }
        return null;
    }

    public static WCPayQueryResData doOnePayQuery(String outTradeNo,String appid,String mchid,String key) throws Exception {

        sleep(500);//等待一定时间再进行查询，避免状态还没来得及被更新

        String result;

        WCPayQueryReqData wcPayQueryReqData = new WCPayQueryReqData(appid,mchid,key,"",outTradeNo);
        
        XStream xStreamForRequestPostData = new XStream(new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_")));
        xStreamForRequestPostData.alias("xml",wcPayQueryReqData.getClass());
        //将要提交给API的数据对象转换成XML格式数据Post给API
        String postDataXML = xStreamForRequestPostData.toXML(wcPayQueryReqData);

        StringEntity postEntity = new StringEntity(postDataXML, "UTF-8");

        
        result = RequestUrlTool.post("text/xml",Configure.PAY_QUERY_API,postEntity);

        //将从API返回的XML数据映射到Java对象
        WCPayQueryResData wcPayQueryResData = (WCPayQueryResData) Util.getObjectFromXML(result, WCPayQueryResData.class);
        if (wcPayQueryResData == null || wcPayQueryResData.getReturn_code() == null) {
            log.i("支付订单查询请求逻辑错误，请仔细检测传过去的每一个参数是否合法");
            return null;
        }

        if (wcPayQueryResData.getReturn_code().equals("FAIL")) {
            //注意：一般这里返回FAIL是出现系统级参数错误，请检测Post给API的数据是否规范合法
            log.i("支付订单查询API系统返回失败，失败信息为：" + wcPayQueryResData.getReturn_msg());
            return null;
        } else {

            if (!Signature.checkIsSignValidFromResponseString(result,key)) {
                log.e("【支付失败】支付请求API返回的数据签名验证失败，有可能数据被篡改了");
                return null;
            }

            if (wcPayQueryResData.getResult_code().equals("SUCCESS")) {//业务层成功
                if (wcPayQueryResData.getTrade_state().equals("SUCCESS")) {
                    //表示查单结果为“支付成功”
                    log.i("查询到订单支付成功");
                    return wcPayQueryResData;
                } else {
                    //支付不成功
                    log.i("查询到订单支付不成功");
                    return null;
                }
            } else {
                log.i("查询出错，错误码：" + wcPayQueryResData.getErr_code() + "     错误信息：" + wcPayQueryResData.getErr_code_des());
                return null;
            }
        }
    }
}
