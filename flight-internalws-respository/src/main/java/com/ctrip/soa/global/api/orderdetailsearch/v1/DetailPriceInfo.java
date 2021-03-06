/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.orderdetailsearch.v1;

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
 * 价格信息
 */
@DtoDoc("价格信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailPriceInfo", propOrder = {
    "totalPrice",
    "flightPrice",
    "tax",
    "oil",
    "totalInsuranceFee",
    "totalPackageAttachAmount",
    "cCardFee",
    "deliverFee",
    "couponAmount",
    "subsidy",
    "insuranceFee",
    "valueAddedBaggageFee",
    "xHotelCouponProductFee",
    "loungeFee",
    "cnyTotalPrice",
    "cnyFlightPrice",
    "cnyTax",
    "cnyOil",
    "cnyTotalInsuranceFee",
    "cnyValueAddedBaggageFee",
    "cnyxHotelCouponFee",
    "cnyLoungeFee",
    "cnyTotalPackageAttachAmount",
    "cnycCardFee",
    "cnyDeliverFee",
    "cnyCouponAmount",
    "cnySubsidy",
    "showCurrencyType",
    "travelMoney"
})
@SuppressWarnings("all")
public class DetailPriceInfo  {

    private static final long serialVersionUID = 1L;

    public DetailPriceInfo(
        BigDecimal totalPrice, 
        BigDecimal flightPrice, 
        BigDecimal tax, 
        BigDecimal oil, 
        BigDecimal totalInsuranceFee, 
        BigDecimal totalPackageAttachAmount, 
        BigDecimal cCardFee, 
        BigDecimal deliverFee, 
        BigDecimal couponAmount, 
        BigDecimal subsidy, 
        BigDecimal insuranceFee, 
        BigDecimal valueAddedBaggageFee, 
        BigDecimal xHotelCouponProductFee, 
        BigDecimal loungeFee, 
        BigDecimal cnyTotalPrice, 
        BigDecimal cnyFlightPrice, 
        BigDecimal cnyTax, 
        BigDecimal cnyOil, 
        BigDecimal cnyTotalInsuranceFee, 
        BigDecimal cnyValueAddedBaggageFee, 
        BigDecimal cnyxHotelCouponFee, 
        BigDecimal cnyLoungeFee, 
        BigDecimal cnyTotalPackageAttachAmount, 
        BigDecimal cnycCardFee, 
        BigDecimal cnyDeliverFee, 
        BigDecimal cnyCouponAmount, 
        BigDecimal cnySubsidy, 
        String showCurrencyType, 
        BigDecimal travelMoney) {
        this.totalPrice = totalPrice;
        this.flightPrice = flightPrice;
        this.tax = tax;
        this.oil = oil;
        this.totalInsuranceFee = totalInsuranceFee;
        this.totalPackageAttachAmount = totalPackageAttachAmount;
        this.cCardFee = cCardFee;
        this.deliverFee = deliverFee;
        this.couponAmount = couponAmount;
        this.subsidy = subsidy;
        this.insuranceFee = insuranceFee;
        this.valueAddedBaggageFee = valueAddedBaggageFee;
        this.xHotelCouponProductFee = xHotelCouponProductFee;
        this.loungeFee = loungeFee;
        this.cnyTotalPrice = cnyTotalPrice;
        this.cnyFlightPrice = cnyFlightPrice;
        this.cnyTax = cnyTax;
        this.cnyOil = cnyOil;
        this.cnyTotalInsuranceFee = cnyTotalInsuranceFee;
        this.cnyValueAddedBaggageFee = cnyValueAddedBaggageFee;
        this.cnyxHotelCouponFee = cnyxHotelCouponFee;
        this.cnyLoungeFee = cnyLoungeFee;
        this.cnyTotalPackageAttachAmount = cnyTotalPackageAttachAmount;
        this.cnycCardFee = cnycCardFee;
        this.cnyDeliverFee = cnyDeliverFee;
        this.cnyCouponAmount = cnyCouponAmount;
        this.cnySubsidy = cnySubsidy;
        this.showCurrencyType = showCurrencyType;
        this.travelMoney = travelMoney;
    }

    public DetailPriceInfo() {
    }

    @FieldDoc("当前币种机票总价")
    @JsonProperty("TotalPrice")
    @XmlElement(name = "TotalPrice")
    private BigDecimal totalPrice;

    @FieldDoc("当前币种机票单价")
    @JsonProperty("FlightPrice")
    @XmlElement(name = "FlightPrice")
    private BigDecimal flightPrice;

    @FieldDoc("当前币种机票税费")
    @JsonProperty("Tax")
    @XmlElement(name = "Tax")
    private BigDecimal tax;

    @FieldDoc("当前币种机票燃油费")
    @JsonProperty("Oil")
    @XmlElement(name = "Oil")
    private BigDecimal oil;

    @FieldDoc("当前币种保险总额")
    @JsonProperty("TotalInsuranceFee")
    @XmlElement(name = "TotalInsuranceFee")
    private BigDecimal totalInsuranceFee;

    @FieldDoc("当前币种套餐捆绑优惠券总价")
    @JsonProperty("TotalPackageAttachAmount")
    @XmlElement(name = "TotalPackageAttachAmount")
    private BigDecimal totalPackageAttachAmount;

    @FieldDoc("当前币种外卡手续费")
    @JsonProperty("CCardFee")
    @XmlElement(name = "CCardFee")
    private BigDecimal cCardFee;

    @FieldDoc("当前币种配送费")
    @JsonProperty("DeliverFee")
    @XmlElement(name = "DeliverFee")
    private BigDecimal deliverFee;

    @FieldDoc("当前币种礼品卡支付费用")
    @JsonProperty("CouponAmount")
    @XmlElement(name = "CouponAmount")
    private BigDecimal couponAmount;

    @FieldDoc("当前币种飞享金")
    @JsonProperty("Subsidy")
    @XmlElement(name = "Subsidy")
    private BigDecimal subsidy;

    @FieldDoc("保险总价(单航段)")
    @JsonProperty("InsuranceFee")
    @XmlElement(name = "InsuranceFee")
    private BigDecimal insuranceFee;

    @FieldDoc("增值行李额总价")
    @JsonProperty("ValueAddedBaggageFee")
    @XmlElement(name = "ValueAddedBaggageFee")
    private BigDecimal valueAddedBaggageFee;

    @FieldDoc("X产品酒店优惠券总价")
    @JsonProperty("XHotelCouponProductFee")
    @XmlElement(name = "XHotelCouponProductFee")
    private BigDecimal xHotelCouponProductFee;

    @FieldDoc("候机室费用")
    @JsonProperty("LoungeFee")
    @XmlElement(name = "LoungeFee")
    private BigDecimal loungeFee;

    @FieldDoc("订单总价")
    @JsonProperty("CNYTotalPrice")
    @XmlElement(name = "CNYTotalPrice")
    private BigDecimal cnyTotalPrice;

    @FieldDoc("机票总价")
    @JsonProperty("CNYFlightPrice")
    @XmlElement(name = "CNYFlightPrice")
    private BigDecimal cnyFlightPrice;

    @FieldDoc("税费")
    @JsonProperty("CNYTax")
    @XmlElement(name = "CNYTax")
    private BigDecimal cnyTax;

    @FieldDoc("燃油费")
    @JsonProperty("CNYOil")
    @XmlElement(name = "CNYOil")
    private BigDecimal cnyOil;

    @FieldDoc("保险总额")
    @JsonProperty("CNYTotalInsuranceFee")
    @XmlElement(name = "CNYTotalInsuranceFee")
    private BigDecimal cnyTotalInsuranceFee;

    @FieldDoc("增值行李额总价(CNY)")
    @JsonProperty("CNYValueAddedBaggageFee")
    @XmlElement(name = "CNYValueAddedBaggageFee")
    private BigDecimal cnyValueAddedBaggageFee;

    @FieldDoc("X产品酒店优惠券总价(CNY)")
    @JsonProperty("CNYXHotelCouponFee")
    @XmlElement(name = "CNYXHotelCouponFee")
    private BigDecimal cnyxHotelCouponFee;

    @FieldDoc("休息室总额")
    @JsonProperty("CNYLoungeFee")
    @XmlElement(name = "CNYLoungeFee")
    private BigDecimal cnyLoungeFee;

    @FieldDoc("套餐捆绑优惠券总价")
    @JsonProperty("CNYTotalPackageAttachAmount")
    @XmlElement(name = "CNYTotalPackageAttachAmount")
    private BigDecimal cnyTotalPackageAttachAmount;

    @FieldDoc("外卡手续费")
    @JsonProperty("CNYCCardFee")
    @XmlElement(name = "CNYCCardFee")
    private BigDecimal cnycCardFee;

    @FieldDoc("配送费")
    @JsonProperty("CNYDeliverFee")
    @XmlElement(name = "CNYDeliverFee")
    private BigDecimal cnyDeliverFee;

    @FieldDoc("礼品卡支付费用")
    @JsonProperty("CNYCouponAmount")
    @XmlElement(name = "CNYCouponAmount")
    private BigDecimal cnyCouponAmount;

    @FieldDoc("飞享金")
    @JsonProperty("CNYSubsidy")
    @XmlElement(name = "CNYSubsidy")
    private BigDecimal cnySubsidy;

    @FieldDoc("客户端展示币种类型")
    @JsonProperty("ShowCurrencyType")
    @XmlElement(name = "ShowCurrencyType")
    private String showCurrencyType;

    @FieldDoc("礼品卡")
    @JsonProperty("TravelMoney")
    @XmlElement(name = "TravelMoney")
    private BigDecimal travelMoney;

    /**
     * 当前币种机票总价
     */
    public BigDecimal getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * 当前币种机票单价
     */
    public BigDecimal getFlightPrice() {
        return this.flightPrice;
    }

    public void setFlightPrice(BigDecimal flightPrice) {
        this.flightPrice = flightPrice;
    }

    /**
     * 当前币种机票税费
     */
    public BigDecimal getTax() {
        return this.tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    /**
     * 当前币种机票燃油费
     */
    public BigDecimal getOil() {
        return this.oil;
    }

    public void setOil(BigDecimal oil) {
        this.oil = oil;
    }

    /**
     * 当前币种保险总额
     */
    public BigDecimal getTotalInsuranceFee() {
        return this.totalInsuranceFee;
    }

    public void setTotalInsuranceFee(BigDecimal totalInsuranceFee) {
        this.totalInsuranceFee = totalInsuranceFee;
    }

    /**
     * 当前币种套餐捆绑优惠券总价
     */
    public BigDecimal getTotalPackageAttachAmount() {
        return this.totalPackageAttachAmount;
    }

    public void setTotalPackageAttachAmount(BigDecimal totalPackageAttachAmount) {
        this.totalPackageAttachAmount = totalPackageAttachAmount;
    }

    /**
     * 当前币种外卡手续费
     */
    public BigDecimal getCCardFee() {
        return this.cCardFee;
    }

    public void setCCardFee(BigDecimal cCardFee) {
        this.cCardFee = cCardFee;
    }

    /**
     * 当前币种配送费
     */
    public BigDecimal getDeliverFee() {
        return this.deliverFee;
    }

    public void setDeliverFee(BigDecimal deliverFee) {
        this.deliverFee = deliverFee;
    }

    /**
     * 当前币种礼品卡支付费用
     */
    public BigDecimal getCouponAmount() {
        return this.couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * 当前币种飞享金
     */
    public BigDecimal getSubsidy() {
        return this.subsidy;
    }

    public void setSubsidy(BigDecimal subsidy) {
        this.subsidy = subsidy;
    }

    /**
     * 保险总价(单航段)
     */
    public BigDecimal getInsuranceFee() {
        return this.insuranceFee;
    }

    public void setInsuranceFee(BigDecimal insuranceFee) {
        this.insuranceFee = insuranceFee;
    }

    /**
     * 增值行李额总价
     */
    public BigDecimal getValueAddedBaggageFee() {
        return this.valueAddedBaggageFee;
    }

    public void setValueAddedBaggageFee(BigDecimal valueAddedBaggageFee) {
        this.valueAddedBaggageFee = valueAddedBaggageFee;
    }

    /**
     * X产品酒店优惠券总价
     */
    public BigDecimal getXHotelCouponProductFee() {
        return this.xHotelCouponProductFee;
    }

    public void setXHotelCouponProductFee(BigDecimal xHotelCouponProductFee) {
        this.xHotelCouponProductFee = xHotelCouponProductFee;
    }

    /**
     * 候机室费用
     */
    public BigDecimal getLoungeFee() {
        return this.loungeFee;
    }

    public void setLoungeFee(BigDecimal loungeFee) {
        this.loungeFee = loungeFee;
    }

    /**
     * 订单总价
     */
    public BigDecimal getCnyTotalPrice() {
        return this.cnyTotalPrice;
    }

    public void setCnyTotalPrice(BigDecimal cnyTotalPrice) {
        this.cnyTotalPrice = cnyTotalPrice;
    }

    /**
     * 机票总价
     */
    public BigDecimal getCnyFlightPrice() {
        return this.cnyFlightPrice;
    }

    public void setCnyFlightPrice(BigDecimal cnyFlightPrice) {
        this.cnyFlightPrice = cnyFlightPrice;
    }

    /**
     * 税费
     */
    public BigDecimal getCnyTax() {
        return this.cnyTax;
    }

    public void setCnyTax(BigDecimal cnyTax) {
        this.cnyTax = cnyTax;
    }

    /**
     * 燃油费
     */
    public BigDecimal getCnyOil() {
        return this.cnyOil;
    }

    public void setCnyOil(BigDecimal cnyOil) {
        this.cnyOil = cnyOil;
    }

    /**
     * 保险总额
     */
    public BigDecimal getCnyTotalInsuranceFee() {
        return this.cnyTotalInsuranceFee;
    }

    public void setCnyTotalInsuranceFee(BigDecimal cnyTotalInsuranceFee) {
        this.cnyTotalInsuranceFee = cnyTotalInsuranceFee;
    }

    /**
     * 增值行李额总价(CNY)
     */
    public BigDecimal getCnyValueAddedBaggageFee() {
        return this.cnyValueAddedBaggageFee;
    }

    public void setCnyValueAddedBaggageFee(BigDecimal cnyValueAddedBaggageFee) {
        this.cnyValueAddedBaggageFee = cnyValueAddedBaggageFee;
    }

    /**
     * X产品酒店优惠券总价(CNY)
     */
    public BigDecimal getCnyxHotelCouponFee() {
        return this.cnyxHotelCouponFee;
    }

    public void setCnyxHotelCouponFee(BigDecimal cnyxHotelCouponFee) {
        this.cnyxHotelCouponFee = cnyxHotelCouponFee;
    }

    /**
     * 休息室总额
     */
    public BigDecimal getCnyLoungeFee() {
        return this.cnyLoungeFee;
    }

    public void setCnyLoungeFee(BigDecimal cnyLoungeFee) {
        this.cnyLoungeFee = cnyLoungeFee;
    }

    /**
     * 套餐捆绑优惠券总价
     */
    public BigDecimal getCnyTotalPackageAttachAmount() {
        return this.cnyTotalPackageAttachAmount;
    }

    public void setCnyTotalPackageAttachAmount(BigDecimal cnyTotalPackageAttachAmount) {
        this.cnyTotalPackageAttachAmount = cnyTotalPackageAttachAmount;
    }

    /**
     * 外卡手续费
     */
    public BigDecimal getCnycCardFee() {
        return this.cnycCardFee;
    }

    public void setCnycCardFee(BigDecimal cnycCardFee) {
        this.cnycCardFee = cnycCardFee;
    }

    /**
     * 配送费
     */
    public BigDecimal getCnyDeliverFee() {
        return this.cnyDeliverFee;
    }

    public void setCnyDeliverFee(BigDecimal cnyDeliverFee) {
        this.cnyDeliverFee = cnyDeliverFee;
    }

    /**
     * 礼品卡支付费用
     */
    public BigDecimal getCnyCouponAmount() {
        return this.cnyCouponAmount;
    }

    public void setCnyCouponAmount(BigDecimal cnyCouponAmount) {
        this.cnyCouponAmount = cnyCouponAmount;
    }

    /**
     * 飞享金
     */
    public BigDecimal getCnySubsidy() {
        return this.cnySubsidy;
    }

    public void setCnySubsidy(BigDecimal cnySubsidy) {
        this.cnySubsidy = cnySubsidy;
    }

    /**
     * 客户端展示币种类型
     */
    public String getShowCurrencyType() {
        return this.showCurrencyType;
    }

    public void setShowCurrencyType(String showCurrencyType) {
        this.showCurrencyType = showCurrencyType;
    }

    /**
     * 礼品卡
     */
    public BigDecimal getTravelMoney() {
        return this.travelMoney;
    }

    public void setTravelMoney(BigDecimal travelMoney) {
        this.travelMoney = travelMoney;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final DetailPriceInfo other = (DetailPriceInfo)obj;
        return
            Objects.equal(this.totalPrice, other.totalPrice) && 
            Objects.equal(this.flightPrice, other.flightPrice) && 
            Objects.equal(this.tax, other.tax) && 
            Objects.equal(this.oil, other.oil) && 
            Objects.equal(this.totalInsuranceFee, other.totalInsuranceFee) && 
            Objects.equal(this.totalPackageAttachAmount, other.totalPackageAttachAmount) && 
            Objects.equal(this.cCardFee, other.cCardFee) && 
            Objects.equal(this.deliverFee, other.deliverFee) && 
            Objects.equal(this.couponAmount, other.couponAmount) && 
            Objects.equal(this.subsidy, other.subsidy) && 
            Objects.equal(this.insuranceFee, other.insuranceFee) && 
            Objects.equal(this.valueAddedBaggageFee, other.valueAddedBaggageFee) && 
            Objects.equal(this.xHotelCouponProductFee, other.xHotelCouponProductFee) && 
            Objects.equal(this.loungeFee, other.loungeFee) && 
            Objects.equal(this.cnyTotalPrice, other.cnyTotalPrice) && 
            Objects.equal(this.cnyFlightPrice, other.cnyFlightPrice) && 
            Objects.equal(this.cnyTax, other.cnyTax) && 
            Objects.equal(this.cnyOil, other.cnyOil) && 
            Objects.equal(this.cnyTotalInsuranceFee, other.cnyTotalInsuranceFee) && 
            Objects.equal(this.cnyValueAddedBaggageFee, other.cnyValueAddedBaggageFee) && 
            Objects.equal(this.cnyxHotelCouponFee, other.cnyxHotelCouponFee) && 
            Objects.equal(this.cnyLoungeFee, other.cnyLoungeFee) && 
            Objects.equal(this.cnyTotalPackageAttachAmount, other.cnyTotalPackageAttachAmount) && 
            Objects.equal(this.cnycCardFee, other.cnycCardFee) && 
            Objects.equal(this.cnyDeliverFee, other.cnyDeliverFee) && 
            Objects.equal(this.cnyCouponAmount, other.cnyCouponAmount) && 
            Objects.equal(this.cnySubsidy, other.cnySubsidy) && 
            Objects.equal(this.showCurrencyType, other.showCurrencyType) && 
            Objects.equal(this.travelMoney, other.travelMoney);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.totalPrice);
        result = 31 * result + Objects.hashCode(this.flightPrice);
        result = 31 * result + Objects.hashCode(this.tax);
        result = 31 * result + Objects.hashCode(this.oil);
        result = 31 * result + Objects.hashCode(this.totalInsuranceFee);
        result = 31 * result + Objects.hashCode(this.totalPackageAttachAmount);
        result = 31 * result + Objects.hashCode(this.cCardFee);
        result = 31 * result + Objects.hashCode(this.deliverFee);
        result = 31 * result + Objects.hashCode(this.couponAmount);
        result = 31 * result + Objects.hashCode(this.subsidy);
        result = 31 * result + Objects.hashCode(this.insuranceFee);
        result = 31 * result + Objects.hashCode(this.valueAddedBaggageFee);
        result = 31 * result + Objects.hashCode(this.xHotelCouponProductFee);
        result = 31 * result + Objects.hashCode(this.loungeFee);
        result = 31 * result + Objects.hashCode(this.cnyTotalPrice);
        result = 31 * result + Objects.hashCode(this.cnyFlightPrice);
        result = 31 * result + Objects.hashCode(this.cnyTax);
        result = 31 * result + Objects.hashCode(this.cnyOil);
        result = 31 * result + Objects.hashCode(this.cnyTotalInsuranceFee);
        result = 31 * result + Objects.hashCode(this.cnyValueAddedBaggageFee);
        result = 31 * result + Objects.hashCode(this.cnyxHotelCouponFee);
        result = 31 * result + Objects.hashCode(this.cnyLoungeFee);
        result = 31 * result + Objects.hashCode(this.cnyTotalPackageAttachAmount);
        result = 31 * result + Objects.hashCode(this.cnycCardFee);
        result = 31 * result + Objects.hashCode(this.cnyDeliverFee);
        result = 31 * result + Objects.hashCode(this.cnyCouponAmount);
        result = 31 * result + Objects.hashCode(this.cnySubsidy);
        result = 31 * result + Objects.hashCode(this.showCurrencyType);
        result = 31 * result + Objects.hashCode(this.travelMoney);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("totalPrice", totalPrice)
            .add("flightPrice", flightPrice)
            .add("tax", tax)
            .add("oil", oil)
            .add("totalInsuranceFee", totalInsuranceFee)
            .add("totalPackageAttachAmount", totalPackageAttachAmount)
            .add("cCardFee", cCardFee)
            .add("deliverFee", deliverFee)
            .add("couponAmount", couponAmount)
            .add("subsidy", subsidy)
            .add("insuranceFee", insuranceFee)
            .add("valueAddedBaggageFee", valueAddedBaggageFee)
            .add("xHotelCouponProductFee", xHotelCouponProductFee)
            .add("loungeFee", loungeFee)
            .add("cnyTotalPrice", cnyTotalPrice)
            .add("cnyFlightPrice", cnyFlightPrice)
            .add("cnyTax", cnyTax)
            .add("cnyOil", cnyOil)
            .add("cnyTotalInsuranceFee", cnyTotalInsuranceFee)
            .add("cnyValueAddedBaggageFee", cnyValueAddedBaggageFee)
            .add("cnyxHotelCouponFee", cnyxHotelCouponFee)
            .add("cnyLoungeFee", cnyLoungeFee)
            .add("cnyTotalPackageAttachAmount", cnyTotalPackageAttachAmount)
            .add("cnycCardFee", cnycCardFee)
            .add("cnyDeliverFee", cnyDeliverFee)
            .add("cnyCouponAmount", cnyCouponAmount)
            .add("cnySubsidy", cnySubsidy)
            .add("showCurrencyType", showCurrencyType)
            .add("travelMoney", travelMoney)
            .toString();
    }
}