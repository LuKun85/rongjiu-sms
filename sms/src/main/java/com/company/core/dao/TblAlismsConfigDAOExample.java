package com.company.core.dao;

import java.util.ArrayList;
import java.util.List;

public class TblAlismsConfigDAOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_ALISMS_CONFIG
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_ALISMS_CONFIG
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_ALISMS_CONFIG
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_ALISMS_CONFIG
     *
     * @mbggenerated
     */
    public TblAlismsConfigDAOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_ALISMS_CONFIG
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_ALISMS_CONFIG
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_ALISMS_CONFIG
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_ALISMS_CONFIG
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_ALISMS_CONFIG
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_ALISMS_CONFIG
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_ALISMS_CONFIG
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_ALISMS_CONFIG
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_ALISMS_CONFIG
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_ALISMS_CONFIG
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TBL_ALISMS_CONFIG
     *
     * @mbggenerated
     */
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

        public Criteria andSmsChannelIdIsNull() {
            addCriterion("SMS_CHANNEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andSmsChannelIdIsNotNull() {
            addCriterion("SMS_CHANNEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSmsChannelIdEqualTo(String value) {
            addCriterion("SMS_CHANNEL_ID =", value, "smsChannelId");
            return (Criteria) this;
        }

        public Criteria andSmsChannelIdNotEqualTo(String value) {
            addCriterion("SMS_CHANNEL_ID <>", value, "smsChannelId");
            return (Criteria) this;
        }

        public Criteria andSmsChannelIdGreaterThan(String value) {
            addCriterion("SMS_CHANNEL_ID >", value, "smsChannelId");
            return (Criteria) this;
        }

        public Criteria andSmsChannelIdGreaterThanOrEqualTo(String value) {
            addCriterion("SMS_CHANNEL_ID >=", value, "smsChannelId");
            return (Criteria) this;
        }

        public Criteria andSmsChannelIdLessThan(String value) {
            addCriterion("SMS_CHANNEL_ID <", value, "smsChannelId");
            return (Criteria) this;
        }

        public Criteria andSmsChannelIdLessThanOrEqualTo(String value) {
            addCriterion("SMS_CHANNEL_ID <=", value, "smsChannelId");
            return (Criteria) this;
        }

        public Criteria andSmsChannelIdLike(String value) {
            addCriterion("SMS_CHANNEL_ID like", value, "smsChannelId");
            return (Criteria) this;
        }

        public Criteria andSmsChannelIdNotLike(String value) {
            addCriterion("SMS_CHANNEL_ID not like", value, "smsChannelId");
            return (Criteria) this;
        }

        public Criteria andSmsChannelIdIn(List<String> values) {
            addCriterion("SMS_CHANNEL_ID in", values, "smsChannelId");
            return (Criteria) this;
        }

        public Criteria andSmsChannelIdNotIn(List<String> values) {
            addCriterion("SMS_CHANNEL_ID not in", values, "smsChannelId");
            return (Criteria) this;
        }

        public Criteria andSmsChannelIdBetween(String value1, String value2) {
            addCriterion("SMS_CHANNEL_ID between", value1, value2, "smsChannelId");
            return (Criteria) this;
        }

        public Criteria andSmsChannelIdNotBetween(String value1, String value2) {
            addCriterion("SMS_CHANNEL_ID not between", value1, value2, "smsChannelId");
            return (Criteria) this;
        }

        public Criteria andSmsChannelNameIsNull() {
            addCriterion("SMS_CHANNEL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSmsChannelNameIsNotNull() {
            addCriterion("SMS_CHANNEL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSmsChannelNameEqualTo(String value) {
            addCriterion("SMS_CHANNEL_NAME =", value, "smsChannelName");
            return (Criteria) this;
        }

        public Criteria andSmsChannelNameNotEqualTo(String value) {
            addCriterion("SMS_CHANNEL_NAME <>", value, "smsChannelName");
            return (Criteria) this;
        }

        public Criteria andSmsChannelNameGreaterThan(String value) {
            addCriterion("SMS_CHANNEL_NAME >", value, "smsChannelName");
            return (Criteria) this;
        }

        public Criteria andSmsChannelNameGreaterThanOrEqualTo(String value) {
            addCriterion("SMS_CHANNEL_NAME >=", value, "smsChannelName");
            return (Criteria) this;
        }

        public Criteria andSmsChannelNameLessThan(String value) {
            addCriterion("SMS_CHANNEL_NAME <", value, "smsChannelName");
            return (Criteria) this;
        }

        public Criteria andSmsChannelNameLessThanOrEqualTo(String value) {
            addCriterion("SMS_CHANNEL_NAME <=", value, "smsChannelName");
            return (Criteria) this;
        }

        public Criteria andSmsChannelNameLike(String value) {
            addCriterion("SMS_CHANNEL_NAME like", value, "smsChannelName");
            return (Criteria) this;
        }

        public Criteria andSmsChannelNameNotLike(String value) {
            addCriterion("SMS_CHANNEL_NAME not like", value, "smsChannelName");
            return (Criteria) this;
        }

        public Criteria andSmsChannelNameIn(List<String> values) {
            addCriterion("SMS_CHANNEL_NAME in", values, "smsChannelName");
            return (Criteria) this;
        }

        public Criteria andSmsChannelNameNotIn(List<String> values) {
            addCriterion("SMS_CHANNEL_NAME not in", values, "smsChannelName");
            return (Criteria) this;
        }

        public Criteria andSmsChannelNameBetween(String value1, String value2) {
            addCriterion("SMS_CHANNEL_NAME between", value1, value2, "smsChannelName");
            return (Criteria) this;
        }

        public Criteria andSmsChannelNameNotBetween(String value1, String value2) {
            addCriterion("SMS_CHANNEL_NAME not between", value1, value2, "smsChannelName");
            return (Criteria) this;
        }

        public Criteria andProductIsNull() {
            addCriterion("PRODUCT is null");
            return (Criteria) this;
        }

        public Criteria andProductIsNotNull() {
            addCriterion("PRODUCT is not null");
            return (Criteria) this;
        }

        public Criteria andProductEqualTo(String value) {
            addCriterion("PRODUCT =", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotEqualTo(String value) {
            addCriterion("PRODUCT <>", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThan(String value) {
            addCriterion("PRODUCT >", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT >=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThan(String value) {
            addCriterion("PRODUCT <", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT <=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLike(String value) {
            addCriterion("PRODUCT like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotLike(String value) {
            addCriterion("PRODUCT not like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductIn(List<String> values) {
            addCriterion("PRODUCT in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotIn(List<String> values) {
            addCriterion("PRODUCT not in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductBetween(String value1, String value2) {
            addCriterion("PRODUCT between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotBetween(String value1, String value2) {
            addCriterion("PRODUCT not between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andDomainIsNull() {
            addCriterion("DOMAIN is null");
            return (Criteria) this;
        }

        public Criteria andDomainIsNotNull() {
            addCriterion("DOMAIN is not null");
            return (Criteria) this;
        }

        public Criteria andDomainEqualTo(String value) {
            addCriterion("DOMAIN =", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotEqualTo(String value) {
            addCriterion("DOMAIN <>", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThan(String value) {
            addCriterion("DOMAIN >", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThanOrEqualTo(String value) {
            addCriterion("DOMAIN >=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThan(String value) {
            addCriterion("DOMAIN <", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThanOrEqualTo(String value) {
            addCriterion("DOMAIN <=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLike(String value) {
            addCriterion("DOMAIN like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotLike(String value) {
            addCriterion("DOMAIN not like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainIn(List<String> values) {
            addCriterion("DOMAIN in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotIn(List<String> values) {
            addCriterion("DOMAIN not in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainBetween(String value1, String value2) {
            addCriterion("DOMAIN between", value1, value2, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotBetween(String value1, String value2) {
            addCriterion("DOMAIN not between", value1, value2, "domain");
            return (Criteria) this;
        }

        public Criteria andAccessKeyIdIsNull() {
            addCriterion("ACCESS_KEY_ID is null");
            return (Criteria) this;
        }

        public Criteria andAccessKeyIdIsNotNull() {
            addCriterion("ACCESS_KEY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAccessKeyIdEqualTo(String value) {
            addCriterion("ACCESS_KEY_ID =", value, "accessKeyId");
            return (Criteria) this;
        }

        public Criteria andAccessKeyIdNotEqualTo(String value) {
            addCriterion("ACCESS_KEY_ID <>", value, "accessKeyId");
            return (Criteria) this;
        }

        public Criteria andAccessKeyIdGreaterThan(String value) {
            addCriterion("ACCESS_KEY_ID >", value, "accessKeyId");
            return (Criteria) this;
        }

        public Criteria andAccessKeyIdGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESS_KEY_ID >=", value, "accessKeyId");
            return (Criteria) this;
        }

        public Criteria andAccessKeyIdLessThan(String value) {
            addCriterion("ACCESS_KEY_ID <", value, "accessKeyId");
            return (Criteria) this;
        }

        public Criteria andAccessKeyIdLessThanOrEqualTo(String value) {
            addCriterion("ACCESS_KEY_ID <=", value, "accessKeyId");
            return (Criteria) this;
        }

        public Criteria andAccessKeyIdLike(String value) {
            addCriterion("ACCESS_KEY_ID like", value, "accessKeyId");
            return (Criteria) this;
        }

        public Criteria andAccessKeyIdNotLike(String value) {
            addCriterion("ACCESS_KEY_ID not like", value, "accessKeyId");
            return (Criteria) this;
        }

        public Criteria andAccessKeyIdIn(List<String> values) {
            addCriterion("ACCESS_KEY_ID in", values, "accessKeyId");
            return (Criteria) this;
        }

        public Criteria andAccessKeyIdNotIn(List<String> values) {
            addCriterion("ACCESS_KEY_ID not in", values, "accessKeyId");
            return (Criteria) this;
        }

        public Criteria andAccessKeyIdBetween(String value1, String value2) {
            addCriterion("ACCESS_KEY_ID between", value1, value2, "accessKeyId");
            return (Criteria) this;
        }

        public Criteria andAccessKeyIdNotBetween(String value1, String value2) {
            addCriterion("ACCESS_KEY_ID not between", value1, value2, "accessKeyId");
            return (Criteria) this;
        }

        public Criteria andAccessKeySecretIsNull() {
            addCriterion("ACCESS_KEY_SECRET is null");
            return (Criteria) this;
        }

        public Criteria andAccessKeySecretIsNotNull() {
            addCriterion("ACCESS_KEY_SECRET is not null");
            return (Criteria) this;
        }

        public Criteria andAccessKeySecretEqualTo(String value) {
            addCriterion("ACCESS_KEY_SECRET =", value, "accessKeySecret");
            return (Criteria) this;
        }

        public Criteria andAccessKeySecretNotEqualTo(String value) {
            addCriterion("ACCESS_KEY_SECRET <>", value, "accessKeySecret");
            return (Criteria) this;
        }

        public Criteria andAccessKeySecretGreaterThan(String value) {
            addCriterion("ACCESS_KEY_SECRET >", value, "accessKeySecret");
            return (Criteria) this;
        }

        public Criteria andAccessKeySecretGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESS_KEY_SECRET >=", value, "accessKeySecret");
            return (Criteria) this;
        }

        public Criteria andAccessKeySecretLessThan(String value) {
            addCriterion("ACCESS_KEY_SECRET <", value, "accessKeySecret");
            return (Criteria) this;
        }

        public Criteria andAccessKeySecretLessThanOrEqualTo(String value) {
            addCriterion("ACCESS_KEY_SECRET <=", value, "accessKeySecret");
            return (Criteria) this;
        }

        public Criteria andAccessKeySecretLike(String value) {
            addCriterion("ACCESS_KEY_SECRET like", value, "accessKeySecret");
            return (Criteria) this;
        }

        public Criteria andAccessKeySecretNotLike(String value) {
            addCriterion("ACCESS_KEY_SECRET not like", value, "accessKeySecret");
            return (Criteria) this;
        }

        public Criteria andAccessKeySecretIn(List<String> values) {
            addCriterion("ACCESS_KEY_SECRET in", values, "accessKeySecret");
            return (Criteria) this;
        }

        public Criteria andAccessKeySecretNotIn(List<String> values) {
            addCriterion("ACCESS_KEY_SECRET not in", values, "accessKeySecret");
            return (Criteria) this;
        }

        public Criteria andAccessKeySecretBetween(String value1, String value2) {
            addCriterion("ACCESS_KEY_SECRET between", value1, value2, "accessKeySecret");
            return (Criteria) this;
        }

        public Criteria andAccessKeySecretNotBetween(String value1, String value2) {
            addCriterion("ACCESS_KEY_SECRET not between", value1, value2, "accessKeySecret");
            return (Criteria) this;
        }

        public Criteria andConnectTimeoutIsNull() {
            addCriterion("CONNECT_TIMEOUT is null");
            return (Criteria) this;
        }

        public Criteria andConnectTimeoutIsNotNull() {
            addCriterion("CONNECT_TIMEOUT is not null");
            return (Criteria) this;
        }

        public Criteria andConnectTimeoutEqualTo(Integer value) {
            addCriterion("CONNECT_TIMEOUT =", value, "connectTimeout");
            return (Criteria) this;
        }

        public Criteria andConnectTimeoutNotEqualTo(Integer value) {
            addCriterion("CONNECT_TIMEOUT <>", value, "connectTimeout");
            return (Criteria) this;
        }

        public Criteria andConnectTimeoutGreaterThan(Integer value) {
            addCriterion("CONNECT_TIMEOUT >", value, "connectTimeout");
            return (Criteria) this;
        }

        public Criteria andConnectTimeoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONNECT_TIMEOUT >=", value, "connectTimeout");
            return (Criteria) this;
        }

        public Criteria andConnectTimeoutLessThan(Integer value) {
            addCriterion("CONNECT_TIMEOUT <", value, "connectTimeout");
            return (Criteria) this;
        }

        public Criteria andConnectTimeoutLessThanOrEqualTo(Integer value) {
            addCriterion("CONNECT_TIMEOUT <=", value, "connectTimeout");
            return (Criteria) this;
        }

        public Criteria andConnectTimeoutIn(List<Integer> values) {
            addCriterion("CONNECT_TIMEOUT in", values, "connectTimeout");
            return (Criteria) this;
        }

        public Criteria andConnectTimeoutNotIn(List<Integer> values) {
            addCriterion("CONNECT_TIMEOUT not in", values, "connectTimeout");
            return (Criteria) this;
        }

        public Criteria andConnectTimeoutBetween(Integer value1, Integer value2) {
            addCriterion("CONNECT_TIMEOUT between", value1, value2, "connectTimeout");
            return (Criteria) this;
        }

        public Criteria andConnectTimeoutNotBetween(Integer value1, Integer value2) {
            addCriterion("CONNECT_TIMEOUT not between", value1, value2, "connectTimeout");
            return (Criteria) this;
        }

        public Criteria andReadTimeoutIsNull() {
            addCriterion("READ_TIMEOUT is null");
            return (Criteria) this;
        }

        public Criteria andReadTimeoutIsNotNull() {
            addCriterion("READ_TIMEOUT is not null");
            return (Criteria) this;
        }

        public Criteria andReadTimeoutEqualTo(Integer value) {
            addCriterion("READ_TIMEOUT =", value, "readTimeout");
            return (Criteria) this;
        }

        public Criteria andReadTimeoutNotEqualTo(Integer value) {
            addCriterion("READ_TIMEOUT <>", value, "readTimeout");
            return (Criteria) this;
        }

        public Criteria andReadTimeoutGreaterThan(Integer value) {
            addCriterion("READ_TIMEOUT >", value, "readTimeout");
            return (Criteria) this;
        }

        public Criteria andReadTimeoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("READ_TIMEOUT >=", value, "readTimeout");
            return (Criteria) this;
        }

        public Criteria andReadTimeoutLessThan(Integer value) {
            addCriterion("READ_TIMEOUT <", value, "readTimeout");
            return (Criteria) this;
        }

        public Criteria andReadTimeoutLessThanOrEqualTo(Integer value) {
            addCriterion("READ_TIMEOUT <=", value, "readTimeout");
            return (Criteria) this;
        }

        public Criteria andReadTimeoutIn(List<Integer> values) {
            addCriterion("READ_TIMEOUT in", values, "readTimeout");
            return (Criteria) this;
        }

        public Criteria andReadTimeoutNotIn(List<Integer> values) {
            addCriterion("READ_TIMEOUT not in", values, "readTimeout");
            return (Criteria) this;
        }

        public Criteria andReadTimeoutBetween(Integer value1, Integer value2) {
            addCriterion("READ_TIMEOUT between", value1, value2, "readTimeout");
            return (Criteria) this;
        }

        public Criteria andReadTimeoutNotBetween(Integer value1, Integer value2) {
            addCriterion("READ_TIMEOUT not between", value1, value2, "readTimeout");
            return (Criteria) this;
        }

        public Criteria andSignNameIsNull() {
            addCriterion("SIGN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSignNameIsNotNull() {
            addCriterion("SIGN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSignNameEqualTo(String value) {
            addCriterion("SIGN_NAME =", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameNotEqualTo(String value) {
            addCriterion("SIGN_NAME <>", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameGreaterThan(String value) {
            addCriterion("SIGN_NAME >", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_NAME >=", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameLessThan(String value) {
            addCriterion("SIGN_NAME <", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameLessThanOrEqualTo(String value) {
            addCriterion("SIGN_NAME <=", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameLike(String value) {
            addCriterion("SIGN_NAME like", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameNotLike(String value) {
            addCriterion("SIGN_NAME not like", value, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameIn(List<String> values) {
            addCriterion("SIGN_NAME in", values, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameNotIn(List<String> values) {
            addCriterion("SIGN_NAME not in", values, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameBetween(String value1, String value2) {
            addCriterion("SIGN_NAME between", value1, value2, "signName");
            return (Criteria) this;
        }

        public Criteria andSignNameNotBetween(String value1, String value2) {
            addCriterion("SIGN_NAME not between", value1, value2, "signName");
            return (Criteria) this;
        }

        public Criteria andTemplicateCodeIsNull() {
            addCriterion("TEMPLICATE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTemplicateCodeIsNotNull() {
            addCriterion("TEMPLICATE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTemplicateCodeEqualTo(String value) {
            addCriterion("TEMPLICATE_CODE =", value, "templicateCode");
            return (Criteria) this;
        }

        public Criteria andTemplicateCodeNotEqualTo(String value) {
            addCriterion("TEMPLICATE_CODE <>", value, "templicateCode");
            return (Criteria) this;
        }

        public Criteria andTemplicateCodeGreaterThan(String value) {
            addCriterion("TEMPLICATE_CODE >", value, "templicateCode");
            return (Criteria) this;
        }

        public Criteria andTemplicateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLICATE_CODE >=", value, "templicateCode");
            return (Criteria) this;
        }

        public Criteria andTemplicateCodeLessThan(String value) {
            addCriterion("TEMPLICATE_CODE <", value, "templicateCode");
            return (Criteria) this;
        }

        public Criteria andTemplicateCodeLessThanOrEqualTo(String value) {
            addCriterion("TEMPLICATE_CODE <=", value, "templicateCode");
            return (Criteria) this;
        }

        public Criteria andTemplicateCodeLike(String value) {
            addCriterion("TEMPLICATE_CODE like", value, "templicateCode");
            return (Criteria) this;
        }

        public Criteria andTemplicateCodeNotLike(String value) {
            addCriterion("TEMPLICATE_CODE not like", value, "templicateCode");
            return (Criteria) this;
        }

        public Criteria andTemplicateCodeIn(List<String> values) {
            addCriterion("TEMPLICATE_CODE in", values, "templicateCode");
            return (Criteria) this;
        }

        public Criteria andTemplicateCodeNotIn(List<String> values) {
            addCriterion("TEMPLICATE_CODE not in", values, "templicateCode");
            return (Criteria) this;
        }

        public Criteria andTemplicateCodeBetween(String value1, String value2) {
            addCriterion("TEMPLICATE_CODE between", value1, value2, "templicateCode");
            return (Criteria) this;
        }

        public Criteria andTemplicateCodeNotBetween(String value1, String value2) {
            addCriterion("TEMPLICATE_CODE not between", value1, value2, "templicateCode");
            return (Criteria) this;
        }

        public Criteria andTemplicateParamIsNull() {
            addCriterion("TEMPLICATE_PARAM is null");
            return (Criteria) this;
        }

        public Criteria andTemplicateParamIsNotNull() {
            addCriterion("TEMPLICATE_PARAM is not null");
            return (Criteria) this;
        }

        public Criteria andTemplicateParamEqualTo(String value) {
            addCriterion("TEMPLICATE_PARAM =", value, "templicateParam");
            return (Criteria) this;
        }

        public Criteria andTemplicateParamNotEqualTo(String value) {
            addCriterion("TEMPLICATE_PARAM <>", value, "templicateParam");
            return (Criteria) this;
        }

        public Criteria andTemplicateParamGreaterThan(String value) {
            addCriterion("TEMPLICATE_PARAM >", value, "templicateParam");
            return (Criteria) this;
        }

        public Criteria andTemplicateParamGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLICATE_PARAM >=", value, "templicateParam");
            return (Criteria) this;
        }

        public Criteria andTemplicateParamLessThan(String value) {
            addCriterion("TEMPLICATE_PARAM <", value, "templicateParam");
            return (Criteria) this;
        }

        public Criteria andTemplicateParamLessThanOrEqualTo(String value) {
            addCriterion("TEMPLICATE_PARAM <=", value, "templicateParam");
            return (Criteria) this;
        }

        public Criteria andTemplicateParamLike(String value) {
            addCriterion("TEMPLICATE_PARAM like", value, "templicateParam");
            return (Criteria) this;
        }

        public Criteria andTemplicateParamNotLike(String value) {
            addCriterion("TEMPLICATE_PARAM not like", value, "templicateParam");
            return (Criteria) this;
        }

        public Criteria andTemplicateParamIn(List<String> values) {
            addCriterion("TEMPLICATE_PARAM in", values, "templicateParam");
            return (Criteria) this;
        }

        public Criteria andTemplicateParamNotIn(List<String> values) {
            addCriterion("TEMPLICATE_PARAM not in", values, "templicateParam");
            return (Criteria) this;
        }

        public Criteria andTemplicateParamBetween(String value1, String value2) {
            addCriterion("TEMPLICATE_PARAM between", value1, value2, "templicateParam");
            return (Criteria) this;
        }

        public Criteria andTemplicateParamNotBetween(String value1, String value2) {
            addCriterion("TEMPLICATE_PARAM not between", value1, value2, "templicateParam");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TBL_ALISMS_CONFIG
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TBL_ALISMS_CONFIG
     *
     * @mbggenerated
     */
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