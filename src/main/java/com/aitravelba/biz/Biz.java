package com.aitravelba.biz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

public class Biz {

	public static String sendHttpRequestGetAccessToken(){
		String ans = "";
		String urlStr = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wx12e77add623d9a28&secret=b8d9e74db9fc78d1ec6b77d0ac1ec38f";
		URL url = null;
		BufferedReader in = null;
		
		try {
			url = new URL(urlStr);
			URLConnection conn = url.openConnection();
			conn.connect();
			in = new BufferedReader(new InputStreamReader(
                    conn.getInputStream()));
			String line = null;
			while((line=in.readLine())!=null){
				ans+=line;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		return ans;
	}
	public static String createMenu(){
		String ans=null;
		PrintWriter pw = null;
		String access_token = sendHttpRequestGetAccessToken();
		String[] tokens = access_token.split("\"");
		
		System.out.println(tokens[3]);
		String urlStr = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token="+tokens[3];
		String firstMenu = "{"
				+ "\"button\":"
				+ "{	\"type\":\"view\","
				+ "\"name\":\"今日歌曲\","
				+ " \"url\":\"http://www.soso.com/\""
				+ " }";
		URL url = null;
		URLConnection conn = null;
		try{
			url = new URL(urlStr);
			conn = url.openConnection();
			
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.connect();
			pw = new PrintWriter(conn.getOutputStream());
			//pw.print(firstMenu);
			pw.flush();
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line = null;
			while((line=br.readLine())!=null){
				ans+=line;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		return ans;
	}
}
