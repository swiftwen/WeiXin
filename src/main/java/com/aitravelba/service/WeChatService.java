package com.aitravelba.service;

import org.springframework.web.multipart.MultipartFile;

import com.aitravelba.common.resp.BaseResponse;
import com.aitravelba.dto.req.wechat.OrderListReqDto;
import com.aitravelba.dto.req.wechat.QueryPayInfoReqDto;
import com.aitravelba.dto.req.wechat.RegisterUserReqDto;
import com.aitravelba.dto.req.wechat.VoucherListReqDto;
import com.aitravelba.dto.resp.wechat.AuthRespDto;
import com.aitravelba.dto.resp.wechat.OrderListRespDto;
import com.aitravelba.dto.resp.wechat.QueryNoticeRespDto;
import com.aitravelba.dto.resp.wechat.QueryPayInfoRespDto;
import com.aitravelba.dto.resp.wechat.VoucherListRespDto;

/**
 * 
 * @author swiftwen
 * @date 2019年1月24日 下午2:58:55
 */
public interface WeChatService {

	/**
	 * 订单列表
	 * @param req
	 * @return
	 */
	OrderListRespDto orderList(OrderListReqDto req);
	/**
	 * 查询收款信息
	 * @param req
	 * @return
	 */
	QueryPayInfoRespDto queryPayInfo(QueryPayInfoReqDto req);
	/**
	 * 新增或更新收款信息
	 * @param params
	 * @return
	 */
	Integer saveOrUpdatePayInfo(String openId, MultipartFile file, String alipayNo);
	/**
	 * 票据列表
	 * @param req
	 * @return
	 */
	VoucherListRespDto voucherList(VoucherListReqDto req);
	/**
	 * 票据提交
	 * @param openId
	 * @param file
	 * @param voucherNo
	 * @return
	 */
	boolean submitVoucher(String openId, Long voucherId, MultipartFile file, String voucherNo);
	/**
	 * 注册用户
	 * @param req
	 * @return
	 */
	boolean register(RegisterUserReqDto req);
	/**
	 * 查询公告
	 * @return
	 */
	QueryNoticeRespDto queryNotice();
	
	/**
	 * 微信网页授权
	 * @param code
	 * @return
	 */
	BaseResponse<AuthRespDto> auth(String code);
}
