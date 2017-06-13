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
@XmlType(name = "FlightCreditCard", propOrder = {
    "creditcardEName",
    "creditcardname",
    "creditcardtype"
})
@SuppressWarnings("all")
public class FlightCreditCard  {

    private static final long serialVersionUID = 1L;

    public FlightCreditCard(
        String creditcardEName, 
        String creditcardname, 
        int creditcardtype) {
        this.creditcardEName = creditcardEName;
        this.creditcardname = creditcardname;
        this.creditcardtype = creditcardtype;
    }

    public FlightCreditCard() {
    }

    @FieldDoc("信用卡英文名称")
    @JsonProperty("CreditcardEName")
    @XmlElement(name = "CreditcardEName")
    private String creditcardEName;

    @FieldDoc("信用卡中文名称")
    @JsonProperty("Creditcardname")
    @XmlElement(name = "Creditcardname")
    private String creditcardname;

    @FieldDoc("信用卡类型：6-Master,7-Visa,8-Amex,10-JCB,14-China Union Pay,88881-Paypal,88882-INICIS,88883-Paypal One Touch")
    @JsonProperty("Creditcardtype")
    @XmlElement(name = "Creditcardtype")
    private int creditcardtype;

    /**
     * 信用卡英文名称
     */
    public String getCreditcardEName() {
        return this.creditcardEName;
    }

    public void setCreditcardEName(String creditcardEName) {
        this.creditcardEName = creditcardEName;
    }

    /**
     * 信用卡中文名称
     */
    public String getCreditcardname() {
        return this.creditcardname;
    }

    public void setCreditcardname(String creditcardname) {
        this.creditcardname = creditcardname;
    }

    /**
     * 信用卡类型：6-Master,7-Visa,8-Amex,10-JCB,14-China Union Pay,88881-Paypal,88882-INICIS,88883-Paypal One Touch
     */
    public int getCreditcardtype() {
        return this.creditcardtype;
    }

    public void setCreditcardtype(int creditcardtype) {
        this.creditcardtype = creditcardtype;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final FlightCreditCard other = (FlightCreditCard)obj;
        return
            Objects.equal(this.creditcardEName, other.creditcardEName) && 
            Objects.equal(this.creditcardname, other.creditcardname) && 
            Objects.equal(this.creditcardtype, other.creditcardtype);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.creditcardEName);
        result = 31 * result + Objects.hashCode(this.creditcardname);
        result = 31 * result + Objects.hashCode(this.creditcardtype);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("creditcardEName", creditcardEName)
            .add("creditcardname", creditcardname)
            .add("creditcardtype", creditcardtype)
            .toString();
    }
}