package com.sound.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DocumentAttributeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DocumentAttributeExample() {
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

        public Criteria andDocumentIdIsNull() {
            addCriterion("DOCUMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDocumentIdIsNotNull() {
            addCriterion("DOCUMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentIdEqualTo(String value) {
            addCriterion("DOCUMENT_ID =", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdNotEqualTo(String value) {
            addCriterion("DOCUMENT_ID <>", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdGreaterThan(String value) {
            addCriterion("DOCUMENT_ID >", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_ID >=", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdLessThan(String value) {
            addCriterion("DOCUMENT_ID <", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_ID <=", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdLike(String value) {
            addCriterion("DOCUMENT_ID like", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdNotLike(String value) {
            addCriterion("DOCUMENT_ID not like", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdIn(List<String> values) {
            addCriterion("DOCUMENT_ID in", values, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdNotIn(List<String> values) {
            addCriterion("DOCUMENT_ID not in", values, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdBetween(String value1, String value2) {
            addCriterion("DOCUMENT_ID between", value1, value2, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdNotBetween(String value1, String value2) {
            addCriterion("DOCUMENT_ID not between", value1, value2, "documentId");
            return (Criteria) this;
        }

        public Criteria andAttrNameIsNull() {
            addCriterion("ATTR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAttrNameIsNotNull() {
            addCriterion("ATTR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAttrNameEqualTo(String value) {
            addCriterion("ATTR_NAME =", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotEqualTo(String value) {
            addCriterion("ATTR_NAME <>", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameGreaterThan(String value) {
            addCriterion("ATTR_NAME >", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameGreaterThanOrEqualTo(String value) {
            addCriterion("ATTR_NAME >=", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLessThan(String value) {
            addCriterion("ATTR_NAME <", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLessThanOrEqualTo(String value) {
            addCriterion("ATTR_NAME <=", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLike(String value) {
            addCriterion("ATTR_NAME like", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotLike(String value) {
            addCriterion("ATTR_NAME not like", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameIn(List<String> values) {
            addCriterion("ATTR_NAME in", values, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotIn(List<String> values) {
            addCriterion("ATTR_NAME not in", values, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameBetween(String value1, String value2) {
            addCriterion("ATTR_NAME between", value1, value2, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotBetween(String value1, String value2) {
            addCriterion("ATTR_NAME not between", value1, value2, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrValueIsNull() {
            addCriterion("ATTR_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andAttrValueIsNotNull() {
            addCriterion("ATTR_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andAttrValueEqualTo(String value) {
            addCriterion("ATTR_VALUE =", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueNotEqualTo(String value) {
            addCriterion("ATTR_VALUE <>", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueGreaterThan(String value) {
            addCriterion("ATTR_VALUE >", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueGreaterThanOrEqualTo(String value) {
            addCriterion("ATTR_VALUE >=", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueLessThan(String value) {
            addCriterion("ATTR_VALUE <", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueLessThanOrEqualTo(String value) {
            addCriterion("ATTR_VALUE <=", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueLike(String value) {
            addCriterion("ATTR_VALUE like", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueNotLike(String value) {
            addCriterion("ATTR_VALUE not like", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueIn(List<String> values) {
            addCriterion("ATTR_VALUE in", values, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueNotIn(List<String> values) {
            addCriterion("ATTR_VALUE not in", values, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueBetween(String value1, String value2) {
            addCriterion("ATTR_VALUE between", value1, value2, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueNotBetween(String value1, String value2) {
            addCriterion("ATTR_VALUE not between", value1, value2, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrDescriptionIsNull() {
            addCriterion("ATTR_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andAttrDescriptionIsNotNull() {
            addCriterion("ATTR_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andAttrDescriptionEqualTo(String value) {
            addCriterion("ATTR_DESCRIPTION =", value, "attrDescription");
            return (Criteria) this;
        }

        public Criteria andAttrDescriptionNotEqualTo(String value) {
            addCriterion("ATTR_DESCRIPTION <>", value, "attrDescription");
            return (Criteria) this;
        }

        public Criteria andAttrDescriptionGreaterThan(String value) {
            addCriterion("ATTR_DESCRIPTION >", value, "attrDescription");
            return (Criteria) this;
        }

        public Criteria andAttrDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("ATTR_DESCRIPTION >=", value, "attrDescription");
            return (Criteria) this;
        }

        public Criteria andAttrDescriptionLessThan(String value) {
            addCriterion("ATTR_DESCRIPTION <", value, "attrDescription");
            return (Criteria) this;
        }

        public Criteria andAttrDescriptionLessThanOrEqualTo(String value) {
            addCriterion("ATTR_DESCRIPTION <=", value, "attrDescription");
            return (Criteria) this;
        }

        public Criteria andAttrDescriptionLike(String value) {
            addCriterion("ATTR_DESCRIPTION like", value, "attrDescription");
            return (Criteria) this;
        }

        public Criteria andAttrDescriptionNotLike(String value) {
            addCriterion("ATTR_DESCRIPTION not like", value, "attrDescription");
            return (Criteria) this;
        }

        public Criteria andAttrDescriptionIn(List<String> values) {
            addCriterion("ATTR_DESCRIPTION in", values, "attrDescription");
            return (Criteria) this;
        }

        public Criteria andAttrDescriptionNotIn(List<String> values) {
            addCriterion("ATTR_DESCRIPTION not in", values, "attrDescription");
            return (Criteria) this;
        }

        public Criteria andAttrDescriptionBetween(String value1, String value2) {
            addCriterion("ATTR_DESCRIPTION between", value1, value2, "attrDescription");
            return (Criteria) this;
        }

        public Criteria andAttrDescriptionNotBetween(String value1, String value2) {
            addCriterion("ATTR_DESCRIPTION not between", value1, value2, "attrDescription");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampIsNull() {
            addCriterion("LAST_UPDATED_STAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampIsNotNull() {
            addCriterion("LAST_UPDATED_STAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampEqualTo(Date value) {
            addCriterion("LAST_UPDATED_STAMP =", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampNotEqualTo(Date value) {
            addCriterion("LAST_UPDATED_STAMP <>", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampGreaterThan(Date value) {
            addCriterion("LAST_UPDATED_STAMP >", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATED_STAMP >=", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampLessThan(Date value) {
            addCriterion("LAST_UPDATED_STAMP <", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATED_STAMP <=", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampIn(List<Date> values) {
            addCriterion("LAST_UPDATED_STAMP in", values, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampNotIn(List<Date> values) {
            addCriterion("LAST_UPDATED_STAMP not in", values, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATED_STAMP between", value1, value2, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATED_STAMP not between", value1, value2, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampIsNull() {
            addCriterion("LAST_UPDATED_TX_STAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampIsNotNull() {
            addCriterion("LAST_UPDATED_TX_STAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampEqualTo(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP =", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampNotEqualTo(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP <>", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampGreaterThan(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP >", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP >=", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampLessThan(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP <", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP <=", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampIn(List<Date> values) {
            addCriterion("LAST_UPDATED_TX_STAMP in", values, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampNotIn(List<Date> values) {
            addCriterion("LAST_UPDATED_TX_STAMP not in", values, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATED_TX_STAMP between", value1, value2, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATED_TX_STAMP not between", value1, value2, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampIsNull() {
            addCriterion("CREATED_STAMP is null");
            return (Criteria) this;
        }

        public Criteria andCreatedStampIsNotNull() {
            addCriterion("CREATED_STAMP is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedStampEqualTo(Date value) {
            addCriterion("CREATED_STAMP =", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampNotEqualTo(Date value) {
            addCriterion("CREATED_STAMP <>", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampGreaterThan(Date value) {
            addCriterion("CREATED_STAMP >", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_STAMP >=", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampLessThan(Date value) {
            addCriterion("CREATED_STAMP <", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_STAMP <=", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampIn(List<Date> values) {
            addCriterion("CREATED_STAMP in", values, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampNotIn(List<Date> values) {
            addCriterion("CREATED_STAMP not in", values, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampBetween(Date value1, Date value2) {
            addCriterion("CREATED_STAMP between", value1, value2, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_STAMP not between", value1, value2, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampIsNull() {
            addCriterion("CREATED_TX_STAMP is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampIsNotNull() {
            addCriterion("CREATED_TX_STAMP is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampEqualTo(Date value) {
            addCriterion("CREATED_TX_STAMP =", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampNotEqualTo(Date value) {
            addCriterion("CREATED_TX_STAMP <>", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampGreaterThan(Date value) {
            addCriterion("CREATED_TX_STAMP >", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_TX_STAMP >=", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampLessThan(Date value) {
            addCriterion("CREATED_TX_STAMP <", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_TX_STAMP <=", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampIn(List<Date> values) {
            addCriterion("CREATED_TX_STAMP in", values, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampNotIn(List<Date> values) {
            addCriterion("CREATED_TX_STAMP not in", values, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampBetween(Date value1, Date value2) {
            addCriterion("CREATED_TX_STAMP between", value1, value2, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_TX_STAMP not between", value1, value2, "createdTxStamp");
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