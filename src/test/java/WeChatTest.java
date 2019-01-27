import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.aitravelba.dto.req.wechat.OrderListReqDto;
import com.aitravelba.dto.req.wechat.RegisterUserReqDto;
import com.aitravelba.dto.req.wechat.VoucherListReqDto;
import com.aitravelba.dto.resp.wechat.OrderListRespDto;
import com.aitravelba.dto.resp.wechat.VoucherListRespDto;
import com.aitravelba.service.WeChatService;

public class WeChatTest extends BaseTest{

	@Autowired
	private WeChatService weChatService;
	
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
		weChatService.saveOrUpdatePayInfo("wenpeng",null, "15766086852");
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
}
