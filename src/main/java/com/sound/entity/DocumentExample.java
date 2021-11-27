package com.sound.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DocumentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DocumentExample() {
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

        public Criteria andDocumentTypeIdIsNull() {
            addCriterion("DOCUMENT_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIdIsNotNull() {
            addCriterion("DOCUMENT_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIdEqualTo(String value) {
            addCriterion("DOCUMENT_TYPE_ID =", value, "documentTypeId");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIdNotEqualTo(String value) {
            addCriterion("DOCUMENT_TYPE_ID <>", value, "documentTypeId");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIdGreaterThan(String value) {
            addCriterion("DOCUMENT_TYPE_ID >", value, "documentTypeId");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_TYPE_ID >=", value, "documentTypeId");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIdLessThan(String value) {
            addCriterion("DOCUMENT_TYPE_ID <", value, "documentTypeId");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIdLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_TYPE_ID <=", value, "documentTypeId");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIdLike(String value) {
            addCriterion("DOCUMENT_TYPE_ID like", value, "documentTypeId");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIdNotLike(String value) {
            addCriterion("DOCUMENT_TYPE_ID not like", value, "documentTypeId");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIdIn(List<String> values) {
            addCriterion("DOCUMENT_TYPE_ID in", values, "documentTypeId");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIdNotIn(List<String> values) {
            addCriterion("DOCUMENT_TYPE_ID not in", values, "documentTypeId");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIdBetween(String value1, String value2) {
            addCriterion("DOCUMENT_TYPE_ID between", value1, value2, "documentTypeId");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIdNotBetween(String value1, String value2) {
            addCriterion("DOCUMENT_TYPE_ID not between", value1, value2, "documentTypeId");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIsNull() {
            addCriterion("DATE_CREATED is null");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIsNotNull() {
            addCriterion("DATE_CREATED is not null");
            return (Criteria) this;
        }

        public Criteria andDateCreatedEqualTo(Date value) {
            addCriterion("DATE_CREATED =", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotEqualTo(Date value) {
            addCriterion("DATE_CREATED <>", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedGreaterThan(Date value) {
            addCriterion("DATE_CREATED >", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_CREATED >=", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedLessThan(Date value) {
            addCriterion("DATE_CREATED <", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedLessThanOrEqualTo(Date value) {
            addCriterion("DATE_CREATED <=", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIn(List<Date> values) {
            addCriterion("DATE_CREATED in", values, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotIn(List<Date> values) {
            addCriterion("DATE_CREATED not in", values, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedBetween(Date value1, Date value2) {
            addCriterion("DATE_CREATED between", value1, value2, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotBetween(Date value1, Date value2) {
            addCriterion("DATE_CREATED not between", value1, value2, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("COMMENTS is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("COMMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("COMMENTS =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("COMMENTS <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("COMMENTS >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTS >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("COMMENTS <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("COMMENTS <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("COMMENTS like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("COMMENTS not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("COMMENTS in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("COMMENTS not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("COMMENTS between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("COMMENTS not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andDocumentLocationIsNull() {
            addCriterion("DOCUMENT_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andDocumentLocationIsNotNull() {
            addCriterion("DOCUMENT_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentLocationEqualTo(String value) {
            addCriterion("DOCUMENT_LOCATION =", value, "documentLocation");
            return (Criteria) this;
        }

        public Criteria andDocumentLocationNotEqualTo(String value) {
            addCriterion("DOCUMENT_LOCATION <>", value, "documentLocation");
            return (Criteria) this;
        }

        public Criteria andDocumentLocationGreaterThan(String value) {
            addCriterion("DOCUMENT_LOCATION >", value, "documentLocation");
            return (Criteria) this;
        }

        public Criteria andDocumentLocationGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_LOCATION >=", value, "documentLocation");
            return (Criteria) this;
        }

        public Criteria andDocumentLocationLessThan(String value) {
            addCriterion("DOCUMENT_LOCATION <", value, "documentLocation");
            return (Criteria) this;
        }

        public Criteria andDocumentLocationLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_LOCATION <=", value, "documentLocation");
            return (Criteria) this;
        }

        public Criteria andDocumentLocationLike(String value) {
            addCriterion("DOCUMENT_LOCATION like", value, "documentLocation");
            return (Criteria) this;
        }

        public Criteria andDocumentLocationNotLike(String value) {
            addCriterion("DOCUMENT_LOCATION not like", value, "documentLocation");
            return (Criteria) this;
        }

        public Criteria andDocumentLocationIn(List<String> values) {
            addCriterion("DOCUMENT_LOCATION in", values, "documentLocation");
            return (Criteria) this;
        }

        public Criteria andDocumentLocationNotIn(List<String> values) {
            addCriterion("DOCUMENT_LOCATION not in", values, "documentLocation");
            return (Criteria) this;
        }

        public Criteria andDocumentLocationBetween(String value1, String value2) {
            addCriterion("DOCUMENT_LOCATION between", value1, value2, "documentLocation");
            return (Criteria) this;
        }

        public Criteria andDocumentLocationNotBetween(String value1, String value2) {
            addCriterion("DOCUMENT_LOCATION not between", value1, value2, "documentLocation");
            return (Criteria) this;
        }

        public Criteria andDocumentTextIsNull() {
            addCriterion("DOCUMENT_TEXT is null");
            return (Criteria) this;
        }

        public Criteria andDocumentTextIsNotNull() {
            addCriterion("DOCUMENT_TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentTextEqualTo(String value) {
            addCriterion("DOCUMENT_TEXT =", value, "documentText");
            return (Criteria) this;
        }

        public Criteria andDocumentTextNotEqualTo(String value) {
            addCriterion("DOCUMENT_TEXT <>", value, "documentText");
            return (Criteria) this;
        }

        public Criteria andDocumentTextGreaterThan(String value) {
            addCriterion("DOCUMENT_TEXT >", value, "documentText");
            return (Criteria) this;
        }

        public Criteria andDocumentTextGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_TEXT >=", value, "documentText");
            return (Criteria) this;
        }

        public Criteria andDocumentTextLessThan(String value) {
            addCriterion("DOCUMENT_TEXT <", value, "documentText");
            return (Criteria) this;
        }

        public Criteria andDocumentTextLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_TEXT <=", value, "documentText");
            return (Criteria) this;
        }

        public Criteria andDocumentTextLike(String value) {
            addCriterion("DOCUMENT_TEXT like", value, "documentText");
            return (Criteria) this;
        }

        public Criteria andDocumentTextNotLike(String value) {
            addCriterion("DOCUMENT_TEXT not like", value, "documentText");
            return (Criteria) this;
        }

        public Criteria andDocumentTextIn(List<String> values) {
            addCriterion("DOCUMENT_TEXT in", values, "documentText");
            return (Criteria) this;
        }

        public Criteria andDocumentTextNotIn(List<String> values) {
            addCriterion("DOCUMENT_TEXT not in", values, "documentText");
            return (Criteria) this;
        }

        public Criteria andDocumentTextBetween(String value1, String value2) {
            addCriterion("DOCUMENT_TEXT between", value1, value2, "documentText");
            return (Criteria) this;
        }

        public Criteria andDocumentTextNotBetween(String value1, String value2) {
            addCriterion("DOCUMENT_TEXT not between", value1, value2, "documentText");
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