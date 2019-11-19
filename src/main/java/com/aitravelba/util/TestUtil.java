package com.aitravelba.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * 
 * @author swiftwen
 * @date 2019年6月21日 下午5:51:13
 */
public class TestUtil {

	public static void main(String[] args)throws Exception {
		HttpUtil httpUtil = new HttpUtil();
		String url = "http://wxticket.cymss1109.cn";
		Map<String,String> paramMap = new HashMap<String,String>();
		Map<String,String> headers = new HashMap<String,String>();
		String body = "";
		//String s = httpUtil.httpPost(url, paramMap, headers, body);
		System.out.println("-----------");
		System.out.println("");
		
		
		
		 // 请求客户端及参数
	    CloseableHttpClient client = HttpClients.createDefault();
	    // Post请求
	    HttpPost httppost = new HttpPost(url);
	    //在这里我们给Post请求的头部加上User-Agent来伪装成微信内置浏览器
	    httppost.setHeader("User-Agent","Mozilla/5.0 (Linux; U; Android 2.3.6; zh-cn; GT-S5660 Build/GINGERBREAD) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1 MicroMessenger/4.5.255");
	    //这个是在网上看到的，要加上这个，避免其他错误
	    httppost.setHeader("Referer", "https://mp.weixin.qq.com");
	    //发送Post请求
	    CloseableHttpResponse response = client.execute(httppost);
	}
}
