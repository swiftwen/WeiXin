package com.aitravelba.pojo.yihui;

import java.util.Date;

public class CollectionEntrust {
	private Long id;

	private Long debtorId;

	private Long deptId;

	private Long orgId;

	private Long dispatcherId;

	private Date entrustBeginTime;

	private Date entrustExpireTime;

	private Date entrustEndTime;

	private Byte status;

	private String abandonReason;

	private Date createTime;

	private Date updateTime;

	private Byte addressType;

	private String address;

	private Integer alreadyRefundAmount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDebtorId() {
		return debtorId;
	}

	public void setDebtorId(Long debtorId) {
		this.debtorId = debtorId;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public Long getDispatcherId() {
		return dispatcherId;
	}

	public void setDispatcherId(Long dispatcherId) {
		this.dispatcherId = dispatcherId;
	}

	public Date getEntrustBeginTime() {
		return entrustBeginTime;
	}

	public void setEntrustBeginTime(Date entrustBeginTime) {
		this.entrustBeginTime = entrustBeginTime;
	}

	public Date getEntrustExpireTime() {
		return entrustExpireTime;
	}

	public void setEntrustExpireTime(Date entrustExpireTime) {
		this.entrustExpireTime = entrustExpireTime;
	}

	public Date getEntrustEndTime() {
		return entrustEndTime;
	}

	public void setEntrustEndTime(Date entrustEndTime) {
		this.entrustEndTime = entrustEndTime;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public String getAbandonReason() {
		return abandonReason;
	}

	public void setAbandonReason(String abandonReason) {
		this.abandonReason = abandonReason == null ? null : abandonReason.trim();
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

	public Byte getAddressType() {
		return addressType;
	}

	public void setAddressType(Byte addressType) {
		this.addressType = addressType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public Integer getAlreadyRefundAmount() {
		return alreadyRefundAmount;
	}

	public void setAlreadyRefundAmount(Integer alreadyRefundAmount) {
		this.alreadyRefundAmount = alreadyRefundAmount;
	}
}