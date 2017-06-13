/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.searhflightporduct.v1;

import com.ctrip.soa.global.api.flightcommon.v1.DatetimeSpan;
import com.ctrip.soa.global.api.flightcommon.v1.GaTravelerEligibilityCodeType;
import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 过滤条件
 */
@DtoDoc("过滤条件")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterInfo", propOrder = {
    "transitType",
    "airLine",
    "dPort",
    "aPort",
    "dDateStr",
    "dDateEnd",
    "aDateStr",
    "aDateEnd",
    "dDateSpan",
    "aDateSpan",
    "gaTravelerEligibilityCodeType",
    "allianceList",
    "stopCityList",
    "notNeedCodeShare"
})
@SuppressWarnings("all")
public class FilterInfo  {

    private static final long serialVersionUID = 1L;

    public FilterInfo(
        String transitType, 
        String airLine, 
        String dPort, 
        String aPort, 
        Integer dDateStr, 
        Integer dDateEnd, 
        Integer aDateStr, 
        Integer aDateEnd, 
        List<DatetimeSpan> dDateSpan, 
        List<DatetimeSpan> aDateSpan, 
        GaTravelerEligibilityCodeType gaTravelerEligibilityCodeType, 
        List<String> allianceList, 
        List<String> stopCityList, 
        Boolean notNeedCodeShare) {
        this.transitType = transitType;
        this.airLine = airLine;
        this.dPort = dPort;
        this.aPort = aPort;
        this.dDateStr = dDateStr;
        this.dDateEnd = dDateEnd;
        this.aDateStr = aDateStr;
        this.aDateEnd = aDateEnd;
        this.dDateSpan = dDateSpan;
        this.aDateSpan = aDateSpan;
        this.gaTravelerEligibilityCodeType = gaTravelerEligibilityCodeType;
        this.allianceList = allianceList;
        this.stopCityList = stopCityList;
        this.notNeedCodeShare = notNeedCodeShare;
    }

    public FilterInfo() {
    }

    @FieldDoc("中转类型" +
            "Direct=直飞" +
            "OneStop=一次中转" +
            "Multi=多次中转")
    @JsonProperty("TransitType")
    @XmlElement(name = "TransitType")
    private String transitType;

    @FieldDoc("航司")
    @JsonProperty("AirLine")
    @XmlElement(name = "AirLine")
    private String airLine;

    @FieldDoc("出发机场")
    @JsonProperty("DPort")
    @XmlElement(name = "DPort")
    private String dPort;

    @FieldDoc("到达机场")
    @JsonProperty("APort")
    @XmlElement(name = "APort")
    private String aPort;

    @FieldDoc("出发时间开始")
    @JsonProperty("DDateStr")
    @XmlElement(name = "DDateStr", nillable = true)
    private Integer dDateStr;

    @FieldDoc("出发时间结束")
    @JsonProperty("DDateEnd")
    @XmlElement(name = "DDateEnd", nillable = true)
    private Integer dDateEnd;

    @FieldDoc("到达时间开始")
    @JsonProperty("ADateStr")
    @XmlElement(name = "ADateStr", nillable = true)
    private Integer aDateStr;

    @FieldDoc("到达时间结束")
    @JsonProperty("ADateEnd")
    @XmlElement(name = "ADateEnd", nillable = true)
    private Integer aDateEnd;

    @FieldDoc("出发时间区间")
    @JsonProperty("DDateSpan")
    @XmlElement(name = "DDateSpan")
    private List<DatetimeSpan> dDateSpan;

    @FieldDoc("到达时间区间")
    @JsonProperty("ADateSpan")
    @XmlElement(name = "ADateSpan")
    private List<DatetimeSpan> aDateSpan;

    @FieldDoc("乘客资质")
    @JsonProperty("GaTravelerEligibilityCodeType")
    @XmlElement(name = "GaTravelerEligibilityCodeType", nillable = true)
    private GaTravelerEligibilityCodeType gaTravelerEligibilityCodeType;

    @FieldDoc("航司联盟,传OW,ST,SA三个值，分别代表，OneWorld,SkyTeam,StarAlliance")
    @JsonProperty("AllianceList")
    @XmlElement(name = "AllianceList", nillable = true)
    private List<String> allianceList;

    @FieldDoc("中转城市")
    @JsonProperty("StopCityList")
    @XmlElement(name = "StopCityList", nillable = true)
    private List<String> stopCityList;

    @FieldDoc("是否不需要代码共享航班，默认false")
    @JsonProperty("NotNeedCodeShare")
    @XmlElement(name = "NotNeedCodeShare", nillable = true)
    private Boolean notNeedCodeShare;

    /**
     * 中转类型
     *             Direct=直飞
     *             OneStop=一次中转
     *             Multi=多次中转
     */
    public String getTransitType() {
        return this.transitType;
    }

    public void setTransitType(String transitType) {
        this.transitType = transitType;
    }

    /**
     * 航司
     */
    public String getAirLine() {
        return this.airLine;
    }

    public void setAirLine(String airLine) {
        this.airLine = airLine;
    }

    /**
     * 出发机场
     */
    public String getDPort() {
        return this.dPort;
    }

    public void setDPort(String dPort) {
        this.dPort = dPort;
    }

    /**
     * 到达机场
     */
    public String getAPort() {
        return this.aPort;
    }

    public void setAPort(String aPort) {
        this.aPort = aPort;
    }

    /**
     * 出发时间开始
     */
    public Integer getDDateStr() {
        return this.dDateStr;
    }

    public void setDDateStr(Integer dDateStr) {
        this.dDateStr = dDateStr;
    }

    /**
     * 出发时间结束
     */
    public Integer getDDateEnd() {
        return this.dDateEnd;
    }

    public void setDDateEnd(Integer dDateEnd) {
        this.dDateEnd = dDateEnd;
    }

    /**
     * 到达时间开始
     */
    public Integer getADateStr() {
        return this.aDateStr;
    }

    public void setADateStr(Integer aDateStr) {
        this.aDateStr = aDateStr;
    }

    /**
     * 到达时间结束
     */
    public Integer getADateEnd() {
        return this.aDateEnd;
    }

    public void setADateEnd(Integer aDateEnd) {
        this.aDateEnd = aDateEnd;
    }

    /**
     * 出发时间区间
     */
    public List<DatetimeSpan> getDDateSpan() {
        return this.dDateSpan;
    }

    public void setDDateSpan(List<DatetimeSpan> dDateSpan) {
        this.dDateSpan = dDateSpan;
    }

    /**
     * 到达时间区间
     */
    public List<DatetimeSpan> getADateSpan() {
        return this.aDateSpan;
    }

    public void setADateSpan(List<DatetimeSpan> aDateSpan) {
        this.aDateSpan = aDateSpan;
    }

    /**
     * 乘客资质
     */
    public GaTravelerEligibilityCodeType getGaTravelerEligibilityCodeType() {
        return this.gaTravelerEligibilityCodeType;
    }

    public void setGaTravelerEligibilityCodeType(GaTravelerEligibilityCodeType gaTravelerEligibilityCodeType) {
        this.gaTravelerEligibilityCodeType = gaTravelerEligibilityCodeType;
    }

    /**
     * 航司联盟,传OW,ST,SA三个值，分别代表，OneWorld,SkyTeam,StarAlliance
     */
    public List<String> getAllianceList() {
        return this.allianceList;
    }

    public void setAllianceList(List<String> allianceList) {
        this.allianceList = allianceList;
    }

    /**
     * 中转城市
     */
    public List<String> getStopCityList() {
        return this.stopCityList;
    }

    public void setStopCityList(List<String> stopCityList) {
        this.stopCityList = stopCityList;
    }

    /**
     * 是否不需要代码共享航班，默认false
     */
    public Boolean getNotNeedCodeShare() {
        return this.notNeedCodeShare;
    }

    public void setNotNeedCodeShare(Boolean notNeedCodeShare) {
        this.notNeedCodeShare = notNeedCodeShare;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final FilterInfo other = (FilterInfo)obj;
        return
            Objects.equal(this.transitType, other.transitType) && 
            Objects.equal(this.airLine, other.airLine) && 
            Objects.equal(this.dPort, other.dPort) && 
            Objects.equal(this.aPort, other.aPort) && 
            Objects.equal(this.dDateStr, other.dDateStr) && 
            Objects.equal(this.dDateEnd, other.dDateEnd) && 
            Objects.equal(this.aDateStr, other.aDateStr) && 
            Objects.equal(this.aDateEnd, other.aDateEnd) && 
            Objects.equal(this.dDateSpan, other.dDateSpan) && 
            Objects.equal(this.aDateSpan, other.aDateSpan) && 
            Objects.equal(this.gaTravelerEligibilityCodeType, other.gaTravelerEligibilityCodeType) && 
            Objects.equal(this.allianceList, other.allianceList) && 
            Objects.equal(this.stopCityList, other.stopCityList) && 
            Objects.equal(this.notNeedCodeShare, other.notNeedCodeShare);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.transitType);
        result = 31 * result + Objects.hashCode(this.airLine);
        result = 31 * result + Objects.hashCode(this.dPort);
        result = 31 * result + Objects.hashCode(this.aPort);
        result = 31 * result + Objects.hashCode(this.dDateStr);
        result = 31 * result + Objects.hashCode(this.dDateEnd);
        result = 31 * result + Objects.hashCode(this.aDateStr);
        result = 31 * result + Objects.hashCode(this.aDateEnd);
        result = 31 * result + Objects.hashCode(this.dDateSpan);
        result = 31 * result + Objects.hashCode(this.aDateSpan);
        result = 31 * result + Objects.hashCode(this.gaTravelerEligibilityCodeType);
        result = 31 * result + Objects.hashCode(this.allianceList);
        result = 31 * result + Objects.hashCode(this.stopCityList);
        result = 31 * result + Objects.hashCode(this.notNeedCodeShare);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("transitType", transitType)
            .add("airLine", airLine)
            .add("dPort", dPort)
            .add("aPort", aPort)
            .add("dDateStr", dDateStr)
            .add("dDateEnd", dDateEnd)
            .add("aDateStr", aDateStr)
            .add("aDateEnd", aDateEnd)
            .add("dDateSpan", dDateSpan)
            .add("aDateSpan", aDateSpan)
            .add("gaTravelerEligibilityCodeType", gaTravelerEligibilityCodeType)
            .add("allianceList", allianceList)
            .add("stopCityList", stopCityList)
            .add("notNeedCodeShare", notNeedCodeShare)
            .toString();
    }
}