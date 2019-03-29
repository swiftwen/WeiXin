import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.aitravelba.common.ConfigIdType;
import com.aitravelba.dto.req.wechat.OrderListReqDto;
import com.aitravelba.dto.req.wechat.RegisterUserReqDto;
import com.aitravelba.dto.req.wechat.VoucherListReqDto;
import com.aitravelba.dto.resp.wechat.OrderListRespDto;
import com.aitravelba.dto.resp.wechat.VoucherListRespDto;
import com.aitravelba.pojo.wechat.Config;
import com.aitravelba.service.ConfigService;
import com.aitravelba.service.WeChatService;

public class WeChatTest extends BaseTest{

	@Autowired
	private WeChatService weChatService;
	@Autowired
	private ConfigService configService;
	
	@Test
	public void orderList()throws Exception{
		OrderListReqDto req = new OrderListReqDto();
		req.setPageNum(1);
		req.setPageSize(10);
		
		OrderListRespDto resp = weChatService.orderList(req);
		System.out.println(resp.getList().size());
	}
	
	@Test
	public void voucherList()throws Exception{
		VoucherListReqDto req = new VoucherListReqDto();
		req.setPageNum(1);
		req.setPageSize(10);
		VoucherListRespDto resp = weChatService.voucherList(req);
		System.out.println(resp.getList().size());
	}
	
	@Test
	public void saveOrUpdatePayInfo()throws Exception{
		//weChatService.saveOrUpdatePayInfo("wenpeng",null, "15766086852");
	}
	
	@Test
	public void registerUser()throws Exception{
		RegisterUserReqDto req = new RegisterUserReqDto();
		req.setCity("株洲");
		req.setCountry("中国");
		req.setNickName("经过");
		req.setOpenId("wenpeng002");
		req.setProvince("湖南省");
		req.setSex((byte)1);
		req.setHeadImgUrl("aa");
		weChatService.register(req);
	}
	@Test
	public void queryConfigTest()throws Exception{
		Config config = configService.selectByConfigId(ConfigIdType.INIT_CHECK);
		if(null == config || "0".equals(config.getConfig())){
			System.out.println(config.getConfig());
		}else{
			System.out.println("*****************");
		}
	}
}
