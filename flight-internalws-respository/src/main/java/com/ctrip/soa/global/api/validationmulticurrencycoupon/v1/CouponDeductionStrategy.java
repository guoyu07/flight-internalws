/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.validationmulticurrencycoupon.v1;

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

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponDeductionStrategy", propOrder = {
    "startAmount",
    "deductionType",
    "deductionAmount"
})
@SuppressWarnings("all")
public class CouponDeductionStrategy  {

    private static final long serialVersionUID = 1L;

    public CouponDeductionStrategy(
        BigDecimal startAmount, 
        int deductionType, 
        BigDecimal deductionAmount) {
        this.startAmount = startAmount;
        this.deductionType = deductionType;
        this.deductionAmount = deductionAmount;
    }

    public CouponDeductionStrategy() {
    }

    @FieldDoc("扣减起价金额")
    @JsonProperty("StartAmount")
    @XmlElement(name = "StartAmount")
    private BigDecimal startAmount;

    @FieldDoc("扣减方式")
    @JsonProperty("DeductionType")
    @XmlElement(name = "DeductionType")
    private int deductionType;

    @FieldDoc("扣减金额")
    @JsonProperty("DeductionAmount")
    @XmlElement(name = "DeductionAmount")
    private BigDecimal deductionAmount;

    /**
     * 扣减起价金额
     */
    public BigDecimal getStartAmount() {
        return this.startAmount;
    }

    public void setStartAmount(BigDecimal startAmount) {
        this.startAmount = startAmount;
    }

    /**
     * 扣减方式
     */
    public int getDeductionType() {
        return this.deductionType;
    }

    public void setDeductionType(int deductionType) {
        this.deductionType = deductionType;
    }

    /**
     * 扣减金额
     */
    public BigDecimal getDeductionAmount() {
        return this.deductionAmount;
    }

    public void setDeductionAmount(BigDecimal deductionAmount) {
        this.deductionAmount = deductionAmount;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final CouponDeductionStrategy other = (CouponDeductionStrategy)obj;
        return
            Objects.equal(this.startAmount, other.startAmount) && 
            Objects.equal(this.deductionType, other.deductionType) && 
            Objects.equal(this.deductionAmount, other.deductionAmount);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.startAmount);
        result = 31 * result + Objects.hashCode(this.deductionType);
        result = 31 * result + Objects.hashCode(this.deductionAmount);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("startAmount", startAmount)
            .add("deductionType", deductionType)
            .add("deductionAmount", deductionAmount)
            .toString();
    }
}