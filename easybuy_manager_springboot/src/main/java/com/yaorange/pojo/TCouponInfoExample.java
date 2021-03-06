package com.yaorange.pojo;

import java.util.ArrayList;
import java.util.List;

public class TCouponInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCouponInfoExample() {
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
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

        public Criteria andUpdateTimeEqualTo(Long value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Long value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Long value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Long value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Long> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Long> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andPromotionNameIsNull() {
            addCriterion("promotion_name is null");
            return (Criteria) this;
        }

        public Criteria andPromotionNameIsNotNull() {
            addCriterion("promotion_name is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionNameEqualTo(String value) {
            addCriterion("promotion_name =", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameNotEqualTo(String value) {
            addCriterion("promotion_name <>", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameGreaterThan(String value) {
            addCriterion("promotion_name >", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_name >=", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameLessThan(String value) {
            addCriterion("promotion_name <", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameLessThanOrEqualTo(String value) {
            addCriterion("promotion_name <=", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameLike(String value) {
            addCriterion("promotion_name like", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameNotLike(String value) {
            addCriterion("promotion_name not like", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameIn(List<String> values) {
            addCriterion("promotion_name in", values, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameNotIn(List<String> values) {
            addCriterion("promotion_name not in", values, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameBetween(String value1, String value2) {
            addCriterion("promotion_name between", value1, value2, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameNotBetween(String value1, String value2) {
            addCriterion("promotion_name not between", value1, value2, "promotionName");
            return (Criteria) this;
        }

        public Criteria andValidateTimeIsNull() {
            addCriterion("validate_time is null");
            return (Criteria) this;
        }

        public Criteria andValidateTimeIsNotNull() {
            addCriterion("validate_time is not null");
            return (Criteria) this;
        }

        public Criteria andValidateTimeEqualTo(Long value) {
            addCriterion("validate_time =", value, "validateTime");
            return (Criteria) this;
        }

        public Criteria andValidateTimeNotEqualTo(Long value) {
            addCriterion("validate_time <>", value, "validateTime");
            return (Criteria) this;
        }

        public Criteria andValidateTimeGreaterThan(Long value) {
            addCriterion("validate_time >", value, "validateTime");
            return (Criteria) this;
        }

        public Criteria andValidateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("validate_time >=", value, "validateTime");
            return (Criteria) this;
        }

        public Criteria andValidateTimeLessThan(Long value) {
            addCriterion("validate_time <", value, "validateTime");
            return (Criteria) this;
        }

        public Criteria andValidateTimeLessThanOrEqualTo(Long value) {
            addCriterion("validate_time <=", value, "validateTime");
            return (Criteria) this;
        }

        public Criteria andValidateTimeIn(List<Long> values) {
            addCriterion("validate_time in", values, "validateTime");
            return (Criteria) this;
        }

        public Criteria andValidateTimeNotIn(List<Long> values) {
            addCriterion("validate_time not in", values, "validateTime");
            return (Criteria) this;
        }

        public Criteria andValidateTimeBetween(Long value1, Long value2) {
            addCriterion("validate_time between", value1, value2, "validateTime");
            return (Criteria) this;
        }

        public Criteria andValidateTimeNotBetween(Long value1, Long value2) {
            addCriterion("validate_time not between", value1, value2, "validateTime");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNull() {
            addCriterion("total_count is null");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNotNull() {
            addCriterion("total_count is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCountEqualTo(Integer value) {
            addCriterion("total_count =", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotEqualTo(Integer value) {
            addCriterion("total_count <>", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThan(Integer value) {
            addCriterion("total_count >", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_count >=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThan(Integer value) {
            addCriterion("total_count <", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThanOrEqualTo(Integer value) {
            addCriterion("total_count <=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountIn(List<Integer> values) {
            addCriterion("total_count in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotIn(List<Integer> values) {
            addCriterion("total_count not in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountBetween(Integer value1, Integer value2) {
            addCriterion("total_count between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotBetween(Integer value1, Integer value2) {
            addCriterion("total_count not between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountIsNull() {
            addCriterion("publish_count is null");
            return (Criteria) this;
        }

        public Criteria andPublishCountIsNotNull() {
            addCriterion("publish_count is not null");
            return (Criteria) this;
        }

        public Criteria andPublishCountEqualTo(Integer value) {
            addCriterion("publish_count =", value, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountNotEqualTo(Integer value) {
            addCriterion("publish_count <>", value, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountGreaterThan(Integer value) {
            addCriterion("publish_count >", value, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("publish_count >=", value, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountLessThan(Integer value) {
            addCriterion("publish_count <", value, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountLessThanOrEqualTo(Integer value) {
            addCriterion("publish_count <=", value, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountIn(List<Integer> values) {
            addCriterion("publish_count in", values, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountNotIn(List<Integer> values) {
            addCriterion("publish_count not in", values, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountBetween(Integer value1, Integer value2) {
            addCriterion("publish_count between", value1, value2, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountNotBetween(Integer value1, Integer value2) {
            addCriterion("publish_count not between", value1, value2, "publishCount");
            return (Criteria) this;
        }

        public Criteria andLeftCountIsNull() {
            addCriterion("left_count is null");
            return (Criteria) this;
        }

        public Criteria andLeftCountIsNotNull() {
            addCriterion("left_count is not null");
            return (Criteria) this;
        }

        public Criteria andLeftCountEqualTo(Integer value) {
            addCriterion("left_count =", value, "leftCount");
            return (Criteria) this;
        }

        public Criteria andLeftCountNotEqualTo(Integer value) {
            addCriterion("left_count <>", value, "leftCount");
            return (Criteria) this;
        }

        public Criteria andLeftCountGreaterThan(Integer value) {
            addCriterion("left_count >", value, "leftCount");
            return (Criteria) this;
        }

        public Criteria andLeftCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("left_count >=", value, "leftCount");
            return (Criteria) this;
        }

        public Criteria andLeftCountLessThan(Integer value) {
            addCriterion("left_count <", value, "leftCount");
            return (Criteria) this;
        }

        public Criteria andLeftCountLessThanOrEqualTo(Integer value) {
            addCriterion("left_count <=", value, "leftCount");
            return (Criteria) this;
        }

        public Criteria andLeftCountIn(List<Integer> values) {
            addCriterion("left_count in", values, "leftCount");
            return (Criteria) this;
        }

        public Criteria andLeftCountNotIn(List<Integer> values) {
            addCriterion("left_count not in", values, "leftCount");
            return (Criteria) this;
        }

        public Criteria andLeftCountBetween(Integer value1, Integer value2) {
            addCriterion("left_count between", value1, value2, "leftCount");
            return (Criteria) this;
        }

        public Criteria andLeftCountNotBetween(Integer value1, Integer value2) {
            addCriterion("left_count not between", value1, value2, "leftCount");
            return (Criteria) this;
        }

        public Criteria andPromotionRuleidIsNull() {
            addCriterion("promotion_ruleId is null");
            return (Criteria) this;
        }

        public Criteria andPromotionRuleidIsNotNull() {
            addCriterion("promotion_ruleId is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionRuleidEqualTo(Long value) {
            addCriterion("promotion_ruleId =", value, "promotionRuleid");
            return (Criteria) this;
        }

        public Criteria andPromotionRuleidNotEqualTo(Long value) {
            addCriterion("promotion_ruleId <>", value, "promotionRuleid");
            return (Criteria) this;
        }

        public Criteria andPromotionRuleidGreaterThan(Long value) {
            addCriterion("promotion_ruleId >", value, "promotionRuleid");
            return (Criteria) this;
        }

        public Criteria andPromotionRuleidGreaterThanOrEqualTo(Long value) {
            addCriterion("promotion_ruleId >=", value, "promotionRuleid");
            return (Criteria) this;
        }

        public Criteria andPromotionRuleidLessThan(Long value) {
            addCriterion("promotion_ruleId <", value, "promotionRuleid");
            return (Criteria) this;
        }

        public Criteria andPromotionRuleidLessThanOrEqualTo(Long value) {
            addCriterion("promotion_ruleId <=", value, "promotionRuleid");
            return (Criteria) this;
        }

        public Criteria andPromotionRuleidIn(List<Long> values) {
            addCriterion("promotion_ruleId in", values, "promotionRuleid");
            return (Criteria) this;
        }

        public Criteria andPromotionRuleidNotIn(List<Long> values) {
            addCriterion("promotion_ruleId not in", values, "promotionRuleid");
            return (Criteria) this;
        }

        public Criteria andPromotionRuleidBetween(Long value1, Long value2) {
            addCriterion("promotion_ruleId between", value1, value2, "promotionRuleid");
            return (Criteria) this;
        }

        public Criteria andPromotionRuleidNotBetween(Long value1, Long value2) {
            addCriterion("promotion_ruleId not between", value1, value2, "promotionRuleid");
            return (Criteria) this;
        }

        public Criteria andScopeRuleidIsNull() {
            addCriterion("scope_ruleId is null");
            return (Criteria) this;
        }

        public Criteria andScopeRuleidIsNotNull() {
            addCriterion("scope_ruleId is not null");
            return (Criteria) this;
        }

        public Criteria andScopeRuleidEqualTo(Long value) {
            addCriterion("scope_ruleId =", value, "scopeRuleid");
            return (Criteria) this;
        }

        public Criteria andScopeRuleidNotEqualTo(Long value) {
            addCriterion("scope_ruleId <>", value, "scopeRuleid");
            return (Criteria) this;
        }

        public Criteria andScopeRuleidGreaterThan(Long value) {
            addCriterion("scope_ruleId >", value, "scopeRuleid");
            return (Criteria) this;
        }

        public Criteria andScopeRuleidGreaterThanOrEqualTo(Long value) {
            addCriterion("scope_ruleId >=", value, "scopeRuleid");
            return (Criteria) this;
        }

        public Criteria andScopeRuleidLessThan(Long value) {
            addCriterion("scope_ruleId <", value, "scopeRuleid");
            return (Criteria) this;
        }

        public Criteria andScopeRuleidLessThanOrEqualTo(Long value) {
            addCriterion("scope_ruleId <=", value, "scopeRuleid");
            return (Criteria) this;
        }

        public Criteria andScopeRuleidIn(List<Long> values) {
            addCriterion("scope_ruleId in", values, "scopeRuleid");
            return (Criteria) this;
        }

        public Criteria andScopeRuleidNotIn(List<Long> values) {
            addCriterion("scope_ruleId not in", values, "scopeRuleid");
            return (Criteria) this;
        }

        public Criteria andScopeRuleidBetween(Long value1, Long value2) {
            addCriterion("scope_ruleId between", value1, value2, "scopeRuleid");
            return (Criteria) this;
        }

        public Criteria andScopeRuleidNotBetween(Long value1, Long value2) {
            addCriterion("scope_ruleId not between", value1, value2, "scopeRuleid");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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