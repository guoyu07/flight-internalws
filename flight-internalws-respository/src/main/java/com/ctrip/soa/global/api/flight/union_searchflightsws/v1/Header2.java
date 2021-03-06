/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.flight.union_searchflightsws.v1;

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
@XmlType(name = "Header2", propOrder = {
    "shouldRecordPerformanceTime",
    "referenceID",
    "resultCode"
})
@SuppressWarnings("all")
public class Header2  {

    private static final long serialVersionUID = 1L;

    public Header2(
        boolean shouldRecordPerformanceTime, 
        String referenceID, 
        String resultCode) {
        this.shouldRecordPerformanceTime = shouldRecordPerformanceTime;
        this.referenceID = referenceID;
        this.resultCode = resultCode;
    }

    public Header2() {
    }

    @JsonProperty("ShouldRecordPerformanceTime")
    @XmlElement(name = "ShouldRecordPerformanceTime")
    private boolean shouldRecordPerformanceTime;

    @JsonProperty("ReferenceID")
    @XmlElement(name = "ReferenceID")
    private String referenceID;

    @JsonProperty("ResultCode")
    @XmlElement(name = "ResultCode")
    private String resultCode;

    public boolean getShouldRecordPerformanceTime() {
        return this.shouldRecordPerformanceTime;
    }

    public void setShouldRecordPerformanceTime(boolean shouldRecordPerformanceTime) {
        this.shouldRecordPerformanceTime = shouldRecordPerformanceTime;
    }

    public String getReferenceID() {
        return this.referenceID;
    }

    public void setReferenceID(String referenceID) {
        this.referenceID = referenceID;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final Header2 other = (Header2)obj;
        return
            Objects.equal(this.shouldRecordPerformanceTime, other.shouldRecordPerformanceTime) && 
            Objects.equal(this.referenceID, other.referenceID) && 
            Objects.equal(this.resultCode, other.resultCode);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.shouldRecordPerformanceTime);
        result = 31 * result + Objects.hashCode(this.referenceID);
        result = 31 * result + Objects.hashCode(this.resultCode);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("shouldRecordPerformanceTime", shouldRecordPerformanceTime)
            .add("referenceID", referenceID)
            .add("resultCode", resultCode)
            .toString();
    }
}