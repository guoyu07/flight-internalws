/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.flight.transfersrecommandation.v1;

import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.math.BigDecimal;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 航程信息
 */
@DtoDoc("航程信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransitFlightEntity", propOrder = {
    "deliverTicketType",
    "rate",
    "price",
    "standardPrice",
    "airline",
    "clazz",
    "ticketType",
    "operationRemark",
    "canUpGrade",
    "upgradableNote",
    "refundFeeFormulaID",
    "maxBeforeFlyDays",
    "minBeforeFlyDays",
    "transitPolicy",
    "transitRouteList"
})
@SuppressWarnings("all")
public class TransitFlightEntity  {

    private static final long serialVersionUID = 1L;

    public TransitFlightEntity(
        String deliverTicketType, 
        BigDecimal rate, 
        BigDecimal price, 
        BigDecimal standardPrice, 
        String airline, 
        String clazz, 
        String ticketType, 
        String operationRemark, 
        boolean canUpGrade, 
        String upgradableNote, 
        int refundFeeFormulaID, 
        int maxBeforeFlyDays, 
        int minBeforeFlyDays, 
        TicketPolicy transitPolicy, 
        List<TransitRouteEntity> transitRouteList) {
        this.deliverTicketType = deliverTicketType;
        this.rate = rate;
        this.price = price;
        this.standardPrice = standardPrice;
        this.airline = airline;
        this.clazz = clazz;
        this.ticketType = ticketType;
        this.operationRemark = operationRemark;
        this.canUpGrade = canUpGrade;
        this.upgradableNote = upgradableNote;
        this.refundFeeFormulaID = refundFeeFormulaID;
        this.maxBeforeFlyDays = maxBeforeFlyDays;
        this.minBeforeFlyDays = minBeforeFlyDays;
        this.transitPolicy = transitPolicy;
        this.transitRouteList = transitRouteList;
    }

    public TransitFlightEntity() {
    }

    @FieldDoc("配送方式")
    @JsonProperty("DeliverTicketType")
    @XmlElement(name = "DeliverTicketType")
    private String deliverTicketType;

    @FieldDoc("折扣率")
    @JsonProperty("Rate")
    @XmlElement(name = "Rate")
    private BigDecimal rate;

    @FieldDoc("价格")
    @JsonProperty("Price")
    @XmlElement(name = "Price")
    private BigDecimal price;

    @FieldDoc("标准价")
    @JsonProperty("StandardPrice")
    @XmlElement(name = "StandardPrice")
    private BigDecimal standardPrice;

    @FieldDoc("航空公司")
    @JsonProperty("Airline")
    @XmlElement(name = "Airline")
    private String airline;

    @FieldDoc("服务等级")
    @JsonProperty("Class")
    @XmlElement(name = "Class")
    private String clazz;

    @FieldDoc("票种")
    @JsonProperty("TicketType")
    @XmlElement(name = "TicketType")
    private String ticketType;

    @FieldDoc("操作备注")
    @JsonProperty("OperationRemark")
    @XmlElement(name = "OperationRemark")
    private String operationRemark;

    @FieldDoc("能否升舱")
    @JsonProperty("CanUpGrade")
    @XmlElement(name = "CanUpGrade")
    private boolean canUpGrade;

    @FieldDoc("可升舱条件")
    @JsonProperty("UpgradableNote")
    @XmlElement(name = "UpgradableNote")
    private String upgradableNote;

    @FieldDoc("退票费公示ID")
    @JsonProperty("RefundFeeFormulaID")
    @XmlElement(name = "RefundFeeFormulaID")
    private int refundFeeFormulaID;

    @FieldDoc("最大提前天数")
    @JsonProperty("MaxBeforeFlyDays")
    @XmlElement(name = "MaxBeforeFlyDays")
    private int maxBeforeFlyDays;

    @FieldDoc("最小提前天数")
    @JsonProperty("MinBeforeFlyDays")
    @XmlElement(name = "MinBeforeFlyDays")
    private int minBeforeFlyDays;

    @FieldDoc("机票政策")
    @JsonProperty("TransitPolicy")
    @XmlElement(name = "TransitPolicy")
    private TicketPolicy transitPolicy;

    @FieldDoc("中转联程航程实体列表")
    @JsonProperty("TransitRouteList")
    @XmlElement(name = "TransitRouteList")
    private List<TransitRouteEntity> transitRouteList;

    /**
     * 配送方式
     */
    public String getDeliverTicketType() {
        return this.deliverTicketType;
    }

    public void setDeliverTicketType(String deliverTicketType) {
        this.deliverTicketType = deliverTicketType;
    }

    /**
     * 折扣率
     */
    public BigDecimal getRate() {
        return this.rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * 价格
     */
    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 标准价
     */
    public BigDecimal getStandardPrice() {
        return this.standardPrice;
    }

    public void setStandardPrice(BigDecimal standardPrice) {
        this.standardPrice = standardPrice;
    }

    /**
     * 航空公司
     */
    public String getAirline() {
        return this.airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    /**
     * 服务等级
     */
    public String getClazz() {
        return this.clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    /**
     * 票种
     */
    public String getTicketType() {
        return this.ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    /**
     * 操作备注
     */
    public String getOperationRemark() {
        return this.operationRemark;
    }

    public void setOperationRemark(String operationRemark) {
        this.operationRemark = operationRemark;
    }

    /**
     * 能否升舱
     */
    public boolean getCanUpGrade() {
        return this.canUpGrade;
    }

    public void setCanUpGrade(boolean canUpGrade) {
        this.canUpGrade = canUpGrade;
    }

    /**
     * 可升舱条件
     */
    public String getUpgradableNote() {
        return this.upgradableNote;
    }

    public void setUpgradableNote(String upgradableNote) {
        this.upgradableNote = upgradableNote;
    }

    /**
     * 退票费公示ID
     */
    public int getRefundFeeFormulaID() {
        return this.refundFeeFormulaID;
    }

    public void setRefundFeeFormulaID(int refundFeeFormulaID) {
        this.refundFeeFormulaID = refundFeeFormulaID;
    }

    /**
     * 最大提前天数
     */
    public int getMaxBeforeFlyDays() {
        return this.maxBeforeFlyDays;
    }

    public void setMaxBeforeFlyDays(int maxBeforeFlyDays) {
        this.maxBeforeFlyDays = maxBeforeFlyDays;
    }

    /**
     * 最小提前天数
     */
    public int getMinBeforeFlyDays() {
        return this.minBeforeFlyDays;
    }

    public void setMinBeforeFlyDays(int minBeforeFlyDays) {
        this.minBeforeFlyDays = minBeforeFlyDays;
    }

    /**
     * 机票政策
     */
    public TicketPolicy getTransitPolicy() {
        return this.transitPolicy;
    }

    public void setTransitPolicy(TicketPolicy transitPolicy) {
        this.transitPolicy = transitPolicy;
    }

    /**
     * 中转联程航程实体列表
     */
    public List<TransitRouteEntity> getTransitRouteList() {
        return this.transitRouteList;
    }

    public void setTransitRouteList(List<TransitRouteEntity> transitRouteList) {
        this.transitRouteList = transitRouteList;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final TransitFlightEntity other = (TransitFlightEntity)obj;
        return
            Objects.equal(this.deliverTicketType, other.deliverTicketType) && 
            Objects.equal(this.rate, other.rate) && 
            Objects.equal(this.price, other.price) && 
            Objects.equal(this.standardPrice, other.standardPrice) && 
            Objects.equal(this.airline, other.airline) && 
            Objects.equal(this.clazz, other.clazz) && 
            Objects.equal(this.ticketType, other.ticketType) && 
            Objects.equal(this.operationRemark, other.operationRemark) && 
            Objects.equal(this.canUpGrade, other.canUpGrade) && 
            Objects.equal(this.upgradableNote, other.upgradableNote) && 
            Objects.equal(this.refundFeeFormulaID, other.refundFeeFormulaID) && 
            Objects.equal(this.maxBeforeFlyDays, other.maxBeforeFlyDays) && 
            Objects.equal(this.minBeforeFlyDays, other.minBeforeFlyDays) && 
            Objects.equal(this.transitPolicy, other.transitPolicy) && 
            Objects.equal(this.transitRouteList, other.transitRouteList);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.deliverTicketType);
        result = 31 * result + Objects.hashCode(this.rate);
        result = 31 * result + Objects.hashCode(this.price);
        result = 31 * result + Objects.hashCode(this.standardPrice);
        result = 31 * result + Objects.hashCode(this.airline);
        result = 31 * result + Objects.hashCode(this.clazz);
        result = 31 * result + Objects.hashCode(this.ticketType);
        result = 31 * result + Objects.hashCode(this.operationRemark);
        result = 31 * result + Objects.hashCode(this.canUpGrade);
        result = 31 * result + Objects.hashCode(this.upgradableNote);
        result = 31 * result + Objects.hashCode(this.refundFeeFormulaID);
        result = 31 * result + Objects.hashCode(this.maxBeforeFlyDays);
        result = 31 * result + Objects.hashCode(this.minBeforeFlyDays);
        result = 31 * result + Objects.hashCode(this.transitPolicy);
        result = 31 * result + Objects.hashCode(this.transitRouteList);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("deliverTicketType", deliverTicketType)
            .add("rate", rate)
            .add("price", price)
            .add("standardPrice", standardPrice)
            .add("airline", airline)
            .add("clazz", clazz)
            .add("ticketType", ticketType)
            .add("operationRemark", operationRemark)
            .add("canUpGrade", canUpGrade)
            .add("upgradableNote", upgradableNote)
            .add("refundFeeFormulaID", refundFeeFormulaID)
            .add("maxBeforeFlyDays", maxBeforeFlyDays)
            .add("minBeforeFlyDays", minBeforeFlyDays)
            .add("transitPolicy", transitPolicy)
            .add("transitRouteList", transitRouteList)
            .toString();
    }
}