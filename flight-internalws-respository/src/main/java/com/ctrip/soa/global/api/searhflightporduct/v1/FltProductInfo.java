/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.searhflightporduct.v1;

import com.ctrip.soa.global.api.flightcommon.v1.AirLineInfo;
import com.ctrip.soa.global.api.flightcommon.v1.CityInfo;
import com.ctrip.soa.global.api.flightcommon.v1.ColunmInfo;
import com.ctrip.soa.global.api.flightcommon.v1.FlightStopInfo;
import com.ctrip.soa.global.api.flightcommon.v1.KeyValueInfos;
import com.ctrip.soa.global.api.flightcommon.v1.PolicyPirceInfo;
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
 * 航线产品信息
 */
@DtoDoc("航线产品信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FltProductInfo", propOrder = {
    "partitionedToken",
    "nextGroupKey",
    "arrivalDays",
    "laveTicket",
    "dCity",
    "aCity",
    "dDate",
    "aDate",
    "duration",
    "durationStr",
    "hour",
    "min",
    "colunmInfoList",
    "partialColunmInfoList",
    "policyInfo",
    "fltClassLabel",
    "ticketDescription",
    "stopCityInfoList",
    "codeShareInfoList",
    "productExtensionFlag",
    "origDestSeqID",
    "productID",
    "verifyTokenNumber",
    "flightNotices"
})
@SuppressWarnings("all")
public class FltProductInfo  {

    private static final long serialVersionUID = 1L;

    public FltProductInfo(
        String partitionedToken, 
        String nextGroupKey, 
        int arrivalDays, 
        int laveTicket, 
        CityInfo dCity, 
        CityInfo aCity, 
        long dDate, 
        long aDate, 
        int duration, 
        String durationStr, 
        int hour, 
        int min, 
        List<ColunmInfo> colunmInfoList, 
        List<ColunmInfo> partialColunmInfoList, 
        List<PolicyPirceInfo> policyInfo, 
        String fltClassLabel, 
        String ticketDescription, 
        List<FlightStopInfo> stopCityInfoList, 
        List<AirLineInfo> codeShareInfoList, 
        int productExtensionFlag, 
        int origDestSeqID, 
        String productID, 
        String verifyTokenNumber, 
        List<KeyValueInfos> flightNotices) {
        this.partitionedToken = partitionedToken;
        this.nextGroupKey = nextGroupKey;
        this.arrivalDays = arrivalDays;
        this.laveTicket = laveTicket;
        this.dCity = dCity;
        this.aCity = aCity;
        this.dDate = dDate;
        this.aDate = aDate;
        this.duration = duration;
        this.durationStr = durationStr;
        this.hour = hour;
        this.min = min;
        this.colunmInfoList = colunmInfoList;
        this.partialColunmInfoList = partialColunmInfoList;
        this.policyInfo = policyInfo;
        this.fltClassLabel = fltClassLabel;
        this.ticketDescription = ticketDescription;
        this.stopCityInfoList = stopCityInfoList;
        this.codeShareInfoList = codeShareInfoList;
        this.productExtensionFlag = productExtensionFlag;
        this.origDestSeqID = origDestSeqID;
        this.productID = productID;
        this.verifyTokenNumber = verifyTokenNumber;
        this.flightNotices = flightNotices;
    }

    public FltProductInfo() {
    }

    @FieldDoc("该Group所属批次号，空=第一批次")
    @JsonProperty("PartitionedToken")
    @XmlElement(name = "PartitionedToken")
    private String partitionedToken;

    @FieldDoc("航班号所组成的Key")
    @JsonProperty("NextGroupKey")
    @XmlElement(name = "NextGroupKey")
    private String nextGroupKey;

    @FieldDoc("航班跨天数")
    @JsonProperty("ArrivalDays")
    @XmlElement(name = "ArrivalDays")
    private int arrivalDays;

    @FieldDoc("剩余票量")
    @JsonProperty("LaveTicket")
    @XmlElement(name = "LaveTicket")
    private int laveTicket;

    @FieldDoc("出发城市")
    @JsonProperty("DCity")
    @XmlElement(name = "DCity")
    private CityInfo dCity;

    @FieldDoc("到达城市")
    @JsonProperty("ACity")
    @XmlElement(name = "ACity")
    private CityInfo aCity;

    @FieldDoc("出发时间")
    @JsonProperty("DDate")
    @XmlElement(name = "DDate")
    private long dDate;

    @FieldDoc("到达时间")
    @JsonProperty("ADate")
    @XmlElement(name = "ADate")
    private long aDate;

    @FieldDoc("飞行总时间/分钟")
    @JsonProperty("Duration")
    @XmlElement(name = "Duration")
    private int duration;

    @FieldDoc("飞行时间字符串 2h3m")
    @JsonProperty("DurationStr")
    @XmlElement(name = "DurationStr")
    private String durationStr;

    @FieldDoc("飞行小时/总时间换算")
    @JsonProperty("Hour")
    @XmlElement(name = "Hour")
    private int hour;

    @FieldDoc("飞行除去小时后剩余分钟数")
    @JsonProperty("Min")
    @XmlElement(name = "Min")
    private int min;

    @FieldDoc("航段信息")
    @JsonProperty("ColunmInfoList")
    @XmlElement(name = "ColunmInfoList")
    private List<ColunmInfo> colunmInfoList;

    @FieldDoc("国际弃程")
    @JsonProperty("PartialColunmInfoList")
    @XmlElement(name = "PartialColunmInfoList")
    private List<ColunmInfo> partialColunmInfoList;

    @FieldDoc("运价、政策信息")
    @JsonProperty("PolicyInfo")
    @XmlElement(name = "PolicyInfo")
    private List<PolicyPirceInfo> policyInfo;

    @FieldDoc("该航班下所有运价中所包含的主舱位等级 以“,”分隔")
    @JsonProperty("FltClassLabel")
    @XmlElement(name = "FltClassLabel")
    private String fltClassLabel;

    @FieldDoc("票量描述")
    @JsonProperty("TicketDescription")
    @XmlElement(name = "TicketDescription")
    private String ticketDescription;

    @FieldDoc("中转城市列表")
    @JsonProperty("StopCityInfoList")
    @XmlElement(name = "StopCityInfoList")
    private List<FlightStopInfo> stopCityInfoList;

    @FieldDoc("代码共享航班列表")
    @JsonProperty("CodeShareInfoList")
    @XmlElement(name = "CodeShareInfoList")
    private List<AirLineInfo> codeShareInfoList;

    @FieldDoc("相应码，第1位全部是代码共享")
    @JsonProperty("ProductExtensionFlag")
    @XmlElement(name = "ProductExtensionFlag")
    private int productExtensionFlag;

    @FieldDoc("航线序号")
    @JsonProperty("OrigDestSeqID")
    @XmlElement(name = "OrigDestSeqID")
    private int origDestSeqID;

    @FieldDoc("定位航线唯一键")
    @JsonProperty("ProductID")
    @XmlElement(name = "ProductID")
    private String productID;

    @FieldDoc("验舱验价的key值")
    @JsonProperty("VerifyTokenNumber")
    @XmlElement(name = "VerifyTokenNumber")
    private String verifyTokenNumber;

    @FieldDoc("提醒信息(5.1版本添加)")
    @JsonProperty("FlightNotices")
    @XmlElement(name = "FlightNotices")
    private List<KeyValueInfos> flightNotices;

    /**
     * 该Group所属批次号，空=第一批次
     */
    public String getPartitionedToken() {
        return this.partitionedToken;
    }

    public void setPartitionedToken(String partitionedToken) {
        this.partitionedToken = partitionedToken;
    }

    /**
     * 航班号所组成的Key
     */
    public String getNextGroupKey() {
        return this.nextGroupKey;
    }

    public void setNextGroupKey(String nextGroupKey) {
        this.nextGroupKey = nextGroupKey;
    }

    /**
     * 航班跨天数
     */
    public int getArrivalDays() {
        return this.arrivalDays;
    }

    public void setArrivalDays(int arrivalDays) {
        this.arrivalDays = arrivalDays;
    }

    /**
     * 剩余票量
     */
    public int getLaveTicket() {
        return this.laveTicket;
    }

    public void setLaveTicket(int laveTicket) {
        this.laveTicket = laveTicket;
    }

    /**
     * 出发城市
     */
    public CityInfo getDCity() {
        return this.dCity;
    }

    public void setDCity(CityInfo dCity) {
        this.dCity = dCity;
    }

    /**
     * 到达城市
     */
    public CityInfo getACity() {
        return this.aCity;
    }

    public void setACity(CityInfo aCity) {
        this.aCity = aCity;
    }

    /**
     * 出发时间
     */
    public long getDDate() {
        return this.dDate;
    }

    public void setDDate(long dDate) {
        this.dDate = dDate;
    }

    /**
     * 到达时间
     */
    public long getADate() {
        return this.aDate;
    }

    public void setADate(long aDate) {
        this.aDate = aDate;
    }

    /**
     * 飞行总时间/分钟
     */
    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * 飞行时间字符串 2h3m
     */
    public String getDurationStr() {
        return this.durationStr;
    }

    public void setDurationStr(String durationStr) {
        this.durationStr = durationStr;
    }

    /**
     * 飞行小时/总时间换算
     */
    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    /**
     * 飞行除去小时后剩余分钟数
     */
    public int getMin() {
        return this.min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    /**
     * 航段信息
     */
    public List<ColunmInfo> getColunmInfoList() {
        return this.colunmInfoList;
    }

    public void setColunmInfoList(List<ColunmInfo> colunmInfoList) {
        this.colunmInfoList = colunmInfoList;
    }

    /**
     * 国际弃程
     */
    public List<ColunmInfo> getPartialColunmInfoList() {
        return this.partialColunmInfoList;
    }

    public void setPartialColunmInfoList(List<ColunmInfo> partialColunmInfoList) {
        this.partialColunmInfoList = partialColunmInfoList;
    }

    /**
     * 运价、政策信息
     */
    public List<PolicyPirceInfo> getPolicyInfo() {
        return this.policyInfo;
    }

    public void setPolicyInfo(List<PolicyPirceInfo> policyInfo) {
        this.policyInfo = policyInfo;
    }

    /**
     * 该航班下所有运价中所包含的主舱位等级 以“,”分隔
     */
    public String getFltClassLabel() {
        return this.fltClassLabel;
    }

    public void setFltClassLabel(String fltClassLabel) {
        this.fltClassLabel = fltClassLabel;
    }

    /**
     * 票量描述
     */
    public String getTicketDescription() {
        return this.ticketDescription;
    }

    public void setTicketDescription(String ticketDescription) {
        this.ticketDescription = ticketDescription;
    }

    /**
     * 中转城市列表
     */
    public List<FlightStopInfo> getStopCityInfoList() {
        return this.stopCityInfoList;
    }

    public void setStopCityInfoList(List<FlightStopInfo> stopCityInfoList) {
        this.stopCityInfoList = stopCityInfoList;
    }

    /**
     * 代码共享航班列表
     */
    public List<AirLineInfo> getCodeShareInfoList() {
        return this.codeShareInfoList;
    }

    public void setCodeShareInfoList(List<AirLineInfo> codeShareInfoList) {
        this.codeShareInfoList = codeShareInfoList;
    }

    /**
     * 相应码，第1位全部是代码共享
     */
    public int getProductExtensionFlag() {
        return this.productExtensionFlag;
    }

    public void setProductExtensionFlag(int productExtensionFlag) {
        this.productExtensionFlag = productExtensionFlag;
    }

    /**
     * 航线序号
     */
    public int getOrigDestSeqID() {
        return this.origDestSeqID;
    }

    public void setOrigDestSeqID(int origDestSeqID) {
        this.origDestSeqID = origDestSeqID;
    }

    /**
     * 定位航线唯一键
     */
    public String getProductID() {
        return this.productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    /**
     * 验舱验价的key值
     */
    public String getVerifyTokenNumber() {
        return this.verifyTokenNumber;
    }

    public void setVerifyTokenNumber(String verifyTokenNumber) {
        this.verifyTokenNumber = verifyTokenNumber;
    }

    /**
     * 提醒信息(5.1版本添加)
     */
    public List<KeyValueInfos> getFlightNotices() {
        return this.flightNotices;
    }

    public void setFlightNotices(List<KeyValueInfos> flightNotices) {
        this.flightNotices = flightNotices;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final FltProductInfo other = (FltProductInfo)obj;
        return
            Objects.equal(this.partitionedToken, other.partitionedToken) && 
            Objects.equal(this.nextGroupKey, other.nextGroupKey) && 
            Objects.equal(this.arrivalDays, other.arrivalDays) && 
            Objects.equal(this.laveTicket, other.laveTicket) && 
            Objects.equal(this.dCity, other.dCity) && 
            Objects.equal(this.aCity, other.aCity) && 
            Objects.equal(this.dDate, other.dDate) && 
            Objects.equal(this.aDate, other.aDate) && 
            Objects.equal(this.duration, other.duration) && 
            Objects.equal(this.durationStr, other.durationStr) && 
            Objects.equal(this.hour, other.hour) && 
            Objects.equal(this.min, other.min) && 
            Objects.equal(this.colunmInfoList, other.colunmInfoList) && 
            Objects.equal(this.partialColunmInfoList, other.partialColunmInfoList) && 
            Objects.equal(this.policyInfo, other.policyInfo) && 
            Objects.equal(this.fltClassLabel, other.fltClassLabel) && 
            Objects.equal(this.ticketDescription, other.ticketDescription) && 
            Objects.equal(this.stopCityInfoList, other.stopCityInfoList) && 
            Objects.equal(this.codeShareInfoList, other.codeShareInfoList) && 
            Objects.equal(this.productExtensionFlag, other.productExtensionFlag) && 
            Objects.equal(this.origDestSeqID, other.origDestSeqID) && 
            Objects.equal(this.productID, other.productID) && 
            Objects.equal(this.verifyTokenNumber, other.verifyTokenNumber) && 
            Objects.equal(this.flightNotices, other.flightNotices);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.partitionedToken);
        result = 31 * result + Objects.hashCode(this.nextGroupKey);
        result = 31 * result + Objects.hashCode(this.arrivalDays);
        result = 31 * result + Objects.hashCode(this.laveTicket);
        result = 31 * result + Objects.hashCode(this.dCity);
        result = 31 * result + Objects.hashCode(this.aCity);
        result = 31 * result + Objects.hashCode(this.dDate);
        result = 31 * result + Objects.hashCode(this.aDate);
        result = 31 * result + Objects.hashCode(this.duration);
        result = 31 * result + Objects.hashCode(this.durationStr);
        result = 31 * result + Objects.hashCode(this.hour);
        result = 31 * result + Objects.hashCode(this.min);
        result = 31 * result + Objects.hashCode(this.colunmInfoList);
        result = 31 * result + Objects.hashCode(this.partialColunmInfoList);
        result = 31 * result + Objects.hashCode(this.policyInfo);
        result = 31 * result + Objects.hashCode(this.fltClassLabel);
        result = 31 * result + Objects.hashCode(this.ticketDescription);
        result = 31 * result + Objects.hashCode(this.stopCityInfoList);
        result = 31 * result + Objects.hashCode(this.codeShareInfoList);
        result = 31 * result + Objects.hashCode(this.productExtensionFlag);
        result = 31 * result + Objects.hashCode(this.origDestSeqID);
        result = 31 * result + Objects.hashCode(this.productID);
        result = 31 * result + Objects.hashCode(this.verifyTokenNumber);
        result = 31 * result + Objects.hashCode(this.flightNotices);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("partitionedToken", partitionedToken)
            .add("nextGroupKey", nextGroupKey)
            .add("arrivalDays", arrivalDays)
            .add("laveTicket", laveTicket)
            .add("dCity", dCity)
            .add("aCity", aCity)
            .add("dDate", dDate)
            .add("aDate", aDate)
            .add("duration", duration)
            .add("durationStr", durationStr)
            .add("hour", hour)
            .add("min", min)
            .add("colunmInfoList", colunmInfoList)
            .add("partialColunmInfoList", partialColunmInfoList)
            .add("policyInfo", policyInfo)
            .add("fltClassLabel", fltClassLabel)
            .add("ticketDescription", ticketDescription)
            .add("stopCityInfoList", stopCityInfoList)
            .add("codeShareInfoList", codeShareInfoList)
            .add("productExtensionFlag", productExtensionFlag)
            .add("origDestSeqID", origDestSeqID)
            .add("productID", productID)
            .add("verifyTokenNumber", verifyTokenNumber)
            .add("flightNotices", flightNotices)
            .toString();
    }
}