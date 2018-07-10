package com.aitravelba.pojo.weixin;

import java.util.Date;

public class NewsDetails {
	private Integer id;
	
	private Integer parentId;
	
	private String content;
	
	private Integer order;
	
	private Date sendDate;
	
	private Integer status;
	
	private Date createTime;
	
	private Date updateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public Date getSendDate() {
		return sendDate;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "NewsDetails [id=" + id + ", parentId=" + parentId + ", content=" + content + ", order=" + order
						+ ", sendDate=" + sendDate + ", status=" + status + ", createTime=" + createTime
						+ ", updateTime=" + updateTime + "]";
	}
	
	
}