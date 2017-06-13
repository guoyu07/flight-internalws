/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.gacreateflightorder.v1;

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
@XmlType(name = "AllianceInfo", propOrder = {
    "allianceID",
    "sid",
    "ouID"
})
@SuppressWarnings("all")
public class AllianceInfo  {

    private static final long serialVersionUID = 1L;

    public AllianceInfo(
        int allianceID, 
        int sid, 
        String ouID) {
        this.allianceID = allianceID;
        this.sid = sid;
        this.ouID = ouID;
    }

    public AllianceInfo() {
    }

    @JsonProperty("AllianceID")
    @XmlElement(name = "AllianceID")
    private int allianceID;

    @JsonProperty("SID")
    @XmlElement(name = "SID")
    private int sid;

    @JsonProperty("OuID")
    @XmlElement(name = "OuID")
    private String ouID;

    public int getAllianceID() {
        return this.allianceID;
    }

    public void setAllianceID(int allianceID) {
        this.allianceID = allianceID;
    }

    public int getSid() {
        return this.sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getOuID() {
        return this.ouID;
    }

    public void setOuID(String ouID) {
        this.ouID = ouID;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final AllianceInfo other = (AllianceInfo)obj;
        return
            Objects.equal(this.allianceID, other.allianceID) && 
            Objects.equal(this.sid, other.sid) && 
            Objects.equal(this.ouID, other.ouID);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.allianceID);
        result = 31 * result + Objects.hashCode(this.sid);
        result = 31 * result + Objects.hashCode(this.ouID);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("allianceID", allianceID)
            .add("sid", sid)
            .add("ouID", ouID)
            .toString();
    }
}