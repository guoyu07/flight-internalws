/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.flightcommon.v1;

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
 * 多币种支付信息
 */
@DtoDoc("多币种支付信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeInfo", propOrder = {
    "exchangeCurrency",
    "exchangeTotalPrice",
    "exchangeRate",
    "exchangeFltPrice",
    "exchangeTax",
    "exchangeOil",
    "flightCarryRule",
    "decimalCount",
    "canUsePayIconType"
})
@SuppressWarnings("all")
public class ExchangeInfo  {

    private static final long serialVersionUID = 1L;

    public ExchangeInfo(
        String exchangeCurrency, 
        BigDecimal exchangeTotalPrice, 
        BigDecimal exchangeRate, 
        BigDecimal exchangeFltPrice, 
        BigDecimal exchangeTax, 
        BigDecimal exchangeOil, 
        FlightCarryRule flightCarryRule, 
        int decimalCount, 
        List<Integer> canUsePayIconType) {
        this.exchangeCurrency = exchangeCurrency;
        this.exchangeTotalPrice = exchangeTotalPrice;
        this.exchangeRate = exchangeRate;
        this.exchangeFltPrice = exchangeFltPrice;
        this.exchangeTax = exchangeTax;
        this.exchangeOil = exchangeOil;
        this.flightCarryRule = flightCarryRule;
        this.decimalCount = decimalCount;
        this.canUsePayIconType = canUsePayIconType;
    }

    public ExchangeInfo() {
    }

    @FieldDoc("当前查询语言币种")
    @JsonProperty("ExchangeCurrency")
    @XmlElement(name = "ExchangeCurrency")
    private String exchangeCurrency;

    @FieldDoc("当前查询语言币种机票总价")
    @JsonProperty("ExchangeTotalPrice")
    @XmlElement(name = "ExchangeTotalPrice")
    private BigDecimal exchangeTotalPrice;

    @FieldDoc("当前查询语言币种对人民币汇率")
    @JsonProperty("ExchangeRate")
    @XmlElement(name = "ExchangeRate")
    private BigDecimal exchangeRate;

    @FieldDoc("当前查询语言币种机票单价")
    @JsonProperty("ExchangeFltPrice")
    @XmlElement(name = "ExchangeFltPrice")
    private BigDecimal exchangeFltPrice;

    @FieldDoc("当前查询语言币种机票税费")
    @JsonProperty("ExchangeTax")
    @XmlElement(name = "ExchangeTax")
    private BigDecimal exchangeTax;

    @FieldDoc("当前查询语言币种机票燃油费")
    @JsonProperty("ExchangeOil")
    @XmlElement(name = "ExchangeOil")
    private BigDecimal exchangeOil;

    @FieldDoc("机票金额计算 换算规则")
    @JsonProperty("FlightCarryRule")
    @XmlElement(name = "FlightCarryRule")
    private FlightCarryRule flightCarryRule;

    @FieldDoc("保留小数点位数")
    @JsonProperty("DecimalCount")
    @XmlElement(name = "DecimalCount")
    private int decimalCount;

    @FieldDoc("可支付类型：1-Visa,2-Master,3-JCB,4-Amex,5-China Union Pay,6-Paypal,7-Paypal One Touch,8-INICIS")
    @JsonProperty("CanUsePayIconType")
    @XmlElement(name = "CanUsePayIconType")
    private List<Integer> canUsePayIconType;

    /**
     * 当前查询语言币种
     */
    public String getExchangeCurrency() {
        return this.exchangeCurrency;
    }

    public void setExchangeCurrency(String exchangeCurrency) {
        this.exchangeCurrency = exchangeCurrency;
    }

    /**
     * 当前查询语言币种机票总价
     */
    public BigDecimal getExchangeTotalPrice() {
        return this.exchangeTotalPrice;
    }

    public void setExchangeTotalPrice(BigDecimal exchangeTotalPrice) {
        this.exchangeTotalPrice = exchangeTotalPrice;
    }

    /**
     * 当前查询语言币种对人民币汇率
     */
    public BigDecimal getExchangeRate() {
        return this.exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    /**
     * 当前查询语言币种机票单价
     */
    public BigDecimal getExchangeFltPrice() {
        return this.exchangeFltPrice;
    }

    public void setExchangeFltPrice(BigDecimal exchangeFltPrice) {
        this.exchangeFltPrice = exchangeFltPrice;
    }

    /**
     * 当前查询语言币种机票税费
     */
    public BigDecimal getExchangeTax() {
        return this.exchangeTax;
    }

    public void setExchangeTax(BigDecimal exchangeTax) {
        this.exchangeTax = exchangeTax;
    }

    /**
     * 当前查询语言币种机票燃油费
     */
    public BigDecimal getExchangeOil() {
        return this.exchangeOil;
    }

    public void setExchangeOil(BigDecimal exchangeOil) {
        this.exchangeOil = exchangeOil;
    }

    /**
     * 机票金额计算 换算规则
     */
    public FlightCarryRule getFlightCarryRule() {
        return this.flightCarryRule;
    }

    public void setFlightCarryRule(FlightCarryRule flightCarryRule) {
        this.flightCarryRule = flightCarryRule;
    }

    /**
     * 保留小数点位数
     */
    public int getDecimalCount() {
        return this.decimalCount;
    }

    public void setDecimalCount(int decimalCount) {
        this.decimalCount = decimalCount;
    }

    /**
     * 可支付类型：1-Visa,2-Master,3-JCB,4-Amex,5-China Union Pay,6-Paypal,7-Paypal One Touch,8-INICIS
     */
    public List<Integer> getCanUsePayIconType() {
        return this.canUsePayIconType;
    }

    public void setCanUsePayIconType(List<Integer> canUsePayIconType) {
        this.canUsePayIconType = canUsePayIconType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final ExchangeInfo other = (ExchangeInfo)obj;
        return
            Objects.equal(this.exchangeCurrency, other.exchangeCurrency) && 
            Objects.equal(this.exchangeTotalPrice, other.exchangeTotalPrice) && 
            Objects.equal(this.exchangeRate, other.exchangeRate) && 
            Objects.equal(this.exchangeFltPrice, other.exchangeFltPrice) && 
            Objects.equal(this.exchangeTax, other.exchangeTax) && 
            Objects.equal(this.exchangeOil, other.exchangeOil) && 
            Objects.equal(this.flightCarryRule, other.flightCarryRule) && 
            Objects.equal(this.decimalCount, other.decimalCount) && 
            Objects.equal(this.canUsePayIconType, other.canUsePayIconType);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.exchangeCurrency);
        result = 31 * result + Objects.hashCode(this.exchangeTotalPrice);
        result = 31 * result + Objects.hashCode(this.exchangeRate);
        result = 31 * result + Objects.hashCode(this.exchangeFltPrice);
        result = 31 * result + Objects.hashCode(this.exchangeTax);
        result = 31 * result + Objects.hashCode(this.exchangeOil);
        result = 31 * result + Objects.hashCode(this.flightCarryRule);
        result = 31 * result + Objects.hashCode(this.decimalCount);
        result = 31 * result + Objects.hashCode(this.canUsePayIconType);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("exchangeCurrency", exchangeCurrency)
            .add("exchangeTotalPrice", exchangeTotalPrice)
            .add("exchangeRate", exchangeRate)
            .add("exchangeFltPrice", exchangeFltPrice)
            .add("exchangeTax", exchangeTax)
            .add("exchangeOil", exchangeOil)
            .add("flightCarryRule", flightCarryRule)
            .add("decimalCount", decimalCount)
            .add("canUsePayIconType", canUsePayIconType)
            .toString();
    }
}