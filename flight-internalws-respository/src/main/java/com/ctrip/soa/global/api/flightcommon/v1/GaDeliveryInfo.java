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
 * 配送地址实体信息
 */
@DtoDoc("配送地址实体信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GaDeliveryInfo", propOrder = {
    "deliveryType",
    "thirdPartyDeliveryInfo",
    "customerPickup",
    "flightAgency"
})
@SuppressWarnings("all")
public class GaDeliveryInfo  {

    private static final long serialVersionUID = 1L;

    public GaDeliveryInfo(
        GaDeliveryType deliveryType, 
        ThirdPartyDeliveryInfo thirdPartyDeliveryInfo, 
        CustomerPickup customerPickup, 
        int flightAgency) {
        this.deliveryType = deliveryType;
        this.thirdPartyDeliveryInfo = thirdPartyDeliveryInfo;
        this.customerPickup = customerPickup;
        this.flightAgency = flightAgency;
    }

    public GaDeliveryInfo() {
    }

    @FieldDoc("配送类型")
    @JsonProperty("DeliveryType")
    @XmlElement(name = "DeliveryType")
    private GaDeliveryType deliveryType;

    @FieldDoc("邮寄行程单")
    @JsonProperty("ThirdPartyDeliveryInfo")
    @XmlElement(name = "ThirdPartyDeliveryInfo")
    private ThirdPartyDeliveryInfo thirdPartyDeliveryInfo;

    @FieldDoc("机场自取")
    @JsonProperty("CustomerPickup")
    @XmlElement(name = "CustomerPickup")
    private CustomerPickup customerPickup;

    @FieldDoc("票台")
    @JsonProperty("FlightAgency")
    @XmlElement(name = "FlightAgency")
    private int flightAgency;

    /**
     * 配送类型
     */
    public GaDeliveryType getDeliveryType() {
        return this.deliveryType;
    }

    public void setDeliveryType(GaDeliveryType deliveryType) {
        this.deliveryType = deliveryType;
    }

    /**
     * 邮寄行程单
     */
    public ThirdPartyDeliveryInfo getThirdPartyDeliveryInfo() {
        return this.thirdPartyDeliveryInfo;
    }

    public void setThirdPartyDeliveryInfo(ThirdPartyDeliveryInfo thirdPartyDeliveryInfo) {
        this.thirdPartyDeliveryInfo = thirdPartyDeliveryInfo;
    }

    /**
     * 机场自取
     */
    public CustomerPickup getCustomerPickup() {
        return this.customerPickup;
    }

    public void setCustomerPickup(CustomerPickup customerPickup) {
        this.customerPickup = customerPickup;
    }

    /**
     * 票台
     */
    public int getFlightAgency() {
        return this.flightAgency;
    }

    public void setFlightAgency(int flightAgency) {
        this.flightAgency = flightAgency;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaDeliveryInfo other = (GaDeliveryInfo)obj;
        return
            Objects.equal(this.deliveryType, other.deliveryType) && 
            Objects.equal(this.thirdPartyDeliveryInfo, other.thirdPartyDeliveryInfo) && 
            Objects.equal(this.customerPickup, other.customerPickup) && 
            Objects.equal(this.flightAgency, other.flightAgency);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.deliveryType);
        result = 31 * result + Objects.hashCode(this.thirdPartyDeliveryInfo);
        result = 31 * result + Objects.hashCode(this.customerPickup);
        result = 31 * result + Objects.hashCode(this.flightAgency);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("deliveryType", deliveryType)
            .add("thirdPartyDeliveryInfo", thirdPartyDeliveryInfo)
            .add("customerPickup", customerPickup)
            .add("flightAgency", flightAgency)
            .toString();
    }
}