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
 * 行李额重量信息
 */
@DtoDoc("行李额重量信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageWeightEntity", propOrder = {
    "weightUnits",
    "weightExchangeRate",
    "weight",
    "freeWeight",
    "chargeWeight"
})
@SuppressWarnings("all")
public class BaggageWeightEntity  {

    private static final long serialVersionUID = 1L;

    public BaggageWeightEntity(
        String weightUnits, 
        BigDecimal weightExchangeRate, 
        BigDecimal weight, 
        BigDecimal freeWeight, 
        BigDecimal chargeWeight) {
        this.weightUnits = weightUnits;
        this.weightExchangeRate = weightExchangeRate;
        this.weight = weight;
        this.freeWeight = freeWeight;
        this.chargeWeight = chargeWeight;
    }

    public BaggageWeightEntity() {
    }

    @FieldDoc("重量单位")
    @JsonProperty("WeightUnits")
    @XmlElement(name = "WeightUnits")
    private String weightUnits;

    @FieldDoc("当前重量对kg的转换率(units/kg)")
    @JsonProperty("WeightExchangeRate")
    @XmlElement(name = "WeightExchangeRate")
    private BigDecimal weightExchangeRate;

    @FieldDoc("行李额重量")
    @JsonProperty("Weight")
    @XmlElement(name = "Weight")
    private BigDecimal weight;

    @FieldDoc("免费行李额重量")
    @JsonProperty("FreeWeight")
    @XmlElement(name = "FreeWeight")
    private BigDecimal freeWeight;

    @FieldDoc("收费行李额重量")
    @JsonProperty("ChargeWeight")
    @XmlElement(name = "ChargeWeight")
    private BigDecimal chargeWeight;

    /**
     * 重量单位
     */
    public String getWeightUnits() {
        return this.weightUnits;
    }

    public void setWeightUnits(String weightUnits) {
        this.weightUnits = weightUnits;
    }

    /**
     * 当前重量对kg的转换率(units/kg)
     */
    public BigDecimal getWeightExchangeRate() {
        return this.weightExchangeRate;
    }

    public void setWeightExchangeRate(BigDecimal weightExchangeRate) {
        this.weightExchangeRate = weightExchangeRate;
    }

    /**
     * 行李额重量
     */
    public BigDecimal getWeight() {
        return this.weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * 免费行李额重量
     */
    public BigDecimal getFreeWeight() {
        return this.freeWeight;
    }

    public void setFreeWeight(BigDecimal freeWeight) {
        this.freeWeight = freeWeight;
    }

    /**
     * 收费行李额重量
     */
    public BigDecimal getChargeWeight() {
        return this.chargeWeight;
    }

    public void setChargeWeight(BigDecimal chargeWeight) {
        this.chargeWeight = chargeWeight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final BaggageWeightEntity other = (BaggageWeightEntity)obj;
        return
            Objects.equal(this.weightUnits, other.weightUnits) && 
            Objects.equal(this.weightExchangeRate, other.weightExchangeRate) && 
            Objects.equal(this.weight, other.weight) && 
            Objects.equal(this.freeWeight, other.freeWeight) && 
            Objects.equal(this.chargeWeight, other.chargeWeight);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.weightUnits);
        result = 31 * result + Objects.hashCode(this.weightExchangeRate);
        result = 31 * result + Objects.hashCode(this.weight);
        result = 31 * result + Objects.hashCode(this.freeWeight);
        result = 31 * result + Objects.hashCode(this.chargeWeight);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("weightUnits", weightUnits)
            .add("weightExchangeRate", weightExchangeRate)
            .add("weight", weight)
            .add("freeWeight", freeWeight)
            .add("chargeWeight", chargeWeight)
            .toString();
    }
}