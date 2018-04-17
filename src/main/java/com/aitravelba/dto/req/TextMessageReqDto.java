package com.aitravelba.dto.req;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * 
 * @desc 
 * @Author wenpeng
 * @2017年10月11日 下午4:23:03
 */
@XmlRootElement(name="xml")
public class TextMessageReqDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 开发者微信号
	 */
	private String toUserName;
	/**
	 * 发送方帐号
	 */
	private String fromUserName;
	/**
	 * 消息创建时间
	 */
	private Date createTime;
	/**
	 * 文本消息：text 图片消息：image 语音消息：voice 视频消息：video 小视频消息：shortvideo 
	 * 地理位置消息：location  链接消息：link
	 */
	private String msgType;
	/**
	 * 内容
	 */

	private String content;
	/**
	 * 消息id
	 */
	private Long msgId;
	/**
	 * 事件
	 */
	private String event;
	/**
	 * 图片消息图片url
	 */
	private String picUrl;
	/**
	 * 语音/图片 消息媒体id，可以调用多媒体文件下载接口拉取数据
	 */
	private String mediaId;
	/**
	 * 语音格式，如amr，speex等
	 */
	private String format;
	/**
	 * 视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据
	 */
	private String thumbMediaId;
	//地理位置消息字段
	/**
	 * 地理位置维度
	 */
	private String location_X;
	/**
	 * 地理位置经度
	 */
	private String location_Y;
	/**
	 * 地图缩放大小
	 */
	private String scale;
	/**
	 * 地理位置信息
	 */
	private String label;
	
	//链接消息字段
	/**
	 * 消息标题
	 */
	private String title;
	/**
	 * 消息描述
	 */
	private String description;
	/**
	 * 消息链接url
	 */
	private String url;
	
	public String getToUserName() {
		return toUserName;
	}
	@XmlElement(name="ToUserName")
	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}
	public String getFromUserName() {
		return fromUserName;
	}
	@XmlElement(name="FromUserName")
	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}
	public Date getCreateTime() {
		return createTime;
	}
	@XmlElement(name="CreateTime")
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getMsgType() {
		return msgType;
	}
	@XmlElement(name="MsgType")
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public String getContent() {
		return content;
	}
	@XmlElement(name="Content")
	public void setContent(String content) {
		this.content = content;
	}
	public Long getMsgId() {
		return msgId;
	}
	@XmlElement(name="MsgId")
	public void setMsgId(Long msgId) {
		this.msgId = msgId;
	}
	public String getEvent() {
		return event;
	}
	@XmlElement(name="Event")
	public void setEvent(String event) {
		this.event = event;
	}
	
	public String getPicUrl() {
		return picUrl;
	}
	@XmlElement(name="PicUrl")
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getMediaId() {
		return mediaId;
	}
	@XmlElement(name="MediaId")
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	public String getFormat() {
		return format;
	}
	@XmlElement(name="Format")
	public void setFormat(String format) {
		this.format = format;
	}
	public String getThumbMediaId() {
		return thumbMediaId;
	}
	@XmlElement(name="ThumbMediaId")
	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}
	public String getLocation_X() {
		return location_X;
	}
	@XmlElement(name="Location_X")
	public void setLocation_X(String location_X) {
		this.location_X = location_X;
	}
	public String getLocation_Y() {
		return location_Y;
	}
	@XmlElement(name="Location_Y")
	public void setLocation_Y(String location_Y) {
		this.location_Y = location_Y;
	}
	public String getScale() {
		return scale;
	}
	@XmlElement(name="Scale")
	public void setScale(String scale) {
		this.scale = scale;
	}
	public String getLabel() {
		return label;
	}
	@XmlElement(name="Label")
	public void setLabel(String label) {
		this.label = label;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "TextMessageReqDto [toUserName=" + toUserName + ", fromUserName=" + fromUserName + ", createTime="
				+ createTime + ", msgType=" + msgType + ", content=" + content + ", msgId=" + msgId + ", event=" + event
				+ ", picUrl=" + picUrl + ", mediaId=" + mediaId + ", format=" + format + ", thumbMediaId="
				+ thumbMediaId + ", location_X=" + location_X + ", location_Y=" + location_Y + ", scale=" + scale
				+ ", label=" + label + ", title=" + title + ", description=" + description + ", url=" + url + "]";
	}
	
	
}
