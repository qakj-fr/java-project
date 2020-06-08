package com.qakj.crm.pojo;

import java.util.ArrayList;
import java.util.List;

public class SupplierInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierInfoExample() {
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

        public Criteria andSuppliernameIsNull() {
            addCriterion("supplierName is null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNotNull() {
            addCriterion("supplierName is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameEqualTo(String value) {
            addCriterion("supplierName =", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotEqualTo(String value) {
            addCriterion("supplierName <>", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThan(String value) {
            addCriterion("supplierName >", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThanOrEqualTo(String value) {
            addCriterion("supplierName >=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThan(String value) {
            addCriterion("supplierName <", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThanOrEqualTo(String value) {
            addCriterion("supplierName <=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLike(String value) {
            addCriterion("supplierName like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotLike(String value) {
            addCriterion("supplierName not like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIn(List<String> values) {
            addCriterion("supplierName in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotIn(List<String> values) {
            addCriterion("supplierName not in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameBetween(String value1, String value2) {
            addCriterion("supplierName between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotBetween(String value1, String value2) {
            addCriterion("supplierName not between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSupplieraddressIsNull() {
            addCriterion("supplierAddress is null");
            return (Criteria) this;
        }

        public Criteria andSupplieraddressIsNotNull() {
            addCriterion("supplierAddress is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieraddressEqualTo(String value) {
            addCriterion("supplierAddress =", value, "supplieraddress");
            return (Criteria) this;
        }

        public Criteria andSupplieraddressNotEqualTo(String value) {
            addCriterion("supplierAddress <>", value, "supplieraddress");
            return (Criteria) this;
        }

        public Criteria andSupplieraddressGreaterThan(String value) {
            addCriterion("supplierAddress >", value, "supplieraddress");
            return (Criteria) this;
        }

        public Criteria andSupplieraddressGreaterThanOrEqualTo(String value) {
            addCriterion("supplierAddress >=", value, "supplieraddress");
            return (Criteria) this;
        }

        public Criteria andSupplieraddressLessThan(String value) {
            addCriterion("supplierAddress <", value, "supplieraddress");
            return (Criteria) this;
        }

        public Criteria andSupplieraddressLessThanOrEqualTo(String value) {
            addCriterion("supplierAddress <=", value, "supplieraddress");
            return (Criteria) this;
        }

        public Criteria andSupplieraddressLike(String value) {
            addCriterion("supplierAddress like", value, "supplieraddress");
            return (Criteria) this;
        }

        public Criteria andSupplieraddressNotLike(String value) {
            addCriterion("supplierAddress not like", value, "supplieraddress");
            return (Criteria) this;
        }

        public Criteria andSupplieraddressIn(List<String> values) {
            addCriterion("supplierAddress in", values, "supplieraddress");
            return (Criteria) this;
        }

        public Criteria andSupplieraddressNotIn(List<String> values) {
            addCriterion("supplierAddress not in", values, "supplieraddress");
            return (Criteria) this;
        }

        public Criteria andSupplieraddressBetween(String value1, String value2) {
            addCriterion("supplierAddress between", value1, value2, "supplieraddress");
            return (Criteria) this;
        }

        public Criteria andSupplieraddressNotBetween(String value1, String value2) {
            addCriterion("supplierAddress not between", value1, value2, "supplieraddress");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneIsNull() {
            addCriterion("supplierPhone is null");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneIsNotNull() {
            addCriterion("supplierPhone is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneEqualTo(String value) {
            addCriterion("supplierPhone =", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneNotEqualTo(String value) {
            addCriterion("supplierPhone <>", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneGreaterThan(String value) {
            addCriterion("supplierPhone >", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneGreaterThanOrEqualTo(String value) {
            addCriterion("supplierPhone >=", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneLessThan(String value) {
            addCriterion("supplierPhone <", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneLessThanOrEqualTo(String value) {
            addCriterion("supplierPhone <=", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneLike(String value) {
            addCriterion("supplierPhone like", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneNotLike(String value) {
            addCriterion("supplierPhone not like", value, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneIn(List<String> values) {
            addCriterion("supplierPhone in", values, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneNotIn(List<String> values) {
            addCriterion("supplierPhone not in", values, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneBetween(String value1, String value2) {
            addCriterion("supplierPhone between", value1, value2, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andSupplierphoneNotBetween(String value1, String value2) {
            addCriterion("supplierPhone not between", value1, value2, "supplierphone");
            return (Criteria) this;
        }

        public Criteria andCommoditynameIsNull() {
            addCriterion("commodityName is null");
            return (Criteria) this;
        }

        public Criteria andCommoditynameIsNotNull() {
            addCriterion("commodityName is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditynameEqualTo(String value) {
            addCriterion("commodityName =", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameNotEqualTo(String value) {
            addCriterion("commodityName <>", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameGreaterThan(String value) {
            addCriterion("commodityName >", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameGreaterThanOrEqualTo(String value) {
            addCriterion("commodityName >=", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameLessThan(String value) {
            addCriterion("commodityName <", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameLessThanOrEqualTo(String value) {
            addCriterion("commodityName <=", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameLike(String value) {
            addCriterion("commodityName like", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameNotLike(String value) {
            addCriterion("commodityName not like", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameIn(List<String> values) {
            addCriterion("commodityName in", values, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameNotIn(List<String> values) {
            addCriterion("commodityName not in", values, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameBetween(String value1, String value2) {
            addCriterion("commodityName between", value1, value2, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameNotBetween(String value1, String value2) {
            addCriterion("commodityName not between", value1, value2, "commodityname");
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