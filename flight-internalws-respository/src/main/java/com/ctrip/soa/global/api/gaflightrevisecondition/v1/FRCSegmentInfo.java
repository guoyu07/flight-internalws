/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.gaflightrevisecondition.v1;

import com.ctrip.soa.global.api.flightcommon.v1.ColunmInfo;
import com.ctrip.soa.global.api.flightcommon.v1.FeeEntity;
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
 * 航段信息
 */
@DtoDoc("航段信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FRCSegmentInfo", propOrder = {
    "sequence",
    "price",
    "printPrice",
    "oilFee",
    "tax",
    "cnyPrice",
    "cnyPrintPrice",
    "cnyOilFee",
    "cnyTax",
    "rebookPolicy",
    "refundPolicy",
    "flightColunmInfo",
    "psgReviseConditionList",
    "cnySubsidy",
    "subsidy",
    "adultRefundList",
    "childRefundList",
    "infantRefundList",
    "adultChangeList",
    "childChangeList",
    "infantChangeList",
    "endorsePolicy"
})
@SuppressWarnings("all")
public class FRCSegmentInfo  {

    private static final long serialVersionUID = 1L;

    public FRCSegmentInfo(
        int sequence, 
        BigDecimal price, 
        BigDecimal printPrice, 
        BigDecimal oilFee, 
        BigDecimal tax, 
        BigDecimal cnyPrice, 
        BigDecimal cnyPrintPrice, 
        BigDecimal cnyOilFee, 
        BigDecimal cnyTax, 
        String rebookPolicy, 
        String refundPolicy, 
        ColunmInfo flightColunmInfo, 
        List<PsgReviseCondition> psgReviseConditionList, 
        BigDecimal cnySubsidy, 
        BigDecimal subsidy, 
        List<FeeEntity> adultRefundList, 
        List<FeeEntity> childRefundList, 
        List<FeeEntity> infantRefundList, 
        List<FeeEntity> adultChangeList, 
        List<FeeEntity> childChangeList, 
        List<FeeEntity> infantChangeList, 
        String endorsePolicy) {
        this.sequence = sequence;
        this.price = price;
        this.printPrice = printPrice;
        this.oilFee = oilFee;
        this.tax = tax;
        this.cnyPrice = cnyPrice;
        this.cnyPrintPrice = cnyPrintPrice;
        this.cnyOilFee = cnyOilFee;
        this.cnyTax = cnyTax;
        this.rebookPolicy = rebookPolicy;
        this.refundPolicy = refundPolicy;
        this.flightColunmInfo = flightColunmInfo;
        this.psgReviseConditionList = psgReviseConditionList;
        this.cnySubsidy = cnySubsidy;
        this.subsidy = subsidy;
        this.adultRefundList = adultRefundList;
        this.childRefundList = childRefundList;
        this.infantRefundList = infantRefundList;
        this.adultChangeList = adultChangeList;
        this.childChangeList = childChangeList;
        this.infantChangeList = infantChangeList;
        this.endorsePolicy = endorsePolicy;
    }

    public FRCSegmentInfo() {
    }

    @FieldDoc("航段序号")
    @JsonProperty("Sequence")
    @XmlElement(name = "Sequence")
    private int sequence;

    @FieldDoc("售价(支付币种)")
    @JsonProperty("Price")
    @XmlElement(name = "Price")
    private BigDecimal price;

    @FieldDoc("票面价(支付币种)")
    @JsonProperty("PrintPrice")
    @XmlElement(name = "PrintPrice")
    private BigDecimal printPrice;

    @FieldDoc("燃油(支付币种)")
    @JsonProperty("OilFee")
    @XmlElement(name = "OilFee")
    private BigDecimal oilFee;

    @FieldDoc("税(支付币种)")
    @JsonProperty("Tax")
    @XmlElement(name = "Tax")
    private BigDecimal tax;

    @FieldDoc("售价（人民币）")
    @JsonProperty("CNYPrice")
    @XmlElement(name = "CNYPrice")
    private BigDecimal cnyPrice;

    @FieldDoc("票面价（人民币）")
    @JsonProperty("CNYPrintPrice")
    @XmlElement(name = "CNYPrintPrice")
    private BigDecimal cnyPrintPrice;

    @FieldDoc("燃油（人民币）")
    @JsonProperty("CNYOilFee")
    @XmlElement(name = "CNYOilFee")
    private BigDecimal cnyOilFee;

    @FieldDoc("税（人民币）")
    @JsonProperty("CNYTax")
    @XmlElement(name = "CNYTax")
    private BigDecimal cnyTax;

    @FieldDoc("改签政策")
    @JsonProperty("RebookPolicy")
    @XmlElement(name = "RebookPolicy")
    private String rebookPolicy;

    @FieldDoc("退票政策")
    @JsonProperty("RefundPolicy")
    @XmlElement(name = "RefundPolicy")
    private String refundPolicy;

    @FieldDoc("航段信息")
    @JsonProperty("FlightColunmInfo")
    @XmlElement(name = "FlightColunmInfo")
    private ColunmInfo flightColunmInfo;

    @FieldDoc("人乘可退改信息")
    @JsonProperty("PsgReviseConditionList")
    @XmlElement(name = "PsgReviseConditionList")
    private List<PsgReviseCondition> psgReviseConditionList;

    @FieldDoc("飞享金（人民币）")
    @JsonProperty("CNYSubsidy")
    @XmlElement(name = "CNYSubsidy")
    private BigDecimal cnySubsidy;

    @FieldDoc("飞享金")
    @JsonProperty("Subsidy")
    @XmlElement(name = "Subsidy")
    private BigDecimal subsidy;

    @FieldDoc("成人退票费信息")
    @JsonProperty("AdultRefundList")
    @XmlElement(name = "AdultRefundList")
    private List<FeeEntity> adultRefundList;

    @FieldDoc("儿童退票费信息")
    @JsonProperty("ChildRefundList")
    @XmlElement(name = "ChildRefundList")
    private List<FeeEntity> childRefundList;

    @FieldDoc("婴儿退票费信息")
    @JsonProperty("InfantRefundList")
    @XmlElement(name = "InfantRefundList")
    private List<FeeEntity> infantRefundList;

    @FieldDoc("成人改期费信息")
    @JsonProperty("AdultChangeList")
    @XmlElement(name = "AdultChangeList")
    private List<FeeEntity> adultChangeList;

    @FieldDoc("儿童改期费信息")
    @JsonProperty("ChildChangeList")
    @XmlElement(name = "ChildChangeList")
    private List<FeeEntity> childChangeList;

    @FieldDoc("婴儿改期费信息")
    @JsonProperty("InfantChangeList")
    @XmlElement(name = "InfantChangeList")
    private List<FeeEntity> infantChangeList;

    @FieldDoc("签转政策")
    @JsonProperty("EndorsePolicy")
    @XmlElement(name = "EndorsePolicy")
    private String endorsePolicy;

    /**
     * 航段序号
     */
    public int getSequence() {
        return this.sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    /**
     * 售价(支付币种)
     */
    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 票面价(支付币种)
     */
    public BigDecimal getPrintPrice() {
        return this.printPrice;
    }

    public void setPrintPrice(BigDecimal printPrice) {
        this.printPrice = printPrice;
    }

    /**
     * 燃油(支付币种)
     */
    public BigDecimal getOilFee() {
        return this.oilFee;
    }

    public void setOilFee(BigDecimal oilFee) {
        this.oilFee = oilFee;
    }

    /**
     * 税(支付币种)
     */
    public BigDecimal getTax() {
        return this.tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    /**
     * 售价（人民币）
     */
    public BigDecimal getCnyPrice() {
        return this.cnyPrice;
    }

    public void setCnyPrice(BigDecimal cnyPrice) {
        this.cnyPrice = cnyPrice;
    }

    /**
     * 票面价（人民币）
     */
    public BigDecimal getCnyPrintPrice() {
        return this.cnyPrintPrice;
    }

    public void setCnyPrintPrice(BigDecimal cnyPrintPrice) {
        this.cnyPrintPrice = cnyPrintPrice;
    }

    /**
     * 燃油（人民币）
     */
    public BigDecimal getCnyOilFee() {
        return this.cnyOilFee;
    }

    public void setCnyOilFee(BigDecimal cnyOilFee) {
        this.cnyOilFee = cnyOilFee;
    }

    /**
     * 税（人民币）
     */
    public BigDecimal getCnyTax() {
        return this.cnyTax;
    }

    public void setCnyTax(BigDecimal cnyTax) {
        this.cnyTax = cnyTax;
    }

    /**
     * 改签政策
     */
    public String getRebookPolicy() {
        return this.rebookPolicy;
    }

    public void setRebookPolicy(String rebookPolicy) {
        this.rebookPolicy = rebookPolicy;
    }

    /**
     * 退票政策
     */
    public String getRefundPolicy() {
        return this.refundPolicy;
    }

    public void setRefundPolicy(String refundPolicy) {
        this.refundPolicy = refundPolicy;
    }

    /**
     * 航段信息
     */
    public ColunmInfo getFlightColunmInfo() {
        return this.flightColunmInfo;
    }

    public void setFlightColunmInfo(ColunmInfo flightColunmInfo) {
        this.flightColunmInfo = flightColunmInfo;
    }

    /**
     * 人乘可退改信息
     */
    public List<PsgReviseCondition> getPsgReviseConditionList() {
        return this.psgReviseConditionList;
    }

    public void setPsgReviseConditionList(List<PsgReviseCondition> psgReviseConditionList) {
        this.psgReviseConditionList = psgReviseConditionList;
    }

    /**
     * 飞享金（人民币）
     */
    public BigDecimal getCnySubsidy() {
        return this.cnySubsidy;
    }

    public void setCnySubsidy(BigDecimal cnySubsidy) {
        this.cnySubsidy = cnySubsidy;
    }

    /**
     * 飞享金
     */
    public BigDecimal getSubsidy() {
        return this.subsidy;
    }

    public void setSubsidy(BigDecimal subsidy) {
        this.subsidy = subsidy;
    }

    /**
     * 成人退票费信息
     */
    public List<FeeEntity> getAdultRefundList() {
        return this.adultRefundList;
    }

    public void setAdultRefundList(List<FeeEntity> adultRefundList) {
        this.adultRefundList = adultRefundList;
    }

    /**
     * 儿童退票费信息
     */
    public List<FeeEntity> getChildRefundList() {
        return this.childRefundList;
    }

    public void setChildRefundList(List<FeeEntity> childRefundList) {
        this.childRefundList = childRefundList;
    }

    /**
     * 婴儿退票费信息
     */
    public List<FeeEntity> getInfantRefundList() {
        return this.infantRefundList;
    }

    public void setInfantRefundList(List<FeeEntity> infantRefundList) {
        this.infantRefundList = infantRefundList;
    }

    /**
     * 成人改期费信息
     */
    public List<FeeEntity> getAdultChangeList() {
        return this.adultChangeList;
    }

    public void setAdultChangeList(List<FeeEntity> adultChangeList) {
        this.adultChangeList = adultChangeList;
    }

    /**
     * 儿童改期费信息
     */
    public List<FeeEntity> getChildChangeList() {
        return this.childChangeList;
    }

    public void setChildChangeList(List<FeeEntity> childChangeList) {
        this.childChangeList = childChangeList;
    }

    /**
     * 婴儿改期费信息
     */
    public List<FeeEntity> getInfantChangeList() {
        return this.infantChangeList;
    }

    public void setInfantChangeList(List<FeeEntity> infantChangeList) {
        this.infantChangeList = infantChangeList;
    }

    /**
     * 签转政策
     */
    public String getEndorsePolicy() {
        return this.endorsePolicy;
    }

    public void setEndorsePolicy(String endorsePolicy) {
        this.endorsePolicy = endorsePolicy;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final FRCSegmentInfo other = (FRCSegmentInfo)obj;
        return
            Objects.equal(this.sequence, other.sequence) && 
            Objects.equal(this.price, other.price) && 
            Objects.equal(this.printPrice, other.printPrice) && 
            Objects.equal(this.oilFee, other.oilFee) && 
            Objects.equal(this.tax, other.tax) && 
            Objects.equal(this.cnyPrice, other.cnyPrice) && 
            Objects.equal(this.cnyPrintPrice, other.cnyPrintPrice) && 
            Objects.equal(this.cnyOilFee, other.cnyOilFee) && 
            Objects.equal(this.cnyTax, other.cnyTax) && 
            Objects.equal(this.rebookPolicy, other.rebookPolicy) && 
            Objects.equal(this.refundPolicy, other.refundPolicy) && 
            Objects.equal(this.flightColunmInfo, other.flightColunmInfo) && 
            Objects.equal(this.psgReviseConditionList, other.psgReviseConditionList) && 
            Objects.equal(this.cnySubsidy, other.cnySubsidy) && 
            Objects.equal(this.subsidy, other.subsidy) && 
            Objects.equal(this.adultRefundList, other.adultRefundList) && 
            Objects.equal(this.childRefundList, other.childRefundList) && 
            Objects.equal(this.infantRefundList, other.infantRefundList) && 
            Objects.equal(this.adultChangeList, other.adultChangeList) && 
            Objects.equal(this.childChangeList, other.childChangeList) && 
            Objects.equal(this.infantChangeList, other.infantChangeList) && 
            Objects.equal(this.endorsePolicy, other.endorsePolicy);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.sequence);
        result = 31 * result + Objects.hashCode(this.price);
        result = 31 * result + Objects.hashCode(this.printPrice);
        result = 31 * result + Objects.hashCode(this.oilFee);
        result = 31 * result + Objects.hashCode(this.tax);
        result = 31 * result + Objects.hashCode(this.cnyPrice);
        result = 31 * result + Objects.hashCode(this.cnyPrintPrice);
        result = 31 * result + Objects.hashCode(this.cnyOilFee);
        result = 31 * result + Objects.hashCode(this.cnyTax);
        result = 31 * result + Objects.hashCode(this.rebookPolicy);
        result = 31 * result + Objects.hashCode(this.refundPolicy);
        result = 31 * result + Objects.hashCode(this.flightColunmInfo);
        result = 31 * result + Objects.hashCode(this.psgReviseConditionList);
        result = 31 * result + Objects.hashCode(this.cnySubsidy);
        result = 31 * result + Objects.hashCode(this.subsidy);
        result = 31 * result + Objects.hashCode(this.adultRefundList);
        result = 31 * result + Objects.hashCode(this.childRefundList);
        result = 31 * result + Objects.hashCode(this.infantRefundList);
        result = 31 * result + Objects.hashCode(this.adultChangeList);
        result = 31 * result + Objects.hashCode(this.childChangeList);
        result = 31 * result + Objects.hashCode(this.infantChangeList);
        result = 31 * result + Objects.hashCode(this.endorsePolicy);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("sequence", sequence)
            .add("price", price)
            .add("printPrice", printPrice)
            .add("oilFee", oilFee)
            .add("tax", tax)
            .add("cnyPrice", cnyPrice)
            .add("cnyPrintPrice", cnyPrintPrice)
            .add("cnyOilFee", cnyOilFee)
            .add("cnyTax", cnyTax)
            .add("rebookPolicy", rebookPolicy)
            .add("refundPolicy", refundPolicy)
            .add("flightColunmInfo", flightColunmInfo)
            .add("psgReviseConditionList", psgReviseConditionList)
            .add("cnySubsidy", cnySubsidy)
            .add("subsidy", subsidy)
            .add("adultRefundList", adultRefundList)
            .add("childRefundList", childRefundList)
            .add("infantRefundList", infantRefundList)
            .add("adultChangeList", adultChangeList)
            .add("childChangeList", childChangeList)
            .add("infantChangeList", infantChangeList)
            .add("endorsePolicy", endorsePolicy)
            .toString();
    }
}