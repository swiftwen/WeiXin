import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aitravelba.dto.BasicElement;
import com.aitravelba.dto.FirstMenuButtonDto;
import com.aitravelba.dto.req.CreateMenuReqDto;
import com.aitravelba.dto.resp.GetAccessTokenRespDto;
import com.aitravelba.util.HttpUtil;
import com.alibaba.fastjson.JSONObject;

/**
 * 
 * @author swiftwen
 * @date 2019年1月23日 上午11:13:34
 */
public class WeiXinMenuTest extends BaseTest {
	
	public static void main(String[] args) {
		
		String getAccessTokenUrl = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wxef77eaf24420a6c6&secret=867377bf5bdf98b6edb97f6a66bb1d17";
		
		String url = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=";
		
		HttpUtil httpUtil = new HttpUtil();
		Map<String, String> headers = new HashMap<String, String>();
		Map<String, String> paramMap = new HashMap<String, String>();
		String ret = httpUtil.httpGet(getAccessTokenUrl, headers);
		GetAccessTokenRespDto resp = JSONObject.parseObject(ret, GetAccessTokenRespDto.class);
		System.out.println("----------");
		System.out.println(resp);
		
		url = url + resp.getAccessToken();
		CreateMenuReqDto req = new CreateMenuReqDto();
		List<Object> list = new ArrayList<Object>();
		BasicElement menu1 = new BasicElement();
		menu1.setType("click");
		menu1.setName("今日回收价");
		menu1.setKey("TODAY_RECYCLE");
		
		FirstMenuButtonDto menu2 = new FirstMenuButtonDto();
	    menu2.setName("券码管理");
		List<BasicElement> menu2List = new ArrayList<BasicElement>();
		BasicElement b1 = new BasicElement();
		b1.setType("view");
		b1.setName("订单查询");
		b1.setUrl("https://mp.weixin.qq.com/s?__biz=Mzg4MjA5MDMzMw==&tempkey=OTkzX09YY2pRWlFpNGFTL3luZEVCeUJ2Z3hqbTREMXR2anduYjl1eFRSVUpSUEVTeDlzcUNmVThZU0dqRFVJRWJUV0dhZ010eVB3MjBzckY2NnJ0NmVMRGhqWDQ1YzBPWTRoWnk2c3Nqd2hvb0U4Y3B1Q0ZsQm95LVpzVmhQUU1kV21oMkg5Njl4WUFXcjFsQWtUSmI4Zm15cjZJTHFSVUlSMXZBcTRIQ2d%2Bfg%3D%3D&chksm=4f5d4934782ac022fde1960b5d1333a6d925cdad71041f56f320b7b64f3caf5a87db2f174493#rd");
		
		//BasicElement b2 = new BasicElement();
		//b2.setType("view");
		//b2.setName("资料/汇总");
		//b2.setUrl("https://mp.weixin.qq.com/s?__biz=Mzg4MjA5MDMzMw==&tempkey=OTkzX09YY2pRWlFpNGFTL3luZEVCeUJ2Z3hqbTREMXR2anduYjl1eFRSVUpSUEVTeDlzcUNmVThZU0dqRFVJRWJUV0dhZ010eVB3MjBzckY2NnJ0NmVMRGhqWDQ1YzBPWTRoWnk2c3Nqd2hvb0U4Y3B1Q0ZsQm95LVpzVmhQUU1kV21oMkg5Njl4WUFXcjFsQWtUSmI4Zm15cjZJTHFSVUlSMXZBcTRIQ2d%2Bfg%3D%3D&chksm=4f5d4934782ac022fde1960b5d1333a6d925cdad71041f56f320b7b64f3caf5a87db2f174493#rd");
		
		menu2List.add(b1);
		//menu2List.add(b2);
		menu2.setSubButton(menu2List);
		
		
		FirstMenuButtonDto menu3 = new FirstMenuButtonDto();
		List<BasicElement> menu3List = new ArrayList<BasicElement>();
		menu3.setName("更多服务");
		
		BasicElement c1 = new BasicElement();
		c1.setType("view");
		c1.setName("交易指南");
		c1.setUrl("https://mp.weixin.qq.com/s?__biz=Mzg4MjA5MDMzMw==&tempkey=OTkzX09YY2pRWlFpNGFTL3luZEVCeUJ2Z3hqbTREMXR2anduYjl1eFRSVUpSUEVTeDlzcUNmVThZU0dqRFVJRWJUV0dhZ010eVB3MjBzckY2NnJ0NmVMRGhqWDQ1YzBPWTRoWnk2c3Nqd2hvb0U4Y3B1Q0ZsQm95LVpzVmhQUU1kV21oMkg5Njl4WUFXcjFsQWtUSmI4Zm15cjZJTHFSVUlSMXZBcTRIQ2d%2Bfg%3D%3D&chksm=4f5d4934782ac022fde1960b5d1333a6d925cdad71041f56f320b7b64f3caf5a87db2f174493#rd");
		
		
		BasicElement c2 = new BasicElement();
		c2.setType("view");
		c2.setName("pos工具");
		c2.setUrl("https://mp.weixin.qq.com/s?__biz=Mzg4MjA5MDMzMw==&tempkey=OTkzX09YY2pRWlFpNGFTL3luZEVCeUJ2Z3hqbTREMXR2anduYjl1eFRSVUpSUEVTeDlzcUNmVThZU0dqRFVJRWJUV0dhZ010eVB3MjBzckY2NnJ0NmVMRGhqWDQ1YzBPWTRoWnk2c3Nqd2hvb0U4Y3B1Q0ZsQm95LVpzVmhQUU1kV21oMkg5Njl4WUFXcjFsQWtUSmI4Zm15cjZJTHFSVUlSMXZBcTRIQ2d%2Bfg%3D%3D&chksm=4f5d4934782ac022fde1960b5d1333a6d925cdad71041f56f320b7b64f3caf5a87db2f174493#rd");
		
		
		BasicElement c3 = new BasicElement();
		c3.setType("view");
		c3.setName("联系客服");
		c3.setUrl("https://mp.weixin.qq.com/s?__biz=Mzg4MjA5MDMzMw==&tempkey=OTkzX09YY2pRWlFpNGFTL3luZEVCeUJ2Z3hqbTREMXR2anduYjl1eFRSVUpSUEVTeDlzcUNmVThZU0dqRFVJRWJUV0dhZ010eVB3MjBzckY2NnJ0NmVMRGhqWDQ1YzBPWTRoWnk2c3Nqd2hvb0U4Y3B1Q0ZsQm95LVpzVmhQUU1kV21oMkg5Njl4WUFXcjFsQWtUSmI4Zm15cjZJTHFSVUlSMXZBcTRIQ2d%2Bfg%3D%3D&chksm=4f5d4934782ac022fde1960b5d1333a6d925cdad71041f56f320b7b64f3caf5a87db2f174493#rd");
		menu3List.add(c1);
		menu3List.add(c2);
		menu3List.add(c3);
		menu3.setSubButton(menu3List);
		
		list.add(menu1);
		list.add(menu2);
		list.add(menu3);
		req.setButton(list);
		String body = JSONObject.toJSONString(req);
		System.out.println(body);
		String postRet = httpUtil.httpPost(url, paramMap, headers, body);
		System.out.println("-----");
		System.out.println(postRet);
	}
	
}
