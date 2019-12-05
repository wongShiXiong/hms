package com.hms.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbRoomtypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbRoomtypeExample() {
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

        public Criteria andRpIdIsNull() {
            addCriterion("rp_id is null");
            return (Criteria) this;
        }

        public Criteria andRpIdIsNotNull() {
            addCriterion("rp_id is not null");
            return (Criteria) this;
        }

        public Criteria andRpIdEqualTo(Integer value) {
            addCriterion("rp_id =", value, "rpId");
            return (Criteria) this;
        }

        public Criteria andRpIdNotEqualTo(Integer value) {
            addCriterion("rp_id <>", value, "rpId");
            return (Criteria) this;
        }

        public Criteria andRpIdGreaterThan(Integer value) {
            addCriterion("rp_id >", value, "rpId");
            return (Criteria) this;
        }

        public Criteria andRpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rp_id >=", value, "rpId");
            return (Criteria) this;
        }

        public Criteria andRpIdLessThan(Integer value) {
            addCriterion("rp_id <", value, "rpId");
            return (Criteria) this;
        }

        public Criteria andRpIdLessThanOrEqualTo(Integer value) {
            addCriterion("rp_id <=", value, "rpId");
            return (Criteria) this;
        }

        public Criteria andRpIdIn(List<Integer> values) {
            addCriterion("rp_id in", values, "rpId");
            return (Criteria) this;
        }

        public Criteria andRpIdNotIn(List<Integer> values) {
            addCriterion("rp_id not in", values, "rpId");
            return (Criteria) this;
        }

        public Criteria andRpIdBetween(Integer value1, Integer value2) {
            addCriterion("rp_id between", value1, value2, "rpId");
            return (Criteria) this;
        }

        public Criteria andRpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rp_id not between", value1, value2, "rpId");
            return (Criteria) this;
        }

        public Criteria andRtIdIsNull() {
            addCriterion("rt_id is null");
            return (Criteria) this;
        }

        public Criteria andRtIdIsNotNull() {
            addCriterion("rt_id is not null");
            return (Criteria) this;
        }

        public Criteria andRtIdEqualTo(Integer value) {
            addCriterion("rt_id =", value, "rtId");
            return (Criteria) this;
        }

        public Criteria andRtIdNotEqualTo(Integer value) {
            addCriterion("rt_id <>", value, "rtId");
            return (Criteria) this;
        }

        public Criteria andRtIdGreaterThan(Integer value) {
            addCriterion("rt_id >", value, "rtId");
            return (Criteria) this;
        }

        public Criteria andRtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rt_id >=", value, "rtId");
            return (Criteria) this;
        }

        public Criteria andRtIdLessThan(Integer value) {
            addCriterion("rt_id <", value, "rtId");
            return (Criteria) this;
        }

        public Criteria andRtIdLessThanOrEqualTo(Integer value) {
            addCriterion("rt_id <=", value, "rtId");
            return (Criteria) this;
        }

        public Criteria andRtIdIn(List<Integer> values) {
            addCriterion("rt_id in", values, "rtId");
            return (Criteria) this;
        }

        public Criteria andRtIdNotIn(List<Integer> values) {
            addCriterion("rt_id not in", values, "rtId");
            return (Criteria) this;
        }

        public Criteria andRtIdBetween(Integer value1, Integer value2) {
            addCriterion("rt_id between", value1, value2, "rtId");
            return (Criteria) this;
        }

        public Criteria andRtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rt_id not between", value1, value2, "rtId");
            return (Criteria) this;
        }

        public Criteria andRtNameIsNull() {
            addCriterion("rt_name is null");
            return (Criteria) this;
        }

        public Criteria andRtNameIsNotNull() {
            addCriterion("rt_name is not null");
            return (Criteria) this;
        }

        public Criteria andRtNameEqualTo(String value) {
            addCriterion("rt_name =", value, "rtName");
            return (Criteria) this;
        }

        public Criteria andRtNameNotEqualTo(String value) {
            addCriterion("rt_name <>", value, "rtName");
            return (Criteria) this;
        }

        public Criteria andRtNameGreaterThan(String value) {
            addCriterion("rt_name >", value, "rtName");
            return (Criteria) this;
        }

        public Criteria andRtNameGreaterThanOrEqualTo(String value) {
            addCriterion("rt_name >=", value, "rtName");
            return (Criteria) this;
        }

        public Criteria andRtNameLessThan(String value) {
            addCriterion("rt_name <", value, "rtName");
            return (Criteria) this;
        }

        public Criteria andRtNameLessThanOrEqualTo(String value) {
            addCriterion("rt_name <=", value, "rtName");
            return (Criteria) this;
        }

        public Criteria andRtNameLike(String value) {
            addCriterion("rt_name like", value, "rtName");
            return (Criteria) this;
        }

        public Criteria andRtNameNotLike(String value) {
            addCriterion("rt_name not like", value, "rtName");
            return (Criteria) this;
        }

        public Criteria andRtNameIn(List<String> values) {
            addCriterion("rt_name in", values, "rtName");
            return (Criteria) this;
        }

        public Criteria andRtNameNotIn(List<String> values) {
            addCriterion("rt_name not in", values, "rtName");
            return (Criteria) this;
        }

        public Criteria andRtNameBetween(String value1, String value2) {
            addCriterion("rt_name between", value1, value2, "rtName");
            return (Criteria) this;
        }

        public Criteria andRtNameNotBetween(String value1, String value2) {
            addCriterion("rt_name not between", value1, value2, "rtName");
            return (Criteria) this;
        }

        public Criteria andRtPriceIsNull() {
            addCriterion("rt_price is null");
            return (Criteria) this;
        }

        public Criteria andRtPriceIsNotNull() {
            addCriterion("rt_price is not null");
            return (Criteria) this;
        }

        public Criteria andRtPriceEqualTo(String value) {
            addCriterion("rt_price =", value, "rtPrice");
            return (Criteria) this;
        }

        public Criteria andRtPriceNotEqualTo(String value) {
            addCriterion("rt_price <>", value, "rtPrice");
            return (Criteria) this;
        }

        public Criteria andRtPriceGreaterThan(String value) {
            addCriterion("rt_price >", value, "rtPrice");
            return (Criteria) this;
        }

        public Criteria andRtPriceGreaterThanOrEqualTo(String value) {
            addCriterion("rt_price >=", value, "rtPrice");
            return (Criteria) this;
        }

        public Criteria andRtPriceLessThan(String value) {
            addCriterion("rt_price <", value, "rtPrice");
            return (Criteria) this;
        }

        public Criteria andRtPriceLessThanOrEqualTo(String value) {
            addCriterion("rt_price <=", value, "rtPrice");
            return (Criteria) this;
        }

        public Criteria andRtPriceLike(String value) {
            addCriterion("rt_price like", value, "rtPrice");
            return (Criteria) this;
        }

        public Criteria andRtPriceNotLike(String value) {
            addCriterion("rt_price not like", value, "rtPrice");
            return (Criteria) this;
        }

        public Criteria andRtPriceIn(List<String> values) {
            addCriterion("rt_price in", values, "rtPrice");
            return (Criteria) this;
        }

        public Criteria andRtPriceNotIn(List<String> values) {
            addCriterion("rt_price not in", values, "rtPrice");
            return (Criteria) this;
        }

        public Criteria andRtPriceBetween(String value1, String value2) {
            addCriterion("rt_price between", value1, value2, "rtPrice");
            return (Criteria) this;
        }

        public Criteria andRtPriceNotBetween(String value1, String value2) {
            addCriterion("rt_price not between", value1, value2, "rtPrice");
            return (Criteria) this;
        }

        public Criteria andRtDescripeIsNull() {
            addCriterion("rt_descripe is null");
            return (Criteria) this;
        }

        public Criteria andRtDescripeIsNotNull() {
            addCriterion("rt_descripe is not null");
            return (Criteria) this;
        }

        public Criteria andRtDescripeEqualTo(String value) {
            addCriterion("rt_descripe =", value, "rtDescripe");
            return (Criteria) this;
        }

        public Criteria andRtDescripeNotEqualTo(String value) {
            addCriterion("rt_descripe <>", value, "rtDescripe");
            return (Criteria) this;
        }

        public Criteria andRtDescripeGreaterThan(String value) {
            addCriterion("rt_descripe >", value, "rtDescripe");
            return (Criteria) this;
        }

        public Criteria andRtDescripeGreaterThanOrEqualTo(String value) {
            addCriterion("rt_descripe >=", value, "rtDescripe");
            return (Criteria) this;
        }

        public Criteria andRtDescripeLessThan(String value) {
            addCriterion("rt_descripe <", value, "rtDescripe");
            return (Criteria) this;
        }

        public Criteria andRtDescripeLessThanOrEqualTo(String value) {
            addCriterion("rt_descripe <=", value, "rtDescripe");
            return (Criteria) this;
        }

        public Criteria andRtDescripeLike(String value) {
            addCriterion("rt_descripe like", value, "rtDescripe");
            return (Criteria) this;
        }

        public Criteria andRtDescripeNotLike(String value) {
            addCriterion("rt_descripe not like", value, "rtDescripe");
            return (Criteria) this;
        }

        public Criteria andRtDescripeIn(List<String> values) {
            addCriterion("rt_descripe in", values, "rtDescripe");
            return (Criteria) this;
        }

        public Criteria andRtDescripeNotIn(List<String> values) {
            addCriterion("rt_descripe not in", values, "rtDescripe");
            return (Criteria) this;
        }

        public Criteria andRtDescripeBetween(String value1, String value2) {
            addCriterion("rt_descripe between", value1, value2, "rtDescripe");
            return (Criteria) this;
        }

        public Criteria andRtDescripeNotBetween(String value1, String value2) {
            addCriterion("rt_descripe not between", value1, value2, "rtDescripe");
            return (Criteria) this;
        }

        public Criteria andRtStateIsNull() {
            addCriterion("rt_state is null");
            return (Criteria) this;
        }

        public Criteria andRtStateIsNotNull() {
            addCriterion("rt_state is not null");
            return (Criteria) this;
        }

        public Criteria andRtStateEqualTo(String value) {
            addCriterion("rt_state =", value, "rtState");
            return (Criteria) this;
        }

        public Criteria andRtStateNotEqualTo(String value) {
            addCriterion("rt_state <>", value, "rtState");
            return (Criteria) this;
        }

        public Criteria andRtStateGreaterThan(String value) {
            addCriterion("rt_state >", value, "rtState");
            return (Criteria) this;
        }

        public Criteria andRtStateGreaterThanOrEqualTo(String value) {
            addCriterion("rt_state >=", value, "rtState");
            return (Criteria) this;
        }

        public Criteria andRtStateLessThan(String value) {
            addCriterion("rt_state <", value, "rtState");
            return (Criteria) this;
        }

        public Criteria andRtStateLessThanOrEqualTo(String value) {
            addCriterion("rt_state <=", value, "rtState");
            return (Criteria) this;
        }

        public Criteria andRtStateLike(String value) {
            addCriterion("rt_state like", value, "rtState");
            return (Criteria) this;
        }

        public Criteria andRtStateNotLike(String value) {
            addCriterion("rt_state not like", value, "rtState");
            return (Criteria) this;
        }

        public Criteria andRtStateIn(List<String> values) {
            addCriterion("rt_state in", values, "rtState");
            return (Criteria) this;
        }

        public Criteria andRtStateNotIn(List<String> values) {
            addCriterion("rt_state not in", values, "rtState");
            return (Criteria) this;
        }

        public Criteria andRtStateBetween(String value1, String value2) {
            addCriterion("rt_state between", value1, value2, "rtState");
            return (Criteria) this;
        }

        public Criteria andRtStateNotBetween(String value1, String value2) {
            addCriterion("rt_state not between", value1, value2, "rtState");
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