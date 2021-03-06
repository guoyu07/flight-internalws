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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 允许的扣款方式
 */
@DtoDoc("允许的扣款方式")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightRealTimePay", propOrder = {
    "isRealTimePayOn",
    "isPayToCBU"
})
@SuppressWarnings("all")
public class FlightRealTimePay  {

    private static final long serialVersionUID = 1L;

    public FlightRealTimePay(
        int isRealTimePayOn, 
        int isPayToCBU) {
        this.isRealTimePayOn = isRealTimePayOn;
        this.isPayToCBU = isPayToCBU;
    }

    public FlightRealTimePay() {
    }

    @FieldDoc("是否实时支付")
    @JsonProperty("IsRealTimePayOn")
    @XmlElement(name = "IsRealTimePayOn")
    private int isRealTimePayOn;

    @FieldDoc("是否CBU支付")
    @JsonProperty("IsPayToCBU")
    @XmlElement(name = "IsPayToCBU")
    private int isPayToCBU;

    /**
     * 是否实时支付
     */
    public int getIsRealTimePayOn() {
        return this.isRealTimePayOn;
    }

    public void setIsRealTimePayOn(int isRealTimePayOn) {
        this.isRealTimePayOn = isRealTimePayOn;
    }

    /**
     * 是否CBU支付
     */
    public int getIsPayToCBU() {
        return this.isPayToCBU;
    }

    public void setIsPayToCBU(int isPayToCBU) {
        this.isPayToCBU = isPayToCBU;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final FlightRealTimePay other = (FlightRealTimePay)obj;
        return
            Objects.equal(this.isRealTimePayOn, other.isRealTimePayOn) && 
            Objects.equal(this.isPayToCBU, other.isPayToCBU);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.isRealTimePayOn);
        result = 31 * result + Objects.hashCode(this.isPayToCBU);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("isRealTimePayOn", isRealTimePayOn)
            .add("isPayToCBU", isPayToCBU)
            .toString();
    }
}