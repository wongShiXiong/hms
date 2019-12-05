package com.hms.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbCustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbCustomerExample() {
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

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("c_name is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("c_name is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("c_name =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("c_name <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("c_name >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_name >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("c_name <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("c_name <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("c_name like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("c_name not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("c_name in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("c_name not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("c_name between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("c_name not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCSexIsNull() {
            addCriterion("c_sex is null");
            return (Criteria) this;
        }

        public Criteria andCSexIsNotNull() {
            addCriterion("c_sex is not null");
            return (Criteria) this;
        }

        public Criteria andCSexEqualTo(String value) {
            addCriterion("c_sex =", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexNotEqualTo(String value) {
            addCriterion("c_sex <>", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexGreaterThan(String value) {
            addCriterion("c_sex >", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexGreaterThanOrEqualTo(String value) {
            addCriterion("c_sex >=", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexLessThan(String value) {
            addCriterion("c_sex <", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexLessThanOrEqualTo(String value) {
            addCriterion("c_sex <=", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexLike(String value) {
            addCriterion("c_sex like", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexNotLike(String value) {
            addCriterion("c_sex not like", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexIn(List<String> values) {
            addCriterion("c_sex in", values, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexNotIn(List<String> values) {
            addCriterion("c_sex not in", values, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexBetween(String value1, String value2) {
            addCriterion("c_sex between", value1, value2, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexNotBetween(String value1, String value2) {
            addCriterion("c_sex not between", value1, value2, "cSex");
            return (Criteria) this;
        }

        public Criteria andCCardstyleIsNull() {
            addCriterion("c_cardstyle is null");
            return (Criteria) this;
        }

        public Criteria andCCardstyleIsNotNull() {
            addCriterion("c_cardstyle is not null");
            return (Criteria) this;
        }

        public Criteria andCCardstyleEqualTo(String value) {
            addCriterion("c_cardstyle =", value, "cCardstyle");
            return (Criteria) this;
        }

        public Criteria andCCardstyleNotEqualTo(String value) {
            addCriterion("c_cardstyle <>", value, "cCardstyle");
            return (Criteria) this;
        }

        public Criteria andCCardstyleGreaterThan(String value) {
            addCriterion("c_cardstyle >", value, "cCardstyle");
            return (Criteria) this;
        }

        public Criteria andCCardstyleGreaterThanOrEqualTo(String value) {
            addCriterion("c_cardstyle >=", value, "cCardstyle");
            return (Criteria) this;
        }

        public Criteria andCCardstyleLessThan(String value) {
            addCriterion("c_cardstyle <", value, "cCardstyle");
            return (Criteria) this;
        }

        public Criteria andCCardstyleLessThanOrEqualTo(String value) {
            addCriterion("c_cardstyle <=", value, "cCardstyle");
            return (Criteria) this;
        }

        public Criteria andCCardstyleLike(String value) {
            addCriterion("c_cardstyle like", value, "cCardstyle");
            return (Criteria) this;
        }

        public Criteria andCCardstyleNotLike(String value) {
            addCriterion("c_cardstyle not like", value, "cCardstyle");
            return (Criteria) this;
        }

        public Criteria andCCardstyleIn(List<String> values) {
            addCriterion("c_cardstyle in", values, "cCardstyle");
            return (Criteria) this;
        }

        public Criteria andCCardstyleNotIn(List<String> values) {
            addCriterion("c_cardstyle not in", values, "cCardstyle");
            return (Criteria) this;
        }

        public Criteria andCCardstyleBetween(String value1, String value2) {
            addCriterion("c_cardstyle between", value1, value2, "cCardstyle");
            return (Criteria) this;
        }

        public Criteria andCCardstyleNotBetween(String value1, String value2) {
            addCriterion("c_cardstyle not between", value1, value2, "cCardstyle");
            return (Criteria) this;
        }

        public Criteria andCCardnoIsNull() {
            addCriterion("c_cardno is null");
            return (Criteria) this;
        }

        public Criteria andCCardnoIsNotNull() {
            addCriterion("c_cardno is not null");
            return (Criteria) this;
        }

        public Criteria andCCardnoEqualTo(String value) {
            addCriterion("c_cardno =", value, "cCardno");
            return (Criteria) this;
        }

        public Criteria andCCardnoNotEqualTo(String value) {
            addCriterion("c_cardno <>", value, "cCardno");
            return (Criteria) this;
        }

        public Criteria andCCardnoGreaterThan(String value) {
            addCriterion("c_cardno >", value, "cCardno");
            return (Criteria) this;
        }

        public Criteria andCCardnoGreaterThanOrEqualTo(String value) {
            addCriterion("c_cardno >=", value, "cCardno");
            return (Criteria) this;
        }

        public Criteria andCCardnoLessThan(String value) {
            addCriterion("c_cardno <", value, "cCardno");
            return (Criteria) this;
        }

        public Criteria andCCardnoLessThanOrEqualTo(String value) {
            addCriterion("c_cardno <=", value, "cCardno");
            return (Criteria) this;
        }

        public Criteria andCCardnoLike(String value) {
            addCriterion("c_cardno like", value, "cCardno");
            return (Criteria) this;
        }

        public Criteria andCCardnoNotLike(String value) {
            addCriterion("c_cardno not like", value, "cCardno");
            return (Criteria) this;
        }

        public Criteria andCCardnoIn(List<String> values) {
            addCriterion("c_cardno in", values, "cCardno");
            return (Criteria) this;
        }

        public Criteria andCCardnoNotIn(List<String> values) {
            addCriterion("c_cardno not in", values, "cCardno");
            return (Criteria) this;
        }

        public Criteria andCCardnoBetween(String value1, String value2) {
            addCriterion("c_cardno between", value1, value2, "cCardno");
            return (Criteria) this;
        }

        public Criteria andCCardnoNotBetween(String value1, String value2) {
            addCriterion("c_cardno not between", value1, value2, "cCardno");
            return (Criteria) this;
        }

        public Criteria andCAddressIsNull() {
            addCriterion("c_address is null");
            return (Criteria) this;
        }

        public Criteria andCAddressIsNotNull() {
            addCriterion("c_address is not null");
            return (Criteria) this;
        }

        public Criteria andCAddressEqualTo(String value) {
            addCriterion("c_address =", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotEqualTo(String value) {
            addCriterion("c_address <>", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressGreaterThan(String value) {
            addCriterion("c_address >", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressGreaterThanOrEqualTo(String value) {
            addCriterion("c_address >=", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressLessThan(String value) {
            addCriterion("c_address <", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressLessThanOrEqualTo(String value) {
            addCriterion("c_address <=", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressLike(String value) {
            addCriterion("c_address like", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotLike(String value) {
            addCriterion("c_address not like", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressIn(List<String> values) {
            addCriterion("c_address in", values, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotIn(List<String> values) {
            addCriterion("c_address not in", values, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressBetween(String value1, String value2) {
            addCriterion("c_address between", value1, value2, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotBetween(String value1, String value2) {
            addCriterion("c_address not between", value1, value2, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCPhonenoIsNull() {
            addCriterion("c_phoneno is null");
            return (Criteria) this;
        }

        public Criteria andCPhonenoIsNotNull() {
            addCriterion("c_phoneno is not null");
            return (Criteria) this;
        }

        public Criteria andCPhonenoEqualTo(String value) {
            addCriterion("c_phoneno =", value, "cPhoneno");
            return (Criteria) this;
        }

        public Criteria andCPhonenoNotEqualTo(String value) {
            addCriterion("c_phoneno <>", value, "cPhoneno");
            return (Criteria) this;
        }

        public Criteria andCPhonenoGreaterThan(String value) {
            addCriterion("c_phoneno >", value, "cPhoneno");
            return (Criteria) this;
        }

        public Criteria andCPhonenoGreaterThanOrEqualTo(String value) {
            addCriterion("c_phoneno >=", value, "cPhoneno");
            return (Criteria) this;
        }

        public Criteria andCPhonenoLessThan(String value) {
            addCriterion("c_phoneno <", value, "cPhoneno");
            return (Criteria) this;
        }

        public Criteria andCPhonenoLessThanOrEqualTo(String value) {
            addCriterion("c_phoneno <=", value, "cPhoneno");
            return (Criteria) this;
        }

        public Criteria andCPhonenoLike(String value) {
            addCriterion("c_phoneno like", value, "cPhoneno");
            return (Criteria) this;
        }

        public Criteria andCPhonenoNotLike(String value) {
            addCriterion("c_phoneno not like", value, "cPhoneno");
            return (Criteria) this;
        }

        public Criteria andCPhonenoIn(List<String> values) {
            addCriterion("c_phoneno in", values, "cPhoneno");
            return (Criteria) this;
        }

        public Criteria andCPhonenoNotIn(List<String> values) {
            addCriterion("c_phoneno not in", values, "cPhoneno");
            return (Criteria) this;
        }

        public Criteria andCPhonenoBetween(String value1, String value2) {
            addCriterion("c_phoneno between", value1, value2, "cPhoneno");
            return (Criteria) this;
        }

        public Criteria andCPhonenoNotBetween(String value1, String value2) {
            addCriterion("c_phoneno not between", value1, value2, "cPhoneno");
            return (Criteria) this;
        }

        public Criteria andCStateIsNull() {
            addCriterion("c_state is null");
            return (Criteria) this;
        }

        public Criteria andCStateIsNotNull() {
            addCriterion("c_state is not null");
            return (Criteria) this;
        }

        public Criteria andCStateEqualTo(String value) {
            addCriterion("c_state =", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateNotEqualTo(String value) {
            addCriterion("c_state <>", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateGreaterThan(String value) {
            addCriterion("c_state >", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateGreaterThanOrEqualTo(String value) {
            addCriterion("c_state >=", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateLessThan(String value) {
            addCriterion("c_state <", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateLessThanOrEqualTo(String value) {
            addCriterion("c_state <=", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateLike(String value) {
            addCriterion("c_state like", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateNotLike(String value) {
            addCriterion("c_state not like", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateIn(List<String> values) {
            addCriterion("c_state in", values, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateNotIn(List<String> values) {
            addCriterion("c_state not in", values, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateBetween(String value1, String value2) {
            addCriterion("c_state between", value1, value2, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateNotBetween(String value1, String value2) {
            addCriterion("c_state not between", value1, value2, "cState");
            return (Criteria) this;
        }

        public Criteria andCTotalmoneyIsNull() {
            addCriterion("c_totalmoney is null");
            return (Criteria) this;
        }

        public Criteria andCTotalmoneyIsNotNull() {
            addCriterion("c_totalmoney is not null");
            return (Criteria) this;
        }

        public Criteria andCTotalmoneyEqualTo(String value) {
            addCriterion("c_totalmoney =", value, "cTotalmoney");
            return (Criteria) this;
        }

        public Criteria andCTotalmoneyNotEqualTo(String value) {
            addCriterion("c_totalmoney <>", value, "cTotalmoney");
            return (Criteria) this;
        }

        public Criteria andCTotalmoneyGreaterThan(String value) {
            addCriterion("c_totalmoney >", value, "cTotalmoney");
            return (Criteria) this;
        }

        public Criteria andCTotalmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("c_totalmoney >=", value, "cTotalmoney");
            return (Criteria) this;
        }

        public Criteria andCTotalmoneyLessThan(String value) {
            addCriterion("c_totalmoney <", value, "cTotalmoney");
            return (Criteria) this;
        }

        public Criteria andCTotalmoneyLessThanOrEqualTo(String value) {
            addCriterion("c_totalmoney <=", value, "cTotalmoney");
            return (Criteria) this;
        }

        public Criteria andCTotalmoneyLike(String value) {
            addCriterion("c_totalmoney like", value, "cTotalmoney");
            return (Criteria) this;
        }

        public Criteria andCTotalmoneyNotLike(String value) {
            addCriterion("c_totalmoney not like", value, "cTotalmoney");
            return (Criteria) this;
        }

        public Criteria andCTotalmoneyIn(List<String> values) {
            addCriterion("c_totalmoney in", values, "cTotalmoney");
            return (Criteria) this;
        }

        public Criteria andCTotalmoneyNotIn(List<String> values) {
            addCriterion("c_totalmoney not in", values, "cTotalmoney");
            return (Criteria) this;
        }

        public Criteria andCTotalmoneyBetween(String value1, String value2) {
            addCriterion("c_totalmoney between", value1, value2, "cTotalmoney");
            return (Criteria) this;
        }

        public Criteria andCTotalmoneyNotBetween(String value1, String value2) {
            addCriterion("c_totalmoney not between", value1, value2, "cTotalmoney");
            return (Criteria) this;
        }

        public Criteria andCTypeIsNull() {
            addCriterion("c_type is null");
            return (Criteria) this;
        }

        public Criteria andCTypeIsNotNull() {
            addCriterion("c_type is not null");
            return (Criteria) this;
        }

        public Criteria andCTypeEqualTo(String value) {
            addCriterion("c_type =", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotEqualTo(String value) {
            addCriterion("c_type <>", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeGreaterThan(String value) {
            addCriterion("c_type >", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_type >=", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeLessThan(String value) {
            addCriterion("c_type <", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeLessThanOrEqualTo(String value) {
            addCriterion("c_type <=", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeLike(String value) {
            addCriterion("c_type like", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotLike(String value) {
            addCriterion("c_type not like", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeIn(List<String> values) {
            addCriterion("c_type in", values, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotIn(List<String> values) {
            addCriterion("c_type not in", values, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeBetween(String value1, String value2) {
            addCriterion("c_type between", value1, value2, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotBetween(String value1, String value2) {
            addCriterion("c_type not between", value1, value2, "cType");
            return (Criteria) this;
        }

        public Criteria andCDiscountIsNull() {
            addCriterion("c_discount is null");
            return (Criteria) this;
        }

        public Criteria andCDiscountIsNotNull() {
            addCriterion("c_discount is not null");
            return (Criteria) this;
        }

        public Criteria andCDiscountEqualTo(String value) {
            addCriterion("c_discount =", value, "cDiscount");
            return (Criteria) this;
        }

        public Criteria andCDiscountNotEqualTo(String value) {
            addCriterion("c_discount <>", value, "cDiscount");
            return (Criteria) this;
        }

        public Criteria andCDiscountGreaterThan(String value) {
            addCriterion("c_discount >", value, "cDiscount");
            return (Criteria) this;
        }

        public Criteria andCDiscountGreaterThanOrEqualTo(String value) {
            addCriterion("c_discount >=", value, "cDiscount");
            return (Criteria) this;
        }

        public Criteria andCDiscountLessThan(String value) {
            addCriterion("c_discount <", value, "cDiscount");
            return (Criteria) this;
        }

        public Criteria andCDiscountLessThanOrEqualTo(String value) {
            addCriterion("c_discount <=", value, "cDiscount");
            return (Criteria) this;
        }

        public Criteria andCDiscountLike(String value) {
            addCriterion("c_discount like", value, "cDiscount");
            return (Criteria) this;
        }

        public Criteria andCDiscountNotLike(String value) {
            addCriterion("c_discount not like", value, "cDiscount");
            return (Criteria) this;
        }

        public Criteria andCDiscountIn(List<String> values) {
            addCriterion("c_discount in", values, "cDiscount");
            return (Criteria) this;
        }

        public Criteria andCDiscountNotIn(List<String> values) {
            addCriterion("c_discount not in", values, "cDiscount");
            return (Criteria) this;
        }

        public Criteria andCDiscountBetween(String value1, String value2) {
            addCriterion("c_discount between", value1, value2, "cDiscount");
            return (Criteria) this;
        }

        public Criteria andCDiscountNotBetween(String value1, String value2) {
            addCriterion("c_discount not between", value1, value2, "cDiscount");
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