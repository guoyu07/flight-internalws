/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.flight.union_searchflightsws.v1;

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
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceInfoType", propOrder = {
    "isDefault",
    "expression",
    "travelerCategoryCode",
    "agency",
    "commissionRate",
    "salesRate",
    "exchange",
    "profitType",
    "ticketRemark",
    "priceDetail",
    "originalPriceDetail",
    "segmentPriceList",
    "insuranceList"
})
@SuppressWarnings("all")
public class PriceInfoType  {

    private static final long serialVersionUID = 1L;

    public PriceInfoType(
        boolean isDefault, 
        String expression, 
        String travelerCategoryCode, 
        AgencyType agency, 
        BigDecimal commissionRate, 
        BigDecimal salesRate, 
        BigDecimal exchange, 
        int profitType, 
        String ticketRemark, 
        PriceDetailType priceDetail, 
        PriceDetailType originalPriceDetail, 
        List<PriceDetailType> segmentPriceList, 
        List<InsuranceType> insuranceList) {
        this.isDefault = isDefault;
        this.expression = expression;
        this.travelerCategoryCode = travelerCategoryCode;
        this.agency = agency;
        this.commissionRate = commissionRate;
        this.salesRate = salesRate;
        this.exchange = exchange;
        this.profitType = profitType;
        this.ticketRemark = ticketRemark;
        this.priceDetail = priceDetail;
        this.originalPriceDetail = originalPriceDetail;
        this.segmentPriceList = segmentPriceList;
        this.insuranceList = insuranceList;
    }

    public PriceInfoType() {
    }

    @FieldDoc("默认票台价格")
    @JsonProperty("IsDefault")
    @XmlElement(name = "IsDefault")
    private boolean isDefault;

    @FieldDoc("横式")
    @JsonProperty("Expression")
    @XmlElement(name = "Expression")
    private String expression;

    @FieldDoc("乘客类别（成人、儿童等）")
    @JsonProperty("TravelerCategoryCode")
    @XmlElement(name = "TravelerCategoryCode")
    private String travelerCategoryCode;

    @JsonProperty("Agency")
    @XmlElement(name = "Agency")
    private AgencyType agency;

    @FieldDoc("底价扣率")
    @JsonProperty("CommissionRate")
    @XmlElement(name = "CommissionRate")
    private BigDecimal commissionRate;

    @FieldDoc("实价扣率")
    @JsonProperty("SalesRate")
    @XmlElement(name = "SalesRate")
    private BigDecimal salesRate;

    @FieldDoc("汇率")
    @JsonProperty("Exchange")
    @XmlElement(name = "Exchange")
    private BigDecimal exchange;

    @FieldDoc("利润类型，0=扣率，1=保险费")
    @JsonProperty("ProfitType")
    @XmlElement(name = "ProfitType")
    private int profitType;

    @FieldDoc("出票备注")
    @JsonProperty("TicketRemark")
    @XmlElement(name = "TicketRemark")
    private String ticketRemark;

    @JsonProperty("PriceDetail")
    @XmlElement(name = "PriceDetail")
    private PriceDetailType priceDetail;

    @JsonProperty("OriginalPriceDetail")
    @XmlElement(name = "OriginalPriceDetail")
    private PriceDetailType originalPriceDetail;

    @FieldDoc("春秋分段价格")
    @JsonProperty("SegmentPriceList")
    @XmlElement(name = "SegmentPrice")
    @XmlElementWrapper(name = "SegmentPriceList")
    private List<PriceDetailType> segmentPriceList;

    @FieldDoc("强制保险")
    @JsonProperty("InsuranceList")
    @XmlElement(name = "Insurance")
    @XmlElementWrapper(name = "InsuranceList")
    private List<InsuranceType> insuranceList;

    /**
     * 默认票台价格
     */
    public boolean getIsDefault() {
        return this.isDefault;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * 横式
     */
    public String getExpression() {
        return this.expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * 乘客类别（成人、儿童等）
     */
    public String getTravelerCategoryCode() {
        return this.travelerCategoryCode;
    }

    public void setTravelerCategoryCode(String travelerCategoryCode) {
        this.travelerCategoryCode = travelerCategoryCode;
    }

    public AgencyType getAgency() {
        return this.agency;
    }

    public void setAgency(AgencyType agency) {
        this.agency = agency;
    }

    /**
     * 底价扣率
     */
    public BigDecimal getCommissionRate() {
        return this.commissionRate;
    }

    public void setCommissionRate(BigDecimal commissionRate) {
        this.commissionRate = commissionRate;
    }

    /**
     * 实价扣率
     */
    public BigDecimal getSalesRate() {
        return this.salesRate;
    }

    public void setSalesRate(BigDecimal salesRate) {
        this.salesRate = salesRate;
    }

    /**
     * 汇率
     */
    public BigDecimal getExchange() {
        return this.exchange;
    }

    public void setExchange(BigDecimal exchange) {
        this.exchange = exchange;
    }

    /**
     * 利润类型，0=扣率，1=保险费
     */
    public int getProfitType() {
        return this.profitType;
    }

    public void setProfitType(int profitType) {
        this.profitType = profitType;
    }

    /**
     * 出票备注
     */
    public String getTicketRemark() {
        return this.ticketRemark;
    }

    public void setTicketRemark(String ticketRemark) {
        this.ticketRemark = ticketRemark;
    }

    public PriceDetailType getPriceDetail() {
        return this.priceDetail;
    }

    public void setPriceDetail(PriceDetailType priceDetail) {
        this.priceDetail = priceDetail;
    }

    public PriceDetailType getOriginalPriceDetail() {
        return this.originalPriceDetail;
    }

    public void setOriginalPriceDetail(PriceDetailType originalPriceDetail) {
        this.originalPriceDetail = originalPriceDetail;
    }

    /**
     * 春秋分段价格
     */
    public List<PriceDetailType> getSegmentPriceList() {
        return this.segmentPriceList;
    }

    public void setSegmentPriceList(List<PriceDetailType> segmentPriceList) {
        this.segmentPriceList = segmentPriceList;
    }

    /**
     * 强制保险
     */
    public List<InsuranceType> getInsuranceList() {
        return this.insuranceList;
    }

    public void setInsuranceList(List<InsuranceType> insuranceList) {
        this.insuranceList = insuranceList;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final PriceInfoType other = (PriceInfoType)obj;
        return
            Objects.equal(this.isDefault, other.isDefault) && 
            Objects.equal(this.expression, other.expression) && 
            Objects.equal(this.travelerCategoryCode, other.travelerCategoryCode) && 
            Objects.equal(this.agency, other.agency) && 
            Objects.equal(this.commissionRate, other.commissionRate) && 
            Objects.equal(this.salesRate, other.salesRate) && 
            Objects.equal(this.exchange, other.exchange) && 
            Objects.equal(this.profitType, other.profitType) && 
            Objects.equal(this.ticketRemark, other.ticketRemark) && 
            Objects.equal(this.priceDetail, other.priceDetail) && 
            Objects.equal(this.originalPriceDetail, other.originalPriceDetail) && 
            Objects.equal(this.segmentPriceList, other.segmentPriceList) && 
            Objects.equal(this.insuranceList, other.insuranceList);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.isDefault);
        result = 31 * result + Objects.hashCode(this.expression);
        result = 31 * result + Objects.hashCode(this.travelerCategoryCode);
        result = 31 * result + Objects.hashCode(this.agency);
        result = 31 * result + Objects.hashCode(this.commissionRate);
        result = 31 * result + Objects.hashCode(this.salesRate);
        result = 31 * result + Objects.hashCode(this.exchange);
        result = 31 * result + Objects.hashCode(this.profitType);
        result = 31 * result + Objects.hashCode(this.ticketRemark);
        result = 31 * result + Objects.hashCode(this.priceDetail);
        result = 31 * result + Objects.hashCode(this.originalPriceDetail);
        result = 31 * result + Objects.hashCode(this.segmentPriceList);
        result = 31 * result + Objects.hashCode(this.insuranceList);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("isDefault", isDefault)
            .add("expression", expression)
            .add("travelerCategoryCode", travelerCategoryCode)
            .add("agency", agency)
            .add("commissionRate", commissionRate)
            .add("salesRate", salesRate)
            .add("exchange", exchange)
            .add("profitType", profitType)
            .add("ticketRemark", ticketRemark)
            .add("priceDetail", priceDetail)
            .add("originalPriceDetail", originalPriceDetail)
            .add("segmentPriceList", segmentPriceList)
            .add("insuranceList", insuranceList)
            .toString();
    }
}