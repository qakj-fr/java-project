package com.qakj.crm.pojo;

import java.util.ArrayList;
import java.util.List;

public class SchedulemgtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchedulemgtExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNineclockIsNull() {
            addCriterion("nineClock is null");
            return (Criteria) this;
        }

        public Criteria andNineclockIsNotNull() {
            addCriterion("nineClock is not null");
            return (Criteria) this;
        }

        public Criteria andNineclockEqualTo(String value) {
            addCriterion("nineClock =", value, "nineclock");
            return (Criteria) this;
        }

        public Criteria andNineclockNotEqualTo(String value) {
            addCriterion("nineClock <>", value, "nineclock");
            return (Criteria) this;
        }

        public Criteria andNineclockGreaterThan(String value) {
            addCriterion("nineClock >", value, "nineclock");
            return (Criteria) this;
        }

        public Criteria andNineclockGreaterThanOrEqualTo(String value) {
            addCriterion("nineClock >=", value, "nineclock");
            return (Criteria) this;
        }

        public Criteria andNineclockLessThan(String value) {
            addCriterion("nineClock <", value, "nineclock");
            return (Criteria) this;
        }

        public Criteria andNineclockLessThanOrEqualTo(String value) {
            addCriterion("nineClock <=", value, "nineclock");
            return (Criteria) this;
        }

        public Criteria andNineclockLike(String value) {
            addCriterion("nineClock like", value, "nineclock");
            return (Criteria) this;
        }

        public Criteria andNineclockNotLike(String value) {
            addCriterion("nineClock not like", value, "nineclock");
            return (Criteria) this;
        }

        public Criteria andNineclockIn(List<String> values) {
            addCriterion("nineClock in", values, "nineclock");
            return (Criteria) this;
        }

        public Criteria andNineclockNotIn(List<String> values) {
            addCriterion("nineClock not in", values, "nineclock");
            return (Criteria) this;
        }

        public Criteria andNineclockBetween(String value1, String value2) {
            addCriterion("nineClock between", value1, value2, "nineclock");
            return (Criteria) this;
        }

        public Criteria andNineclockNotBetween(String value1, String value2) {
            addCriterion("nineClock not between", value1, value2, "nineclock");
            return (Criteria) this;
        }

        public Criteria andTwelveclockIsNull() {
            addCriterion("twelveClock is null");
            return (Criteria) this;
        }

        public Criteria andTwelveclockIsNotNull() {
            addCriterion("twelveClock is not null");
            return (Criteria) this;
        }

        public Criteria andTwelveclockEqualTo(String value) {
            addCriterion("twelveClock =", value, "twelveclock");
            return (Criteria) this;
        }

        public Criteria andTwelveclockNotEqualTo(String value) {
            addCriterion("twelveClock <>", value, "twelveclock");
            return (Criteria) this;
        }

        public Criteria andTwelveclockGreaterThan(String value) {
            addCriterion("twelveClock >", value, "twelveclock");
            return (Criteria) this;
        }

        public Criteria andTwelveclockGreaterThanOrEqualTo(String value) {
            addCriterion("twelveClock >=", value, "twelveclock");
            return (Criteria) this;
        }

        public Criteria andTwelveclockLessThan(String value) {
            addCriterion("twelveClock <", value, "twelveclock");
            return (Criteria) this;
        }

        public Criteria andTwelveclockLessThanOrEqualTo(String value) {
            addCriterion("twelveClock <=", value, "twelveclock");
            return (Criteria) this;
        }

        public Criteria andTwelveclockLike(String value) {
            addCriterion("twelveClock like", value, "twelveclock");
            return (Criteria) this;
        }

        public Criteria andTwelveclockNotLike(String value) {
            addCriterion("twelveClock not like", value, "twelveclock");
            return (Criteria) this;
        }

        public Criteria andTwelveclockIn(List<String> values) {
            addCriterion("twelveClock in", values, "twelveclock");
            return (Criteria) this;
        }

        public Criteria andTwelveclockNotIn(List<String> values) {
            addCriterion("twelveClock not in", values, "twelveclock");
            return (Criteria) this;
        }

        public Criteria andTwelveclockBetween(String value1, String value2) {
            addCriterion("twelveClock between", value1, value2, "twelveclock");
            return (Criteria) this;
        }

        public Criteria andTwelveclockNotBetween(String value1, String value2) {
            addCriterion("twelveClock not between", value1, value2, "twelveclock");
            return (Criteria) this;
        }

        public Criteria andFourteenclockIsNull() {
            addCriterion("fourteenClock is null");
            return (Criteria) this;
        }

        public Criteria andFourteenclockIsNotNull() {
            addCriterion("fourteenClock is not null");
            return (Criteria) this;
        }

        public Criteria andFourteenclockEqualTo(String value) {
            addCriterion("fourteenClock =", value, "fourteenclock");
            return (Criteria) this;
        }

        public Criteria andFourteenclockNotEqualTo(String value) {
            addCriterion("fourteenClock <>", value, "fourteenclock");
            return (Criteria) this;
        }

        public Criteria andFourteenclockGreaterThan(String value) {
            addCriterion("fourteenClock >", value, "fourteenclock");
            return (Criteria) this;
        }

        public Criteria andFourteenclockGreaterThanOrEqualTo(String value) {
            addCriterion("fourteenClock >=", value, "fourteenclock");
            return (Criteria) this;
        }

        public Criteria andFourteenclockLessThan(String value) {
            addCriterion("fourteenClock <", value, "fourteenclock");
            return (Criteria) this;
        }

        public Criteria andFourteenclockLessThanOrEqualTo(String value) {
            addCriterion("fourteenClock <=", value, "fourteenclock");
            return (Criteria) this;
        }

        public Criteria andFourteenclockLike(String value) {
            addCriterion("fourteenClock like", value, "fourteenclock");
            return (Criteria) this;
        }

        public Criteria andFourteenclockNotLike(String value) {
            addCriterion("fourteenClock not like", value, "fourteenclock");
            return (Criteria) this;
        }

        public Criteria andFourteenclockIn(List<String> values) {
            addCriterion("fourteenClock in", values, "fourteenclock");
            return (Criteria) this;
        }

        public Criteria andFourteenclockNotIn(List<String> values) {
            addCriterion("fourteenClock not in", values, "fourteenclock");
            return (Criteria) this;
        }

        public Criteria andFourteenclockBetween(String value1, String value2) {
            addCriterion("fourteenClock between", value1, value2, "fourteenclock");
            return (Criteria) this;
        }

        public Criteria andFourteenclockNotBetween(String value1, String value2) {
            addCriterion("fourteenClock not between", value1, value2, "fourteenclock");
            return (Criteria) this;
        }

        public Criteria andSeventeenclockIsNull() {
            addCriterion("seventeenClock is null");
            return (Criteria) this;
        }

        public Criteria andSeventeenclockIsNotNull() {
            addCriterion("seventeenClock is not null");
            return (Criteria) this;
        }

        public Criteria andSeventeenclockEqualTo(String value) {
            addCriterion("seventeenClock =", value, "seventeenclock");
            return (Criteria) this;
        }

        public Criteria andSeventeenclockNotEqualTo(String value) {
            addCriterion("seventeenClock <>", value, "seventeenclock");
            return (Criteria) this;
        }

        public Criteria andSeventeenclockGreaterThan(String value) {
            addCriterion("seventeenClock >", value, "seventeenclock");
            return (Criteria) this;
        }

        public Criteria andSeventeenclockGreaterThanOrEqualTo(String value) {
            addCriterion("seventeenClock >=", value, "seventeenclock");
            return (Criteria) this;
        }

        public Criteria andSeventeenclockLessThan(String value) {
            addCriterion("seventeenClock <", value, "seventeenclock");
            return (Criteria) this;
        }

        public Criteria andSeventeenclockLessThanOrEqualTo(String value) {
            addCriterion("seventeenClock <=", value, "seventeenclock");
            return (Criteria) this;
        }

        public Criteria andSeventeenclockLike(String value) {
            addCriterion("seventeenClock like", value, "seventeenclock");
            return (Criteria) this;
        }

        public Criteria andSeventeenclockNotLike(String value) {
            addCriterion("seventeenClock not like", value, "seventeenclock");
            return (Criteria) this;
        }

        public Criteria andSeventeenclockIn(List<String> values) {
            addCriterion("seventeenClock in", values, "seventeenclock");
            return (Criteria) this;
        }

        public Criteria andSeventeenclockNotIn(List<String> values) {
            addCriterion("seventeenClock not in", values, "seventeenclock");
            return (Criteria) this;
        }

        public Criteria andSeventeenclockBetween(String value1, String value2) {
            addCriterion("seventeenClock between", value1, value2, "seventeenclock");
            return (Criteria) this;
        }

        public Criteria andSeventeenclockNotBetween(String value1, String value2) {
            addCriterion("seventeenClock not between", value1, value2, "seventeenclock");
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