package com.aitravelba.pojo.yihui;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DebtorExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	protected int limitStart = -1;

	protected int limitEnd = -1;

	public DebtorExample() {
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

		public Criteria andCardTypeIsNull() {
			addCriterion("card_type is null");
			return (Criteria) this;
		}

		public Criteria andCardTypeIsNotNull() {
			addCriterion("card_type is not null");
			return (Criteria) this;
		}

		public Criteria andCardTypeEqualTo(Byte value) {
			addCriterion("card_type =", value, "cardType");
			return (Criteria) this;
		}

		public Criteria andCardTypeNotEqualTo(Byte value) {
			addCriterion("card_type <>", value, "cardType");
			return (Criteria) this;
		}

		public Criteria andCardTypeGreaterThan(Byte value) {
			addCriterion("card_type >", value, "cardType");
			return (Criteria) this;
		}

		public Criteria andCardTypeGreaterThanOrEqualTo(Byte value) {
			addCriterion("card_type >=", value, "cardType");
			return (Criteria) this;
		}

		public Criteria andCardTypeLessThan(Byte value) {
			addCriterion("card_type <", value, "cardType");
			return (Criteria) this;
		}

		public Criteria andCardTypeLessThanOrEqualTo(Byte value) {
			addCriterion("card_type <=", value, "cardType");
			return (Criteria) this;
		}

		public Criteria andCardTypeIn(List<Byte> values) {
			addCriterion("card_type in", values, "cardType");
			return (Criteria) this;
		}

		public Criteria andCardTypeNotIn(List<Byte> values) {
			addCriterion("card_type not in", values, "cardType");
			return (Criteria) this;
		}

		public Criteria andCardTypeBetween(Byte value1, Byte value2) {
			addCriterion("card_type between", value1, value2, "cardType");
			return (Criteria) this;
		}

		public Criteria andCardTypeNotBetween(Byte value1, Byte value2) {
			addCriterion("card_type not between", value1, value2, "cardType");
			return (Criteria) this;
		}

		public Criteria andCardNoIsNull() {
			addCriterion("card_no is null");
			return (Criteria) this;
		}

		public Criteria andCardNoIsNotNull() {
			addCriterion("card_no is not null");
			return (Criteria) this;
		}

		public Criteria andCardNoEqualTo(String value) {
			addCriterion("card_no =", value, "cardNo");
			return (Criteria) this;
		}

		public Criteria andCardNoNotEqualTo(String value) {
			addCriterion("card_no <>", value, "cardNo");
			return (Criteria) this;
		}

		public Criteria andCardNoGreaterThan(String value) {
			addCriterion("card_no >", value, "cardNo");
			return (Criteria) this;
		}

		public Criteria andCardNoGreaterThanOrEqualTo(String value) {
			addCriterion("card_no >=", value, "cardNo");
			return (Criteria) this;
		}

		public Criteria andCardNoLessThan(String value) {
			addCriterion("card_no <", value, "cardNo");
			return (Criteria) this;
		}

		public Criteria andCardNoLessThanOrEqualTo(String value) {
			addCriterion("card_no <=", value, "cardNo");
			return (Criteria) this;
		}

		public Criteria andCardNoLike(String value) {
			addCriterion("card_no like", value, "cardNo");
			return (Criteria) this;
		}

		public Criteria andCardNoNotLike(String value) {
			addCriterion("card_no not like", value, "cardNo");
			return (Criteria) this;
		}

		public Criteria andCardNoIn(List<String> values) {
			addCriterion("card_no in", values, "cardNo");
			return (Criteria) this;
		}

		public Criteria andCardNoNotIn(List<String> values) {
			addCriterion("card_no not in", values, "cardNo");
			return (Criteria) this;
		}

		public Criteria andCardNoBetween(String value1, String value2) {
			addCriterion("card_no between", value1, value2, "cardNo");
			return (Criteria) this;
		}

		public Criteria andCardNoNotBetween(String value1, String value2) {
			addCriterion("card_no not between", value1, value2, "cardNo");
			return (Criteria) this;
		}

		public Criteria andRealNameIsNull() {
			addCriterion("real_name is null");
			return (Criteria) this;
		}

		public Criteria andRealNameIsNotNull() {
			addCriterion("real_name is not null");
			return (Criteria) this;
		}

		public Criteria andRealNameEqualTo(String value) {
			addCriterion("real_name =", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameNotEqualTo(String value) {
			addCriterion("real_name <>", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameGreaterThan(String value) {
			addCriterion("real_name >", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameGreaterThanOrEqualTo(String value) {
			addCriterion("real_name >=", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameLessThan(String value) {
			addCriterion("real_name <", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameLessThanOrEqualTo(String value) {
			addCriterion("real_name <=", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameLike(String value) {
			addCriterion("real_name like", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameNotLike(String value) {
			addCriterion("real_name not like", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameIn(List<String> values) {
			addCriterion("real_name in", values, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameNotIn(List<String> values) {
			addCriterion("real_name not in", values, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameBetween(String value1, String value2) {
			addCriterion("real_name between", value1, value2, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameNotBetween(String value1, String value2) {
			addCriterion("real_name not between", value1, value2, "realName");
			return (Criteria) this;
		}

		public Criteria andSexIsNull() {
			addCriterion("sex is null");
			return (Criteria) this;
		}

		public Criteria andSexIsNotNull() {
			addCriterion("sex is not null");
			return (Criteria) this;
		}

		public Criteria andSexEqualTo(Byte value) {
			addCriterion("sex =", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotEqualTo(Byte value) {
			addCriterion("sex <>", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexGreaterThan(Byte value) {
			addCriterion("sex >", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexGreaterThanOrEqualTo(Byte value) {
			addCriterion("sex >=", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLessThan(Byte value) {
			addCriterion("sex <", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLessThanOrEqualTo(Byte value) {
			addCriterion("sex <=", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexIn(List<Byte> values) {
			addCriterion("sex in", values, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotIn(List<Byte> values) {
			addCriterion("sex not in", values, "sex");
			return (Criteria) this;
		}

		public Criteria andSexBetween(Byte value1, Byte value2) {
			addCriterion("sex between", value1, value2, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotBetween(Byte value1, Byte value2) {
			addCriterion("sex not between", value1, value2, "sex");
			return (Criteria) this;
		}

		public Criteria andMaritalStatusIsNull() {
			addCriterion("marital_status is null");
			return (Criteria) this;
		}

		public Criteria andMaritalStatusIsNotNull() {
			addCriterion("marital_status is not null");
			return (Criteria) this;
		}

		public Criteria andMaritalStatusEqualTo(Byte value) {
			addCriterion("marital_status =", value, "maritalStatus");
			return (Criteria) this;
		}

		public Criteria andMaritalStatusNotEqualTo(Byte value) {
			addCriterion("marital_status <>", value, "maritalStatus");
			return (Criteria) this;
		}

		public Criteria andMaritalStatusGreaterThan(Byte value) {
			addCriterion("marital_status >", value, "maritalStatus");
			return (Criteria) this;
		}

		public Criteria andMaritalStatusGreaterThanOrEqualTo(Byte value) {
			addCriterion("marital_status >=", value, "maritalStatus");
			return (Criteria) this;
		}

		public Criteria andMaritalStatusLessThan(Byte value) {
			addCriterion("marital_status <", value, "maritalStatus");
			return (Criteria) this;
		}

		public Criteria andMaritalStatusLessThanOrEqualTo(Byte value) {
			addCriterion("marital_status <=", value, "maritalStatus");
			return (Criteria) this;
		}

		public Criteria andMaritalStatusIn(List<Byte> values) {
			addCriterion("marital_status in", values, "maritalStatus");
			return (Criteria) this;
		}

		public Criteria andMaritalStatusNotIn(List<Byte> values) {
			addCriterion("marital_status not in", values, "maritalStatus");
			return (Criteria) this;
		}

		public Criteria andMaritalStatusBetween(Byte value1, Byte value2) {
			addCriterion("marital_status between", value1, value2, "maritalStatus");
			return (Criteria) this;
		}

		public Criteria andMaritalStatusNotBetween(Byte value1, Byte value2) {
			addCriterion("marital_status not between", value1, value2, "maritalStatus");
			return (Criteria) this;
		}

		public Criteria andChildrenStatusIsNull() {
			addCriterion("children_status is null");
			return (Criteria) this;
		}

		public Criteria andChildrenStatusIsNotNull() {
			addCriterion("children_status is not null");
			return (Criteria) this;
		}

		public Criteria andChildrenStatusEqualTo(Byte value) {
			addCriterion("children_status =", value, "childrenStatus");
			return (Criteria) this;
		}

		public Criteria andChildrenStatusNotEqualTo(Byte value) {
			addCriterion("children_status <>", value, "childrenStatus");
			return (Criteria) this;
		}

		public Criteria andChildrenStatusGreaterThan(Byte value) {
			addCriterion("children_status >", value, "childrenStatus");
			return (Criteria) this;
		}

		public Criteria andChildrenStatusGreaterThanOrEqualTo(Byte value) {
			addCriterion("children_status >=", value, "childrenStatus");
			return (Criteria) this;
		}

		public Criteria andChildrenStatusLessThan(Byte value) {
			addCriterion("children_status <", value, "childrenStatus");
			return (Criteria) this;
		}

		public Criteria andChildrenStatusLessThanOrEqualTo(Byte value) {
			addCriterion("children_status <=", value, "childrenStatus");
			return (Criteria) this;
		}

		public Criteria andChildrenStatusIn(List<Byte> values) {
			addCriterion("children_status in", values, "childrenStatus");
			return (Criteria) this;
		}

		public Criteria andChildrenStatusNotIn(List<Byte> values) {
			addCriterion("children_status not in", values, "childrenStatus");
			return (Criteria) this;
		}

		public Criteria andChildrenStatusBetween(Byte value1, Byte value2) {
			addCriterion("children_status between", value1, value2, "childrenStatus");
			return (Criteria) this;
		}

		public Criteria andChildrenStatusNotBetween(Byte value1, Byte value2) {
			addCriterion("children_status not between", value1, value2, "childrenStatus");
			return (Criteria) this;
		}

		public Criteria andMobileIsNull() {
			addCriterion("mobile is null");
			return (Criteria) this;
		}

		public Criteria andMobileIsNotNull() {
			addCriterion("mobile is not null");
			return (Criteria) this;
		}

		public Criteria andMobileEqualTo(String value) {
			addCriterion("mobile =", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotEqualTo(String value) {
			addCriterion("mobile <>", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileGreaterThan(String value) {
			addCriterion("mobile >", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileGreaterThanOrEqualTo(String value) {
			addCriterion("mobile >=", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLessThan(String value) {
			addCriterion("mobile <", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLessThanOrEqualTo(String value) {
			addCriterion("mobile <=", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLike(String value) {
			addCriterion("mobile like", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotLike(String value) {
			addCriterion("mobile not like", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileIn(List<String> values) {
			addCriterion("mobile in", values, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotIn(List<String> values) {
			addCriterion("mobile not in", values, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileBetween(String value1, String value2) {
			addCriterion("mobile between", value1, value2, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotBetween(String value1, String value2) {
			addCriterion("mobile not between", value1, value2, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileStatusIsNull() {
			addCriterion("mobile_status is null");
			return (Criteria) this;
		}

		public Criteria andMobileStatusIsNotNull() {
			addCriterion("mobile_status is not null");
			return (Criteria) this;
		}

		public Criteria andMobileStatusEqualTo(Byte value) {
			addCriterion("mobile_status =", value, "mobileStatus");
			return (Criteria) this;
		}

		public Criteria andMobileStatusNotEqualTo(Byte value) {
			addCriterion("mobile_status <>", value, "mobileStatus");
			return (Criteria) this;
		}

		public Criteria andMobileStatusGreaterThan(Byte value) {
			addCriterion("mobile_status >", value, "mobileStatus");
			return (Criteria) this;
		}

		public Criteria andMobileStatusGreaterThanOrEqualTo(Byte value) {
			addCriterion("mobile_status >=", value, "mobileStatus");
			return (Criteria) this;
		}

		public Criteria andMobileStatusLessThan(Byte value) {
			addCriterion("mobile_status <", value, "mobileStatus");
			return (Criteria) this;
		}

		public Criteria andMobileStatusLessThanOrEqualTo(Byte value) {
			addCriterion("mobile_status <=", value, "mobileStatus");
			return (Criteria) this;
		}

		public Criteria andMobileStatusIn(List<Byte> values) {
			addCriterion("mobile_status in", values, "mobileStatus");
			return (Criteria) this;
		}

		public Criteria andMobileStatusNotIn(List<Byte> values) {
			addCriterion("mobile_status not in", values, "mobileStatus");
			return (Criteria) this;
		}

		public Criteria andMobileStatusBetween(Byte value1, Byte value2) {
			addCriterion("mobile_status between", value1, value2, "mobileStatus");
			return (Criteria) this;
		}

		public Criteria andMobileStatusNotBetween(Byte value1, Byte value2) {
			addCriterion("mobile_status not between", value1, value2, "mobileStatus");
			return (Criteria) this;
		}

		public Criteria andEmailIsNull() {
			addCriterion("email is null");
			return (Criteria) this;
		}

		public Criteria andEmailIsNotNull() {
			addCriterion("email is not null");
			return (Criteria) this;
		}

		public Criteria andEmailEqualTo(String value) {
			addCriterion("email =", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotEqualTo(String value) {
			addCriterion("email <>", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThan(String value) {
			addCriterion("email >", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThanOrEqualTo(String value) {
			addCriterion("email >=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThan(String value) {
			addCriterion("email <", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThanOrEqualTo(String value) {
			addCriterion("email <=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLike(String value) {
			addCriterion("email like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotLike(String value) {
			addCriterion("email not like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailIn(List<String> values) {
			addCriterion("email in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotIn(List<String> values) {
			addCriterion("email not in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailBetween(String value1, String value2) {
			addCriterion("email between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotBetween(String value1, String value2) {
			addCriterion("email not between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andQqIsNull() {
			addCriterion("QQ is null");
			return (Criteria) this;
		}

		public Criteria andQqIsNotNull() {
			addCriterion("QQ is not null");
			return (Criteria) this;
		}

		public Criteria andQqEqualTo(String value) {
			addCriterion("QQ =", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqNotEqualTo(String value) {
			addCriterion("QQ <>", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqGreaterThan(String value) {
			addCriterion("QQ >", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqGreaterThanOrEqualTo(String value) {
			addCriterion("QQ >=", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqLessThan(String value) {
			addCriterion("QQ <", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqLessThanOrEqualTo(String value) {
			addCriterion("QQ <=", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqLike(String value) {
			addCriterion("QQ like", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqNotLike(String value) {
			addCriterion("QQ not like", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqIn(List<String> values) {
			addCriterion("QQ in", values, "qq");
			return (Criteria) this;
		}

		public Criteria andQqNotIn(List<String> values) {
			addCriterion("QQ not in", values, "qq");
			return (Criteria) this;
		}

		public Criteria andQqBetween(String value1, String value2) {
			addCriterion("QQ between", value1, value2, "qq");
			return (Criteria) this;
		}

		public Criteria andQqNotBetween(String value1, String value2) {
			addCriterion("QQ not between", value1, value2, "qq");
			return (Criteria) this;
		}

		public Criteria andWebChatIsNull() {
			addCriterion("web_chat is null");
			return (Criteria) this;
		}

		public Criteria andWebChatIsNotNull() {
			addCriterion("web_chat is not null");
			return (Criteria) this;
		}

		public Criteria andWebChatEqualTo(String value) {
			addCriterion("web_chat =", value, "webChat");
			return (Criteria) this;
		}

		public Criteria andWebChatNotEqualTo(String value) {
			addCriterion("web_chat <>", value, "webChat");
			return (Criteria) this;
		}

		public Criteria andWebChatGreaterThan(String value) {
			addCriterion("web_chat >", value, "webChat");
			return (Criteria) this;
		}

		public Criteria andWebChatGreaterThanOrEqualTo(String value) {
			addCriterion("web_chat >=", value, "webChat");
			return (Criteria) this;
		}

		public Criteria andWebChatLessThan(String value) {
			addCriterion("web_chat <", value, "webChat");
			return (Criteria) this;
		}

		public Criteria andWebChatLessThanOrEqualTo(String value) {
			addCriterion("web_chat <=", value, "webChat");
			return (Criteria) this;
		}

		public Criteria andWebChatLike(String value) {
			addCriterion("web_chat like", value, "webChat");
			return (Criteria) this;
		}

		public Criteria andWebChatNotLike(String value) {
			addCriterion("web_chat not like", value, "webChat");
			return (Criteria) this;
		}

		public Criteria andWebChatIn(List<String> values) {
			addCriterion("web_chat in", values, "webChat");
			return (Criteria) this;
		}

		public Criteria andWebChatNotIn(List<String> values) {
			addCriterion("web_chat not in", values, "webChat");
			return (Criteria) this;
		}

		public Criteria andWebChatBetween(String value1, String value2) {
			addCriterion("web_chat between", value1, value2, "webChat");
			return (Criteria) this;
		}

		public Criteria andWebChatNotBetween(String value1, String value2) {
			addCriterion("web_chat not between", value1, value2, "webChat");
			return (Criteria) this;
		}

		public Criteria andResidenceProvinceIsNull() {
			addCriterion("residence_province is null");
			return (Criteria) this;
		}

		public Criteria andResidenceProvinceIsNotNull() {
			addCriterion("residence_province is not null");
			return (Criteria) this;
		}

		public Criteria andResidenceProvinceEqualTo(String value) {
			addCriterion("residence_province =", value, "residenceProvince");
			return (Criteria) this;
		}

		public Criteria andResidenceProvinceNotEqualTo(String value) {
			addCriterion("residence_province <>", value, "residenceProvince");
			return (Criteria) this;
		}

		public Criteria andResidenceProvinceGreaterThan(String value) {
			addCriterion("residence_province >", value, "residenceProvince");
			return (Criteria) this;
		}

		public Criteria andResidenceProvinceGreaterThanOrEqualTo(String value) {
			addCriterion("residence_province >=", value, "residenceProvince");
			return (Criteria) this;
		}

		public Criteria andResidenceProvinceLessThan(String value) {
			addCriterion("residence_province <", value, "residenceProvince");
			return (Criteria) this;
		}

		public Criteria andResidenceProvinceLessThanOrEqualTo(String value) {
			addCriterion("residence_province <=", value, "residenceProvince");
			return (Criteria) this;
		}

		public Criteria andResidenceProvinceLike(String value) {
			addCriterion("residence_province like", value, "residenceProvince");
			return (Criteria) this;
		}

		public Criteria andResidenceProvinceNotLike(String value) {
			addCriterion("residence_province not like", value, "residenceProvince");
			return (Criteria) this;
		}

		public Criteria andResidenceProvinceIn(List<String> values) {
			addCriterion("residence_province in", values, "residenceProvince");
			return (Criteria) this;
		}

		public Criteria andResidenceProvinceNotIn(List<String> values) {
			addCriterion("residence_province not in", values, "residenceProvince");
			return (Criteria) this;
		}

		public Criteria andResidenceProvinceBetween(String value1, String value2) {
			addCriterion("residence_province between", value1, value2, "residenceProvince");
			return (Criteria) this;
		}

		public Criteria andResidenceProvinceNotBetween(String value1, String value2) {
			addCriterion("residence_province not between", value1, value2, "residenceProvince");
			return (Criteria) this;
		}

		public Criteria andResidenceCityIsNull() {
			addCriterion("residence_city is null");
			return (Criteria) this;
		}

		public Criteria andResidenceCityIsNotNull() {
			addCriterion("residence_city is not null");
			return (Criteria) this;
		}

		public Criteria andResidenceCityEqualTo(String value) {
			addCriterion("residence_city =", value, "residenceCity");
			return (Criteria) this;
		}

		public Criteria andResidenceCityNotEqualTo(String value) {
			addCriterion("residence_city <>", value, "residenceCity");
			return (Criteria) this;
		}

		public Criteria andResidenceCityGreaterThan(String value) {
			addCriterion("residence_city >", value, "residenceCity");
			return (Criteria) this;
		}

		public Criteria andResidenceCityGreaterThanOrEqualTo(String value) {
			addCriterion("residence_city >=", value, "residenceCity");
			return (Criteria) this;
		}

		public Criteria andResidenceCityLessThan(String value) {
			addCriterion("residence_city <", value, "residenceCity");
			return (Criteria) this;
		}

		public Criteria andResidenceCityLessThanOrEqualTo(String value) {
			addCriterion("residence_city <=", value, "residenceCity");
			return (Criteria) this;
		}

		public Criteria andResidenceCityLike(String value) {
			addCriterion("residence_city like", value, "residenceCity");
			return (Criteria) this;
		}

		public Criteria andResidenceCityNotLike(String value) {
			addCriterion("residence_city not like", value, "residenceCity");
			return (Criteria) this;
		}

		public Criteria andResidenceCityIn(List<String> values) {
			addCriterion("residence_city in", values, "residenceCity");
			return (Criteria) this;
		}

		public Criteria andResidenceCityNotIn(List<String> values) {
			addCriterion("residence_city not in", values, "residenceCity");
			return (Criteria) this;
		}

		public Criteria andResidenceCityBetween(String value1, String value2) {
			addCriterion("residence_city between", value1, value2, "residenceCity");
			return (Criteria) this;
		}

		public Criteria andResidenceCityNotBetween(String value1, String value2) {
			addCriterion("residence_city not between", value1, value2, "residenceCity");
			return (Criteria) this;
		}

		public Criteria andResidenceAreaIsNull() {
			addCriterion("residence_area is null");
			return (Criteria) this;
		}

		public Criteria andResidenceAreaIsNotNull() {
			addCriterion("residence_area is not null");
			return (Criteria) this;
		}

		public Criteria andResidenceAreaEqualTo(String value) {
			addCriterion("residence_area =", value, "residenceArea");
			return (Criteria) this;
		}

		public Criteria andResidenceAreaNotEqualTo(String value) {
			addCriterion("residence_area <>", value, "residenceArea");
			return (Criteria) this;
		}

		public Criteria andResidenceAreaGreaterThan(String value) {
			addCriterion("residence_area >", value, "residenceArea");
			return (Criteria) this;
		}

		public Criteria andResidenceAreaGreaterThanOrEqualTo(String value) {
			addCriterion("residence_area >=", value, "residenceArea");
			return (Criteria) this;
		}

		public Criteria andResidenceAreaLessThan(String value) {
			addCriterion("residence_area <", value, "residenceArea");
			return (Criteria) this;
		}

		public Criteria andResidenceAreaLessThanOrEqualTo(String value) {
			addCriterion("residence_area <=", value, "residenceArea");
			return (Criteria) this;
		}

		public Criteria andResidenceAreaLike(String value) {
			addCriterion("residence_area like", value, "residenceArea");
			return (Criteria) this;
		}

		public Criteria andResidenceAreaNotLike(String value) {
			addCriterion("residence_area not like", value, "residenceArea");
			return (Criteria) this;
		}

		public Criteria andResidenceAreaIn(List<String> values) {
			addCriterion("residence_area in", values, "residenceArea");
			return (Criteria) this;
		}

		public Criteria andResidenceAreaNotIn(List<String> values) {
			addCriterion("residence_area not in", values, "residenceArea");
			return (Criteria) this;
		}

		public Criteria andResidenceAreaBetween(String value1, String value2) {
			addCriterion("residence_area between", value1, value2, "residenceArea");
			return (Criteria) this;
		}

		public Criteria andResidenceAreaNotBetween(String value1, String value2) {
			addCriterion("residence_area not between", value1, value2, "residenceArea");
			return (Criteria) this;
		}

		public Criteria andResidenceAddressIsNull() {
			addCriterion("residence_address is null");
			return (Criteria) this;
		}

		public Criteria andResidenceAddressIsNotNull() {
			addCriterion("residence_address is not null");
			return (Criteria) this;
		}

		public Criteria andResidenceAddressEqualTo(String value) {
			addCriterion("residence_address =", value, "residenceAddress");
			return (Criteria) this;
		}

		public Criteria andResidenceAddressNotEqualTo(String value) {
			addCriterion("residence_address <>", value, "residenceAddress");
			return (Criteria) this;
		}

		public Criteria andResidenceAddressGreaterThan(String value) {
			addCriterion("residence_address >", value, "residenceAddress");
			return (Criteria) this;
		}

		public Criteria andResidenceAddressGreaterThanOrEqualTo(String value) {
			addCriterion("residence_address >=", value, "residenceAddress");
			return (Criteria) this;
		}

		public Criteria andResidenceAddressLessThan(String value) {
			addCriterion("residence_address <", value, "residenceAddress");
			return (Criteria) this;
		}

		public Criteria andResidenceAddressLessThanOrEqualTo(String value) {
			addCriterion("residence_address <=", value, "residenceAddress");
			return (Criteria) this;
		}

		public Criteria andResidenceAddressLike(String value) {
			addCriterion("residence_address like", value, "residenceAddress");
			return (Criteria) this;
		}

		public Criteria andResidenceAddressNotLike(String value) {
			addCriterion("residence_address not like", value, "residenceAddress");
			return (Criteria) this;
		}

		public Criteria andResidenceAddressIn(List<String> values) {
			addCriterion("residence_address in", values, "residenceAddress");
			return (Criteria) this;
		}

		public Criteria andResidenceAddressNotIn(List<String> values) {
			addCriterion("residence_address not in", values, "residenceAddress");
			return (Criteria) this;
		}

		public Criteria andResidenceAddressBetween(String value1, String value2) {
			addCriterion("residence_address between", value1, value2, "residenceAddress");
			return (Criteria) this;
		}

		public Criteria andResidenceAddressNotBetween(String value1, String value2) {
			addCriterion("residence_address not between", value1, value2, "residenceAddress");
			return (Criteria) this;
		}

		public Criteria andResidenceLongitudeIsNull() {
			addCriterion("residence_longitude is null");
			return (Criteria) this;
		}

		public Criteria andResidenceLongitudeIsNotNull() {
			addCriterion("residence_longitude is not null");
			return (Criteria) this;
		}

		public Criteria andResidenceLongitudeEqualTo(Float value) {
			addCriterion("residence_longitude =", value, "residenceLongitude");
			return (Criteria) this;
		}

		public Criteria andResidenceLongitudeNotEqualTo(Float value) {
			addCriterion("residence_longitude <>", value, "residenceLongitude");
			return (Criteria) this;
		}

		public Criteria andResidenceLongitudeGreaterThan(Float value) {
			addCriterion("residence_longitude >", value, "residenceLongitude");
			return (Criteria) this;
		}

		public Criteria andResidenceLongitudeGreaterThanOrEqualTo(Float value) {
			addCriterion("residence_longitude >=", value, "residenceLongitude");
			return (Criteria) this;
		}

		public Criteria andResidenceLongitudeLessThan(Float value) {
			addCriterion("residence_longitude <", value, "residenceLongitude");
			return (Criteria) this;
		}

		public Criteria andResidenceLongitudeLessThanOrEqualTo(Float value) {
			addCriterion("residence_longitude <=", value, "residenceLongitude");
			return (Criteria) this;
		}

		public Criteria andResidenceLongitudeIn(List<Float> values) {
			addCriterion("residence_longitude in", values, "residenceLongitude");
			return (Criteria) this;
		}

		public Criteria andResidenceLongitudeNotIn(List<Float> values) {
			addCriterion("residence_longitude not in", values, "residenceLongitude");
			return (Criteria) this;
		}

		public Criteria andResidenceLongitudeBetween(Float value1, Float value2) {
			addCriterion("residence_longitude between", value1, value2, "residenceLongitude");
			return (Criteria) this;
		}

		public Criteria andResidenceLongitudeNotBetween(Float value1, Float value2) {
			addCriterion("residence_longitude not between", value1, value2, "residenceLongitude");
			return (Criteria) this;
		}

		public Criteria andResidenceLatitudeIsNull() {
			addCriterion("residence_latitude is null");
			return (Criteria) this;
		}

		public Criteria andResidenceLatitudeIsNotNull() {
			addCriterion("residence_latitude is not null");
			return (Criteria) this;
		}

		public Criteria andResidenceLatitudeEqualTo(Float value) {
			addCriterion("residence_latitude =", value, "residenceLatitude");
			return (Criteria) this;
		}

		public Criteria andResidenceLatitudeNotEqualTo(Float value) {
			addCriterion("residence_latitude <>", value, "residenceLatitude");
			return (Criteria) this;
		}

		public Criteria andResidenceLatitudeGreaterThan(Float value) {
			addCriterion("residence_latitude >", value, "residenceLatitude");
			return (Criteria) this;
		}

		public Criteria andResidenceLatitudeGreaterThanOrEqualTo(Float value) {
			addCriterion("residence_latitude >=", value, "residenceLatitude");
			return (Criteria) this;
		}

		public Criteria andResidenceLatitudeLessThan(Float value) {
			addCriterion("residence_latitude <", value, "residenceLatitude");
			return (Criteria) this;
		}

		public Criteria andResidenceLatitudeLessThanOrEqualTo(Float value) {
			addCriterion("residence_latitude <=", value, "residenceLatitude");
			return (Criteria) this;
		}

		public Criteria andResidenceLatitudeIn(List<Float> values) {
			addCriterion("residence_latitude in", values, "residenceLatitude");
			return (Criteria) this;
		}

		public Criteria andResidenceLatitudeNotIn(List<Float> values) {
			addCriterion("residence_latitude not in", values, "residenceLatitude");
			return (Criteria) this;
		}

		public Criteria andResidenceLatitudeBetween(Float value1, Float value2) {
			addCriterion("residence_latitude between", value1, value2, "residenceLatitude");
			return (Criteria) this;
		}

		public Criteria andResidenceLatitudeNotBetween(Float value1, Float value2) {
			addCriterion("residence_latitude not between", value1, value2, "residenceLatitude");
			return (Criteria) this;
		}

		public Criteria andResidenceStatusIsNull() {
			addCriterion("residence_status is null");
			return (Criteria) this;
		}

		public Criteria andResidenceStatusIsNotNull() {
			addCriterion("residence_status is not null");
			return (Criteria) this;
		}

		public Criteria andResidenceStatusEqualTo(Byte value) {
			addCriterion("residence_status =", value, "residenceStatus");
			return (Criteria) this;
		}

		public Criteria andResidenceStatusNotEqualTo(Byte value) {
			addCriterion("residence_status <>", value, "residenceStatus");
			return (Criteria) this;
		}

		public Criteria andResidenceStatusGreaterThan(Byte value) {
			addCriterion("residence_status >", value, "residenceStatus");
			return (Criteria) this;
		}

		public Criteria andResidenceStatusGreaterThanOrEqualTo(Byte value) {
			addCriterion("residence_status >=", value, "residenceStatus");
			return (Criteria) this;
		}

		public Criteria andResidenceStatusLessThan(Byte value) {
			addCriterion("residence_status <", value, "residenceStatus");
			return (Criteria) this;
		}

		public Criteria andResidenceStatusLessThanOrEqualTo(Byte value) {
			addCriterion("residence_status <=", value, "residenceStatus");
			return (Criteria) this;
		}

		public Criteria andResidenceStatusIn(List<Byte> values) {
			addCriterion("residence_status in", values, "residenceStatus");
			return (Criteria) this;
		}

		public Criteria andResidenceStatusNotIn(List<Byte> values) {
			addCriterion("residence_status not in", values, "residenceStatus");
			return (Criteria) this;
		}

		public Criteria andResidenceStatusBetween(Byte value1, Byte value2) {
			addCriterion("residence_status between", value1, value2, "residenceStatus");
			return (Criteria) this;
		}

		public Criteria andResidenceStatusNotBetween(Byte value1, Byte value2) {
			addCriterion("residence_status not between", value1, value2, "residenceStatus");
			return (Criteria) this;
		}

		public Criteria andCompanyProvinceIsNull() {
			addCriterion("company_province is null");
			return (Criteria) this;
		}

		public Criteria andCompanyProvinceIsNotNull() {
			addCriterion("company_province is not null");
			return (Criteria) this;
		}

		public Criteria andCompanyProvinceEqualTo(String value) {
			addCriterion("company_province =", value, "companyProvince");
			return (Criteria) this;
		}

		public Criteria andCompanyProvinceNotEqualTo(String value) {
			addCriterion("company_province <>", value, "companyProvince");
			return (Criteria) this;
		}

		public Criteria andCompanyProvinceGreaterThan(String value) {
			addCriterion("company_province >", value, "companyProvince");
			return (Criteria) this;
		}

		public Criteria andCompanyProvinceGreaterThanOrEqualTo(String value) {
			addCriterion("company_province >=", value, "companyProvince");
			return (Criteria) this;
		}

		public Criteria andCompanyProvinceLessThan(String value) {
			addCriterion("company_province <", value, "companyProvince");
			return (Criteria) this;
		}

		public Criteria andCompanyProvinceLessThanOrEqualTo(String value) {
			addCriterion("company_province <=", value, "companyProvince");
			return (Criteria) this;
		}

		public Criteria andCompanyProvinceLike(String value) {
			addCriterion("company_province like", value, "companyProvince");
			return (Criteria) this;
		}

		public Criteria andCompanyProvinceNotLike(String value) {
			addCriterion("company_province not like", value, "companyProvince");
			return (Criteria) this;
		}

		public Criteria andCompanyProvinceIn(List<String> values) {
			addCriterion("company_province in", values, "companyProvince");
			return (Criteria) this;
		}

		public Criteria andCompanyProvinceNotIn(List<String> values) {
			addCriterion("company_province not in", values, "companyProvince");
			return (Criteria) this;
		}

		public Criteria andCompanyProvinceBetween(String value1, String value2) {
			addCriterion("company_province between", value1, value2, "companyProvince");
			return (Criteria) this;
		}

		public Criteria andCompanyProvinceNotBetween(String value1, String value2) {
			addCriterion("company_province not between", value1, value2, "companyProvince");
			return (Criteria) this;
		}

		public Criteria andCompanyCityIsNull() {
			addCriterion("company_city is null");
			return (Criteria) this;
		}

		public Criteria andCompanyCityIsNotNull() {
			addCriterion("company_city is not null");
			return (Criteria) this;
		}

		public Criteria andCompanyCityEqualTo(String value) {
			addCriterion("company_city =", value, "companyCity");
			return (Criteria) this;
		}

		public Criteria andCompanyCityNotEqualTo(String value) {
			addCriterion("company_city <>", value, "companyCity");
			return (Criteria) this;
		}

		public Criteria andCompanyCityGreaterThan(String value) {
			addCriterion("company_city >", value, "companyCity");
			return (Criteria) this;
		}

		public Criteria andCompanyCityGreaterThanOrEqualTo(String value) {
			addCriterion("company_city >=", value, "companyCity");
			return (Criteria) this;
		}

		public Criteria andCompanyCityLessThan(String value) {
			addCriterion("company_city <", value, "companyCity");
			return (Criteria) this;
		}

		public Criteria andCompanyCityLessThanOrEqualTo(String value) {
			addCriterion("company_city <=", value, "companyCity");
			return (Criteria) this;
		}

		public Criteria andCompanyCityLike(String value) {
			addCriterion("company_city like", value, "companyCity");
			return (Criteria) this;
		}

		public Criteria andCompanyCityNotLike(String value) {
			addCriterion("company_city not like", value, "companyCity");
			return (Criteria) this;
		}

		public Criteria andCompanyCityIn(List<String> values) {
			addCriterion("company_city in", values, "companyCity");
			return (Criteria) this;
		}

		public Criteria andCompanyCityNotIn(List<String> values) {
			addCriterion("company_city not in", values, "companyCity");
			return (Criteria) this;
		}

		public Criteria andCompanyCityBetween(String value1, String value2) {
			addCriterion("company_city between", value1, value2, "companyCity");
			return (Criteria) this;
		}

		public Criteria andCompanyCityNotBetween(String value1, String value2) {
			addCriterion("company_city not between", value1, value2, "companyCity");
			return (Criteria) this;
		}

		public Criteria andCompanyAreaIsNull() {
			addCriterion("company_area is null");
			return (Criteria) this;
		}

		public Criteria andCompanyAreaIsNotNull() {
			addCriterion("company_area is not null");
			return (Criteria) this;
		}

		public Criteria andCompanyAreaEqualTo(String value) {
			addCriterion("company_area =", value, "companyArea");
			return (Criteria) this;
		}

		public Criteria andCompanyAreaNotEqualTo(String value) {
			addCriterion("company_area <>", value, "companyArea");
			return (Criteria) this;
		}

		public Criteria andCompanyAreaGreaterThan(String value) {
			addCriterion("company_area >", value, "companyArea");
			return (Criteria) this;
		}

		public Criteria andCompanyAreaGreaterThanOrEqualTo(String value) {
			addCriterion("company_area >=", value, "companyArea");
			return (Criteria) this;
		}

		public Criteria andCompanyAreaLessThan(String value) {
			addCriterion("company_area <", value, "companyArea");
			return (Criteria) this;
		}

		public Criteria andCompanyAreaLessThanOrEqualTo(String value) {
			addCriterion("company_area <=", value, "companyArea");
			return (Criteria) this;
		}

		public Criteria andCompanyAreaLike(String value) {
			addCriterion("company_area like", value, "companyArea");
			return (Criteria) this;
		}

		public Criteria andCompanyAreaNotLike(String value) {
			addCriterion("company_area not like", value, "companyArea");
			return (Criteria) this;
		}

		public Criteria andCompanyAreaIn(List<String> values) {
			addCriterion("company_area in", values, "companyArea");
			return (Criteria) this;
		}

		public Criteria andCompanyAreaNotIn(List<String> values) {
			addCriterion("company_area not in", values, "companyArea");
			return (Criteria) this;
		}

		public Criteria andCompanyAreaBetween(String value1, String value2) {
			addCriterion("company_area between", value1, value2, "companyArea");
			return (Criteria) this;
		}

		public Criteria andCompanyAreaNotBetween(String value1, String value2) {
			addCriterion("company_area not between", value1, value2, "companyArea");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressIsNull() {
			addCriterion("company_address is null");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressIsNotNull() {
			addCriterion("company_address is not null");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressEqualTo(String value) {
			addCriterion("company_address =", value, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressNotEqualTo(String value) {
			addCriterion("company_address <>", value, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressGreaterThan(String value) {
			addCriterion("company_address >", value, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
			addCriterion("company_address >=", value, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressLessThan(String value) {
			addCriterion("company_address <", value, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
			addCriterion("company_address <=", value, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressLike(String value) {
			addCriterion("company_address like", value, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressNotLike(String value) {
			addCriterion("company_address not like", value, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressIn(List<String> values) {
			addCriterion("company_address in", values, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressNotIn(List<String> values) {
			addCriterion("company_address not in", values, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressBetween(String value1, String value2) {
			addCriterion("company_address between", value1, value2, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressNotBetween(String value1, String value2) {
			addCriterion("company_address not between", value1, value2, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyLongitudeIsNull() {
			addCriterion("company_longitude is null");
			return (Criteria) this;
		}

		public Criteria andCompanyLongitudeIsNotNull() {
			addCriterion("company_longitude is not null");
			return (Criteria) this;
		}

		public Criteria andCompanyLongitudeEqualTo(Float value) {
			addCriterion("company_longitude =", value, "companyLongitude");
			return (Criteria) this;
		}

		public Criteria andCompanyLongitudeNotEqualTo(Float value) {
			addCriterion("company_longitude <>", value, "companyLongitude");
			return (Criteria) this;
		}

		public Criteria andCompanyLongitudeGreaterThan(Float value) {
			addCriterion("company_longitude >", value, "companyLongitude");
			return (Criteria) this;
		}

		public Criteria andCompanyLongitudeGreaterThanOrEqualTo(Float value) {
			addCriterion("company_longitude >=", value, "companyLongitude");
			return (Criteria) this;
		}

		public Criteria andCompanyLongitudeLessThan(Float value) {
			addCriterion("company_longitude <", value, "companyLongitude");
			return (Criteria) this;
		}

		public Criteria andCompanyLongitudeLessThanOrEqualTo(Float value) {
			addCriterion("company_longitude <=", value, "companyLongitude");
			return (Criteria) this;
		}

		public Criteria andCompanyLongitudeIn(List<Float> values) {
			addCriterion("company_longitude in", values, "companyLongitude");
			return (Criteria) this;
		}

		public Criteria andCompanyLongitudeNotIn(List<Float> values) {
			addCriterion("company_longitude not in", values, "companyLongitude");
			return (Criteria) this;
		}

		public Criteria andCompanyLongitudeBetween(Float value1, Float value2) {
			addCriterion("company_longitude between", value1, value2, "companyLongitude");
			return (Criteria) this;
		}

		public Criteria andCompanyLongitudeNotBetween(Float value1, Float value2) {
			addCriterion("company_longitude not between", value1, value2, "companyLongitude");
			return (Criteria) this;
		}

		public Criteria andCompanyLatitudeIsNull() {
			addCriterion("company_latitude is null");
			return (Criteria) this;
		}

		public Criteria andCompanyLatitudeIsNotNull() {
			addCriterion("company_latitude is not null");
			return (Criteria) this;
		}

		public Criteria andCompanyLatitudeEqualTo(Float value) {
			addCriterion("company_latitude =", value, "companyLatitude");
			return (Criteria) this;
		}

		public Criteria andCompanyLatitudeNotEqualTo(Float value) {
			addCriterion("company_latitude <>", value, "companyLatitude");
			return (Criteria) this;
		}

		public Criteria andCompanyLatitudeGreaterThan(Float value) {
			addCriterion("company_latitude >", value, "companyLatitude");
			return (Criteria) this;
		}

		public Criteria andCompanyLatitudeGreaterThanOrEqualTo(Float value) {
			addCriterion("company_latitude >=", value, "companyLatitude");
			return (Criteria) this;
		}

		public Criteria andCompanyLatitudeLessThan(Float value) {
			addCriterion("company_latitude <", value, "companyLatitude");
			return (Criteria) this;
		}

		public Criteria andCompanyLatitudeLessThanOrEqualTo(Float value) {
			addCriterion("company_latitude <=", value, "companyLatitude");
			return (Criteria) this;
		}

		public Criteria andCompanyLatitudeIn(List<Float> values) {
			addCriterion("company_latitude in", values, "companyLatitude");
			return (Criteria) this;
		}

		public Criteria andCompanyLatitudeNotIn(List<Float> values) {
			addCriterion("company_latitude not in", values, "companyLatitude");
			return (Criteria) this;
		}

		public Criteria andCompanyLatitudeBetween(Float value1, Float value2) {
			addCriterion("company_latitude between", value1, value2, "companyLatitude");
			return (Criteria) this;
		}

		public Criteria andCompanyLatitudeNotBetween(Float value1, Float value2) {
			addCriterion("company_latitude not between", value1, value2, "companyLatitude");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressStatusIsNull() {
			addCriterion("company_address_status is null");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressStatusIsNotNull() {
			addCriterion("company_address_status is not null");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressStatusEqualTo(Byte value) {
			addCriterion("company_address_status =", value, "companyAddressStatus");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressStatusNotEqualTo(Byte value) {
			addCriterion("company_address_status <>", value, "companyAddressStatus");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressStatusGreaterThan(Byte value) {
			addCriterion("company_address_status >", value, "companyAddressStatus");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressStatusGreaterThanOrEqualTo(Byte value) {
			addCriterion("company_address_status >=", value, "companyAddressStatus");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressStatusLessThan(Byte value) {
			addCriterion("company_address_status <", value, "companyAddressStatus");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressStatusLessThanOrEqualTo(Byte value) {
			addCriterion("company_address_status <=", value, "companyAddressStatus");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressStatusIn(List<Byte> values) {
			addCriterion("company_address_status in", values, "companyAddressStatus");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressStatusNotIn(List<Byte> values) {
			addCriterion("company_address_status not in", values, "companyAddressStatus");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressStatusBetween(Byte value1, Byte value2) {
			addCriterion("company_address_status between", value1, value2, "companyAddressStatus");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressStatusNotBetween(Byte value1, Byte value2) {
			addCriterion("company_address_status not between", value1, value2, "companyAddressStatus");
			return (Criteria) this;
		}

		public Criteria andCompanyNameIsNull() {
			addCriterion("company_name is null");
			return (Criteria) this;
		}

		public Criteria andCompanyNameIsNotNull() {
			addCriterion("company_name is not null");
			return (Criteria) this;
		}

		public Criteria andCompanyNameEqualTo(String value) {
			addCriterion("company_name =", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameNotEqualTo(String value) {
			addCriterion("company_name <>", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameGreaterThan(String value) {
			addCriterion("company_name >", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
			addCriterion("company_name >=", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameLessThan(String value) {
			addCriterion("company_name <", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameLessThanOrEqualTo(String value) {
			addCriterion("company_name <=", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameLike(String value) {
			addCriterion("company_name like", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameNotLike(String value) {
			addCriterion("company_name not like", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameIn(List<String> values) {
			addCriterion("company_name in", values, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameNotIn(List<String> values) {
			addCriterion("company_name not in", values, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameBetween(String value1, String value2) {
			addCriterion("company_name between", value1, value2, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameNotBetween(String value1, String value2) {
			addCriterion("company_name not between", value1, value2, "companyName");
			return (Criteria) this;
		}

		public Criteria andPresentProvinceIsNull() {
			addCriterion("present_province is null");
			return (Criteria) this;
		}

		public Criteria andPresentProvinceIsNotNull() {
			addCriterion("present_province is not null");
			return (Criteria) this;
		}

		public Criteria andPresentProvinceEqualTo(String value) {
			addCriterion("present_province =", value, "presentProvince");
			return (Criteria) this;
		}

		public Criteria andPresentProvinceNotEqualTo(String value) {
			addCriterion("present_province <>", value, "presentProvince");
			return (Criteria) this;
		}

		public Criteria andPresentProvinceGreaterThan(String value) {
			addCriterion("present_province >", value, "presentProvince");
			return (Criteria) this;
		}

		public Criteria andPresentProvinceGreaterThanOrEqualTo(String value) {
			addCriterion("present_province >=", value, "presentProvince");
			return (Criteria) this;
		}

		public Criteria andPresentProvinceLessThan(String value) {
			addCriterion("present_province <", value, "presentProvince");
			return (Criteria) this;
		}

		public Criteria andPresentProvinceLessThanOrEqualTo(String value) {
			addCriterion("present_province <=", value, "presentProvince");
			return (Criteria) this;
		}

		public Criteria andPresentProvinceLike(String value) {
			addCriterion("present_province like", value, "presentProvince");
			return (Criteria) this;
		}

		public Criteria andPresentProvinceNotLike(String value) {
			addCriterion("present_province not like", value, "presentProvince");
			return (Criteria) this;
		}

		public Criteria andPresentProvinceIn(List<String> values) {
			addCriterion("present_province in", values, "presentProvince");
			return (Criteria) this;
		}

		public Criteria andPresentProvinceNotIn(List<String> values) {
			addCriterion("present_province not in", values, "presentProvince");
			return (Criteria) this;
		}

		public Criteria andPresentProvinceBetween(String value1, String value2) {
			addCriterion("present_province between", value1, value2, "presentProvince");
			return (Criteria) this;
		}

		public Criteria andPresentProvinceNotBetween(String value1, String value2) {
			addCriterion("present_province not between", value1, value2, "presentProvince");
			return (Criteria) this;
		}

		public Criteria andPresentCityIsNull() {
			addCriterion("present_city is null");
			return (Criteria) this;
		}

		public Criteria andPresentCityIsNotNull() {
			addCriterion("present_city is not null");
			return (Criteria) this;
		}

		public Criteria andPresentCityEqualTo(String value) {
			addCriterion("present_city =", value, "presentCity");
			return (Criteria) this;
		}

		public Criteria andPresentCityNotEqualTo(String value) {
			addCriterion("present_city <>", value, "presentCity");
			return (Criteria) this;
		}

		public Criteria andPresentCityGreaterThan(String value) {
			addCriterion("present_city >", value, "presentCity");
			return (Criteria) this;
		}

		public Criteria andPresentCityGreaterThanOrEqualTo(String value) {
			addCriterion("present_city >=", value, "presentCity");
			return (Criteria) this;
		}

		public Criteria andPresentCityLessThan(String value) {
			addCriterion("present_city <", value, "presentCity");
			return (Criteria) this;
		}

		public Criteria andPresentCityLessThanOrEqualTo(String value) {
			addCriterion("present_city <=", value, "presentCity");
			return (Criteria) this;
		}

		public Criteria andPresentCityLike(String value) {
			addCriterion("present_city like", value, "presentCity");
			return (Criteria) this;
		}

		public Criteria andPresentCityNotLike(String value) {
			addCriterion("present_city not like", value, "presentCity");
			return (Criteria) this;
		}

		public Criteria andPresentCityIn(List<String> values) {
			addCriterion("present_city in", values, "presentCity");
			return (Criteria) this;
		}

		public Criteria andPresentCityNotIn(List<String> values) {
			addCriterion("present_city not in", values, "presentCity");
			return (Criteria) this;
		}

		public Criteria andPresentCityBetween(String value1, String value2) {
			addCriterion("present_city between", value1, value2, "presentCity");
			return (Criteria) this;
		}

		public Criteria andPresentCityNotBetween(String value1, String value2) {
			addCriterion("present_city not between", value1, value2, "presentCity");
			return (Criteria) this;
		}

		public Criteria andPresentAreaIsNull() {
			addCriterion("present_area is null");
			return (Criteria) this;
		}

		public Criteria andPresentAreaIsNotNull() {
			addCriterion("present_area is not null");
			return (Criteria) this;
		}

		public Criteria andPresentAreaEqualTo(String value) {
			addCriterion("present_area =", value, "presentArea");
			return (Criteria) this;
		}

		public Criteria andPresentAreaNotEqualTo(String value) {
			addCriterion("present_area <>", value, "presentArea");
			return (Criteria) this;
		}

		public Criteria andPresentAreaGreaterThan(String value) {
			addCriterion("present_area >", value, "presentArea");
			return (Criteria) this;
		}

		public Criteria andPresentAreaGreaterThanOrEqualTo(String value) {
			addCriterion("present_area >=", value, "presentArea");
			return (Criteria) this;
		}

		public Criteria andPresentAreaLessThan(String value) {
			addCriterion("present_area <", value, "presentArea");
			return (Criteria) this;
		}

		public Criteria andPresentAreaLessThanOrEqualTo(String value) {
			addCriterion("present_area <=", value, "presentArea");
			return (Criteria) this;
		}

		public Criteria andPresentAreaLike(String value) {
			addCriterion("present_area like", value, "presentArea");
			return (Criteria) this;
		}

		public Criteria andPresentAreaNotLike(String value) {
			addCriterion("present_area not like", value, "presentArea");
			return (Criteria) this;
		}

		public Criteria andPresentAreaIn(List<String> values) {
			addCriterion("present_area in", values, "presentArea");
			return (Criteria) this;
		}

		public Criteria andPresentAreaNotIn(List<String> values) {
			addCriterion("present_area not in", values, "presentArea");
			return (Criteria) this;
		}

		public Criteria andPresentAreaBetween(String value1, String value2) {
			addCriterion("present_area between", value1, value2, "presentArea");
			return (Criteria) this;
		}

		public Criteria andPresentAreaNotBetween(String value1, String value2) {
			addCriterion("present_area not between", value1, value2, "presentArea");
			return (Criteria) this;
		}

		public Criteria andPresentLongitudeIsNull() {
			addCriterion("present_longitude is null");
			return (Criteria) this;
		}

		public Criteria andPresentLongitudeIsNotNull() {
			addCriterion("present_longitude is not null");
			return (Criteria) this;
		}

		public Criteria andPresentLongitudeEqualTo(Float value) {
			addCriterion("present_longitude =", value, "presentLongitude");
			return (Criteria) this;
		}

		public Criteria andPresentLongitudeNotEqualTo(Float value) {
			addCriterion("present_longitude <>", value, "presentLongitude");
			return (Criteria) this;
		}

		public Criteria andPresentLongitudeGreaterThan(Float value) {
			addCriterion("present_longitude >", value, "presentLongitude");
			return (Criteria) this;
		}

		public Criteria andPresentLongitudeGreaterThanOrEqualTo(Float value) {
			addCriterion("present_longitude >=", value, "presentLongitude");
			return (Criteria) this;
		}

		public Criteria andPresentLongitudeLessThan(Float value) {
			addCriterion("present_longitude <", value, "presentLongitude");
			return (Criteria) this;
		}

		public Criteria andPresentLongitudeLessThanOrEqualTo(Float value) {
			addCriterion("present_longitude <=", value, "presentLongitude");
			return (Criteria) this;
		}

		public Criteria andPresentLongitudeIn(List<Float> values) {
			addCriterion("present_longitude in", values, "presentLongitude");
			return (Criteria) this;
		}

		public Criteria andPresentLongitudeNotIn(List<Float> values) {
			addCriterion("present_longitude not in", values, "presentLongitude");
			return (Criteria) this;
		}

		public Criteria andPresentLongitudeBetween(Float value1, Float value2) {
			addCriterion("present_longitude between", value1, value2, "presentLongitude");
			return (Criteria) this;
		}

		public Criteria andPresentLongitudeNotBetween(Float value1, Float value2) {
			addCriterion("present_longitude not between", value1, value2, "presentLongitude");
			return (Criteria) this;
		}

		public Criteria andPresentLatitudeIsNull() {
			addCriterion("present_latitude is null");
			return (Criteria) this;
		}

		public Criteria andPresentLatitudeIsNotNull() {
			addCriterion("present_latitude is not null");
			return (Criteria) this;
		}

		public Criteria andPresentLatitudeEqualTo(Float value) {
			addCriterion("present_latitude =", value, "presentLatitude");
			return (Criteria) this;
		}

		public Criteria andPresentLatitudeNotEqualTo(Float value) {
			addCriterion("present_latitude <>", value, "presentLatitude");
			return (Criteria) this;
		}

		public Criteria andPresentLatitudeGreaterThan(Float value) {
			addCriterion("present_latitude >", value, "presentLatitude");
			return (Criteria) this;
		}

		public Criteria andPresentLatitudeGreaterThanOrEqualTo(Float value) {
			addCriterion("present_latitude >=", value, "presentLatitude");
			return (Criteria) this;
		}

		public Criteria andPresentLatitudeLessThan(Float value) {
			addCriterion("present_latitude <", value, "presentLatitude");
			return (Criteria) this;
		}

		public Criteria andPresentLatitudeLessThanOrEqualTo(Float value) {
			addCriterion("present_latitude <=", value, "presentLatitude");
			return (Criteria) this;
		}

		public Criteria andPresentLatitudeIn(List<Float> values) {
			addCriterion("present_latitude in", values, "presentLatitude");
			return (Criteria) this;
		}

		public Criteria andPresentLatitudeNotIn(List<Float> values) {
			addCriterion("present_latitude not in", values, "presentLatitude");
			return (Criteria) this;
		}

		public Criteria andPresentLatitudeBetween(Float value1, Float value2) {
			addCriterion("present_latitude between", value1, value2, "presentLatitude");
			return (Criteria) this;
		}

		public Criteria andPresentLatitudeNotBetween(Float value1, Float value2) {
			addCriterion("present_latitude not between", value1, value2, "presentLatitude");
			return (Criteria) this;
		}

		public Criteria andPresentAddressIsNull() {
			addCriterion("present_address is null");
			return (Criteria) this;
		}

		public Criteria andPresentAddressIsNotNull() {
			addCriterion("present_address is not null");
			return (Criteria) this;
		}

		public Criteria andPresentAddressEqualTo(String value) {
			addCriterion("present_address =", value, "presentAddress");
			return (Criteria) this;
		}

		public Criteria andPresentAddressNotEqualTo(String value) {
			addCriterion("present_address <>", value, "presentAddress");
			return (Criteria) this;
		}

		public Criteria andPresentAddressGreaterThan(String value) {
			addCriterion("present_address >", value, "presentAddress");
			return (Criteria) this;
		}

		public Criteria andPresentAddressGreaterThanOrEqualTo(String value) {
			addCriterion("present_address >=", value, "presentAddress");
			return (Criteria) this;
		}

		public Criteria andPresentAddressLessThan(String value) {
			addCriterion("present_address <", value, "presentAddress");
			return (Criteria) this;
		}

		public Criteria andPresentAddressLessThanOrEqualTo(String value) {
			addCriterion("present_address <=", value, "presentAddress");
			return (Criteria) this;
		}

		public Criteria andPresentAddressLike(String value) {
			addCriterion("present_address like", value, "presentAddress");
			return (Criteria) this;
		}

		public Criteria andPresentAddressNotLike(String value) {
			addCriterion("present_address not like", value, "presentAddress");
			return (Criteria) this;
		}

		public Criteria andPresentAddressIn(List<String> values) {
			addCriterion("present_address in", values, "presentAddress");
			return (Criteria) this;
		}

		public Criteria andPresentAddressNotIn(List<String> values) {
			addCriterion("present_address not in", values, "presentAddress");
			return (Criteria) this;
		}

		public Criteria andPresentAddressBetween(String value1, String value2) {
			addCriterion("present_address between", value1, value2, "presentAddress");
			return (Criteria) this;
		}

		public Criteria andPresentAddressNotBetween(String value1, String value2) {
			addCriterion("present_address not between", value1, value2, "presentAddress");
			return (Criteria) this;
		}

		public Criteria andPresentAddressStatusIsNull() {
			addCriterion("present_address_status is null");
			return (Criteria) this;
		}

		public Criteria andPresentAddressStatusIsNotNull() {
			addCriterion("present_address_status is not null");
			return (Criteria) this;
		}

		public Criteria andPresentAddressStatusEqualTo(Byte value) {
			addCriterion("present_address_status =", value, "presentAddressStatus");
			return (Criteria) this;
		}

		public Criteria andPresentAddressStatusNotEqualTo(Byte value) {
			addCriterion("present_address_status <>", value, "presentAddressStatus");
			return (Criteria) this;
		}

		public Criteria andPresentAddressStatusGreaterThan(Byte value) {
			addCriterion("present_address_status >", value, "presentAddressStatus");
			return (Criteria) this;
		}

		public Criteria andPresentAddressStatusGreaterThanOrEqualTo(Byte value) {
			addCriterion("present_address_status >=", value, "presentAddressStatus");
			return (Criteria) this;
		}

		public Criteria andPresentAddressStatusLessThan(Byte value) {
			addCriterion("present_address_status <", value, "presentAddressStatus");
			return (Criteria) this;
		}

		public Criteria andPresentAddressStatusLessThanOrEqualTo(Byte value) {
			addCriterion("present_address_status <=", value, "presentAddressStatus");
			return (Criteria) this;
		}

		public Criteria andPresentAddressStatusIn(List<Byte> values) {
			addCriterion("present_address_status in", values, "presentAddressStatus");
			return (Criteria) this;
		}

		public Criteria andPresentAddressStatusNotIn(List<Byte> values) {
			addCriterion("present_address_status not in", values, "presentAddressStatus");
			return (Criteria) this;
		}

		public Criteria andPresentAddressStatusBetween(Byte value1, Byte value2) {
			addCriterion("present_address_status between", value1, value2, "presentAddressStatus");
			return (Criteria) this;
		}

		public Criteria andPresentAddressStatusNotBetween(Byte value1, Byte value2) {
			addCriterion("present_address_status not between", value1, value2, "presentAddressStatus");
			return (Criteria) this;
		}

		public Criteria andIdentityImgIsNull() {
			addCriterion("identity_img is null");
			return (Criteria) this;
		}

		public Criteria andIdentityImgIsNotNull() {
			addCriterion("identity_img is not null");
			return (Criteria) this;
		}

		public Criteria andIdentityImgEqualTo(String value) {
			addCriterion("identity_img =", value, "identityImg");
			return (Criteria) this;
		}

		public Criteria andIdentityImgNotEqualTo(String value) {
			addCriterion("identity_img <>", value, "identityImg");
			return (Criteria) this;
		}

		public Criteria andIdentityImgGreaterThan(String value) {
			addCriterion("identity_img >", value, "identityImg");
			return (Criteria) this;
		}

		public Criteria andIdentityImgGreaterThanOrEqualTo(String value) {
			addCriterion("identity_img >=", value, "identityImg");
			return (Criteria) this;
		}

		public Criteria andIdentityImgLessThan(String value) {
			addCriterion("identity_img <", value, "identityImg");
			return (Criteria) this;
		}

		public Criteria andIdentityImgLessThanOrEqualTo(String value) {
			addCriterion("identity_img <=", value, "identityImg");
			return (Criteria) this;
		}

		public Criteria andIdentityImgLike(String value) {
			addCriterion("identity_img like", value, "identityImg");
			return (Criteria) this;
		}

		public Criteria andIdentityImgNotLike(String value) {
			addCriterion("identity_img not like", value, "identityImg");
			return (Criteria) this;
		}

		public Criteria andIdentityImgIn(List<String> values) {
			addCriterion("identity_img in", values, "identityImg");
			return (Criteria) this;
		}

		public Criteria andIdentityImgNotIn(List<String> values) {
			addCriterion("identity_img not in", values, "identityImg");
			return (Criteria) this;
		}

		public Criteria andIdentityImgBetween(String value1, String value2) {
			addCriterion("identity_img between", value1, value2, "identityImg");
			return (Criteria) this;
		}

		public Criteria andIdentityImgNotBetween(String value1, String value2) {
			addCriterion("identity_img not between", value1, value2, "identityImg");
			return (Criteria) this;
		}

		public Criteria andDebtorImgIsNull() {
			addCriterion("debtor_img is null");
			return (Criteria) this;
		}

		public Criteria andDebtorImgIsNotNull() {
			addCriterion("debtor_img is not null");
			return (Criteria) this;
		}

		public Criteria andDebtorImgEqualTo(String value) {
			addCriterion("debtor_img =", value, "debtorImg");
			return (Criteria) this;
		}

		public Criteria andDebtorImgNotEqualTo(String value) {
			addCriterion("debtor_img <>", value, "debtorImg");
			return (Criteria) this;
		}

		public Criteria andDebtorImgGreaterThan(String value) {
			addCriterion("debtor_img >", value, "debtorImg");
			return (Criteria) this;
		}

		public Criteria andDebtorImgGreaterThanOrEqualTo(String value) {
			addCriterion("debtor_img >=", value, "debtorImg");
			return (Criteria) this;
		}

		public Criteria andDebtorImgLessThan(String value) {
			addCriterion("debtor_img <", value, "debtorImg");
			return (Criteria) this;
		}

		public Criteria andDebtorImgLessThanOrEqualTo(String value) {
			addCriterion("debtor_img <=", value, "debtorImg");
			return (Criteria) this;
		}

		public Criteria andDebtorImgLike(String value) {
			addCriterion("debtor_img like", value, "debtorImg");
			return (Criteria) this;
		}

		public Criteria andDebtorImgNotLike(String value) {
			addCriterion("debtor_img not like", value, "debtorImg");
			return (Criteria) this;
		}

		public Criteria andDebtorImgIn(List<String> values) {
			addCriterion("debtor_img in", values, "debtorImg");
			return (Criteria) this;
		}

		public Criteria andDebtorImgNotIn(List<String> values) {
			addCriterion("debtor_img not in", values, "debtorImg");
			return (Criteria) this;
		}

		public Criteria andDebtorImgBetween(String value1, String value2) {
			addCriterion("debtor_img between", value1, value2, "debtorImg");
			return (Criteria) this;
		}

		public Criteria andDebtorImgNotBetween(String value1, String value2) {
			addCriterion("debtor_img not between", value1, value2, "debtorImg");
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

		public Criteria andAbandonReasonIsNull() {
			addCriterion("abandon_reason is null");
			return (Criteria) this;
		}

		public Criteria andAbandonReasonIsNotNull() {
			addCriterion("abandon_reason is not null");
			return (Criteria) this;
		}

		public Criteria andAbandonReasonEqualTo(String value) {
			addCriterion("abandon_reason =", value, "abandonReason");
			return (Criteria) this;
		}

		public Criteria andAbandonReasonNotEqualTo(String value) {
			addCriterion("abandon_reason <>", value, "abandonReason");
			return (Criteria) this;
		}

		public Criteria andAbandonReasonGreaterThan(String value) {
			addCriterion("abandon_reason >", value, "abandonReason");
			return (Criteria) this;
		}

		public Criteria andAbandonReasonGreaterThanOrEqualTo(String value) {
			addCriterion("abandon_reason >=", value, "abandonReason");
			return (Criteria) this;
		}

		public Criteria andAbandonReasonLessThan(String value) {
			addCriterion("abandon_reason <", value, "abandonReason");
			return (Criteria) this;
		}

		public Criteria andAbandonReasonLessThanOrEqualTo(String value) {
			addCriterion("abandon_reason <=", value, "abandonReason");
			return (Criteria) this;
		}

		public Criteria andAbandonReasonLike(String value) {
			addCriterion("abandon_reason like", value, "abandonReason");
			return (Criteria) this;
		}

		public Criteria andAbandonReasonNotLike(String value) {
			addCriterion("abandon_reason not like", value, "abandonReason");
			return (Criteria) this;
		}

		public Criteria andAbandonReasonIn(List<String> values) {
			addCriterion("abandon_reason in", values, "abandonReason");
			return (Criteria) this;
		}

		public Criteria andAbandonReasonNotIn(List<String> values) {
			addCriterion("abandon_reason not in", values, "abandonReason");
			return (Criteria) this;
		}

		public Criteria andAbandonReasonBetween(String value1, String value2) {
			addCriterion("abandon_reason between", value1, value2, "abandonReason");
			return (Criteria) this;
		}

		public Criteria andAbandonReasonNotBetween(String value1, String value2) {
			addCriterion("abandon_reason not between", value1, value2, "abandonReason");
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