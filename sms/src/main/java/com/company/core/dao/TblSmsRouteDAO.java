package com.company.core.dao;

public class TblSmsRouteDAO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_SMS_ROUTE.SMS_CODE
     *
     * @mbggenerated
     */
    private String smsCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_SMS_ROUTE.SMS_CHANNEL_CAT
     *
     * @mbggenerated
     */
    private String smsChannelCat;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_SMS_ROUTE.SMS_CHANNEL_ID
     *
     * @mbggenerated
     */
    private String smsChannelId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_SMS_ROUTE.STATUS
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_SMS_ROUTE.SMS_CODE
     *
     * @return the value of TBL_SMS_ROUTE.SMS_CODE
     *
     * @mbggenerated
     */
    public String getSmsCode() {
        return smsCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_SMS_ROUTE.SMS_CODE
     *
     * @param smsCode the value for TBL_SMS_ROUTE.SMS_CODE
     *
     * @mbggenerated
     */
    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode == null ? null : smsCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_SMS_ROUTE.SMS_CHANNEL_CAT
     *
     * @return the value of TBL_SMS_ROUTE.SMS_CHANNEL_CAT
     *
     * @mbggenerated
     */
    public String getSmsChannelCat() {
        return smsChannelCat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_SMS_ROUTE.SMS_CHANNEL_CAT
     *
     * @param smsChannelCat the value for TBL_SMS_ROUTE.SMS_CHANNEL_CAT
     *
     * @mbggenerated
     */
    public void setSmsChannelCat(String smsChannelCat) {
        this.smsChannelCat = smsChannelCat == null ? null : smsChannelCat.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_SMS_ROUTE.SMS_CHANNEL_ID
     *
     * @return the value of TBL_SMS_ROUTE.SMS_CHANNEL_ID
     *
     * @mbggenerated
     */
    public String getSmsChannelId() {
        return smsChannelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_SMS_ROUTE.SMS_CHANNEL_ID
     *
     * @param smsChannelId the value for TBL_SMS_ROUTE.SMS_CHANNEL_ID
     *
     * @mbggenerated
     */
    public void setSmsChannelId(String smsChannelId) {
        this.smsChannelId = smsChannelId == null ? null : smsChannelId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_SMS_ROUTE.STATUS
     *
     * @return the value of TBL_SMS_ROUTE.STATUS
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_SMS_ROUTE.STATUS
     *
     * @param status the value for TBL_SMS_ROUTE.STATUS
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}