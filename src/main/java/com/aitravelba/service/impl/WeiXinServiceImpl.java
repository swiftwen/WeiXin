package com.aitravelba.service.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.aitravelba.dao.yihui.ArrearDebtDao;
import com.aitravelba.dao.yihui.CollectionEntrustDao;
import com.aitravelba.dao.yihui.CollectionEntrustDebtDao;
import com.aitravelba.dao.yihui.DebtorDao;
import com.aitravelba.dto.req.TextMessageReqDto;
import com.aitravelba.dto.resp.TextMessageRespDto;
import com.aitravelba.pojo.yihui.ArrearDebt;
import com.aitravelba.pojo.yihui.Debtor;
import com.aitravelba.service.WeiXinService;
import com.aitravelba.util.DateUtil;
import com.aitravelba.util.IDCardUtil;
import com.aitravelba.util.MobileUtil;
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
	
	@Resource
	private DebtorDao debtorDao;
	@Resource
	private ArrearDebtDao arrearDebtDao;
	@Resource
	private CollectionEntrustDao collectionEntrustDao;
	@Resource
	private CollectionEntrustDebtDao collectionEntrustDebtDao;
	
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
				}else {
					try {
						//易回查询
						List<Debtor> debtorList = null;
						String cont = msg.getContent().trim();
						if(IDCardUtil.isValidIDCard(cont)) {
							//身份证查询
							debtorList = debtorDao.selectByCardNo(cont);
							//模板    ：   债务人（张三） 逾期N天，欠款N元  未被抢单
							StringBuffer sb = new StringBuffer();
							if(null != debtorList && debtorList.size() > 0) {
								Debtor debtor = debtorList.get(0);
								sb.append("债务人("+debtor.getRealName()+")");
								if(debtor.getStatus()==0) {
									sb.append("未被抢单");
								}else if(debtor.getStatus() == 1) {
									sb.append("已在催收中");
								}else if(debtor.getStatus() == 2 || debtor.getStatus() == 3) {
									sb.append("已到电催");
								}else if(debtor.getStatus() == -128) {
									sb.append("已经出库");
								}
								List<ArrearDebt> arrearDebtList = arrearDebtDao.selectByDebtorId(debtor.getId());
								int overdue = -1;
								long shouldRefundTotal = 0;
								if(null != arrearDebtList && arrearDebtList.size() >0 ) {
									for(ArrearDebt debt : arrearDebtList) {
										overdue = Math.max(overdue, DateUtil.daysBetween(debt.getShouldRefundDate(), new Date()));
										shouldRefundTotal += debt.getShouldRefundTotal();
									}
								}
								sb.append(";逾期："+overdue+"天,");
								sb.append("欠款金额："+shouldRefundTotal/100.0+"元");
							}else {
								sb.append("易回系统无此债务人");
							}
							resp.setContent(sb.toString());
						}else if(MobileUtil.isValidPhoneNumber(cont)) {
							//手机号查询
							debtorList = debtorDao.selectByMobile(cont);
							//模板    ：   债务人（张三） 逾期N天，欠款N元  未被抢单
							StringBuffer sb = new StringBuffer();
							if(null != debtorList && debtorList.size() > 0) {
								Debtor debtor = debtorList.get(0);
								sb.append("债务人("+debtor.getRealName()+")");
								if(debtor.getStatus()==0) {
									sb.append("未被抢单");
								}else if(debtor.getStatus() == 1) {
									sb.append("已在催收中");
								}else if(debtor.getStatus() == 2 || debtor.getStatus() == 3) {
									sb.append("已到电催");
								}else if(debtor.getStatus() == -128) {
									sb.append("已经出库");
								}
								List<ArrearDebt> arrearDebtList = arrearDebtDao.selectByDebtorId(debtor.getId());
								int overdue = -1;
								long shouldRefundTotal = 0;
								if(null != arrearDebtList && arrearDebtList.size() >0 ) {
									for(ArrearDebt debt : arrearDebtList) {
										overdue = Math.max(overdue, DateUtil.daysBetween(debt.getShouldRefundDate(), new Date()));
										shouldRefundTotal += debt.getShouldRefundTotal();
									}
								}
								sb.append(";逾期："+overdue+"天,");
								sb.append("欠款金额："+shouldRefundTotal/100.0+"元");
							}else {
								sb.append("易回系统无此债务人");
							}
							resp.setContent(sb.toString());
						}else if(cont.contains("下载")) {
							resp.setContent("安卓的地址：https://www.pgyer.com/naOa \r\n iOS下载地址：https://www.pgyer.com/n8CE");
						}else if(cont.contains("帮助")) {
							resp.setContent("");
						}else {
							resp.setContent("该公众号处于开发中...");
						}
					}catch(Exception e) {
						log.error("error happen",e);
					}
				}
			}
		}
		resp.setToUserName(msg.getFromUserName());
		resp.setFromUserName(msg.getToUserName());
		resp.setCreateTime(new Date());
		resp.setMsgType("text");
		return resp;
	}
	
	public boolean isThirdApp(String content) {
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
