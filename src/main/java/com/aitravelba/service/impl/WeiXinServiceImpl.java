package com.aitravelba.service.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aitravelba.common.MsgType;
import com.aitravelba.dto.req.TextMessageReqDto;
import com.aitravelba.dto.resp.TextMessageRespDto;
import com.aitravelba.dto.resp.baidu.GeneralBasicRespDto;
import com.aitravelba.dto.resp.baidu.WordResultDto;
import com.aitravelba.orm.wechat.SmVoucherMapper;
import com.aitravelba.pojo.wechat.SmVoucherEx;
import com.aitravelba.service.WeiXinService;
import com.aitravelba.util.BaiDuPicRecognizeUtil;
/**
 * 
 * @desc 微信服务器处理service
 * @Author wenpeng
 * @2017年10月11日 下午4:02:47
 */
@Service("weiXinService")
public class WeiXinServiceImpl implements WeiXinService {

	private static final Logger logger = LoggerFactory.getLogger(WeiXinServiceImpl.class);
	//private static final String KR36_FEED_RSS = "http://36kr.com/feed";
	
	@Autowired
	private BaiDuPicRecognizeUtil baiDuPicRecognizeUtil;
	
	@Autowired
	private SmVoucherMapper voucherMapper;
	
	@Override
	public void serverInit(HttpServletResponse response,String echostr) {
		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			pw.println(echostr);
			pw.close();
		}catch(IOException e) {
			logger.error("get PrintWriter from response fail",e);
		}
	}

	@Override
	public TextMessageRespDto acceptMsg(HttpServletRequest request, HttpServletResponse response,TextMessageReqDto req) {
		return sendMsg(request,response,req);
	}

	@Override
	public TextMessageRespDto sendMsg(HttpServletRequest request, HttpServletResponse response, TextMessageReqDto msg) {
		TextMessageRespDto resp = new TextMessageRespDto();
		//如果是事件消息
		if(null!=msg.getEvent()) {
			if("subscribe".equals(msg.getEvent())) {
				//关注公众号处理
				resp.setContent("谢谢你的关注♪（＾∀＾●）ﾉｼ （●´∀｀）♪");
			}else if("unsubscribe".equals(msg.getEvent())) {
				//TODO 取消关注处理
				
			}else if("CLICK".equals(msg.getEvent())){
				//点击事件
				System.out.println(msg.getEventKey());
				Map<String, Object> params = new HashMap<String, Object>();
				List<SmVoucherEx> voucherList = voucherMapper.voucherList(params);
				StringBuffer content = new StringBuffer();
				Set<String> cats = new HashSet<String>();
				if(null != voucherList && voucherList.size() > 0){
					for(SmVoucherEx voucher : voucherList){
						if(!cats.contains(voucher.getCatTitle())){
							content.append(voucher.getCatTitle());
							content.append(":\n");
							cats.add(voucher.getCatTitle());
						}
						content.append(voucher.getPrice());
						content.append("收");
						content.append(voucher.getVoucherTitle());
						content.append("\n");
					}
				}
				resp.setContent(content.toString());
			}else {
				//TODO 其他事件处理
				logger.info("取消关注");
			}
		}else { //其他消息
			//处理微信公众号回复内容
			if(MsgType.TEXT.equals(msg.getMsgType())){
				//TODO 
				resp.setContent(msg.getContent());
			}else if(MsgType.IMAGE.equals(msg.getMsgType())){
				//调百度图片识别接口
				GeneralBasicRespDto generalBasicRespDto = baiDuPicRecognizeUtil.recognizePic(msg.getPicUrl());
				System.out.println(generalBasicRespDto);
				List<WordResultDto> list = generalBasicRespDto.getWordsResult();
				StringBuffer content = new StringBuffer();
				for(WordResultDto wordResult : list){
					content.append(wordResult.getWords());
					content.append("\n");
					/*if(wordResult.getWords().contains("券码:")){
						content.append(wordResult.getWords());
						content.append("\n");
						
					}*/
				}
				resp.setContent(content.toString());
			}else{
				resp.setContent("功能待开发");
			}
			
		}
		logger.info("resp:"+resp.getContent());
		resp.setToUserName(msg.getFromUserName());
		resp.setFromUserName(msg.getToUserName());
		resp.setCreateTime(new Date());
		resp.setMsgType("text");
		return resp;
	}
	
	/*private boolean isThirdApp(String content) {
		if(null == content || content.trim().length() == 0) {
			return false;
		}
		content = content.trim();
		boolean ret = false;
		if("打卡".equals(content) || "投票".equals(content) || "街景".equals(content) || "表情红包".equals(content) || "体测成绩".equals(content)
				|| "改成绩".equals(content) || "校花".equals(content) || "贺卡".equals(content)) {
			ret = true;
		}
		return ret;
	}
	
	private boolean isAddNews(String content) {
		if(content.startsWith("yygy")) {
			return true;
		}
		return false;
	}
*/
   
}
