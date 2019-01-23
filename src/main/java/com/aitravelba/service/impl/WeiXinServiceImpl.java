package com.aitravelba.service.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aitravelba.common.MsgType;
import com.aitravelba.dao.weixin.NewsDetailsDao;
import com.aitravelba.dto.req.TextMessageReqDto;
import com.aitravelba.dto.resp.TextMessageRespDto;
import com.aitravelba.dto.resp.baidu.GeneralBasicRespDto;
import com.aitravelba.dto.resp.baidu.WordResultDto;
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

	private static final Logger log= LoggerFactory.getLogger(WeiXinServiceImpl.class);
	//private static final String KR36_FEED_RSS = "http://36kr.com/feed";
	@Autowired
	private NewsDetailsDao newsDetailsDao;
	
	@Autowired
	private BaiDuPicRecognizeUtil baiDuPicRecognizeUtil;
	
	@Override
	public void serverInit(HttpServletResponse response,String echostr) {
		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			pw.println(echostr);
			pw.close();
		}catch(IOException e) {
			log.error("get PrintWriter from response fail",e);
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
				resp.setContent("中信：\n27.5收中信大杯星巴克\n23收中信必胜客30\n33收中信呷哺50（周三周六11点5折友券）\n65收中信小辉哥120（周三周六11点5折友券）上海\n22收中杯星巴克\n18收中信9元享看\n60收汇丰银行电影");
			}else {
				//TODO 其他事件处理
				log.info("取消关注");
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
		log.info("resp:"+resp.getContent());
		resp.setToUserName(msg.getFromUserName());
		resp.setFromUserName(msg.getToUserName());
		resp.setCreateTime(new Date());
		resp.setMsgType("text");
		return resp;
	}
	
	private boolean isThirdApp(String content) {
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

   
}
