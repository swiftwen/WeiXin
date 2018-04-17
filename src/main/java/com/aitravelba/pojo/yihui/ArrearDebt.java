package com.aitravelba.pojo.yihui;

import java.util.Date;

public class ArrearDebt {
	private Long id;

	private String taskCode;

	private Long creditorId;

	private Long debtorId;

	private Integer shouldRefundPrincipal;

	private Integer shouldRefundInterest;

	private Integer shouldRefundCompensation;

	private Integer shouldRefundTotal;

	private Integer relieveAmount;

	private Integer alreadyRefundAmount;

	private Date borrowDate;

	private Date shouldRefundDate;

	private Integer overdueDay;

	private Byte status;

	private Date createTime;

	private Date updateTime;

	private Date lastSyncTime;

	private String loanBusinessDepartment;

	private String customerManager;

	private String customerManagerMobile;

	private Integer poundage;

	private Integer poundageCompensation;

	private Date creditorEntrustExpireTime;

	private String fundsProvider;

	private String productName;

	private String productCode;

	private String billNo;

	private String dataSource;

	private Date pubTime;

	private String loanAgreementUrl;

	private String taskCodeRemark;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTaskCode() {
		return taskCode;
	}

	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode == null ? null : taskCode.trim();
	}

	public Long getCreditorId() {
		return creditorId;
	}

	public void setCreditorId(Long creditorId) {
		this.creditorId = creditorId;
	}

	public Long getDebtorId() {
		return debtorId;
	}

	public void setDebtorId(Long debtorId) {
		this.debtorId = debtorId;
	}

	public Integer getShouldRefundPrincipal() {
		return shouldRefundPrincipal;
	}

	public void setShouldRefundPrincipal(Integer shouldRefundPrincipal) {
		this.shouldRefundPrincipal = shouldRefundPrincipal;
	}

	public Integer getShouldRefundInterest() {
		return shouldRefundInterest;
	}

	public void setShouldRefundInterest(Integer shouldRefundInterest) {
		this.shouldRefundInterest = shouldRefundInterest;
	}

	public Integer getShouldRefundCompensation() {
		return shouldRefundCompensation;
	}

	public void setShouldRefundCompensation(Integer shouldRefundCompensation) {
		this.shouldRefundCompensation = shouldRefundCompensation;
	}

	public Integer getShouldRefundTotal() {
		return shouldRefundTotal;
	}

	public void setShouldRefundTotal(Integer shouldRefundTotal) {
		this.shouldRefundTotal = shouldRefundTotal;
	}

	public Integer getRelieveAmount() {
		return relieveAmount;
	}

	public void setRelieveAmount(Integer relieveAmount) {
		this.relieveAmount = relieveAmount;
	}

	public Integer getAlreadyRefundAmount() {
		return alreadyRefundAmount;
	}

	public void setAlreadyRefundAmount(Integer alreadyRefundAmount) {
		this.alreadyRefundAmount = alreadyRefundAmount;
	}

	public Date getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}

	public Date getShouldRefundDate() {
		return shouldRefundDate;
	}

	public void setShouldRefundDate(Date shouldRefundDate) {
		this.shouldRefundDate = shouldRefundDate;
	}

	public Integer getOverdueDay() {
		return overdueDay;
	}

	public void setOverdueDay(Integer overdueDay) {
		this.overdueDay = overdueDay;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
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

	public Date getLastSyncTime() {
		return lastSyncTime;
	}

	public void setLastSyncTime(Date lastSyncTime) {
		this.lastSyncTime = lastSyncTime;
	}

	public String getLoanBusinessDepartment() {
		return loanBusinessDepartment;
	}

	public void setLoanBusinessDepartment(String loanBusinessDepartment) {
		this.loanBusinessDepartment = loanBusinessDepartment == null ? null : loanBusinessDepartment.trim();
	}

	public String getCustomerManager() {
		return customerManager;
	}

	public void setCustomerManager(String customerManager) {
		this.customerManager = customerManager == null ? null : customerManager.trim();
	}

	public String getCustomerManagerMobile() {
		return customerManagerMobile;
	}

	public void setCustomerManagerMobile(String customerManagerMobile) {
		this.customerManagerMobile = customerManagerMobile == null ? null : customerManagerMobile.trim();
	}

	public Integer getPoundage() {
		return poundage;
	}

	public void setPoundage(Integer poundage) {
		this.poundage = poundage;
	}

	public Integer getPoundageCompensation() {
		return poundageCompensation;
	}

	public void setPoundageCompensation(Integer poundageCompensation) {
		this.poundageCompensation = poundageCompensation;
	}

	public Date getCreditorEntrustExpireTime() {
		return creditorEntrustExpireTime;
	}

	public void setCreditorEntrustExpireTime(Date creditorEntrustExpireTime) {
		this.creditorEntrustExpireTime = creditorEntrustExpireTime;
	}

	public String getFundsProvider() {
		return fundsProvider;
	}

	public void setFundsProvider(String fundsProvider) {
		this.fundsProvider = fundsProvider == null ? null : fundsProvider.trim();
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName == null ? null : productName.trim();
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode == null ? null : productCode.trim();
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo == null ? null : billNo.trim();
	}

	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource == null ? null : dataSource.trim();
	}

	public Date getPubTime() {
		return pubTime;
	}

	public void setPubTime(Date pubTime) {
		this.pubTime = pubTime;
	}

	public String getLoanAgreementUrl() {
		return loanAgreementUrl;
	}

	public void setLoanAgreementUrl(String loanAgreementUrl) {
		this.loanAgreementUrl = loanAgreementUrl == null ? null : loanAgreementUrl.trim();
	}

	public String getTaskCodeRemark() {
		return taskCodeRemark;
	}

	public void setTaskCodeRemark(String taskCodeRemark) {
		this.taskCodeRemark = taskCodeRemark == null ? null : taskCodeRemark.trim();
	}
}