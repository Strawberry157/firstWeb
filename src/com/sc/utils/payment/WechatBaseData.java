package com.sc.utils.payment;

import java.util.Date;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.sc.utils.RequestUrlTool;

public class WechatBaseData{

	/**
	 * 全球电动车网（服务号）
	 */
	public static final String APPID="wxb02ef4ee668e125e";//应用唯一标识
	public static final String APPSECRET="c40d292ed2e419dfc471911798b8995b";

	public static String accessToken;//接口调用凭证 可用code换取
	public static Date accessDate;//token有效期
	
	private static String ticket;	//公众号用于调用微信JS接口的临时票据，有效期为7200秒
	private static Date ticketDate;	//公众号用于调用微信JS接口的临时票据，有效期为7200秒

	public static String getAccessToken(){
		try {
			if (accessToken == null || accessToken == "") {
				setAccessToken(WechatBaseData.APPID,WechatBaseData.APPSECRET);
			} else {
				Date now = new Date();
				Long interval = (now.getTime() - WechatBaseData.accessDate.getTime()) / 1000;
				if (interval > 7000) {
					setAccessToken(WechatBaseData.APPID,WechatBaseData.APPSECRET);
				} 
			}
		} catch (Exception e) {
			accessToken=null;
		}
		return accessToken;
	}
	
	public static void setAccessToken(String ad,String as){
		String requestUrl = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=" + ad + "&secret=" + as;
		JSONObject jo=new JSONObject();
		try {
			jo = JSON.parseObject(RequestUrlTool.get(requestUrl));
			accessToken=jo.getString("access_token");
			accessDate = new Date();
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getTicket(){
		try {
			if (ticket == null) {
				setTicket(getAccessToken());
			} else {
				Date now = new Date();
				Long interval = (now.getTime() - ticketDate.getTime()) / 1000;
				if (interval > 7000) {
					setTicket(getAccessToken());
				} 
			}
		} catch (Exception e) {
			ticket=null;
		}
		return ticket;
	}

	public static void setTicket(String token){
		StringBuffer url = new StringBuffer("https://api.weixin.qq.com/cgi-bin/ticket/getticket");
		url.append("?access_token="+token);
		url.append("&type=jsapi");
		try {
			JSONObject jo = JSON.parseObject(RequestUrlTool.get(url.toString()));
			ticket=jo.getString("ticket");
			ticketDate=new Date();
		} catch (Exception e) {
			ticket=null;
		}
	}
}
