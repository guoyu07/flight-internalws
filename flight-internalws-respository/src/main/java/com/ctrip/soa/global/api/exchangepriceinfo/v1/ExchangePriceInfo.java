/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.exchangepriceinfo.v1;

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
@XmlType(name = "ExchangePriceInfo", propOrder = {
    "priceType",
    "sourceAmount",
    "targetAmount",
    "targetCurrencyShow"
})
@SuppressWarnings("all")
public class ExchangePriceInfo  {

    private static final long serialVersionUID = 1L;

    public ExchangePriceInfo(
        ExchangePriceInfoType priceType, 
        BigDecimal sourceAmount, 
        BigDecimal targetAmount, 
        String targetCurrencyShow) {
        this.priceType = priceType;
        this.sourceAmount = sourceAmount;
        this.targetAmount = targetAmount;
        this.targetCurrencyShow = targetCurrencyShow;
    }

    public ExchangePriceInfo() {
    }

    @FieldDoc("价格种类,默认为none,如果是CCardFee,那计算是方法就不一样")
    @JsonProperty("PriceType")
    @XmlElement(name = "PriceType")
    private ExchangePriceInfoType priceType;

    @FieldDoc("原币种价格,request必传")
    @JsonProperty("SourceAmount")
    @XmlElement(name = "SourceAmount")
    private BigDecimal sourceAmount;

    @FieldDoc("目标币种价格")
    @JsonProperty("TargetAmount")
    @XmlElement(name = "TargetAmount")
    private BigDecimal targetAmount;

    @FieldDoc("目标币种显示string,如$123,123")
    @JsonProperty("TargetCurrencyShow")
    @XmlElement(name = "TargetCurrencyShow")
    private String targetCurrencyShow;

    /**
     * 价格种类,默认为none,如果是CCardFee,那计算是方法就不一样
     */
    public ExchangePriceInfoType getPriceType() {
        return this.priceType;
    }

    public void setPriceType(ExchangePriceInfoType priceType) {
        this.priceType = priceType;
    }

    /**
     * 原币种价格,request必传
     */
    public BigDecimal getSourceAmount() {
        return this.sourceAmount;
    }

    public void setSourceAmount(BigDecimal sourceAmount) {
        this.sourceAmount = sourceAmount;
    }

    /**
     * 目标币种价格
     */
    public BigDecimal getTargetAmount() {
        return this.targetAmount;
    }

    public void setTargetAmount(BigDecimal targetAmount) {
        this.targetAmount = targetAmount;
    }

    /**
     * 目标币种显示string,如$123,123
     */
    public String getTargetCurrencyShow() {
        return this.targetCurrencyShow;
    }

    public void setTargetCurrencyShow(String targetCurrencyShow) {
        this.targetCurrencyShow = targetCurrencyShow;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final ExchangePriceInfo other = (ExchangePriceInfo)obj;
        return
            Objects.equal(this.priceType, other.priceType) && 
            Objects.equal(this.sourceAmount, other.sourceAmount) && 
            Objects.equal(this.targetAmount, other.targetAmount) && 
            Objects.equal(this.targetCurrencyShow, other.targetCurrencyShow);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.priceType);
        result = 31 * result + Objects.hashCode(this.sourceAmount);
        result = 31 * result + Objects.hashCode(this.targetAmount);
        result = 31 * result + Objects.hashCode(this.targetCurrencyShow);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("priceType", priceType)
            .add("sourceAmount", sourceAmount)
            .add("targetAmount", targetAmount)
            .add("targetCurrencyShow", targetCurrencyShow)
            .toString();
    }
}