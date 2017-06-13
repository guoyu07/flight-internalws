/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.flightcommon.v1;

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

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponDescriptionInfo", propOrder = {
    "shortDesc",
    "longDesc"
})
@SuppressWarnings("all")
public class CouponDescriptionInfo  {

    private static final long serialVersionUID = 1L;

    public CouponDescriptionInfo(
        String shortDesc, 
        String longDesc) {
        this.shortDesc = shortDesc;
        this.longDesc = longDesc;
    }

    public CouponDescriptionInfo() {
    }

    @FieldDoc("短描述")
    @JsonProperty("ShortDesc")
    @XmlElement(name = "ShortDesc")
    private String shortDesc;

    @FieldDoc("详细描述")
    @JsonProperty("LongDesc")
    @XmlElement(name = "LongDesc")
    private String longDesc;

    /**
     * 短描述
     */
    public String getShortDesc() {
        return this.shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    /**
     * 详细描述
     */
    public String getLongDesc() {
        return this.longDesc;
    }

    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final CouponDescriptionInfo other = (CouponDescriptionInfo)obj;
        return
            Objects.equal(this.shortDesc, other.shortDesc) && 
            Objects.equal(this.longDesc, other.longDesc);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.shortDesc);
        result = 31 * result + Objects.hashCode(this.longDesc);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("shortDesc", shortDesc)
            .add("longDesc", longDesc)
            .toString();
    }
}