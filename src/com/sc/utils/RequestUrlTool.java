package com.sc.utils;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


public class RequestUrlTool {
	public static String get(String url){
		
		CloseableHttpClient hc = HttpClients.createDefault();
		HttpGet get = new HttpGet(url.toString());
		get.addHeader("Content-Type", "text/html;charset=UTF-8");  
		
		CloseableHttpResponse resp;
		try {
			resp = hc.execute(get);
			if (resp.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				HttpEntity entity = resp.getEntity();
				String r = EntityUtils.toString(entity, "utf8");
				EntityUtils.consume(entity);
				return r;
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static String post(String contentType, String url,HttpEntity postEntity){
        String result = null;
		CloseableHttpClient hc = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url.toString());
        if(contentType!=null){
        	httpPost.addHeader("Content-Type", contentType);	
        }
        httpPost.setEntity(postEntity);

		CloseableHttpResponse response;
		try {
            response = hc.execute(httpPost);
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
	            HttpEntity entity = response.getEntity();
	            result = EntityUtils.toString(entity, "UTF-8");
            }
            return result;
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
            httpPost.abort();
        }
		return null;
	}
}
