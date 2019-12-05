package com.hms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbBookroomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbBookroomExample() {
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

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Integer value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Integer value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Integer value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Integer value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Integer> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Integer> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Integer value1, Integer value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andARoomidIsNull() {
            addCriterion("a_roomid is null");
            return (Criteria) this;
        }

        public Criteria andARoomidIsNotNull() {
            addCriterion("a_roomid is not null");
            return (Criteria) this;
        }

        public Criteria andARoomidEqualTo(Integer value) {
            addCriterion("a_roomid =", value, "aRoomid");
            return (Criteria) this;
        }

        public Criteria andARoomidNotEqualTo(Integer value) {
            addCriterion("a_roomid <>", value, "aRoomid");
            return (Criteria) this;
        }

        public Criteria andARoomidGreaterThan(Integer value) {
            addCriterion("a_roomid >", value, "aRoomid");
            return (Criteria) this;
        }

        public Criteria andARoomidGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_roomid >=", value, "aRoomid");
            return (Criteria) this;
        }

        public Criteria andARoomidLessThan(Integer value) {
            addCriterion("a_roomid <", value, "aRoomid");
            return (Criteria) this;
        }

        public Criteria andARoomidLessThanOrEqualTo(Integer value) {
            addCriterion("a_roomid <=", value, "aRoomid");
            return (Criteria) this;
        }

        public Criteria andARoomidIn(List<Integer> values) {
            addCriterion("a_roomid in", values, "aRoomid");
            return (Criteria) this;
        }

        public Criteria andARoomidNotIn(List<Integer> values) {
            addCriterion("a_roomid not in", values, "aRoomid");
            return (Criteria) this;
        }

        public Criteria andARoomidBetween(Integer value1, Integer value2) {
            addCriterion("a_roomid between", value1, value2, "aRoomid");
            return (Criteria) this;
        }

        public Criteria andARoomidNotBetween(Integer value1, Integer value2) {
            addCriterion("a_roomid not between", value1, value2, "aRoomid");
            return (Criteria) this;
        }

        public Criteria andABooktimeIsNull() {
            addCriterion("a_booktime is null");
            return (Criteria) this;
        }

        public Criteria andABooktimeIsNotNull() {
            addCriterion("a_booktime is not null");
            return (Criteria) this;
        }

        public Criteria andABooktimeEqualTo(Date value) {
            addCriterion("a_booktime =", value, "aBooktime");
            return (Criteria) this;
        }

        public Criteria andABooktimeNotEqualTo(Date value) {
            addCriterion("a_booktime <>", value, "aBooktime");
            return (Criteria) this;
        }

        public Criteria andABooktimeGreaterThan(Date value) {
            addCriterion("a_booktime >", value, "aBooktime");
            return (Criteria) this;
        }

        public Criteria andABooktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("a_booktime >=", value, "aBooktime");
            return (Criteria) this;
        }

        public Criteria andABooktimeLessThan(Date value) {
            addCriterion("a_booktime <", value, "aBooktime");
            return (Criteria) this;
        }

        public Criteria andABooktimeLessThanOrEqualTo(Date value) {
            addCriterion("a_booktime <=", value, "aBooktime");
            return (Criteria) this;
        }

        public Criteria andABooktimeIn(List<Date> values) {
            addCriterion("a_booktime in", values, "aBooktime");
            return (Criteria) this;
        }

        public Criteria andABooktimeNotIn(List<Date> values) {
            addCriterion("a_booktime not in", values, "aBooktime");
            return (Criteria) this;
        }

        public Criteria andABooktimeBetween(Date value1, Date value2) {
            addCriterion("a_booktime between", value1, value2, "aBooktime");
            return (Criteria) this;
        }

        public Criteria andABooktimeNotBetween(Date value1, Date value2) {
            addCriterion("a_booktime not between", value1, value2, "aBooktime");
            return (Criteria) this;
        }

        public Criteria andABookdaysIsNull() {
            addCriterion("a_bookdays is null");
            return (Criteria) this;
        }

        public Criteria andABookdaysIsNotNull() {
            addCriterion("a_bookdays is not null");
            return (Criteria) this;
        }

        public Criteria andABookdaysEqualTo(Integer value) {
            addCriterion("a_bookdays =", value, "aBookdays");
            return (Criteria) this;
        }

        public Criteria andABookdaysNotEqualTo(Integer value) {
            addCriterion("a_bookdays <>", value, "aBookdays");
            return (Criteria) this;
        }

        public Criteria andABookdaysGreaterThan(Integer value) {
            addCriterion("a_bookdays >", value, "aBookdays");
            return (Criteria) this;
        }

        public Criteria andABookdaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_bookdays >=", value, "aBookdays");
            return (Criteria) this;
        }

        public Criteria andABookdaysLessThan(Integer value) {
            addCriterion("a_bookdays <", value, "aBookdays");
            return (Criteria) this;
        }

        public Criteria andABookdaysLessThanOrEqualTo(Integer value) {
            addCriterion("a_bookdays <=", value, "aBookdays");
            return (Criteria) this;
        }

        public Criteria andABookdaysIn(List<Integer> values) {
            addCriterion("a_bookdays in", values, "aBookdays");
            return (Criteria) this;
        }

        public Criteria andABookdaysNotIn(List<Integer> values) {
            addCriterion("a_bookdays not in", values, "aBookdays");
            return (Criteria) this;
        }

        public Criteria andABookdaysBetween(Integer value1, Integer value2) {
            addCriterion("a_bookdays between", value1, value2, "aBookdays");
            return (Criteria) this;
        }

        public Criteria andABookdaysNotBetween(Integer value1, Integer value2) {
            addCriterion("a_bookdays not between", value1, value2, "aBookdays");
            return (Criteria) this;
        }

        public Criteria andAEndtimeIsNull() {
            addCriterion("a_endtime is null");
            return (Criteria) this;
        }

        public Criteria andAEndtimeIsNotNull() {
            addCriterion("a_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andAEndtimeEqualTo(Date value) {
            addCriterion("a_endtime =", value, "aEndtime");
            return (Criteria) this;
        }

        public Criteria andAEndtimeNotEqualTo(Date value) {
            addCriterion("a_endtime <>", value, "aEndtime");
            return (Criteria) this;
        }

        public Criteria andAEndtimeGreaterThan(Date value) {
            addCriterion("a_endtime >", value, "aEndtime");
            return (Criteria) this;
        }

        public Criteria andAEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("a_endtime >=", value, "aEndtime");
            return (Criteria) this;
        }

        public Criteria andAEndtimeLessThan(Date value) {
            addCriterion("a_endtime <", value, "aEndtime");
            return (Criteria) this;
        }

        public Criteria andAEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("a_endtime <=", value, "aEndtime");
            return (Criteria) this;
        }

        public Criteria andAEndtimeIn(List<Date> values) {
            addCriterion("a_endtime in", values, "aEndtime");
            return (Criteria) this;
        }

        public Criteria andAEndtimeNotIn(List<Date> values) {
            addCriterion("a_endtime not in", values, "aEndtime");
            return (Criteria) this;
        }

        public Criteria andAEndtimeBetween(Date value1, Date value2) {
            addCriterion("a_endtime between", value1, value2, "aEndtime");
            return (Criteria) this;
        }

        public Criteria andAEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("a_endtime not between", value1, value2, "aEndtime");
            return (Criteria) this;
        }

        public Criteria andACustomeridIsNull() {
            addCriterion("a_customerid is null");
            return (Criteria) this;
        }

        public Criteria andACustomeridIsNotNull() {
            addCriterion("a_customerid is not null");
            return (Criteria) this;
        }

        public Criteria andACustomeridEqualTo(Integer value) {
            addCriterion("a_customerid =", value, "aCustomerid");
            return (Criteria) this;
        }

        public Criteria andACustomeridNotEqualTo(Integer value) {
            addCriterion("a_customerid <>", value, "aCustomerid");
            return (Criteria) this;
        }

        public Criteria andACustomeridGreaterThan(Integer value) {
            addCriterion("a_customerid >", value, "aCustomerid");
            return (Criteria) this;
        }

        public Criteria andACustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_customerid >=", value, "aCustomerid");
            return (Criteria) this;
        }

        public Criteria andACustomeridLessThan(Integer value) {
            addCriterion("a_customerid <", value, "aCustomerid");
            return (Criteria) this;
        }

        public Criteria andACustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("a_customerid <=", value, "aCustomerid");
            return (Criteria) this;
        }

        public Criteria andACustomeridIn(List<Integer> values) {
            addCriterion("a_customerid in", values, "aCustomerid");
            return (Criteria) this;
        }

        public Criteria andACustomeridNotIn(List<Integer> values) {
            addCriterion("a_customerid not in", values, "aCustomerid");
            return (Criteria) this;
        }

        public Criteria andACustomeridBetween(Integer value1, Integer value2) {
            addCriterion("a_customerid between", value1, value2, "aCustomerid");
            return (Criteria) this;
        }

        public Criteria andACustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("a_customerid not between", value1, value2, "aCustomerid");
            return (Criteria) this;
        }

        public Criteria andACustomernameIsNull() {
            addCriterion("a_customername is null");
            return (Criteria) this;
        }

        public Criteria andACustomernameIsNotNull() {
            addCriterion("a_customername is not null");
            return (Criteria) this;
        }

        public Criteria andACustomernameEqualTo(String value) {
            addCriterion("a_customername =", value, "aCustomername");
            return (Criteria) this;
        }

        public Criteria andACustomernameNotEqualTo(String value) {
            addCriterion("a_customername <>", value, "aCustomername");
            return (Criteria) this;
        }

        public Criteria andACustomernameGreaterThan(String value) {
            addCriterion("a_customername >", value, "aCustomername");
            return (Criteria) this;
        }

        public Criteria andACustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("a_customername >=", value, "aCustomername");
            return (Criteria) this;
        }

        public Criteria andACustomernameLessThan(String value) {
            addCriterion("a_customername <", value, "aCustomername");
            return (Criteria) this;
        }

        public Criteria andACustomernameLessThanOrEqualTo(String value) {
            addCriterion("a_customername <=", value, "aCustomername");
            return (Criteria) this;
        }

        public Criteria andACustomernameLike(String value) {
            addCriterion("a_customername like", value, "aCustomername");
            return (Criteria) this;
        }

        public Criteria andACustomernameNotLike(String value) {
            addCriterion("a_customername not like", value, "aCustomername");
            return (Criteria) this;
        }

        public Criteria andACustomernameIn(List<String> values) {
            addCriterion("a_customername in", values, "aCustomername");
            return (Criteria) this;
        }

        public Criteria andACustomernameNotIn(List<String> values) {
            addCriterion("a_customername not in", values, "aCustomername");
            return (Criteria) this;
        }

        public Criteria andACustomernameBetween(String value1, String value2) {
            addCriterion("a_customername between", value1, value2, "aCustomername");
            return (Criteria) this;
        }

        public Criteria andACustomernameNotBetween(String value1, String value2) {
            addCriterion("a_customername not between", value1, value2, "aCustomername");
            return (Criteria) this;
        }

        public Criteria andATypeIsNull() {
            addCriterion("a_type is null");
            return (Criteria) this;
        }

        public Criteria andATypeIsNotNull() {
            addCriterion("a_type is not null");
            return (Criteria) this;
        }

        public Criteria andATypeEqualTo(String value) {
            addCriterion("a_type =", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeNotEqualTo(String value) {
            addCriterion("a_type <>", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeGreaterThan(String value) {
            addCriterion("a_type >", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeGreaterThanOrEqualTo(String value) {
            addCriterion("a_type >=", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeLessThan(String value) {
            addCriterion("a_type <", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeLessThanOrEqualTo(String value) {
            addCriterion("a_type <=", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeLike(String value) {
            addCriterion("a_type like", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeNotLike(String value) {
            addCriterion("a_type not like", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeIn(List<String> values) {
            addCriterion("a_type in", values, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeNotIn(List<String> values) {
            addCriterion("a_type not in", values, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeBetween(String value1, String value2) {
            addCriterion("a_type between", value1, value2, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeNotBetween(String value1, String value2) {
            addCriterion("a_type not between", value1, value2, "aType");
            return (Criteria) this;
        }

        public Criteria andAActualvalueIsNull() {
            addCriterion("a_actualvalue is null");
            return (Criteria) this;
        }

        public Criteria andAActualvalueIsNotNull() {
            addCriterion("a_actualvalue is not null");
            return (Criteria) this;
        }

        public Criteria andAActualvalueEqualTo(String value) {
            addCriterion("a_actualvalue =", value, "aActualvalue");
            return (Criteria) this;
        }

        public Criteria andAActualvalueNotEqualTo(String value) {
            addCriterion("a_actualvalue <>", value, "aActualvalue");
            return (Criteria) this;
        }

        public Criteria andAActualvalueGreaterThan(String value) {
            addCriterion("a_actualvalue >", value, "aActualvalue");
            return (Criteria) this;
        }

        public Criteria andAActualvalueGreaterThanOrEqualTo(String value) {
            addCriterion("a_actualvalue >=", value, "aActualvalue");
            return (Criteria) this;
        }

        public Criteria andAActualvalueLessThan(String value) {
            addCriterion("a_actualvalue <", value, "aActualvalue");
            return (Criteria) this;
        }

        public Criteria andAActualvalueLessThanOrEqualTo(String value) {
            addCriterion("a_actualvalue <=", value, "aActualvalue");
            return (Criteria) this;
        }

        public Criteria andAActualvalueLike(String value) {
            addCriterion("a_actualvalue like", value, "aActualvalue");
            return (Criteria) this;
        }

        public Criteria andAActualvalueNotLike(String value) {
            addCriterion("a_actualvalue not like", value, "aActualvalue");
            return (Criteria) this;
        }

        public Criteria andAActualvalueIn(List<String> values) {
            addCriterion("a_actualvalue in", values, "aActualvalue");
            return (Criteria) this;
        }

        public Criteria andAActualvalueNotIn(List<String> values) {
            addCriterion("a_actualvalue not in", values, "aActualvalue");
            return (Criteria) this;
        }

        public Criteria andAActualvalueBetween(String value1, String value2) {
            addCriterion("a_actualvalue between", value1, value2, "aActualvalue");
            return (Criteria) this;
        }

        public Criteria andAActualvalueNotBetween(String value1, String value2) {
            addCriterion("a_actualvalue not between", value1, value2, "aActualvalue");
            return (Criteria) this;
        }

        public Criteria andAShouquvalueIsNull() {
            addCriterion("a_shouquvalue is null");
            return (Criteria) this;
        }

        public Criteria andAShouquvalueIsNotNull() {
            addCriterion("a_shouquvalue is not null");
            return (Criteria) this;
        }

        public Criteria andAShouquvalueEqualTo(String value) {
            addCriterion("a_shouquvalue =", value, "aShouquvalue");
            return (Criteria) this;
        }

        public Criteria andAShouquvalueNotEqualTo(String value) {
            addCriterion("a_shouquvalue <>", value, "aShouquvalue");
            return (Criteria) this;
        }

        public Criteria andAShouquvalueGreaterThan(String value) {
            addCriterion("a_shouquvalue >", value, "aShouquvalue");
            return (Criteria) this;
        }

        public Criteria andAShouquvalueGreaterThanOrEqualTo(String value) {
            addCriterion("a_shouquvalue >=", value, "aShouquvalue");
            return (Criteria) this;
        }

        public Criteria andAShouquvalueLessThan(String value) {
            addCriterion("a_shouquvalue <", value, "aShouquvalue");
            return (Criteria) this;
        }

        public Criteria andAShouquvalueLessThanOrEqualTo(String value) {
            addCriterion("a_shouquvalue <=", value, "aShouquvalue");
            return (Criteria) this;
        }

        public Criteria andAShouquvalueLike(String value) {
            addCriterion("a_shouquvalue like", value, "aShouquvalue");
            return (Criteria) this;
        }

        public Criteria andAShouquvalueNotLike(String value) {
            addCriterion("a_shouquvalue not like", value, "aShouquvalue");
            return (Criteria) this;
        }

        public Criteria andAShouquvalueIn(List<String> values) {
            addCriterion("a_shouquvalue in", values, "aShouquvalue");
            return (Criteria) this;
        }

        public Criteria andAShouquvalueNotIn(List<String> values) {
            addCriterion("a_shouquvalue not in", values, "aShouquvalue");
            return (Criteria) this;
        }

        public Criteria andAShouquvalueBetween(String value1, String value2) {
            addCriterion("a_shouquvalue between", value1, value2, "aShouquvalue");
            return (Criteria) this;
        }

        public Criteria andAShouquvalueNotBetween(String value1, String value2) {
            addCriterion("a_shouquvalue not between", value1, value2, "aShouquvalue");
            return (Criteria) this;
        }

        public Criteria andADiscoutvalueIsNull() {
            addCriterion("a_discoutvalue is null");
            return (Criteria) this;
        }

        public Criteria andADiscoutvalueIsNotNull() {
            addCriterion("a_discoutvalue is not null");
            return (Criteria) this;
        }

        public Criteria andADiscoutvalueEqualTo(String value) {
            addCriterion("a_discoutvalue =", value, "aDiscoutvalue");
            return (Criteria) this;
        }

        public Criteria andADiscoutvalueNotEqualTo(String value) {
            addCriterion("a_discoutvalue <>", value, "aDiscoutvalue");
            return (Criteria) this;
        }

        public Criteria andADiscoutvalueGreaterThan(String value) {
            addCriterion("a_discoutvalue >", value, "aDiscoutvalue");
            return (Criteria) this;
        }

        public Criteria andADiscoutvalueGreaterThanOrEqualTo(String value) {
            addCriterion("a_discoutvalue >=", value, "aDiscoutvalue");
            return (Criteria) this;
        }

        public Criteria andADiscoutvalueLessThan(String value) {
            addCriterion("a_discoutvalue <", value, "aDiscoutvalue");
            return (Criteria) this;
        }

        public Criteria andADiscoutvalueLessThanOrEqualTo(String value) {
            addCriterion("a_discoutvalue <=", value, "aDiscoutvalue");
            return (Criteria) this;
        }

        public Criteria andADiscoutvalueLike(String value) {
            addCriterion("a_discoutvalue like", value, "aDiscoutvalue");
            return (Criteria) this;
        }

        public Criteria andADiscoutvalueNotLike(String value) {
            addCriterion("a_discoutvalue not like", value, "aDiscoutvalue");
            return (Criteria) this;
        }

        public Criteria andADiscoutvalueIn(List<String> values) {
            addCriterion("a_discoutvalue in", values, "aDiscoutvalue");
            return (Criteria) this;
        }

        public Criteria andADiscoutvalueNotIn(List<String> values) {
            addCriterion("a_discoutvalue not in", values, "aDiscoutvalue");
            return (Criteria) this;
        }

        public Criteria andADiscoutvalueBetween(String value1, String value2) {
            addCriterion("a_discoutvalue between", value1, value2, "aDiscoutvalue");
            return (Criteria) this;
        }

        public Criteria andADiscoutvalueNotBetween(String value1, String value2) {
            addCriterion("a_discoutvalue not between", value1, value2, "aDiscoutvalue");
            return (Criteria) this;
        }

        public Criteria andAValuestateIsNull() {
            addCriterion("a_valuestate is null");
            return (Criteria) this;
        }

        public Criteria andAValuestateIsNotNull() {
            addCriterion("a_valuestate is not null");
            return (Criteria) this;
        }

        public Criteria andAValuestateEqualTo(String value) {
            addCriterion("a_valuestate =", value, "aValuestate");
            return (Criteria) this;
        }

        public Criteria andAValuestateNotEqualTo(String value) {
            addCriterion("a_valuestate <>", value, "aValuestate");
            return (Criteria) this;
        }

        public Criteria andAValuestateGreaterThan(String value) {
            addCriterion("a_valuestate >", value, "aValuestate");
            return (Criteria) this;
        }

        public Criteria andAValuestateGreaterThanOrEqualTo(String value) {
            addCriterion("a_valuestate >=", value, "aValuestate");
            return (Criteria) this;
        }

        public Criteria andAValuestateLessThan(String value) {
            addCriterion("a_valuestate <", value, "aValuestate");
            return (Criteria) this;
        }

        public Criteria andAValuestateLessThanOrEqualTo(String value) {
            addCriterion("a_valuestate <=", value, "aValuestate");
            return (Criteria) this;
        }

        public Criteria andAValuestateLike(String value) {
            addCriterion("a_valuestate like", value, "aValuestate");
            return (Criteria) this;
        }

        public Criteria andAValuestateNotLike(String value) {
            addCriterion("a_valuestate not like", value, "aValuestate");
            return (Criteria) this;
        }

        public Criteria andAValuestateIn(List<String> values) {
            addCriterion("a_valuestate in", values, "aValuestate");
            return (Criteria) this;
        }

        public Criteria andAValuestateNotIn(List<String> values) {
            addCriterion("a_valuestate not in", values, "aValuestate");
            return (Criteria) this;
        }

        public Criteria andAValuestateBetween(String value1, String value2) {
            addCriterion("a_valuestate between", value1, value2, "aValuestate");
            return (Criteria) this;
        }

        public Criteria andAValuestateNotBetween(String value1, String value2) {
            addCriterion("a_valuestate not between", value1, value2, "aValuestate");
            return (Criteria) this;
        }

        public Criteria andAStateIsNull() {
            addCriterion("a_state is null");
            return (Criteria) this;
        }

        public Criteria andAStateIsNotNull() {
            addCriterion("a_state is not null");
            return (Criteria) this;
        }

        public Criteria andAStateEqualTo(String value) {
            addCriterion("a_state =", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateNotEqualTo(String value) {
            addCriterion("a_state <>", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateGreaterThan(String value) {
            addCriterion("a_state >", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateGreaterThanOrEqualTo(String value) {
            addCriterion("a_state >=", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateLessThan(String value) {
            addCriterion("a_state <", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateLessThanOrEqualTo(String value) {
            addCriterion("a_state <=", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateLike(String value) {
            addCriterion("a_state like", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateNotLike(String value) {
            addCriterion("a_state not like", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateIn(List<String> values) {
            addCriterion("a_state in", values, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateNotIn(List<String> values) {
            addCriterion("a_state not in", values, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateBetween(String value1, String value2) {
            addCriterion("a_state between", value1, value2, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateNotBetween(String value1, String value2) {
            addCriterion("a_state not between", value1, value2, "aState");
            return (Criteria) this;
        }

        public Criteria andARetirementIsNull() {
            addCriterion("a_retirement is null");
            return (Criteria) this;
        }

        public Criteria andARetirementIsNotNull() {
            addCriterion("a_retirement is not null");
            return (Criteria) this;
        }

        public Criteria andARetirementEqualTo(String value) {
            addCriterion("a_retirement =", value, "aRetirement");
            return (Criteria) this;
        }

        public Criteria andARetirementNotEqualTo(String value) {
            addCriterion("a_retirement <>", value, "aRetirement");
            return (Criteria) this;
        }

        public Criteria andARetirementGreaterThan(String value) {
            addCriterion("a_retirement >", value, "aRetirement");
            return (Criteria) this;
        }

        public Criteria andARetirementGreaterThanOrEqualTo(String value) {
            addCriterion("a_retirement >=", value, "aRetirement");
            return (Criteria) this;
        }

        public Criteria andARetirementLessThan(String value) {
            addCriterion("a_retirement <", value, "aRetirement");
            return (Criteria) this;
        }

        public Criteria andARetirementLessThanOrEqualTo(String value) {
            addCriterion("a_retirement <=", value, "aRetirement");
            return (Criteria) this;
        }

        public Criteria andARetirementLike(String value) {
            addCriterion("a_retirement like", value, "aRetirement");
            return (Criteria) this;
        }

        public Criteria andARetirementNotLike(String value) {
            addCriterion("a_retirement not like", value, "aRetirement");
            return (Criteria) this;
        }

        public Criteria andARetirementIn(List<String> values) {
            addCriterion("a_retirement in", values, "aRetirement");
            return (Criteria) this;
        }

        public Criteria andARetirementNotIn(List<String> values) {
            addCriterion("a_retirement not in", values, "aRetirement");
            return (Criteria) this;
        }

        public Criteria andARetirementBetween(String value1, String value2) {
            addCriterion("a_retirement between", value1, value2, "aRetirement");
            return (Criteria) this;
        }

        public Criteria andARetirementNotBetween(String value1, String value2) {
            addCriterion("a_retirement not between", value1, value2, "aRetirement");
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