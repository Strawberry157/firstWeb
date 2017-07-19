package com.sc.utils.payment.common;

public class Configure {	

	//这个就是自己要保管好的私有Key了（切记只能放在自己的后台代码里，不能放在任何可能被看到源代码的客户端程序中）
	// 每次自己Post数据给API的时候都要用这个key来对所有字段进行签名，生成的签名会放在Sign这个字段，API收到Post数据的时候也会用同样的签名算法对Post过来的数据进行签名和验证
	// 收到API的返回的时候也要用这个key来对返回的数据算下签名，跟API的Sign数据进行比较，如果值不一致，有可能数据被第三方给篡改
	
	//全球电动车网服务号appid
	public static String appid = "wxb02ef4ee668e125e";
	
	//微信商户号
	public static String mchid = "1302480901";
	
	//微信商户api密钥(MD5加密32位大写)
	public static String key = "4277939F6DC3464E77B8C27B69E4CE5F";
	
	//支付类型
	public static String trade_type ="JSAPI";

	//以下是几个API的路径：
	//1）同一下单接口
	public static String Unifiedorder_API = "https://api.mch.weixin.qq.com/pay/unifiedorder";

	//2）被扫支付查询API
	public static String PAY_QUERY_API = "https://api.mch.weixin.qq.com/pay/orderquery";

	//3）退款API
	public static String REFUND_API = "https://api.mch.weixin.qq.com/secapi/pay/refund";

	//4）退款查询API
	public static String REFUND_QUERY_API = "https://api.mch.weixin.qq.com/pay/refundquery";

	//5）撤销API
	public static String REVERSE_API = "https://api.mch.weixin.qq.com/secapi/pay/reverse";

	//6）下载对账单API
	public static String DOWNLOAD_BILL_API = "https://api.mch.weixin.qq.com/pay/downloadbill";

	//7) 统计上报API
	public static String REPORT_API = "https://api.mch.weixin.qq.com/payitil/report";
}
