package com.aitravelba.util;

import java.util.HashMap;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aitravelba.dto.resp.baidu.GeneralBasicRespDto;
import com.baidu.aip.ocr.AipOcr;

/**
 * 百度图片识别
 * @author swiftwen
 * @date 2019年1月22日 下午7:30:42
 */
@Component
public class BaiDuPicRecognizeUtil {

	@Autowired
	private ImageEncoder imageEncoder;
	@Autowired
	private HttpUtil httpUtil;
	 //设置APPID/AK/SK
    public static final String APP_ID = "15469734";
    public static final String API_KEY = "beLf63yPOuR2Os9tZTt8bATp";
    public static final String SECRET_KEY = "cysZeRGNlesdEoNltLOpBQlOhWsgQmN6";
	//获取access_token接口
	//private final static String GET_ACCESS_TOKEN_URL = "https://aip.baidubce.com/oauth/2.0/token";
	
	//图片识别url
	//private final static String PIC_RECOGNIZE_URL = "https://aip.baidubce.com/rest/2.0/ocr/v1/general_basic";
	
	public GeneralBasicRespDto recognizePic(String imgUrl){
		AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);
		// 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);
        JSONObject res = client.basicGeneralUrl(imgUrl, new HashMap<String, String>());
        GeneralBasicRespDto resp = com.alibaba.fastjson.JSONObject.parseObject(res.toString(2), GeneralBasicRespDto.class);
        System.out.println(resp.toString());
        return resp;
	}
	
	public GeneralBasicRespDto recognizePicByBinaryData(byte[] data){
		AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);
		// 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);
        JSONObject res = client.basicGeneral(data, new HashMap<String, String>());
        //JSONObject res = client.basicGeneralUrl(imgUrl, new HashMap<String, String>());
        GeneralBasicRespDto resp = com.alibaba.fastjson.JSONObject.parseObject(res.toString(2), GeneralBasicRespDto.class);
        System.out.println(resp.toString());
        return resp;
	}
	/*public String getAccessToken(){
		String accessToken = "";
		Map<String,String> paramMap = new HashMap<String,String>();
		Map<String,String> headers = new HashMap<String,String>();
		String url = GET_ACCESS_TOKEN_URL + "?grant_type=client_credentials&client_id=beLf63yPOuR2Os9tZTt8bATp&client_secret=cysZeRGNlesdEoNltLOpBQlOhWsgQmN6";
		String body = "";
		try{
			String ret = new HttpUtil().httpPost(url, paramMap, headers, body);
			GetAccessTokenRespDto resp = JSONObject.parseObject(ret, GetAccessTokenRespDto.class);
			accessToken = resp.getAccessToken();
		}catch(Exception e){
			System.out.println("get access token error"+e);
		}
		return accessToken;
	}*/
	/*public static void main(String[] args) {
		String imgUrl = "http://47.106.206.152/simu/files/voucher/oXf9j5y55AS6t1WGQKoNTs-yyzi0/1_5c5846b1-0d2b-4e4c-8f93-1ea2e28cfde8.jpg";
		//new BaiDuPicRecognizeUtil().recognizePic("http://img2.imgtn.bdimg.com/it/u=3563596319,1330108801&fm=26&gp=0.jpg");
		new BaiDuPicRecognizeUtil().recognizePic(imgUrl);
	}*/
}
