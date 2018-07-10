package com.aitravelba.service.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aitravelba.dao.weixin.NewsDetailsDao;
import com.aitravelba.dto.req.TextMessageReqDto;
import com.aitravelba.dto.resp.TextMessageRespDto;
import com.aitravelba.pojo.weixin.NewsDetails;
import com.aitravelba.service.WeiXinService;
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
			}else {
				//TODO 其他事件处理
				log.info("取消关注");
			}
		}else { //其他消息
			//处理微信公众号回复内容
			if(StringUtils.isNotBlank(msg.getContent())) {
				if(msg.getContent().trim().contains("文鹏") || msg.getContent().trim().contains("wenpeng")) {
					resp.setContent("你个傻逼！！！");
				}else if(isThirdApp(msg.getContent())) {
					log.info("第三方应用");
				}else if(isAddNews(msg.getContent())) {
					log.info("add news");
					String content = msg.getContent().replaceAll("yygy", "");
					String[] conts = content.split("#");
					NewsDetails newsDetails = new NewsDetails();
					newsDetails.setParentId(1);
					SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
					Date curDate = new Date();
					newsDetails.setContent(sdf.format(curDate)+" 互联网早报，星期二！");
					newsDetails.setOrder(-1);
					newsDetails.setCreateTime(curDate);
					newsDetailsDao.insert(newsDetails);
					newsDetails.setOrder(0);
					newsDetails.setContent("在这里，60秒读懂世界！");
					newsDetailsDao.insert(newsDetails);
					for(int i=0;i<conts.length;i++) {
						newsDetails.setOrder(i+1);
						newsDetails.setContent(conts[i]);
						newsDetailsDao.insert(newsDetails);
					}
					
				}else {
					List<NewsDetails> list = newsDetailsDao.queryCurDayNews();
					if(null != list && list.size() > 0 ) {
						StringBuffer sb = new StringBuffer();
						for(NewsDetails newsDetails : list) {
							if(newsDetails.getOrder() > 0) {
								if(!newsDetails.getContent().contains("微语")) {
									sb.append(newsDetails.getOrder()+"、");
								}
								sb.append(newsDetails.getContent()+"\n\n");
							}else {
								sb.append(newsDetails.getContent()+"\n");
							}
							
						}
						resp.setContent(sb.toString());
					}else {
						resp.setContent("请稍后再试！！！");
					}
					
				}
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


	/*public static void main(String[] args) {
		try {
			URL url = new URL(KR36_FEED_RSS);
			URLConnection conn = url.openConnection();
			InputStream in = conn.getInputStream();
			StringBuilder sb = new StringBuilder();
			String s = null;
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			while((s=br.readLine())!=null) {
				sb.append(s);
			}
			System.out.println(sb.toString());
			News news = XmlUtils.fromXML(sb.toString(), News.class);
			System.out.println(news.getDescription());
		}catch(Exception e) {
			log.error("error happen",e);
		}
	}*/
}
