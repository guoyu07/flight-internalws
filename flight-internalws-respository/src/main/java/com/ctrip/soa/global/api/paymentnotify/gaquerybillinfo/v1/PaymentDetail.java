/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.paymentnotify.gaquerybillinfo.v1;

import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Bill单 项目
 */
@DtoDoc("Bill单 项目")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetail", propOrder = {
    "billItemNo",
    "billNo",
    "amount",
    "cardInfoID",
    "cardRiskLevel",
    "prepayType",
    "cCardPayFee",
    "exchangeRate",
    "subPaySystem",
    "catalogCode",
    "paymentWayName",
    "paymentWayID",
    "cCardPayFeeRate",
    "creditCardType",
    "merchantData",
    "needRealTimeApply",
    "orderID",
    "subGatheringType",
    "dealStatus",
    "dealStatusName",
    "transDealStatus",
    "transDealStatusName",
    "transDealTime",
    "transNo",
    "transRequestType"
})
@SuppressWarnings("all")
public class PaymentDetail  {

    private static final long serialVersionUID = 1L;

    public PaymentDetail(
        long billItemNo, 
        long billNo, 
        BigDecimal amount, 
        int cardInfoID, 
        String cardRiskLevel, 
        String prepayType, 
        BigDecimal cCardPayFee, 
        BigDecimal exchangeRate, 
        int subPaySystem, 
        String catalogCode, 
        String paymentWayName, 
        String paymentWayID, 
        BigDecimal cCardPayFeeRate, 
        int creditCardType, 
        String merchantData, 
        String needRealTimeApply, 
        long orderID, 
        String subGatheringType, 
        int dealStatus, 
        String dealStatusName, 
        int transDealStatus, 
        String transDealStatusName, 
        String transDealTime, 
        long transNo, 
        String transRequestType) {
        this.billItemNo = billItemNo;
        this.billNo = billNo;
        this.amount = amount;
        this.cardInfoID = cardInfoID;
        this.cardRiskLevel = cardRiskLevel;
        this.prepayType = prepayType;
        this.cCardPayFee = cCardPayFee;
        this.exchangeRate = exchangeRate;
        this.subPaySystem = subPaySystem;
        this.catalogCode = catalogCode;
        this.paymentWayName = paymentWayName;
        this.paymentWayID = paymentWayID;
        this.cCardPayFeeRate = cCardPayFeeRate;
        this.creditCardType = creditCardType;
        this.merchantData = merchantData;
        this.needRealTimeApply = needRealTimeApply;
        this.orderID = orderID;
        this.subGatheringType = subGatheringType;
        this.dealStatus = dealStatus;
        this.dealStatusName = dealStatusName;
        this.transDealStatus = transDealStatus;
        this.transDealStatusName = transDealStatusName;
        this.transDealTime = transDealTime;
        this.transNo = transNo;
        this.transRequestType = transRequestType;
    }

    public PaymentDetail() {
    }

    @FieldDoc("BillItem号(Y)")
    @JsonProperty("BillItemNo")
    @XmlElement(name = "BillItemNo")
    private long billItemNo;

    @FieldDoc("BillNo号")
    @JsonProperty("BillNo")
    @XmlElement(name = "BillNo")
    private long billNo;

    @FieldDoc("支付方式")
    @JsonProperty("Amount")
    @XmlElement(name = "Amount")
    private BigDecimal amount;

    @FieldDoc("信用卡信息ID")
    @JsonProperty("CardInfoID")
    @XmlElement(name = "CardInfoID")
    private int cardInfoID;

    @FieldDoc("卡风险等级")
    @JsonProperty("CardRiskLevel")
    @XmlElement(name = "CardRiskLevel")
    private String cardRiskLevel;

    @FieldDoc("支付方式")
    @JsonProperty("PrepayType")
    @XmlElement(name = "PrepayType")
    private String prepayType;

    @FieldDoc("外卡手续费")
    @JsonProperty("CCardPayFee")
    @XmlElement(name = "CCardPayFee")
    private BigDecimal cCardPayFee;

    @FieldDoc("汇率")
    @JsonProperty("ExchangeRate")
    @XmlElement(name = "ExchangeRate")
    private BigDecimal exchangeRate;

    @FieldDoc("支付子子系统")
    @JsonProperty("SubPaySystem")
    @XmlElement(name = "SubPaySystem")
    private int subPaySystem;

    @FieldDoc("支付大类")
    @JsonProperty("CatalogCode")
    @XmlElement(name = "CatalogCode")
    private String catalogCode;

    @FieldDoc("支付方式的名字")
    @JsonProperty("PaymentWayName")
    @XmlElement(name = "PaymentWayName")
    private String paymentWayName;

    @FieldDoc("支付小类")
    @JsonProperty("PaymentWayID")
    @XmlElement(name = "PaymentWayID")
    private String paymentWayID;

    @FieldDoc("手续费 费率")
    @JsonProperty("CCardPayFeeRate")
    @XmlElement(name = "CCardPayFeeRate")
    private BigDecimal cCardPayFeeRate;

    @FieldDoc("卡种")
    @JsonProperty("CreditCardType")
    @XmlElement(name = "CreditCardType")
    private int creditCardType;

    @FieldDoc("商户私有数据")
    @JsonProperty("MerchantData")
    @XmlElement(name = "MerchantData")
    private String merchantData;

    @FieldDoc("NeedRealTimeApply")
    @JsonProperty("NeedRealTimeApply")
    @XmlElement(name = "NeedRealTimeApply")
    private String needRealTimeApply;

    @FieldDoc("OrderID")
    @JsonProperty("OrderID")
    @XmlElement(name = "OrderID")
    private long orderID;

    @FieldDoc("D 扣款 R 退款")
    @JsonProperty("SubGatheringType")
    @XmlElement(name = "SubGatheringType")
    private String subGatheringType;

    @FieldDoc("状态")
    @JsonProperty("DealStatus")
    @XmlElement(name = "DealStatus")
    private int dealStatus;

    @FieldDoc("状态中文表示")
    @JsonProperty("DealStatusName")
    @XmlElement(name = "DealStatusName")
    private String dealStatusName;

    @FieldDoc("交易状态")
    @JsonProperty("TransDealStatus")
    @XmlElement(name = "TransDealStatus")
    private int transDealStatus;

    @FieldDoc("交易状态中文表示")
    @JsonProperty("TransDealStatusName")
    @XmlElement(name = "TransDealStatusName")
    private String transDealStatusName;

    @FieldDoc("交易状态中文表示")
    @JsonProperty("TransDealTime")
    @XmlElement(name = "TransDealTime")
    private String transDealTime;

    @FieldDoc("交易号")
    @JsonProperty("TransNo")
    @XmlElement(name = "TransNo")
    private long transNo;

    @FieldDoc("交易类型")
    @JsonProperty("TransRequestType")
    @XmlElement(name = "TransRequestType")
    private String transRequestType;

    /**
     * BillItem号(Y)
     */
    public long getBillItemNo() {
        return this.billItemNo;
    }

    public void setBillItemNo(long billItemNo) {
        this.billItemNo = billItemNo;
    }

    /**
     * BillNo号
     */
    public long getBillNo() {
        return this.billNo;
    }

    public void setBillNo(long billNo) {
        this.billNo = billNo;
    }

    /**
     * 支付方式
     */
    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 信用卡信息ID
     */
    public int getCardInfoID() {
        return this.cardInfoID;
    }

    public void setCardInfoID(int cardInfoID) {
        this.cardInfoID = cardInfoID;
    }

    /**
     * 卡风险等级
     */
    public String getCardRiskLevel() {
        return this.cardRiskLevel;
    }

    public void setCardRiskLevel(String cardRiskLevel) {
        this.cardRiskLevel = cardRiskLevel;
    }

    /**
     * 支付方式
     */
    public String getPrepayType() {
        return this.prepayType;
    }

    public void setPrepayType(String prepayType) {
        this.prepayType = prepayType;
    }

    /**
     * 外卡手续费
     */
    public BigDecimal getCCardPayFee() {
        return this.cCardPayFee;
    }

    public void setCCardPayFee(BigDecimal cCardPayFee) {
        this.cCardPayFee = cCardPayFee;
    }

    /**
     * 汇率
     */
    public BigDecimal getExchangeRate() {
        return this.exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    /**
     * 支付子子系统
     */
    public int getSubPaySystem() {
        return this.subPaySystem;
    }

    public void setSubPaySystem(int subPaySystem) {
        this.subPaySystem = subPaySystem;
    }

    /**
     * 支付大类
     */
    public String getCatalogCode() {
        return this.catalogCode;
    }

    public void setCatalogCode(String catalogCode) {
        this.catalogCode = catalogCode;
    }

    /**
     * 支付方式的名字
     */
    public String getPaymentWayName() {
        return this.paymentWayName;
    }

    public void setPaymentWayName(String paymentWayName) {
        this.paymentWayName = paymentWayName;
    }

    /**
     * 支付小类
     */
    public String getPaymentWayID() {
        return this.paymentWayID;
    }

    public void setPaymentWayID(String paymentWayID) {
        this.paymentWayID = paymentWayID;
    }

    /**
     * 手续费 费率
     */
    public BigDecimal getCCardPayFeeRate() {
        return this.cCardPayFeeRate;
    }

    public void setCCardPayFeeRate(BigDecimal cCardPayFeeRate) {
        this.cCardPayFeeRate = cCardPayFeeRate;
    }

    /**
     * 卡种
     */
    public int getCreditCardType() {
        return this.creditCardType;
    }

    public void setCreditCardType(int creditCardType) {
        this.creditCardType = creditCardType;
    }

    /**
     * 商户私有数据
     */
    public String getMerchantData() {
        return this.merchantData;
    }

    public void setMerchantData(String merchantData) {
        this.merchantData = merchantData;
    }

    /**
     * NeedRealTimeApply
     */
    public String getNeedRealTimeApply() {
        return this.needRealTimeApply;
    }

    public void setNeedRealTimeApply(String needRealTimeApply) {
        this.needRealTimeApply = needRealTimeApply;
    }

    /**
     * OrderID
     */
    public long getOrderID() {
        return this.orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    /**
     * D 扣款 R 退款
     */
    public String getSubGatheringType() {
        return this.subGatheringType;
    }

    public void setSubGatheringType(String subGatheringType) {
        this.subGatheringType = subGatheringType;
    }

    /**
     * 状态
     */
    public int getDealStatus() {
        return this.dealStatus;
    }

    public void setDealStatus(int dealStatus) {
        this.dealStatus = dealStatus;
    }

    /**
     * 状态中文表示
     */
    public String getDealStatusName() {
        return this.dealStatusName;
    }

    public void setDealStatusName(String dealStatusName) {
        this.dealStatusName = dealStatusName;
    }

    /**
     * 交易状态
     */
    public int getTransDealStatus() {
        return this.transDealStatus;
    }

    public void setTransDealStatus(int transDealStatus) {
        this.transDealStatus = transDealStatus;
    }

    /**
     * 交易状态中文表示
     */
    public String getTransDealStatusName() {
        return this.transDealStatusName;
    }

    public void setTransDealStatusName(String transDealStatusName) {
        this.transDealStatusName = transDealStatusName;
    }

    /**
     * 交易状态中文表示
     */
    public String getTransDealTime() {
        return this.transDealTime;
    }

    public void setTransDealTime(String transDealTime) {
        this.transDealTime = transDealTime;
    }

    /**
     * 交易号
     */
    public long getTransNo() {
        return this.transNo;
    }

    public void setTransNo(long transNo) {
        this.transNo = transNo;
    }

    /**
     * 交易类型
     */
    public String getTransRequestType() {
        return this.transRequestType;
    }

    public void setTransRequestType(String transRequestType) {
        this.transRequestType = transRequestType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final PaymentDetail other = (PaymentDetail)obj;
        return
            Objects.equal(this.billItemNo, other.billItemNo) && 
            Objects.equal(this.billNo, other.billNo) && 
            Objects.equal(this.amount, other.amount) && 
            Objects.equal(this.cardInfoID, other.cardInfoID) && 
            Objects.equal(this.cardRiskLevel, other.cardRiskLevel) && 
            Objects.equal(this.prepayType, other.prepayType) && 
            Objects.equal(this.cCardPayFee, other.cCardPayFee) && 
            Objects.equal(this.exchangeRate, other.exchangeRate) && 
            Objects.equal(this.subPaySystem, other.subPaySystem) && 
            Objects.equal(this.catalogCode, other.catalogCode) && 
            Objects.equal(this.paymentWayName, other.paymentWayName) && 
            Objects.equal(this.paymentWayID, other.paymentWayID) && 
            Objects.equal(this.cCardPayFeeRate, other.cCardPayFeeRate) && 
            Objects.equal(this.creditCardType, other.creditCardType) && 
            Objects.equal(this.merchantData, other.merchantData) && 
            Objects.equal(this.needRealTimeApply, other.needRealTimeApply) && 
            Objects.equal(this.orderID, other.orderID) && 
            Objects.equal(this.subGatheringType, other.subGatheringType) && 
            Objects.equal(this.dealStatus, other.dealStatus) && 
            Objects.equal(this.dealStatusName, other.dealStatusName) && 
            Objects.equal(this.transDealStatus, other.transDealStatus) && 
            Objects.equal(this.transDealStatusName, other.transDealStatusName) && 
            Objects.equal(this.transDealTime, other.transDealTime) && 
            Objects.equal(this.transNo, other.transNo) && 
            Objects.equal(this.transRequestType, other.transRequestType);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.billItemNo);
        result = 31 * result + Objects.hashCode(this.billNo);
        result = 31 * result + Objects.hashCode(this.amount);
        result = 31 * result + Objects.hashCode(this.cardInfoID);
        result = 31 * result + Objects.hashCode(this.cardRiskLevel);
        result = 31 * result + Objects.hashCode(this.prepayType);
        result = 31 * result + Objects.hashCode(this.cCardPayFee);
        result = 31 * result + Objects.hashCode(this.exchangeRate);
        result = 31 * result + Objects.hashCode(this.subPaySystem);
        result = 31 * result + Objects.hashCode(this.catalogCode);
        result = 31 * result + Objects.hashCode(this.paymentWayName);
        result = 31 * result + Objects.hashCode(this.paymentWayID);
        result = 31 * result + Objects.hashCode(this.cCardPayFeeRate);
        result = 31 * result + Objects.hashCode(this.creditCardType);
        result = 31 * result + Objects.hashCode(this.merchantData);
        result = 31 * result + Objects.hashCode(this.needRealTimeApply);
        result = 31 * result + Objects.hashCode(this.orderID);
        result = 31 * result + Objects.hashCode(this.subGatheringType);
        result = 31 * result + Objects.hashCode(this.dealStatus);
        result = 31 * result + Objects.hashCode(this.dealStatusName);
        result = 31 * result + Objects.hashCode(this.transDealStatus);
        result = 31 * result + Objects.hashCode(this.transDealStatusName);
        result = 31 * result + Objects.hashCode(this.transDealTime);
        result = 31 * result + Objects.hashCode(this.transNo);
        result = 31 * result + Objects.hashCode(this.transRequestType);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("billItemNo", billItemNo)
            .add("billNo", billNo)
            .add("amount", amount)
            .add("cardInfoID", cardInfoID)
            .add("cardRiskLevel", cardRiskLevel)
            .add("prepayType", prepayType)
            .add("cCardPayFee", cCardPayFee)
            .add("exchangeRate", exchangeRate)
            .add("subPaySystem", subPaySystem)
            .add("catalogCode", catalogCode)
            .add("paymentWayName", paymentWayName)
            .add("paymentWayID", paymentWayID)
            .add("cCardPayFeeRate", cCardPayFeeRate)
            .add("creditCardType", creditCardType)
            .add("merchantData", merchantData)
            .add("needRealTimeApply", needRealTimeApply)
            .add("orderID", orderID)
            .add("subGatheringType", subGatheringType)
            .add("dealStatus", dealStatus)
            .add("dealStatusName", dealStatusName)
            .add("transDealStatus", transDealStatus)
            .add("transDealStatusName", transDealStatusName)
            .add("transDealTime", transDealTime)
            .add("transNo", transNo)
            .add("transRequestType", transRequestType)
            .toString();
    }
}