package com.aitravelba.pojo.yihui;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollectionEntrustDebtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public CollectionEntrustDebtExample() {
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
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
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

        public Criteria andDebtIdIsNull() {
            addCriterion("debt_id is null");
            return (Criteria) this;
        }

        public Criteria andDebtIdIsNotNull() {
            addCriterion("debt_id is not null");
            return (Criteria) this;
        }

        public Criteria andDebtIdEqualTo(Long value) {
            addCriterion("debt_id =", value, "debtId");
            return (Criteria) this;
        }

        public Criteria andDebtIdNotEqualTo(Long value) {
            addCriterion("debt_id <>", value, "debtId");
            return (Criteria) this;
        }

        public Criteria andDebtIdGreaterThan(Long value) {
            addCriterion("debt_id >", value, "debtId");
            return (Criteria) this;
        }

        public Criteria andDebtIdGreaterThanOrEqualTo(Long value) {
            addCriterion("debt_id >=", value, "debtId");
            return (Criteria) this;
        }

        public Criteria andDebtIdLessThan(Long value) {
            addCriterion("debt_id <", value, "debtId");
            return (Criteria) this;
        }

        public Criteria andDebtIdLessThanOrEqualTo(Long value) {
            addCriterion("debt_id <=", value, "debtId");
            return (Criteria) this;
        }

        public Criteria andDebtIdIn(List<Long> values) {
            addCriterion("debt_id in", values, "debtId");
            return (Criteria) this;
        }

        public Criteria andDebtIdNotIn(List<Long> values) {
            addCriterion("debt_id not in", values, "debtId");
            return (Criteria) this;
        }

        public Criteria andDebtIdBetween(Long value1, Long value2) {
            addCriterion("debt_id between", value1, value2, "debtId");
            return (Criteria) this;
        }

        public Criteria andDebtIdNotBetween(Long value1, Long value2) {
            addCriterion("debt_id not between", value1, value2, "debtId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdIsNull() {
            addCriterion("entrust_id is null");
            return (Criteria) this;
        }

        public Criteria andEntrustIdIsNotNull() {
            addCriterion("entrust_id is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustIdEqualTo(Long value) {
            addCriterion("entrust_id =", value, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdNotEqualTo(Long value) {
            addCriterion("entrust_id <>", value, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdGreaterThan(Long value) {
            addCriterion("entrust_id >", value, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdGreaterThanOrEqualTo(Long value) {
            addCriterion("entrust_id >=", value, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdLessThan(Long value) {
            addCriterion("entrust_id <", value, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdLessThanOrEqualTo(Long value) {
            addCriterion("entrust_id <=", value, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdIn(List<Long> values) {
            addCriterion("entrust_id in", values, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdNotIn(List<Long> values) {
            addCriterion("entrust_id not in", values, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdBetween(Long value1, Long value2) {
            addCriterion("entrust_id between", value1, value2, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdNotBetween(Long value1, Long value2) {
            addCriterion("entrust_id not between", value1, value2, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustBeginTimeIsNull() {
            addCriterion("entrust_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andEntrustBeginTimeIsNotNull() {
            addCriterion("entrust_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustBeginTimeEqualTo(Date value) {
            addCriterion("entrust_begin_time =", value, "entrustBeginTime");
            return (Criteria) this;
        }

        public Criteria andEntrustBeginTimeNotEqualTo(Date value) {
            addCriterion("entrust_begin_time <>", value, "entrustBeginTime");
            return (Criteria) this;
        }

        public Criteria andEntrustBeginTimeGreaterThan(Date value) {
            addCriterion("entrust_begin_time >", value, "entrustBeginTime");
            return (Criteria) this;
        }

        public Criteria andEntrustBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("entrust_begin_time >=", value, "entrustBeginTime");
            return (Criteria) this;
        }

        public Criteria andEntrustBeginTimeLessThan(Date value) {
            addCriterion("entrust_begin_time <", value, "entrustBeginTime");
            return (Criteria) this;
        }

        public Criteria andEntrustBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("entrust_begin_time <=", value, "entrustBeginTime");
            return (Criteria) this;
        }

        public Criteria andEntrustBeginTimeIn(List<Date> values) {
            addCriterion("entrust_begin_time in", values, "entrustBeginTime");
            return (Criteria) this;
        }

        public Criteria andEntrustBeginTimeNotIn(List<Date> values) {
            addCriterion("entrust_begin_time not in", values, "entrustBeginTime");
            return (Criteria) this;
        }

        public Criteria andEntrustBeginTimeBetween(Date value1, Date value2) {
            addCriterion("entrust_begin_time between", value1, value2, "entrustBeginTime");
            return (Criteria) this;
        }

        public Criteria andEntrustBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("entrust_begin_time not between", value1, value2, "entrustBeginTime");
            return (Criteria) this;
        }

        public Criteria andEntrustExpireTimeIsNull() {
            addCriterion("entrust_expire_time is null");
            return (Criteria) this;
        }

        public Criteria andEntrustExpireTimeIsNotNull() {
            addCriterion("entrust_expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustExpireTimeEqualTo(Date value) {
            addCriterion("entrust_expire_time =", value, "entrustExpireTime");
            return (Criteria) this;
        }

        public Criteria andEntrustExpireTimeNotEqualTo(Date value) {
            addCriterion("entrust_expire_time <>", value, "entrustExpireTime");
            return (Criteria) this;
        }

        public Criteria andEntrustExpireTimeGreaterThan(Date value) {
            addCriterion("entrust_expire_time >", value, "entrustExpireTime");
            return (Criteria) this;
        }

        public Criteria andEntrustExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("entrust_expire_time >=", value, "entrustExpireTime");
            return (Criteria) this;
        }

        public Criteria andEntrustExpireTimeLessThan(Date value) {
            addCriterion("entrust_expire_time <", value, "entrustExpireTime");
            return (Criteria) this;
        }

        public Criteria andEntrustExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("entrust_expire_time <=", value, "entrustExpireTime");
            return (Criteria) this;
        }

        public Criteria andEntrustExpireTimeIn(List<Date> values) {
            addCriterion("entrust_expire_time in", values, "entrustExpireTime");
            return (Criteria) this;
        }

        public Criteria andEntrustExpireTimeNotIn(List<Date> values) {
            addCriterion("entrust_expire_time not in", values, "entrustExpireTime");
            return (Criteria) this;
        }

        public Criteria andEntrustExpireTimeBetween(Date value1, Date value2) {
            addCriterion("entrust_expire_time between", value1, value2, "entrustExpireTime");
            return (Criteria) this;
        }

        public Criteria andEntrustExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("entrust_expire_time not between", value1, value2, "entrustExpireTime");
            return (Criteria) this;
        }

        public Criteria andEntrustEndTimeIsNull() {
            addCriterion("entrust_end_time is null");
            return (Criteria) this;
        }

        public Criteria andEntrustEndTimeIsNotNull() {
            addCriterion("entrust_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustEndTimeEqualTo(Date value) {
            addCriterion("entrust_end_time =", value, "entrustEndTime");
            return (Criteria) this;
        }

        public Criteria andEntrustEndTimeNotEqualTo(Date value) {
            addCriterion("entrust_end_time <>", value, "entrustEndTime");
            return (Criteria) this;
        }

        public Criteria andEntrustEndTimeGreaterThan(Date value) {
            addCriterion("entrust_end_time >", value, "entrustEndTime");
            return (Criteria) this;
        }

        public Criteria andEntrustEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("entrust_end_time >=", value, "entrustEndTime");
            return (Criteria) this;
        }

        public Criteria andEntrustEndTimeLessThan(Date value) {
            addCriterion("entrust_end_time <", value, "entrustEndTime");
            return (Criteria) this;
        }

        public Criteria andEntrustEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("entrust_end_time <=", value, "entrustEndTime");
            return (Criteria) this;
        }

        public Criteria andEntrustEndTimeIn(List<Date> values) {
            addCriterion("entrust_end_time in", values, "entrustEndTime");
            return (Criteria) this;
        }

        public Criteria andEntrustEndTimeNotIn(List<Date> values) {
            addCriterion("entrust_end_time not in", values, "entrustEndTime");
            return (Criteria) this;
        }

        public Criteria andEntrustEndTimeBetween(Date value1, Date value2) {
            addCriterion("entrust_end_time between", value1, value2, "entrustEndTime");
            return (Criteria) this;
        }

        public Criteria andEntrustEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("entrust_end_time not between", value1, value2, "entrustEndTime");
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