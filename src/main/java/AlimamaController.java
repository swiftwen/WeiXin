/*

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.request.TimeGetRequest;
import com.taobao.api.response.TimeGetResponse;
import com.wp.youbuy.common.resp.BaseResponse;
import com.wp.youbuy.service.AlimamaService;
import com.wp.youbuy.util.ResponseUtil;

import io.swagger.annotations.ApiOperation;
*//**
 * 淘宝客联盟
 * @author swiftwen
 * @date 2019年7月29日 上午9:50:33
 *//*
@RestController
@RequestMapping(value = "/alimama")
public class AlimamaController extends BaseController {

	private static final Logger log= LoggerFactory.getLogger(AlimamaController.class);

	@Autowired
	private AlimamaService alimamaService;
	
	@ApiOperation(value = "getTime" ,  notes="getTime")
	@PostMapping(value = "/getTime")
	public BaseResponse<Date> getTime(HttpServletRequest request, HttpServletResponse response) {
		String appkey = "27711478";
		String secret = "fbf211cd7042770a79e9e8ac096f7694";
		DefaultTaobaoClient client = new DefaultTaobaoClient("http://gw.api.taobao.com/router/rest", appkey, secret);
		TimeGetRequest timeGetRequest = new TimeGetRequest();
		TimeGetResponse timeGetResponse = null;
		try{
			timeGetResponse = client.execute(timeGetRequest);
		}catch(Exception e){
			log.error("get taobao time error", e);
		}
		if (timeGetResponse.isSuccess()) {
			System.out.println(timeGetResponse.getBody());
		}
		return ResponseUtil.buildResp(timeGetResponse.getTime());
	}
	
	
}
*/