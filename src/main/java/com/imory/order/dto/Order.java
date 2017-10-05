package com.imory.order.dto;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.order_id
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    private Integer order_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.order_no
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    private String order_no;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.shop_id
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    private Integer shop_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.order_status
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    private Integer order_status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.product_count
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    private Integer product_count;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.product_amount_total
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    private BigDecimal product_amount_total;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.order_amount_total
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    private BigDecimal order_amount_total;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.logistics_fee
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    private BigDecimal logistics_fee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.order_coupon_total
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    private BigDecimal order_coupon_total;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.is_unpacking_inspection
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    private Integer is_unpacking_inspection;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.isinvoiceFlag
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    private Integer isinvoiceFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.invoice_id
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    private Integer invoice_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.address_id
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    private Integer address_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.orderlogistics_id
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    private Integer orderlogistics_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.pay_channel
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    private String pay_channel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.out_trade_no
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    private String out_trade_no;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.escrow_trade_no
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    private String escrow_trade_no;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.orderTime
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    private Date orderTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.payTime
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    private Date payTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.logisticsTime
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    private Date logisticsTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.user_id
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    private Integer user_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.user_remark
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    private String user_remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.order_settlement_status
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    private Integer order_settlement_status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.order_settlement_time
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    private Date order_settlement_time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.createTime
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.order_id
     *
     * @return the value of order.order_id
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public Integer getOrder_id() {
        return order_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.order_id
     *
     * @param order_id the value for order.order_id
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.order_no
     *
     * @return the value of order.order_no
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public String getOrder_no() {
        return order_no;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.order_no
     *
     * @param order_no the value for order.order_no
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public void setOrder_no(String order_no) {
        this.order_no = order_no == null ? null : order_no.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.shop_id
     *
     * @return the value of order.shop_id
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public Integer getShop_id() {
        return shop_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.shop_id
     *
     * @param shop_id the value for order.shop_id
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public void setShop_id(Integer shop_id) {
        this.shop_id = shop_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.order_status
     *
     * @return the value of order.order_status
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public Integer getOrder_status() {
        return order_status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.order_status
     *
     * @param order_status the value for order.order_status
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public void setOrder_status(Integer order_status) {
        this.order_status = order_status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.product_count
     *
     * @return the value of order.product_count
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public Integer getProduct_count() {
        return product_count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.product_count
     *
     * @param product_count the value for order.product_count
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public void setProduct_count(Integer product_count) {
        this.product_count = product_count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.product_amount_total
     *
     * @return the value of order.product_amount_total
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public BigDecimal getProduct_amount_total() {
        return product_amount_total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.product_amount_total
     *
     * @param product_amount_total the value for order.product_amount_total
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public void setProduct_amount_total(BigDecimal product_amount_total) {
        this.product_amount_total = product_amount_total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.order_amount_total
     *
     * @return the value of order.order_amount_total
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public BigDecimal getOrder_amount_total() {
        return order_amount_total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.order_amount_total
     *
     * @param order_amount_total the value for order.order_amount_total
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public void setOrder_amount_total(BigDecimal order_amount_total) {
        this.order_amount_total = order_amount_total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.logistics_fee
     *
     * @return the value of order.logistics_fee
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public BigDecimal getLogistics_fee() {
        return logistics_fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.logistics_fee
     *
     * @param logistics_fee the value for order.logistics_fee
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public void setLogistics_fee(BigDecimal logistics_fee) {
        this.logistics_fee = logistics_fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.order_coupon_total
     *
     * @return the value of order.order_coupon_total
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public BigDecimal getOrder_coupon_total() {
        return order_coupon_total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.order_coupon_total
     *
     * @param order_coupon_total the value for order.order_coupon_total
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public void setOrder_coupon_total(BigDecimal order_coupon_total) {
        this.order_coupon_total = order_coupon_total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.is_unpacking_inspection
     *
     * @return the value of order.is_unpacking_inspection
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public Integer getIs_unpacking_inspection() {
        return is_unpacking_inspection;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.is_unpacking_inspection
     *
     * @param is_unpacking_inspection the value for order.is_unpacking_inspection
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public void setIs_unpacking_inspection(Integer is_unpacking_inspection) {
        this.is_unpacking_inspection = is_unpacking_inspection;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.isinvoiceFlag
     *
     * @return the value of order.isinvoiceFlag
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public Integer getIsinvoiceFlag() {
        return isinvoiceFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.isinvoiceFlag
     *
     * @param isinvoiceFlag the value for order.isinvoiceFlag
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public void setIsinvoiceFlag(Integer isinvoiceFlag) {
        this.isinvoiceFlag = isinvoiceFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.invoice_id
     *
     * @return the value of order.invoice_id
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public Integer getInvoice_id() {
        return invoice_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.invoice_id
     *
     * @param invoice_id the value for order.invoice_id
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public void setInvoice_id(Integer invoice_id) {
        this.invoice_id = invoice_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.address_id
     *
     * @return the value of order.address_id
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public Integer getAddress_id() {
        return address_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.address_id
     *
     * @param address_id the value for order.address_id
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public void setAddress_id(Integer address_id) {
        this.address_id = address_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.orderlogistics_id
     *
     * @return the value of order.orderlogistics_id
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public Integer getOrderlogistics_id() {
        return orderlogistics_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.orderlogistics_id
     *
     * @param orderlogistics_id the value for order.orderlogistics_id
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public void setOrderlogistics_id(Integer orderlogistics_id) {
        this.orderlogistics_id = orderlogistics_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.pay_channel
     *
     * @return the value of order.pay_channel
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public String getPay_channel() {
        return pay_channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.pay_channel
     *
     * @param pay_channel the value for order.pay_channel
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public void setPay_channel(String pay_channel) {
        this.pay_channel = pay_channel == null ? null : pay_channel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.out_trade_no
     *
     * @return the value of order.out_trade_no
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public String getOut_trade_no() {
        return out_trade_no;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.out_trade_no
     *
     * @param out_trade_no the value for order.out_trade_no
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no == null ? null : out_trade_no.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.escrow_trade_no
     *
     * @return the value of order.escrow_trade_no
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public String getEscrow_trade_no() {
        return escrow_trade_no;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.escrow_trade_no
     *
     * @param escrow_trade_no the value for order.escrow_trade_no
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public void setEscrow_trade_no(String escrow_trade_no) {
        this.escrow_trade_no = escrow_trade_no == null ? null : escrow_trade_no.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.orderTime
     *
     * @return the value of order.orderTime
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.orderTime
     *
     * @param orderTime the value for order.orderTime
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.payTime
     *
     * @return the value of order.payTime
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.payTime
     *
     * @param payTime the value for order.payTime
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.logisticsTime
     *
     * @return the value of order.logisticsTime
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public Date getLogisticsTime() {
        return logisticsTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.logisticsTime
     *
     * @param logisticsTime the value for order.logisticsTime
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public void setLogisticsTime(Date logisticsTime) {
        this.logisticsTime = logisticsTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.user_id
     *
     * @return the value of order.user_id
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.user_id
     *
     * @param user_id the value for order.user_id
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.user_remark
     *
     * @return the value of order.user_remark
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public String getUser_remark() {
        return user_remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.user_remark
     *
     * @param user_remark the value for order.user_remark
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public void setUser_remark(String user_remark) {
        this.user_remark = user_remark == null ? null : user_remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.order_settlement_status
     *
     * @return the value of order.order_settlement_status
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public Integer getOrder_settlement_status() {
        return order_settlement_status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.order_settlement_status
     *
     * @param order_settlement_status the value for order.order_settlement_status
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public void setOrder_settlement_status(Integer order_settlement_status) {
        this.order_settlement_status = order_settlement_status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.order_settlement_time
     *
     * @return the value of order.order_settlement_time
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public Date getOrder_settlement_time() {
        return order_settlement_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.order_settlement_time
     *
     * @param order_settlement_time the value for order.order_settlement_time
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public void setOrder_settlement_time(Date order_settlement_time) {
        this.order_settlement_time = order_settlement_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.createTime
     *
     * @return the value of order.createTime
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.createTime
     *
     * @param createTime the value for order.createTime
     *
     * @mbggenerated Thu Oct 05 16:27:57 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}