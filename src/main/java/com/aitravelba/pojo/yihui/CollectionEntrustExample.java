package com.aitravelba.pojo.yihui;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollectionEntrustExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public CollectionEntrustExample() {
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

        public Criteria andDeptIdIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(Long value) {
            addCriterion("dept_id =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(Long value) {
            addCriterion("dept_id <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(Long value) {
            addCriterion("dept_id >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dept_id >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(Long value) {
            addCriterion("dept_id <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(Long value) {
            addCriterion("dept_id <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<Long> values) {
            addCriterion("dept_id in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<Long> values) {
            addCriterion("dept_id not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(Long value1, Long value2) {
            addCriterion("dept_id between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(Long value1, Long value2) {
            addCriterion("dept_id not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Long value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Long value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Long value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Long value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Long> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Long> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Long value1, Long value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andDispatcherIdIsNull() {
            addCriterion("dispatcher_id is null");
            return (Criteria) this;
        }

        public Criteria andDispatcherIdIsNotNull() {
            addCriterion("dispatcher_id is not null");
            return (Criteria) this;
        }

        public Criteria andDispatcherIdEqualTo(Long value) {
            addCriterion("dispatcher_id =", value, "dispatcherId");
            return (Criteria) this;
        }

        public Criteria andDispatcherIdNotEqualTo(Long value) {
            addCriterion("dispatcher_id <>", value, "dispatcherId");
            return (Criteria) this;
        }

        public Criteria andDispatcherIdGreaterThan(Long value) {
            addCriterion("dispatcher_id >", value, "dispatcherId");
            return (Criteria) this;
        }

        public Criteria andDispatcherIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dispatcher_id >=", value, "dispatcherId");
            return (Criteria) this;
        }

        public Criteria andDispatcherIdLessThan(Long value) {
            addCriterion("dispatcher_id <", value, "dispatcherId");
            return (Criteria) this;
        }

        public Criteria andDispatcherIdLessThanOrEqualTo(Long value) {
            addCriterion("dispatcher_id <=", value, "dispatcherId");
            return (Criteria) this;
        }

        public Criteria andDispatcherIdIn(List<Long> values) {
            addCriterion("dispatcher_id in", values, "dispatcherId");
            return (Criteria) this;
        }

        public Criteria andDispatcherIdNotIn(List<Long> values) {
            addCriterion("dispatcher_id not in", values, "dispatcherId");
            return (Criteria) this;
        }

        public Criteria andDispatcherIdBetween(Long value1, Long value2) {
            addCriterion("dispatcher_id between", value1, value2, "dispatcherId");
            return (Criteria) this;
        }

        public Criteria andDispatcherIdNotBetween(Long value1, Long value2) {
            addCriterion("dispatcher_id not between", value1, value2, "dispatcherId");
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

        public Criteria andAddressTypeIsNull() {
            addCriterion("address_type is null");
            return (Criteria) this;
        }

        public Criteria andAddressTypeIsNotNull() {
            addCriterion("address_type is not null");
            return (Criteria) this;
        }

        public Criteria andAddressTypeEqualTo(Byte value) {
            addCriterion("address_type =", value, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeNotEqualTo(Byte value) {
            addCriterion("address_type <>", value, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeGreaterThan(Byte value) {
            addCriterion("address_type >", value, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("address_type >=", value, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeLessThan(Byte value) {
            addCriterion("address_type <", value, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeLessThanOrEqualTo(Byte value) {
            addCriterion("address_type <=", value, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeIn(List<Byte> values) {
            addCriterion("address_type in", values, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeNotIn(List<Byte> values) {
            addCriterion("address_type not in", values, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeBetween(Byte value1, Byte value2) {
            addCriterion("address_type between", value1, value2, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("address_type not between", value1, value2, "addressType");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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