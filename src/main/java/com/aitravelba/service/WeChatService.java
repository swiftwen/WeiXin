package com.aitravelba.service;

import com.aitravelba.common.resp.BaseResponse;
import com.aitravelba.dto.req.wechat.BackVoucherReqDto;
import com.aitravelba.dto.req.wechat.OrderListReqDto;
import com.aitravelba.dto.req.wechat.QueryPayInfoReqDto;
import com.aitravelba.dto.req.wechat.RegisterUserReqDto;
import com.aitravelba.dto.req.wechat.VoucherListReqDto;
import com.aitravelba.dto.resp.wechat.AuthRespDto;
import com.aitravelba.dto.resp.wechat.CommonBooleanRespDto;
import com.aitravelba.dto.resp.wechat.OrderListRespDto;
import com.aitravelba.dto.resp.wechat.QueryNoticeRespDto;
import com.aitravelba.dto.resp.wechat.QueryPayInfoRespDto;
import com.aitravelba.dto.resp.wechat.UserInfoRespDto;
import com.aitravelba.dto.resp.wechat.VoucherDetailRespDto;
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
	Integer saveOrUpdatePayInfo(String openId, String payFile, String alipayNo, String alipayName, String remark);
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
	BaseResponse<CommonBooleanRespDto> submitVoucher(String openId, Long voucherId, String voucherFile, String voucherNo);
	/**
	 * 票据撤销
	 * @param openId
	 * @param voucherId
	 * @return
	 */
	boolean backVoucher(BackVoucherReqDto req);
	
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
	/**
	 * 获取微信用户信息
	 * @param accessToken
	 * @param openId
	 * @return
	 */
	BaseResponse<UserInfoRespDto> getWxUserInfo(String accessToken, String openId);
	/**
	 * 券码详情
	 * @param voucherId
	 * @return
	 */
	VoucherDetailRespDto voucherDetail(Long voucherId);
}
