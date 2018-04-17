package com.aitravelba.pojo.yihui;


import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ArrearDebtExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	protected int limitStart = -1;

	protected int limitEnd = -1;

	public ArrearDebtExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	public void setLimitStart(int limitStart) {
		this.limitStart = limitStart;
	}

	public int getLimitStart() {
		return limitStart;
	}

	public void setLimitEnd(int limitEnd) {
		this.limitEnd = limitEnd;
	}

	public int getLimitEnd() {
		return limitEnd;
	}

	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		protected void addCriterionForJDBCDate(String condition, Date value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()), property);
		}

		protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property + " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andTaskCodeIsNull() {
			addCriterion("task_code is null");
			return (Criteria) this;
		}

		public Criteria andTaskCodeIsNotNull() {
			addCriterion("task_code is not null");
			return (Criteria) this;
		}

		public Criteria andTaskCodeEqualTo(String value) {
			addCriterion("task_code =", value, "taskCode");
			return (Criteria) this;
		}

		public Criteria andTaskCodeNotEqualTo(String value) {
			addCriterion("task_code <>", value, "taskCode");
			return (Criteria) this;
		}

		public Criteria andTaskCodeGreaterThan(String value) {
			addCriterion("task_code >", value, "taskCode");
			return (Criteria) this;
		}

		public Criteria andTaskCodeGreaterThanOrEqualTo(String value) {
			addCriterion("task_code >=", value, "taskCode");
			return (Criteria) this;
		}

		public Criteria andTaskCodeLessThan(String value) {
			addCriterion("task_code <", value, "taskCode");
			return (Criteria) this;
		}

		public Criteria andTaskCodeLessThanOrEqualTo(String value) {
			addCriterion("task_code <=", value, "taskCode");
			return (Criteria) this;
		}

		public Criteria andTaskCodeLike(String value) {
			addCriterion("task_code like", value, "taskCode");
			return (Criteria) this;
		}

		public Criteria andTaskCodeNotLike(String value) {
			addCriterion("task_code not like", value, "taskCode");
			return (Criteria) this;
		}

		public Criteria andTaskCodeIn(List<String> values) {
			addCriterion("task_code in", values, "taskCode");
			return (Criteria) this;
		}

		public Criteria andTaskCodeNotIn(List<String> values) {
			addCriterion("task_code not in", values, "taskCode");
			return (Criteria) this;
		}

		public Criteria andTaskCodeBetween(String value1, String value2) {
			addCriterion("task_code between", value1, value2, "taskCode");
			return (Criteria) this;
		}

		public Criteria andTaskCodeNotBetween(String value1, String value2) {
			addCriterion("task_code not between", value1, value2, "taskCode");
			return (Criteria) this;
		}

		public Criteria andCreditorIdIsNull() {
			addCriterion("creditor_id is null");
			return (Criteria) this;
		}

		public Criteria andCreditorIdIsNotNull() {
			addCriterion("creditor_id is not null");
			return (Criteria) this;
		}

		public Criteria andCreditorIdEqualTo(Long value) {
			addCriterion("creditor_id =", value, "creditorId");
			return (Criteria) this;
		}

		public Criteria andCreditorIdNotEqualTo(Long value) {
			addCriterion("creditor_id <>", value, "creditorId");
			return (Criteria) this;
		}

		public Criteria andCreditorIdGreaterThan(Long value) {
			addCriterion("creditor_id >", value, "creditorId");
			return (Criteria) this;
		}

		public Criteria andCreditorIdGreaterThanOrEqualTo(Long value) {
			addCriterion("creditor_id >=", value, "creditorId");
			return (Criteria) this;
		}

		public Criteria andCreditorIdLessThan(Long value) {
			addCriterion("creditor_id <", value, "creditorId");
			return (Criteria) this;
		}

		public Criteria andCreditorIdLessThanOrEqualTo(Long value) {
			addCriterion("creditor_id <=", value, "creditorId");
			return (Criteria) this;
		}

		public Criteria andCreditorIdIn(List<Long> values) {
			addCriterion("creditor_id in", values, "creditorId");
			return (Criteria) this;
		}

		public Criteria andCreditorIdNotIn(List<Long> values) {
			addCriterion("creditor_id not in", values, "creditorId");
			return (Criteria) this;
		}

		public Criteria andCreditorIdBetween(Long value1, Long value2) {
			addCriterion("creditor_id between", value1, value2, "creditorId");
			return (Criteria) this;
		}

		public Criteria andCreditorIdNotBetween(Long value1, Long value2) {
			addCriterion("creditor_id not between", value1, value2, "creditorId");
			return (Criteria) this;
		}

		public Criteria andDebtorIdIsNull() {
			addCriterion("debtor_id is null");
			return (Criteria) this;
		}

		public Criteria andDebtorIdIsNotNull() {
			addCriterion("debtor_id is not null");
			return (Criteria) this;
		}

		public Criteria andDebtorIdEqualTo(Long value) {
			addCriterion("debtor_id =", value, "debtorId");
			return (Criteria) this;
		}

		public Criteria andDebtorIdNotEqualTo(Long value) {
			addCriterion("debtor_id <>", value, "debtorId");
			return (Criteria) this;
		}

		public Criteria andDebtorIdGreaterThan(Long value) {
			addCriterion("debtor_id >", value, "debtorId");
			return (Criteria) this;
		}

		public Criteria andDebtorIdGreaterThanOrEqualTo(Long value) {
			addCriterion("debtor_id >=", value, "debtorId");
			return (Criteria) this;
		}

		public Criteria andDebtorIdLessThan(Long value) {
			addCriterion("debtor_id <", value, "debtorId");
			return (Criteria) this;
		}

		public Criteria andDebtorIdLessThanOrEqualTo(Long value) {
			addCriterion("debtor_id <=", value, "debtorId");
			return (Criteria) this;
		}

		public Criteria andDebtorIdIn(List<Long> values) {
			addCriterion("debtor_id in", values, "debtorId");
			return (Criteria) this;
		}

		public Criteria andDebtorIdNotIn(List<Long> values) {
			addCriterion("debtor_id not in", values, "debtorId");
			return (Criteria) this;
		}

		public Criteria andDebtorIdBetween(Long value1, Long value2) {
			addCriterion("debtor_id between", value1, value2, "debtorId");
			return (Criteria) this;
		}

		public Criteria andDebtorIdNotBetween(Long value1, Long value2) {
			addCriterion("debtor_id not between", value1, value2, "debtorId");
			return (Criteria) this;
		}

		public Criteria andShouldRefundPrincipalIsNull() {
			addCriterion("should_refund_principal is null");
			return (Criteria) this;
		}

		public Criteria andShouldRefundPrincipalIsNotNull() {
			addCriterion("should_refund_principal is not null");
			return (Criteria) this;
		}

		public Criteria andShouldRefundPrincipalEqualTo(Integer value) {
			addCriterion("should_refund_principal =", value, "shouldRefundPrincipal");
			return (Criteria) this;
		}

		public Criteria andShouldRefundPrincipalNotEqualTo(Integer value) {
			addCriterion("should_refund_principal <>", value, "shouldRefundPrincipal");
			return (Criteria) this;
		}

		public Criteria andShouldRefundPrincipalGreaterThan(Integer value) {
			addCriterion("should_refund_principal >", value, "shouldRefundPrincipal");
			return (Criteria) this;
		}

		public Criteria andShouldRefundPrincipalGreaterThanOrEqualTo(Integer value) {
			addCriterion("should_refund_principal >=", value, "shouldRefundPrincipal");
			return (Criteria) this;
		}

		public Criteria andShouldRefundPrincipalLessThan(Integer value) {
			addCriterion("should_refund_principal <", value, "shouldRefundPrincipal");
			return (Criteria) this;
		}

		public Criteria andShouldRefundPrincipalLessThanOrEqualTo(Integer value) {
			addCriterion("should_refund_principal <=", value, "shouldRefundPrincipal");
			return (Criteria) this;
		}

		public Criteria andShouldRefundPrincipalIn(List<Integer> values) {
			addCriterion("should_refund_principal in", values, "shouldRefundPrincipal");
			return (Criteria) this;
		}

		public Criteria andShouldRefundPrincipalNotIn(List<Integer> values) {
			addCriterion("should_refund_principal not in", values, "shouldRefundPrincipal");
			return (Criteria) this;
		}

		public Criteria andShouldRefundPrincipalBetween(Integer value1, Integer value2) {
			addCriterion("should_refund_principal between", value1, value2, "shouldRefundPrincipal");
			return (Criteria) this;
		}

		public Criteria andShouldRefundPrincipalNotBetween(Integer value1, Integer value2) {
			addCriterion("should_refund_principal not between", value1, value2, "shouldRefundPrincipal");
			return (Criteria) this;
		}

		public Criteria andShouldRefundInterestIsNull() {
			addCriterion("should_refund_interest is null");
			return (Criteria) this;
		}

		public Criteria andShouldRefundInterestIsNotNull() {
			addCriterion("should_refund_interest is not null");
			return (Criteria) this;
		}

		public Criteria andShouldRefundInterestEqualTo(Integer value) {
			addCriterion("should_refund_interest =", value, "shouldRefundInterest");
			return (Criteria) this;
		}

		public Criteria andShouldRefundInterestNotEqualTo(Integer value) {
			addCriterion("should_refund_interest <>", value, "shouldRefundInterest");
			return (Criteria) this;
		}

		public Criteria andShouldRefundInterestGreaterThan(Integer value) {
			addCriterion("should_refund_interest >", value, "shouldRefundInterest");
			return (Criteria) this;
		}

		public Criteria andShouldRefundInterestGreaterThanOrEqualTo(Integer value) {
			addCriterion("should_refund_interest >=", value, "shouldRefundInterest");
			return (Criteria) this;
		}

		public Criteria andShouldRefundInterestLessThan(Integer value) {
			addCriterion("should_refund_interest <", value, "shouldRefundInterest");
			return (Criteria) this;
		}

		public Criteria andShouldRefundInterestLessThanOrEqualTo(Integer value) {
			addCriterion("should_refund_interest <=", value, "shouldRefundInterest");
			return (Criteria) this;
		}

		public Criteria andShouldRefundInterestIn(List<Integer> values) {
			addCriterion("should_refund_interest in", values, "shouldRefundInterest");
			return (Criteria) this;
		}

		public Criteria andShouldRefundInterestNotIn(List<Integer> values) {
			addCriterion("should_refund_interest not in", values, "shouldRefundInterest");
			return (Criteria) this;
		}

		public Criteria andShouldRefundInterestBetween(Integer value1, Integer value2) {
			addCriterion("should_refund_interest between", value1, value2, "shouldRefundInterest");
			return (Criteria) this;
		}

		public Criteria andShouldRefundInterestNotBetween(Integer value1, Integer value2) {
			addCriterion("should_refund_interest not between", value1, value2, "shouldRefundInterest");
			return (Criteria) this;
		}

		public Criteria andShouldRefundCompensationIsNull() {
			addCriterion("should_refund_compensation is null");
			return (Criteria) this;
		}

		public Criteria andShouldRefundCompensationIsNotNull() {
			addCriterion("should_refund_compensation is not null");
			return (Criteria) this;
		}

		public Criteria andShouldRefundCompensationEqualTo(Integer value) {
			addCriterion("should_refund_compensation =", value, "shouldRefundCompensation");
			return (Criteria) this;
		}

		public Criteria andShouldRefundCompensationNotEqualTo(Integer value) {
			addCriterion("should_refund_compensation <>", value, "shouldRefundCompensation");
			return (Criteria) this;
		}

		public Criteria andShouldRefundCompensationGreaterThan(Integer value) {
			addCriterion("should_refund_compensation >", value, "shouldRefundCompensation");
			return (Criteria) this;
		}

		public Criteria andShouldRefundCompensationGreaterThanOrEqualTo(Integer value) {
			addCriterion("should_refund_compensation >=", value, "shouldRefundCompensation");
			return (Criteria) this;
		}

		public Criteria andShouldRefundCompensationLessThan(Integer value) {
			addCriterion("should_refund_compensation <", value, "shouldRefundCompensation");
			return (Criteria) this;
		}

		public Criteria andShouldRefundCompensationLessThanOrEqualTo(Integer value) {
			addCriterion("should_refund_compensation <=", value, "shouldRefundCompensation");
			return (Criteria) this;
		}

		public Criteria andShouldRefundCompensationIn(List<Integer> values) {
			addCriterion("should_refund_compensation in", values, "shouldRefundCompensation");
			return (Criteria) this;
		}

		public Criteria andShouldRefundCompensationNotIn(List<Integer> values) {
			addCriterion("should_refund_compensation not in", values, "shouldRefundCompensation");
			return (Criteria) this;
		}

		public Criteria andShouldRefundCompensationBetween(Integer value1, Integer value2) {
			addCriterion("should_refund_compensation between", value1, value2, "shouldRefundCompensation");
			return (Criteria) this;
		}

		public Criteria andShouldRefundCompensationNotBetween(Integer value1, Integer value2) {
			addCriterion("should_refund_compensation not between", value1, value2, "shouldRefundCompensation");
			return (Criteria) this;
		}

		public Criteria andShouldRefundTotalIsNull() {
			addCriterion("should_refund_total is null");
			return (Criteria) this;
		}

		public Criteria andShouldRefundTotalIsNotNull() {
			addCriterion("should_refund_total is not null");
			return (Criteria) this;
		}

		public Criteria andShouldRefundTotalEqualTo(Integer value) {
			addCriterion("should_refund_total =", value, "shouldRefundTotal");
			return (Criteria) this;
		}

		public Criteria andShouldRefundTotalNotEqualTo(Integer value) {
			addCriterion("should_refund_total <>", value, "shouldRefundTotal");
			return (Criteria) this;
		}

		public Criteria andShouldRefundTotalGreaterThan(Integer value) {
			addCriterion("should_refund_total >", value, "shouldRefundTotal");
			return (Criteria) this;
		}

		public Criteria andShouldRefundTotalGreaterThanOrEqualTo(Integer value) {
			addCriterion("should_refund_total >=", value, "shouldRefundTotal");
			return (Criteria) this;
		}

		public Criteria andShouldRefundTotalLessThan(Integer value) {
			addCriterion("should_refund_total <", value, "shouldRefundTotal");
			return (Criteria) this;
		}

		public Criteria andShouldRefundTotalLessThanOrEqualTo(Integer value) {
			addCriterion("should_refund_total <=", value, "shouldRefundTotal");
			return (Criteria) this;
		}

		public Criteria andShouldRefundTotalIn(List<Integer> values) {
			addCriterion("should_refund_total in", values, "shouldRefundTotal");
			return (Criteria) this;
		}

		public Criteria andShouldRefundTotalNotIn(List<Integer> values) {
			addCriterion("should_refund_total not in", values, "shouldRefundTotal");
			return (Criteria) this;
		}

		public Criteria andShouldRefundTotalBetween(Integer value1, Integer value2) {
			addCriterion("should_refund_total between", value1, value2, "shouldRefundTotal");
			return (Criteria) this;
		}

		public Criteria andShouldRefundTotalNotBetween(Integer value1, Integer value2) {
			addCriterion("should_refund_total not between", value1, value2, "shouldRefundTotal");
			return (Criteria) this;
		}

		public Criteria andRelieveAmountIsNull() {
			addCriterion("relieve_amount is null");
			return (Criteria) this;
		}

		public Criteria andRelieveAmountIsNotNull() {
			addCriterion("relieve_amount is not null");
			return (Criteria) this;
		}

		public Criteria andRelieveAmountEqualTo(Integer value) {
			addCriterion("relieve_amount =", value, "relieveAmount");
			return (Criteria) this;
		}

		public Criteria andRelieveAmountNotEqualTo(Integer value) {
			addCriterion("relieve_amount <>", value, "relieveAmount");
			return (Criteria) this;
		}

		public Criteria andRelieveAmountGreaterThan(Integer value) {
			addCriterion("relieve_amount >", value, "relieveAmount");
			return (Criteria) this;
		}

		public Criteria andRelieveAmountGreaterThanOrEqualTo(Integer value) {
			addCriterion("relieve_amount >=", value, "relieveAmount");
			return (Criteria) this;
		}

		public Criteria andRelieveAmountLessThan(Integer value) {
			addCriterion("relieve_amount <", value, "relieveAmount");
			return (Criteria) this;
		}

		public Criteria andRelieveAmountLessThanOrEqualTo(Integer value) {
			addCriterion("relieve_amount <=", value, "relieveAmount");
			return (Criteria) this;
		}

		public Criteria andRelieveAmountIn(List<Integer> values) {
			addCriterion("relieve_amount in", values, "relieveAmount");
			return (Criteria) this;
		}

		public Criteria andRelieveAmountNotIn(List<Integer> values) {
			addCriterion("relieve_amount not in", values, "relieveAmount");
			return (Criteria) this;
		}

		public Criteria andRelieveAmountBetween(Integer value1, Integer value2) {
			addCriterion("relieve_amount between", value1, value2, "relieveAmount");
			return (Criteria) this;
		}

		public Criteria andRelieveAmountNotBetween(Integer value1, Integer value2) {
			addCriterion("relieve_amount not between", value1, value2, "relieveAmount");
			return (Criteria) this;
		}

		public Criteria andAlreadyRefundAmountIsNull() {
			addCriterion("already_refund_amount is null");
			return (Criteria) this;
		}

		public Criteria andAlreadyRefundAmountIsNotNull() {
			addCriterion("already_refund_amount is not null");
			return (Criteria) this;
		}

		public Criteria andAlreadyRefundAmountEqualTo(Integer value) {
			addCriterion("already_refund_amount =", value, "alreadyRefundAmount");
			return (Criteria) this;
		}

		public Criteria andAlreadyRefundAmountNotEqualTo(Integer value) {
			addCriterion("already_refund_amount <>", value, "alreadyRefundAmount");
			return (Criteria) this;
		}

		public Criteria andAlreadyRefundAmountGreaterThan(Integer value) {
			addCriterion("already_refund_amount >", value, "alreadyRefundAmount");
			return (Criteria) this;
		}

		public Criteria andAlreadyRefundAmountGreaterThanOrEqualTo(Integer value) {
			addCriterion("already_refund_amount >=", value, "alreadyRefundAmount");
			return (Criteria) this;
		}

		public Criteria andAlreadyRefundAmountLessThan(Integer value) {
			addCriterion("already_refund_amount <", value, "alreadyRefundAmount");
			return (Criteria) this;
		}

		public Criteria andAlreadyRefundAmountLessThanOrEqualTo(Integer value) {
			addCriterion("already_refund_amount <=", value, "alreadyRefundAmount");
			return (Criteria) this;
		}

		public Criteria andAlreadyRefundAmountIn(List<Integer> values) {
			addCriterion("already_refund_amount in", values, "alreadyRefundAmount");
			return (Criteria) this;
		}

		public Criteria andAlreadyRefundAmountNotIn(List<Integer> values) {
			addCriterion("already_refund_amount not in", values, "alreadyRefundAmount");
			return (Criteria) this;
		}

		public Criteria andAlreadyRefundAmountBetween(Integer value1, Integer value2) {
			addCriterion("already_refund_amount between", value1, value2, "alreadyRefundAmount");
			return (Criteria) this;
		}

		public Criteria andAlreadyRefundAmountNotBetween(Integer value1, Integer value2) {
			addCriterion("already_refund_amount not between", value1, value2, "alreadyRefundAmount");
			return (Criteria) this;
		}

		public Criteria andBorrowDateIsNull() {
			addCriterion("borrow_date is null");
			return (Criteria) this;
		}

		public Criteria andBorrowDateIsNotNull() {
			addCriterion("borrow_date is not null");
			return (Criteria) this;
		}

		public Criteria andBorrowDateEqualTo(Date value) {
			addCriterionForJDBCDate("borrow_date =", value, "borrowDate");
			return (Criteria) this;
		}

		public Criteria andBorrowDateNotEqualTo(Date value) {
			addCriterionForJDBCDate("borrow_date <>", value, "borrowDate");
			return (Criteria) this;
		}

		public Criteria andBorrowDateGreaterThan(Date value) {
			addCriterionForJDBCDate("borrow_date >", value, "borrowDate");
			return (Criteria) this;
		}

		public Criteria andBorrowDateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("borrow_date >=", value, "borrowDate");
			return (Criteria) this;
		}

		public Criteria andBorrowDateLessThan(Date value) {
			addCriterionForJDBCDate("borrow_date <", value, "borrowDate");
			return (Criteria) this;
		}

		public Criteria andBorrowDateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("borrow_date <=", value, "borrowDate");
			return (Criteria) this;
		}

		public Criteria andBorrowDateIn(List<Date> values) {
			addCriterionForJDBCDate("borrow_date in", values, "borrowDate");
			return (Criteria) this;
		}

		public Criteria andBorrowDateNotIn(List<Date> values) {
			addCriterionForJDBCDate("borrow_date not in", values, "borrowDate");
			return (Criteria) this;
		}

		public Criteria andBorrowDateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("borrow_date between", value1, value2, "borrowDate");
			return (Criteria) this;
		}

		public Criteria andBorrowDateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("borrow_date not between", value1, value2, "borrowDate");
			return (Criteria) this;
		}

		public Criteria andShouldRefundDateIsNull() {
			addCriterion("should_refund_date is null");
			return (Criteria) this;
		}

		public Criteria andShouldRefundDateIsNotNull() {
			addCriterion("should_refund_date is not null");
			return (Criteria) this;
		}

		public Criteria andShouldRefundDateEqualTo(Date value) {
			addCriterionForJDBCDate("should_refund_date =", value, "shouldRefundDate");
			return (Criteria) this;
		}

		public Criteria andShouldRefundDateNotEqualTo(Date value) {
			addCriterionForJDBCDate("should_refund_date <>", value, "shouldRefundDate");
			return (Criteria) this;
		}

		public Criteria andShouldRefundDateGreaterThan(Date value) {
			addCriterionForJDBCDate("should_refund_date >", value, "shouldRefundDate");
			return (Criteria) this;
		}

		public Criteria andShouldRefundDateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("should_refund_date >=", value, "shouldRefundDate");
			return (Criteria) this;
		}

		public Criteria andShouldRefundDateLessThan(Date value) {
			addCriterionForJDBCDate("should_refund_date <", value, "shouldRefundDate");
			return (Criteria) this;
		}

		public Criteria andShouldRefundDateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("should_refund_date <=", value, "shouldRefundDate");
			return (Criteria) this;
		}

		public Criteria andShouldRefundDateIn(List<Date> values) {
			addCriterionForJDBCDate("should_refund_date in", values, "shouldRefundDate");
			return (Criteria) this;
		}

		public Criteria andShouldRefundDateNotIn(List<Date> values) {
			addCriterionForJDBCDate("should_refund_date not in", values, "shouldRefundDate");
			return (Criteria) this;
		}

		public Criteria andShouldRefundDateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("should_refund_date between", value1, value2, "shouldRefundDate");
			return (Criteria) this;
		}

		public Criteria andShouldRefundDateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("should_refund_date not between", value1, value2, "shouldRefundDate");
			return (Criteria) this;
		}

		public Criteria andOverdueDayIsNull() {
			addCriterion("overdue_day is null");
			return (Criteria) this;
		}

		public Criteria andOverdueDayIsNotNull() {
			addCriterion("overdue_day is not null");
			return (Criteria) this;
		}

		public Criteria andOverdueDayEqualTo(Integer value) {
			addCriterion("overdue_day =", value, "overdueDay");
			return (Criteria) this;
		}

		public Criteria andOverdueDayNotEqualTo(Integer value) {
			addCriterion("overdue_day <>", value, "overdueDay");
			return (Criteria) this;
		}

		public Criteria andOverdueDayGreaterThan(Integer value) {
			addCriterion("overdue_day >", value, "overdueDay");
			return (Criteria) this;
		}

		public Criteria andOverdueDayGreaterThanOrEqualTo(Integer value) {
			addCriterion("overdue_day >=", value, "overdueDay");
			return (Criteria) this;
		}

		public Criteria andOverdueDayLessThan(Integer value) {
			addCriterion("overdue_day <", value, "overdueDay");
			return (Criteria) this;
		}

		public Criteria andOverdueDayLessThanOrEqualTo(Integer value) {
			addCriterion("overdue_day <=", value, "overdueDay");
			return (Criteria) this;
		}

		public Criteria andOverdueDayIn(List<Integer> values) {
			addCriterion("overdue_day in", values, "overdueDay");
			return (Criteria) this;
		}

		public Criteria andOverdueDayNotIn(List<Integer> values) {
			addCriterion("overdue_day not in", values, "overdueDay");
			return (Criteria) this;
		}

		public Criteria andOverdueDayBetween(Integer value1, Integer value2) {
			addCriterion("overdue_day between", value1, value2, "overdueDay");
			return (Criteria) this;
		}

		public Criteria andOverdueDayNotBetween(Integer value1, Integer value2) {
			addCriterion("overdue_day not between", value1, value2, "overdueDay");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(Byte value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(Byte value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(Byte value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(Byte value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(Byte value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<Byte> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<Byte> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(Byte value1, Byte value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(Byte value1, Byte value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNull() {
			addCriterion("create_time is null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNotNull() {
			addCriterion("create_time is not null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeEqualTo(Date value) {
			addCriterion("create_time =", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotEqualTo(Date value) {
			addCriterion("create_time <>", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThan(Date value) {
			addCriterion("create_time >", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("create_time >=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThan(Date value) {
			addCriterion("create_time <", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
			addCriterion("create_time <=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIn(List<Date> values) {
			addCriterion("create_time in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotIn(List<Date> values) {
			addCriterion("create_time not in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBetween(Date value1, Date value2) {
			addCriterion("create_time between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
			addCriterion("create_time not between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNull() {
			addCriterion("update_time is null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNotNull() {
			addCriterion("update_time is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeEqualTo(Date value) {
			addCriterion("update_time =", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotEqualTo(Date value) {
			addCriterion("update_time <>", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThan(Date value) {
			addCriterion("update_time >", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("update_time >=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThan(Date value) {
			addCriterion("update_time <", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
			addCriterion("update_time <=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIn(List<Date> values) {
			addCriterion("update_time in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotIn(List<Date> values) {
			addCriterion("update_time not in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBetween(Date value1, Date value2) {
			addCriterion("update_time between", value1, value2, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
			addCriterion("update_time not between", value1, value2, "updateTime");
			return (Criteria) this;
		}

		public Criteria andLastSyncTimeIsNull() {
			addCriterion("last_sync_time is null");
			return (Criteria) this;
		}

		public Criteria andLastSyncTimeIsNotNull() {
			addCriterion("last_sync_time is not null");
			return (Criteria) this;
		}

		public Criteria andLastSyncTimeEqualTo(Date value) {
			addCriterion("last_sync_time =", value, "lastSyncTime");
			return (Criteria) this;
		}

		public Criteria andLastSyncTimeNotEqualTo(Date value) {
			addCriterion("last_sync_time <>", value, "lastSyncTime");
			return (Criteria) this;
		}

		public Criteria andLastSyncTimeGreaterThan(Date value) {
			addCriterion("last_sync_time >", value, "lastSyncTime");
			return (Criteria) this;
		}

		public Criteria andLastSyncTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("last_sync_time >=", value, "lastSyncTime");
			return (Criteria) this;
		}

		public Criteria andLastSyncTimeLessThan(Date value) {
			addCriterion("last_sync_time <", value, "lastSyncTime");
			return (Criteria) this;
		}

		public Criteria andLastSyncTimeLessThanOrEqualTo(Date value) {
			addCriterion("last_sync_time <=", value, "lastSyncTime");
			return (Criteria) this;
		}

		public Criteria andLastSyncTimeIn(List<Date> values) {
			addCriterion("last_sync_time in", values, "lastSyncTime");
			return (Criteria) this;
		}

		public Criteria andLastSyncTimeNotIn(List<Date> values) {
			addCriterion("last_sync_time not in", values, "lastSyncTime");
			return (Criteria) this;
		}

		public Criteria andLastSyncTimeBetween(Date value1, Date value2) {
			addCriterion("last_sync_time between", value1, value2, "lastSyncTime");
			return (Criteria) this;
		}

		public Criteria andLastSyncTimeNotBetween(Date value1, Date value2) {
			addCriterion("last_sync_time not between", value1, value2, "lastSyncTime");
			return (Criteria) this;
		}

		public Criteria andLoanBusinessDepartmentIsNull() {
			addCriterion("loan_business_department is null");
			return (Criteria) this;
		}

		public Criteria andLoanBusinessDepartmentIsNotNull() {
			addCriterion("loan_business_department is not null");
			return (Criteria) this;
		}

		public Criteria andLoanBusinessDepartmentEqualTo(String value) {
			addCriterion("loan_business_department =", value, "loanBusinessDepartment");
			return (Criteria) this;
		}

		public Criteria andLoanBusinessDepartmentNotEqualTo(String value) {
			addCriterion("loan_business_department <>", value, "loanBusinessDepartment");
			return (Criteria) this;
		}

		public Criteria andLoanBusinessDepartmentGreaterThan(String value) {
			addCriterion("loan_business_department >", value, "loanBusinessDepartment");
			return (Criteria) this;
		}

		public Criteria andLoanBusinessDepartmentGreaterThanOrEqualTo(String value) {
			addCriterion("loan_business_department >=", value, "loanBusinessDepartment");
			return (Criteria) this;
		}

		public Criteria andLoanBusinessDepartmentLessThan(String value) {
			addCriterion("loan_business_department <", value, "loanBusinessDepartment");
			return (Criteria) this;
		}

		public Criteria andLoanBusinessDepartmentLessThanOrEqualTo(String value) {
			addCriterion("loan_business_department <=", value, "loanBusinessDepartment");
			return (Criteria) this;
		}

		public Criteria andLoanBusinessDepartmentLike(String value) {
			addCriterion("loan_business_department like", value, "loanBusinessDepartment");
			return (Criteria) this;
		}

		public Criteria andLoanBusinessDepartmentNotLike(String value) {
			addCriterion("loan_business_department not like", value, "loanBusinessDepartment");
			return (Criteria) this;
		}

		public Criteria andLoanBusinessDepartmentIn(List<String> values) {
			addCriterion("loan_business_department in", values, "loanBusinessDepartment");
			return (Criteria) this;
		}

		public Criteria andLoanBusinessDepartmentNotIn(List<String> values) {
			addCriterion("loan_business_department not in", values, "loanBusinessDepartment");
			return (Criteria) this;
		}

		public Criteria andLoanBusinessDepartmentBetween(String value1, String value2) {
			addCriterion("loan_business_department between", value1, value2, "loanBusinessDepartment");
			return (Criteria) this;
		}

		public Criteria andLoanBusinessDepartmentNotBetween(String value1, String value2) {
			addCriterion("loan_business_department not between", value1, value2, "loanBusinessDepartment");
			return (Criteria) this;
		}

		public Criteria andCustomerManagerIsNull() {
			addCriterion("customer_manager is null");
			return (Criteria) this;
		}

		public Criteria andCustomerManagerIsNotNull() {
			addCriterion("customer_manager is not null");
			return (Criteria) this;
		}

		public Criteria andCustomerManagerEqualTo(String value) {
			addCriterion("customer_manager =", value, "customerManager");
			return (Criteria) this;
		}

		public Criteria andCustomerManagerNotEqualTo(String value) {
			addCriterion("customer_manager <>", value, "customerManager");
			return (Criteria) this;
		}

		public Criteria andCustomerManagerGreaterThan(String value) {
			addCriterion("customer_manager >", value, "customerManager");
			return (Criteria) this;
		}

		public Criteria andCustomerManagerGreaterThanOrEqualTo(String value) {
			addCriterion("customer_manager >=", value, "customerManager");
			return (Criteria) this;
		}

		public Criteria andCustomerManagerLessThan(String value) {
			addCriterion("customer_manager <", value, "customerManager");
			return (Criteria) this;
		}

		public Criteria andCustomerManagerLessThanOrEqualTo(String value) {
			addCriterion("customer_manager <=", value, "customerManager");
			return (Criteria) this;
		}

		public Criteria andCustomerManagerLike(String value) {
			addCriterion("customer_manager like", value, "customerManager");
			return (Criteria) this;
		}

		public Criteria andCustomerManagerNotLike(String value) {
			addCriterion("customer_manager not like", value, "customerManager");
			return (Criteria) this;
		}

		public Criteria andCustomerManagerIn(List<String> values) {
			addCriterion("customer_manager in", values, "customerManager");
			return (Criteria) this;
		}

		public Criteria andCustomerManagerNotIn(List<String> values) {
			addCriterion("customer_manager not in", values, "customerManager");
			return (Criteria) this;
		}

		public Criteria andCustomerManagerBetween(String value1, String value2) {
			addCriterion("customer_manager between", value1, value2, "customerManager");
			return (Criteria) this;
		}

		public Criteria andCustomerManagerNotBetween(String value1, String value2) {
			addCriterion("customer_manager not between", value1, value2, "customerManager");
			return (Criteria) this;
		}

		public Criteria andCustomerManagerMobileIsNull() {
			addCriterion("customer_manager_mobile is null");
			return (Criteria) this;
		}

		public Criteria andCustomerManagerMobileIsNotNull() {
			addCriterion("customer_manager_mobile is not null");
			return (Criteria) this;
		}

		public Criteria andCustomerManagerMobileEqualTo(String value) {
			addCriterion("customer_manager_mobile =", value, "customerManagerMobile");
			return (Criteria) this;
		}

		public Criteria andCustomerManagerMobileNotEqualTo(String value) {
			addCriterion("customer_manager_mobile <>", value, "customerManagerMobile");
			return (Criteria) this;
		}

		public Criteria andCustomerManagerMobileGreaterThan(String value) {
			addCriterion("customer_manager_mobile >", value, "customerManagerMobile");
			return (Criteria) this;
		}

		public Criteria andCustomerManagerMobileGreaterThanOrEqualTo(String value) {
			addCriterion("customer_manager_mobile >=", value, "customerManagerMobile");
			return (Criteria) this;
		}

		public Criteria andCustomerManagerMobileLessThan(String value) {
			addCriterion("customer_manager_mobile <", value, "customerManagerMobile");
			return (Criteria) this;
		}

		public Criteria andCustomerManagerMobileLessThanOrEqualTo(String value) {
			addCriterion("customer_manager_mobile <=", value, "customerManagerMobile");
			return (Criteria) this;
		}

		public Criteria andCustomerManagerMobileLike(String value) {
			addCriterion("customer_manager_mobile like", value, "customerManagerMobile");
			return (Criteria) this;
		}

		public Criteria andCustomerManagerMobileNotLike(String value) {
			addCriterion("customer_manager_mobile not like", value, "customerManagerMobile");
			return (Criteria) this;
		}

		public Criteria andCustomerManagerMobileIn(List<String> values) {
			addCriterion("customer_manager_mobile in", values, "customerManagerMobile");
			return (Criteria) this;
		}

		public Criteria andCustomerManagerMobileNotIn(List<String> values) {
			addCriterion("customer_manager_mobile not in", values, "customerManagerMobile");
			return (Criteria) this;
		}

		public Criteria andCustomerManagerMobileBetween(String value1, String value2) {
			addCriterion("customer_manager_mobile between", value1, value2, "customerManagerMobile");
			return (Criteria) this;
		}

		public Criteria andCustomerManagerMobileNotBetween(String value1, String value2) {
			addCriterion("customer_manager_mobile not between", value1, value2, "customerManagerMobile");
			return (Criteria) this;
		}

		public Criteria andPoundageIsNull() {
			addCriterion("poundage is null");
			return (Criteria) this;
		}

		public Criteria andPoundageIsNotNull() {
			addCriterion("poundage is not null");
			return (Criteria) this;
		}

		public Criteria andPoundageEqualTo(Integer value) {
			addCriterion("poundage =", value, "poundage");
			return (Criteria) this;
		}

		public Criteria andPoundageNotEqualTo(Integer value) {
			addCriterion("poundage <>", value, "poundage");
			return (Criteria) this;
		}

		public Criteria andPoundageGreaterThan(Integer value) {
			addCriterion("poundage >", value, "poundage");
			return (Criteria) this;
		}

		public Criteria andPoundageGreaterThanOrEqualTo(Integer value) {
			addCriterion("poundage >=", value, "poundage");
			return (Criteria) this;
		}

		public Criteria andPoundageLessThan(Integer value) {
			addCriterion("poundage <", value, "poundage");
			return (Criteria) this;
		}

		public Criteria andPoundageLessThanOrEqualTo(Integer value) {
			addCriterion("poundage <=", value, "poundage");
			return (Criteria) this;
		}

		public Criteria andPoundageIn(List<Integer> values) {
			addCriterion("poundage in", values, "poundage");
			return (Criteria) this;
		}

		public Criteria andPoundageNotIn(List<Integer> values) {
			addCriterion("poundage not in", values, "poundage");
			return (Criteria) this;
		}

		public Criteria andPoundageBetween(Integer value1, Integer value2) {
			addCriterion("poundage between", value1, value2, "poundage");
			return (Criteria) this;
		}

		public Criteria andPoundageNotBetween(Integer value1, Integer value2) {
			addCriterion("poundage not between", value1, value2, "poundage");
			return (Criteria) this;
		}

		public Criteria andPoundageCompensationIsNull() {
			addCriterion("poundage_compensation is null");
			return (Criteria) this;
		}

		public Criteria andPoundageCompensationIsNotNull() {
			addCriterion("poundage_compensation is not null");
			return (Criteria) this;
		}

		public Criteria andPoundageCompensationEqualTo(Integer value) {
			addCriterion("poundage_compensation =", value, "poundageCompensation");
			return (Criteria) this;
		}

		public Criteria andPoundageCompensationNotEqualTo(Integer value) {
			addCriterion("poundage_compensation <>", value, "poundageCompensation");
			return (Criteria) this;
		}

		public Criteria andPoundageCompensationGreaterThan(Integer value) {
			addCriterion("poundage_compensation >", value, "poundageCompensation");
			return (Criteria) this;
		}

		public Criteria andPoundageCompensationGreaterThanOrEqualTo(Integer value) {
			addCriterion("poundage_compensation >=", value, "poundageCompensation");
			return (Criteria) this;
		}

		public Criteria andPoundageCompensationLessThan(Integer value) {
			addCriterion("poundage_compensation <", value, "poundageCompensation");
			return (Criteria) this;
		}

		public Criteria andPoundageCompensationLessThanOrEqualTo(Integer value) {
			addCriterion("poundage_compensation <=", value, "poundageCompensation");
			return (Criteria) this;
		}

		public Criteria andPoundageCompensationIn(List<Integer> values) {
			addCriterion("poundage_compensation in", values, "poundageCompensation");
			return (Criteria) this;
		}

		public Criteria andPoundageCompensationNotIn(List<Integer> values) {
			addCriterion("poundage_compensation not in", values, "poundageCompensation");
			return (Criteria) this;
		}

		public Criteria andPoundageCompensationBetween(Integer value1, Integer value2) {
			addCriterion("poundage_compensation between", value1, value2, "poundageCompensation");
			return (Criteria) this;
		}

		public Criteria andPoundageCompensationNotBetween(Integer value1, Integer value2) {
			addCriterion("poundage_compensation not between", value1, value2, "poundageCompensation");
			return (Criteria) this;
		}

		public Criteria andCreditorEntrustExpireTimeIsNull() {
			addCriterion("creditor_entrust_expire_time is null");
			return (Criteria) this;
		}

		public Criteria andCreditorEntrustExpireTimeIsNotNull() {
			addCriterion("creditor_entrust_expire_time is not null");
			return (Criteria) this;
		}

		public Criteria andCreditorEntrustExpireTimeEqualTo(Date value) {
			addCriterion("creditor_entrust_expire_time =", value, "creditorEntrustExpireTime");
			return (Criteria) this;
		}

		public Criteria andCreditorEntrustExpireTimeNotEqualTo(Date value) {
			addCriterion("creditor_entrust_expire_time <>", value, "creditorEntrustExpireTime");
			return (Criteria) this;
		}

		public Criteria andCreditorEntrustExpireTimeGreaterThan(Date value) {
			addCriterion("creditor_entrust_expire_time >", value, "creditorEntrustExpireTime");
			return (Criteria) this;
		}

		public Criteria andCreditorEntrustExpireTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("creditor_entrust_expire_time >=", value, "creditorEntrustExpireTime");
			return (Criteria) this;
		}

		public Criteria andCreditorEntrustExpireTimeLessThan(Date value) {
			addCriterion("creditor_entrust_expire_time <", value, "creditorEntrustExpireTime");
			return (Criteria) this;
		}

		public Criteria andCreditorEntrustExpireTimeLessThanOrEqualTo(Date value) {
			addCriterion("creditor_entrust_expire_time <=", value, "creditorEntrustExpireTime");
			return (Criteria) this;
		}

		public Criteria andCreditorEntrustExpireTimeIn(List<Date> values) {
			addCriterion("creditor_entrust_expire_time in", values, "creditorEntrustExpireTime");
			return (Criteria) this;
		}

		public Criteria andCreditorEntrustExpireTimeNotIn(List<Date> values) {
			addCriterion("creditor_entrust_expire_time not in", values, "creditorEntrustExpireTime");
			return (Criteria) this;
		}

		public Criteria andCreditorEntrustExpireTimeBetween(Date value1, Date value2) {
			addCriterion("creditor_entrust_expire_time between", value1, value2, "creditorEntrustExpireTime");
			return (Criteria) this;
		}

		public Criteria andCreditorEntrustExpireTimeNotBetween(Date value1, Date value2) {
			addCriterion("creditor_entrust_expire_time not between", value1, value2, "creditorEntrustExpireTime");
			return (Criteria) this;
		}

		public Criteria andFundsProviderIsNull() {
			addCriterion("funds_provider is null");
			return (Criteria) this;
		}

		public Criteria andFundsProviderIsNotNull() {
			addCriterion("funds_provider is not null");
			return (Criteria) this;
		}

		public Criteria andFundsProviderEqualTo(String value) {
			addCriterion("funds_provider =", value, "fundsProvider");
			return (Criteria) this;
		}

		public Criteria andFundsProviderNotEqualTo(String value) {
			addCriterion("funds_provider <>", value, "fundsProvider");
			return (Criteria) this;
		}

		public Criteria andFundsProviderGreaterThan(String value) {
			addCriterion("funds_provider >", value, "fundsProvider");
			return (Criteria) this;
		}

		public Criteria andFundsProviderGreaterThanOrEqualTo(String value) {
			addCriterion("funds_provider >=", value, "fundsProvider");
			return (Criteria) this;
		}

		public Criteria andFundsProviderLessThan(String value) {
			addCriterion("funds_provider <", value, "fundsProvider");
			return (Criteria) this;
		}

		public Criteria andFundsProviderLessThanOrEqualTo(String value) {
			addCriterion("funds_provider <=", value, "fundsProvider");
			return (Criteria) this;
		}

		public Criteria andFundsProviderLike(String value) {
			addCriterion("funds_provider like", value, "fundsProvider");
			return (Criteria) this;
		}

		public Criteria andFundsProviderNotLike(String value) {
			addCriterion("funds_provider not like", value, "fundsProvider");
			return (Criteria) this;
		}

		public Criteria andFundsProviderIn(List<String> values) {
			addCriterion("funds_provider in", values, "fundsProvider");
			return (Criteria) this;
		}

		public Criteria andFundsProviderNotIn(List<String> values) {
			addCriterion("funds_provider not in", values, "fundsProvider");
			return (Criteria) this;
		}

		public Criteria andFundsProviderBetween(String value1, String value2) {
			addCriterion("funds_provider between", value1, value2, "fundsProvider");
			return (Criteria) this;
		}

		public Criteria andFundsProviderNotBetween(String value1, String value2) {
			addCriterion("funds_provider not between", value1, value2, "fundsProvider");
			return (Criteria) this;
		}

		public Criteria andProductNameIsNull() {
			addCriterion("product_name is null");
			return (Criteria) this;
		}

		public Criteria andProductNameIsNotNull() {
			addCriterion("product_name is not null");
			return (Criteria) this;
		}

		public Criteria andProductNameEqualTo(String value) {
			addCriterion("product_name =", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotEqualTo(String value) {
			addCriterion("product_name <>", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameGreaterThan(String value) {
			addCriterion("product_name >", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameGreaterThanOrEqualTo(String value) {
			addCriterion("product_name >=", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameLessThan(String value) {
			addCriterion("product_name <", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameLessThanOrEqualTo(String value) {
			addCriterion("product_name <=", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameLike(String value) {
			addCriterion("product_name like", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotLike(String value) {
			addCriterion("product_name not like", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameIn(List<String> values) {
			addCriterion("product_name in", values, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotIn(List<String> values) {
			addCriterion("product_name not in", values, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameBetween(String value1, String value2) {
			addCriterion("product_name between", value1, value2, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotBetween(String value1, String value2) {
			addCriterion("product_name not between", value1, value2, "productName");
			return (Criteria) this;
		}

		public Criteria andProductCodeIsNull() {
			addCriterion("product_code is null");
			return (Criteria) this;
		}

		public Criteria andProductCodeIsNotNull() {
			addCriterion("product_code is not null");
			return (Criteria) this;
		}

		public Criteria andProductCodeEqualTo(String value) {
			addCriterion("product_code =", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeNotEqualTo(String value) {
			addCriterion("product_code <>", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeGreaterThan(String value) {
			addCriterion("product_code >", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
			addCriterion("product_code >=", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeLessThan(String value) {
			addCriterion("product_code <", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeLessThanOrEqualTo(String value) {
			addCriterion("product_code <=", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeLike(String value) {
			addCriterion("product_code like", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeNotLike(String value) {
			addCriterion("product_code not like", value, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeIn(List<String> values) {
			addCriterion("product_code in", values, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeNotIn(List<String> values) {
			addCriterion("product_code not in", values, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeBetween(String value1, String value2) {
			addCriterion("product_code between", value1, value2, "productCode");
			return (Criteria) this;
		}

		public Criteria andProductCodeNotBetween(String value1, String value2) {
			addCriterion("product_code not between", value1, value2, "productCode");
			return (Criteria) this;
		}

		public Criteria andBillNoIsNull() {
			addCriterion("bill_no is null");
			return (Criteria) this;
		}

		public Criteria andBillNoIsNotNull() {
			addCriterion("bill_no is not null");
			return (Criteria) this;
		}

		public Criteria andBillNoEqualTo(String value) {
			addCriterion("bill_no =", value, "billNo");
			return (Criteria) this;
		}

		public Criteria andBillNoNotEqualTo(String value) {
			addCriterion("bill_no <>", value, "billNo");
			return (Criteria) this;
		}

		public Criteria andBillNoGreaterThan(String value) {
			addCriterion("bill_no >", value, "billNo");
			return (Criteria) this;
		}

		public Criteria andBillNoGreaterThanOrEqualTo(String value) {
			addCriterion("bill_no >=", value, "billNo");
			return (Criteria) this;
		}

		public Criteria andBillNoLessThan(String value) {
			addCriterion("bill_no <", value, "billNo");
			return (Criteria) this;
		}

		public Criteria andBillNoLessThanOrEqualTo(String value) {
			addCriterion("bill_no <=", value, "billNo");
			return (Criteria) this;
		}

		public Criteria andBillNoLike(String value) {
			addCriterion("bill_no like", value, "billNo");
			return (Criteria) this;
		}

		public Criteria andBillNoNotLike(String value) {
			addCriterion("bill_no not like", value, "billNo");
			return (Criteria) this;
		}

		public Criteria andBillNoIn(List<String> values) {
			addCriterion("bill_no in", values, "billNo");
			return (Criteria) this;
		}

		public Criteria andBillNoNotIn(List<String> values) {
			addCriterion("bill_no not in", values, "billNo");
			return (Criteria) this;
		}

		public Criteria andBillNoBetween(String value1, String value2) {
			addCriterion("bill_no between", value1, value2, "billNo");
			return (Criteria) this;
		}

		public Criteria andBillNoNotBetween(String value1, String value2) {
			addCriterion("bill_no not between", value1, value2, "billNo");
			return (Criteria) this;
		}

		public Criteria andDataSourceIsNull() {
			addCriterion("data_source is null");
			return (Criteria) this;
		}

		public Criteria andDataSourceIsNotNull() {
			addCriterion("data_source is not null");
			return (Criteria) this;
		}

		public Criteria andDataSourceEqualTo(String value) {
			addCriterion("data_source =", value, "dataSource");
			return (Criteria) this;
		}

		public Criteria andDataSourceNotEqualTo(String value) {
			addCriterion("data_source <>", value, "dataSource");
			return (Criteria) this;
		}

		public Criteria andDataSourceGreaterThan(String value) {
			addCriterion("data_source >", value, "dataSource");
			return (Criteria) this;
		}

		public Criteria andDataSourceGreaterThanOrEqualTo(String value) {
			addCriterion("data_source >=", value, "dataSource");
			return (Criteria) this;
		}

		public Criteria andDataSourceLessThan(String value) {
			addCriterion("data_source <", value, "dataSource");
			return (Criteria) this;
		}

		public Criteria andDataSourceLessThanOrEqualTo(String value) {
			addCriterion("data_source <=", value, "dataSource");
			return (Criteria) this;
		}

		public Criteria andDataSourceLike(String value) {
			addCriterion("data_source like", value, "dataSource");
			return (Criteria) this;
		}

		public Criteria andDataSourceNotLike(String value) {
			addCriterion("data_source not like", value, "dataSource");
			return (Criteria) this;
		}

		public Criteria andDataSourceIn(List<String> values) {
			addCriterion("data_source in", values, "dataSource");
			return (Criteria) this;
		}

		public Criteria andDataSourceNotIn(List<String> values) {
			addCriterion("data_source not in", values, "dataSource");
			return (Criteria) this;
		}

		public Criteria andDataSourceBetween(String value1, String value2) {
			addCriterion("data_source between", value1, value2, "dataSource");
			return (Criteria) this;
		}

		public Criteria andDataSourceNotBetween(String value1, String value2) {
			addCriterion("data_source not between", value1, value2, "dataSource");
			return (Criteria) this;
		}

		public Criteria andPubTimeIsNull() {
			addCriterion("pub_time is null");
			return (Criteria) this;
		}

		public Criteria andPubTimeIsNotNull() {
			addCriterion("pub_time is not null");
			return (Criteria) this;
		}

		public Criteria andPubTimeEqualTo(Date value) {
			addCriterion("pub_time =", value, "pubTime");
			return (Criteria) this;
		}

		public Criteria andPubTimeNotEqualTo(Date value) {
			addCriterion("pub_time <>", value, "pubTime");
			return (Criteria) this;
		}

		public Criteria andPubTimeGreaterThan(Date value) {
			addCriterion("pub_time >", value, "pubTime");
			return (Criteria) this;
		}

		public Criteria andPubTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("pub_time >=", value, "pubTime");
			return (Criteria) this;
		}

		public Criteria andPubTimeLessThan(Date value) {
			addCriterion("pub_time <", value, "pubTime");
			return (Criteria) this;
		}

		public Criteria andPubTimeLessThanOrEqualTo(Date value) {
			addCriterion("pub_time <=", value, "pubTime");
			return (Criteria) this;
		}

		public Criteria andPubTimeIn(List<Date> values) {
			addCriterion("pub_time in", values, "pubTime");
			return (Criteria) this;
		}

		public Criteria andPubTimeNotIn(List<Date> values) {
			addCriterion("pub_time not in", values, "pubTime");
			return (Criteria) this;
		}

		public Criteria andPubTimeBetween(Date value1, Date value2) {
			addCriterion("pub_time between", value1, value2, "pubTime");
			return (Criteria) this;
		}

		public Criteria andPubTimeNotBetween(Date value1, Date value2) {
			addCriterion("pub_time not between", value1, value2, "pubTime");
			return (Criteria) this;
		}

		public Criteria andLoanAgreementUrlIsNull() {
			addCriterion("loan_agreement_url is null");
			return (Criteria) this;
		}

		public Criteria andLoanAgreementUrlIsNotNull() {
			addCriterion("loan_agreement_url is not null");
			return (Criteria) this;
		}

		public Criteria andLoanAgreementUrlEqualTo(String value) {
			addCriterion("loan_agreement_url =", value, "loanAgreementUrl");
			return (Criteria) this;
		}

		public Criteria andLoanAgreementUrlNotEqualTo(String value) {
			addCriterion("loan_agreement_url <>", value, "loanAgreementUrl");
			return (Criteria) this;
		}

		public Criteria andLoanAgreementUrlGreaterThan(String value) {
			addCriterion("loan_agreement_url >", value, "loanAgreementUrl");
			return (Criteria) this;
		}

		public Criteria andLoanAgreementUrlGreaterThanOrEqualTo(String value) {
			addCriterion("loan_agreement_url >=", value, "loanAgreementUrl");
			return (Criteria) this;
		}

		public Criteria andLoanAgreementUrlLessThan(String value) {
			addCriterion("loan_agreement_url <", value, "loanAgreementUrl");
			return (Criteria) this;
		}

		public Criteria andLoanAgreementUrlLessThanOrEqualTo(String value) {
			addCriterion("loan_agreement_url <=", value, "loanAgreementUrl");
			return (Criteria) this;
		}

		public Criteria andLoanAgreementUrlLike(String value) {
			addCriterion("loan_agreement_url like", value, "loanAgreementUrl");
			return (Criteria) this;
		}

		public Criteria andLoanAgreementUrlNotLike(String value) {
			addCriterion("loan_agreement_url not like", value, "loanAgreementUrl");
			return (Criteria) this;
		}

		public Criteria andLoanAgreementUrlIn(List<String> values) {
			addCriterion("loan_agreement_url in", values, "loanAgreementUrl");
			return (Criteria) this;
		}

		public Criteria andLoanAgreementUrlNotIn(List<String> values) {
			addCriterion("loan_agreement_url not in", values, "loanAgreementUrl");
			return (Criteria) this;
		}

		public Criteria andLoanAgreementUrlBetween(String value1, String value2) {
			addCriterion("loan_agreement_url between", value1, value2, "loanAgreementUrl");
			return (Criteria) this;
		}

		public Criteria andLoanAgreementUrlNotBetween(String value1, String value2) {
			addCriterion("loan_agreement_url not between", value1, value2, "loanAgreementUrl");
			return (Criteria) this;
		}

		public Criteria andTaskCodeRemarkIsNull() {
			addCriterion("task_code_remark is null");
			return (Criteria) this;
		}

		public Criteria andTaskCodeRemarkIsNotNull() {
			addCriterion("task_code_remark is not null");
			return (Criteria) this;
		}

		public Criteria andTaskCodeRemarkEqualTo(String value) {
			addCriterion("task_code_remark =", value, "taskCodeRemark");
			return (Criteria) this;
		}

		public Criteria andTaskCodeRemarkNotEqualTo(String value) {
			addCriterion("task_code_remark <>", value, "taskCodeRemark");
			return (Criteria) this;
		}

		public Criteria andTaskCodeRemarkGreaterThan(String value) {
			addCriterion("task_code_remark >", value, "taskCodeRemark");
			return (Criteria) this;
		}

		public Criteria andTaskCodeRemarkGreaterThanOrEqualTo(String value) {
			addCriterion("task_code_remark >=", value, "taskCodeRemark");
			return (Criteria) this;
		}

		public Criteria andTaskCodeRemarkLessThan(String value) {
			addCriterion("task_code_remark <", value, "taskCodeRemark");
			return (Criteria) this;
		}

		public Criteria andTaskCodeRemarkLessThanOrEqualTo(String value) {
			addCriterion("task_code_remark <=", value, "taskCodeRemark");
			return (Criteria) this;
		}

		public Criteria andTaskCodeRemarkLike(String value) {
			addCriterion("task_code_remark like", value, "taskCodeRemark");
			return (Criteria) this;
		}

		public Criteria andTaskCodeRemarkNotLike(String value) {
			addCriterion("task_code_remark not like", value, "taskCodeRemark");
			return (Criteria) this;
		}

		public Criteria andTaskCodeRemarkIn(List<String> values) {
			addCriterion("task_code_remark in", values, "taskCodeRemark");
			return (Criteria) this;
		}

		public Criteria andTaskCodeRemarkNotIn(List<String> values) {
			addCriterion("task_code_remark not in", values, "taskCodeRemark");
			return (Criteria) this;
		}

		public Criteria andTaskCodeRemarkBetween(String value1, String value2) {
			addCriterion("task_code_remark between", value1, value2, "taskCodeRemark");
			return (Criteria) this;
		}

		public Criteria andTaskCodeRemarkNotBetween(String value1, String value2) {
			addCriterion("task_code_remark not between", value1, value2, "taskCodeRemark");
			return (Criteria) this;
		}
	}

	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	public static class Criterion {
		private String condition;

		private Object value;

		private Object secondValue;

		private boolean noValue;

		private boolean singleValue;

		private boolean betweenValue;

		private boolean listValue;

		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}
}