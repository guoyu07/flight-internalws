/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.getflightintlfareremark.v1;

import com.ctrip.soa.global.api.comm.head.v1.Head;
import com.ctrip.soa.global.api.flightcommon.v1.FlightSearchInfo;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 国际机票退改签查询
 */
@DtoDoc("国际机票退改签查询")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaPenaltyQueryRequest", namespace = "http://soa.ctrip.com/Global/API/GetFlightIntlFareRemark/v1")
@XmlType(name = "GaGetFlightIntlFareRemarkRequest", propOrder = {
    "head",
    "trackCode",
    "engineType",
    "remarkToken",
    "flightSearchInfo",
    "domesticRemarkInfo"
})
@SuppressWarnings("all")
public class GaGetFlightIntlFareRemarkRequest  {

    private static final long serialVersionUID = 1L;

    public GaGetFlightIntlFareRemarkRequest(
        Head head, 
        String trackCode, 
        String engineType, 
        String remarkToken, 
        FlightSearchInfo flightSearchInfo, 
        String domesticRemarkInfo) {
        this.head = head;
        this.trackCode = trackCode;
        this.engineType = engineType;
        this.remarkToken = remarkToken;
        this.flightSearchInfo = flightSearchInfo;
        this.domesticRemarkInfo = domesticRemarkInfo;
    }

    public GaGetFlightIntlFareRemarkRequest() {
    }

    @FieldDoc("SOA2.0请求头部信息")
    @JsonProperty("Head")
    @XmlElement(name = "Head")
    private Head head;

    @FieldDoc("TrackCode唯一标识")
    @JsonProperty("TrackCode")
    @XmlElement(name = "TrackCode")
    private String trackCode;

    @FieldDoc("需要查询的引擎类型")
    @JsonProperty("EngineType")
    @XmlElement(name = "EngineType")
    private String engineType;

    @FieldDoc("Token")
    @JsonProperty("RemarkToken")
    @XmlElement(name = "RemarkToken")
    private String remarkToken;

    @FieldDoc("查询、反查关键信息")
    @JsonProperty("FlightSearchInfo")
    @XmlElement(name = "FlightSearchInfo")
    private FlightSearchInfo flightSearchInfo;

    @FieldDoc("国内退改签关键字段")
    @JsonProperty("DomesticRemarkInfo")
    @XmlElement(name = "DomesticRemarkInfo")
    private String domesticRemarkInfo;

    /**
     * SOA2.0请求头部信息
     */
    public Head getHead() {
        return this.head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    /**
     * TrackCode唯一标识
     */
    public String getTrackCode() {
        return this.trackCode;
    }

    public void setTrackCode(String trackCode) {
        this.trackCode = trackCode;
    }

    /**
     * 需要查询的引擎类型
     */
    public String getEngineType() {
        return this.engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * Token
     */
    public String getRemarkToken() {
        return this.remarkToken;
    }

    public void setRemarkToken(String remarkToken) {
        this.remarkToken = remarkToken;
    }

    /**
     * 查询、反查关键信息
     */
    public FlightSearchInfo getFlightSearchInfo() {
        return this.flightSearchInfo;
    }

    public void setFlightSearchInfo(FlightSearchInfo flightSearchInfo) {
        this.flightSearchInfo = flightSearchInfo;
    }

    /**
     * 国内退改签关键字段
     */
    public String getDomesticRemarkInfo() {
        return this.domesticRemarkInfo;
    }

    public void setDomesticRemarkInfo(String domesticRemarkInfo) {
        this.domesticRemarkInfo = domesticRemarkInfo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaGetFlightIntlFareRemarkRequest other = (GaGetFlightIntlFareRemarkRequest)obj;
        return
            Objects.equal(this.head, other.head) && 
            Objects.equal(this.trackCode, other.trackCode) && 
            Objects.equal(this.engineType, other.engineType) && 
            Objects.equal(this.remarkToken, other.remarkToken) && 
            Objects.equal(this.flightSearchInfo, other.flightSearchInfo) && 
            Objects.equal(this.domesticRemarkInfo, other.domesticRemarkInfo);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.head);
        result = 31 * result + Objects.hashCode(this.trackCode);
        result = 31 * result + Objects.hashCode(this.engineType);
        result = 31 * result + Objects.hashCode(this.remarkToken);
        result = 31 * result + Objects.hashCode(this.flightSearchInfo);
        result = 31 * result + Objects.hashCode(this.domesticRemarkInfo);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("head", head)
            .add("trackCode", trackCode)
            .add("engineType", engineType)
            .add("remarkToken", remarkToken)
            .add("flightSearchInfo", flightSearchInfo)
            .add("domesticRemarkInfo", domesticRemarkInfo)
            .toString();
    }
}