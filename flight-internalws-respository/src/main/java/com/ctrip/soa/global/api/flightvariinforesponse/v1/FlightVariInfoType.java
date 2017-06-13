/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.flightvariinforesponse.v1;

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
 * 航班动态信息实体
 */
@DtoDoc("航班动态信息实体")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightVariInfoType", propOrder = {
    "dCityID",
    "dCityCode",
    "isIntlDCity",
    "aCityID",
    "aCityCode",
    "isIntlACity",
    "dCityName",
    "aCityName",
    "airmodel",
    "altAirportCode",
    "arrZones",
    "boardingGate",
    "checkInCounter",
    "cjflightstatus",
    "delayReason",
    "depZones",
    "distance",
    "flightArr",
    "flightArrcode",
    "flightArrDatetime",
    "flightArrDatetimeReady",
    "flightCompany",
    "flightCompanyEName",
    "flightDate",
    "flightDelayInfo",
    "flightDep",
    "flightDepcode",
    "flightDepDatetime",
    "flightDepDatetimeReady",
    "flightHTerminal",
    "flightNo",
    "flightState",
    "flightTerminal",
    "luggageCarousel",
    "plannedArrtime",
    "plannedDeptime",
    "preArrcode",
    "preDepcode",
    "preorderFlight",
    "preStatus",
    "fsid",
    "bridge",
    "timeStatus",
    "stageStatus",
    "stageMultiLanugae",
    "totalFlightTime",
    "currentFlightTime",
    "delayOrCancelReason",
    "cjflightstatusStr",
    "stageStatusStr"
})
@SuppressWarnings("all")
public class FlightVariInfoType  {

    private static final long serialVersionUID = 1L;

    public FlightVariInfoType(
        int dCityID, 
        String dCityCode, 
        boolean isIntlDCity, 
        int aCityID, 
        String aCityCode, 
        boolean isIntlACity, 
        String dCityName, 
        String aCityName, 
        String airmodel, 
        String altAirportCode, 
        String arrZones, 
        String boardingGate, 
        String checkInCounter, 
        int cjflightstatus, 
        String delayReason, 
        String depZones, 
        String distance, 
        String flightArr, 
        String flightArrcode, 
        String flightArrDatetime, 
        String flightArrDatetimeReady, 
        String flightCompany, 
        String flightCompanyEName, 
        String flightDate, 
        String flightDelayInfo, 
        String flightDep, 
        String flightDepcode, 
        String flightDepDatetime, 
        String flightDepDatetimeReady, 
        String flightHTerminal, 
        String flightNo, 
        String flightState, 
        String flightTerminal, 
        String luggageCarousel, 
        String plannedArrtime, 
        String plannedDeptime, 
        String preArrcode, 
        String preDepcode, 
        String preorderFlight, 
        String preStatus, 
        int fsid, 
        String bridge, 
        TimeStatus timeStatus, 
        StageStatus stageStatus, 
        String stageMultiLanugae, 
        long totalFlightTime, 
        long currentFlightTime, 
        String delayOrCancelReason, 
        String cjflightstatusStr, 
        String stageStatusStr) {
        this.dCityID = dCityID;
        this.dCityCode = dCityCode;
        this.isIntlDCity = isIntlDCity;
        this.aCityID = aCityID;
        this.aCityCode = aCityCode;
        this.isIntlACity = isIntlACity;
        this.dCityName = dCityName;
        this.aCityName = aCityName;
        this.airmodel = airmodel;
        this.altAirportCode = altAirportCode;
        this.arrZones = arrZones;
        this.boardingGate = boardingGate;
        this.checkInCounter = checkInCounter;
        this.cjflightstatus = cjflightstatus;
        this.delayReason = delayReason;
        this.depZones = depZones;
        this.distance = distance;
        this.flightArr = flightArr;
        this.flightArrcode = flightArrcode;
        this.flightArrDatetime = flightArrDatetime;
        this.flightArrDatetimeReady = flightArrDatetimeReady;
        this.flightCompany = flightCompany;
        this.flightCompanyEName = flightCompanyEName;
        this.flightDate = flightDate;
        this.flightDelayInfo = flightDelayInfo;
        this.flightDep = flightDep;
        this.flightDepcode = flightDepcode;
        this.flightDepDatetime = flightDepDatetime;
        this.flightDepDatetimeReady = flightDepDatetimeReady;
        this.flightHTerminal = flightHTerminal;
        this.flightNo = flightNo;
        this.flightState = flightState;
        this.flightTerminal = flightTerminal;
        this.luggageCarousel = luggageCarousel;
        this.plannedArrtime = plannedArrtime;
        this.plannedDeptime = plannedDeptime;
        this.preArrcode = preArrcode;
        this.preDepcode = preDepcode;
        this.preorderFlight = preorderFlight;
        this.preStatus = preStatus;
        this.fsid = fsid;
        this.bridge = bridge;
        this.timeStatus = timeStatus;
        this.stageStatus = stageStatus;
        this.stageMultiLanugae = stageMultiLanugae;
        this.totalFlightTime = totalFlightTime;
        this.currentFlightTime = currentFlightTime;
        this.delayOrCancelReason = delayOrCancelReason;
        this.cjflightstatusStr = cjflightstatusStr;
        this.stageStatusStr = stageStatusStr;
    }

    public FlightVariInfoType() {
    }

    @FieldDoc("出发城市ID")
    @JsonProperty("DCityID")
    @XmlElement(name = "DCityID")
    private int dCityID;

    @FieldDoc("出发城市Code")
    @JsonProperty("DCityCode")
    @XmlElement(name = "DCityCode")
    private String dCityCode;

    @FieldDoc("是否国际出发城市")
    @JsonProperty("IsIntlDCity")
    @XmlElement(name = "IsIntlDCity")
    private boolean isIntlDCity;

    @FieldDoc("到达城市ID")
    @JsonProperty("ACityID")
    @XmlElement(name = "ACityID")
    private int aCityID;

    @FieldDoc("到达城市Code")
    @JsonProperty("ACityCode")
    @XmlElement(name = "ACityCode")
    private String aCityCode;

    @FieldDoc("是否国际到达城市")
    @JsonProperty("IsIntlACity")
    @XmlElement(name = "IsIntlACity")
    private boolean isIntlACity;

    @FieldDoc("出发城市名")
    @JsonProperty("DCityName")
    @XmlElement(name = "DCityName")
    private String dCityName;

    @FieldDoc("到达城市名")
    @JsonProperty("ACityName")
    @XmlElement(name = "ACityName")
    private String aCityName;

    @FieldDoc("机型")
    @JsonProperty("Airmodel")
    @XmlElement(name = "Airmodel")
    private String airmodel;

    @FieldDoc("备降机场")
    @JsonProperty("AltAirportCode")
    @XmlElement(name = "AltAirportCode")
    private String altAirportCode;

    @FieldDoc("到达地区")
    @JsonProperty("ArrZones")
    @XmlElement(name = "ArrZones")
    private String arrZones;

    @FieldDoc("登机口")
    @JsonProperty("BoardingGate")
    @XmlElement(name = "BoardingGate")
    private String boardingGate;

    @FieldDoc("值机柜台")
    @JsonProperty("CheckInCounter")
    @XmlElement(name = "CheckInCounter")
    private String checkInCounter;

    @FieldDoc("登机状态 0:无 1:正在值机 2：值机结束 3：正在登机 4：催促登机 5：登机结束")
    @JsonProperty("Cjflightstatus")
    @XmlElement(name = "Cjflightstatus")
    private int cjflightstatus;

    @FieldDoc("延误原因")
    @JsonProperty("DelayReason")
    @XmlElement(name = "DelayReason")
    private String delayReason;

    @FieldDoc("出发地时区")
    @JsonProperty("DepZones")
    @XmlElement(name = "DepZones")
    private String depZones;

    @FieldDoc("全程公里数")
    @JsonProperty("Distance")
    @XmlElement(name = "Distance")
    private String distance;

    @FieldDoc("到达机场")
    @JsonProperty("FlightArr")
    @XmlElement(name = "FlightArr")
    private String flightArr;

    @FieldDoc("到达机场三字码")
    @JsonProperty("FlightArrcode")
    @XmlElement(name = "FlightArrcode")
    private String flightArrcode;

    @FieldDoc("实际到达时间")
    @JsonProperty("FlightArrDatetime")
    @XmlElement(name = "FlightArrDatetime")
    private String flightArrDatetime;

    @FieldDoc("预计到达时间")
    @JsonProperty("FlightArrDatetimeReady")
    @XmlElement(name = "FlightArrDatetimeReady")
    private String flightArrDatetimeReady;

    @FieldDoc("航空公司")
    @JsonProperty("FlightCompany")
    @XmlElement(name = "FlightCompany")
    private String flightCompany;

    @FieldDoc("航空公司英文名")
    @JsonProperty("FlightCompanyEName")
    @XmlElement(name = "FlightCompanyEName")
    private String flightCompanyEName;

    @FieldDoc("航班日期")
    @JsonProperty("FlightDate")
    @XmlElement(name = "FlightDate")
    private String flightDate;

    @FieldDoc("准点率")
    @JsonProperty("FlightDelayInfo")
    @XmlElement(name = "FlightDelayInfo")
    private String flightDelayInfo;

    @FieldDoc("出发机场")
    @JsonProperty("FlightDep")
    @XmlElement(name = "FlightDep")
    private String flightDep;

    @FieldDoc("出发机场三字码")
    @JsonProperty("FlightDepcode")
    @XmlElement(name = "FlightDepcode")
    private String flightDepcode;

    @FieldDoc("实际起飞时间")
    @JsonProperty("FlightDepDatetime")
    @XmlElement(name = "FlightDepDatetime")
    private String flightDepDatetime;

    @FieldDoc("预计起飞时间")
    @JsonProperty("FlightDepDatetimeReady")
    @XmlElement(name = "FlightDepDatetimeReady")
    private String flightDepDatetimeReady;

    @FieldDoc("登机楼")
    @JsonProperty("FlightHTerminal")
    @XmlElement(name = "FlightHTerminal")
    private String flightHTerminal;

    @FieldDoc("航班号")
    @JsonProperty("FlightNo")
    @XmlElement(name = "FlightNo")
    private String flightNo;

    @FieldDoc("航班状态")
    @JsonProperty("FlightState")
    @XmlElement(name = "FlightState")
    private String flightState;

    @FieldDoc("接机楼")
    @JsonProperty("FlightTerminal")
    @XmlElement(name = "FlightTerminal")
    private String flightTerminal;

    @FieldDoc("行李转盘")
    @JsonProperty("LuggageCarousel")
    @XmlElement(name = "LuggageCarousel")
    private String luggageCarousel;

    @FieldDoc("计划降落时间(航班时刻表时间)")
    @JsonProperty("PlannedArrtime")
    @XmlElement(name = "PlannedArrtime")
    private String plannedArrtime;

    @FieldDoc("计划起飞时间(航班时刻表时间)")
    @JsonProperty("PlannedDeptime")
    @XmlElement(name = "PlannedDeptime")
    private String plannedDeptime;

    @FieldDoc("前序航班到达机场")
    @JsonProperty("PreArrcode")
    @XmlElement(name = "PreArrcode")
    private String preArrcode;

    @FieldDoc("前序航班起飞机场")
    @JsonProperty("PreDepcode")
    @XmlElement(name = "PreDepcode")
    private String preDepcode;

    @FieldDoc("前序航班")
    @JsonProperty("PreorderFlight")
    @XmlElement(name = "PreorderFlight")
    private String preorderFlight;

    @FieldDoc("前序航班状态")
    @JsonProperty("PreStatus")
    @XmlElement(name = "PreStatus")
    private String preStatus;

    @FieldDoc("FSID")
    @JsonProperty("FSID")
    @XmlElement(name = "FSID")
    private int fsid;

    @FieldDoc("廊桥（上行;下行） 0摆渡车 1廊桥 2步行")
    @JsonProperty("Bridge")
    @XmlElement(name = "Bridge")
    private String bridge;

    @FieldDoc("时间状态")
    @JsonProperty("TimeStatus")
    @XmlElement(name = "TimeStatus")
    private TimeStatus timeStatus;

    @FieldDoc("阶段状态（5.0.1之前使用）")
    @JsonProperty("StageStatus")
    @XmlElement(name = "StageStatus")
    private StageStatus stageStatus;

    @FieldDoc("阶段状态多语言")
    @JsonProperty("StageMultiLanugae")
    @XmlElement(name = "StageMultiLanugae")
    private String stageMultiLanugae;

    @FieldDoc("总共飞行时长")
    @JsonProperty("TotalFlightTime")
    @XmlElement(name = "TotalFlightTime")
    private long totalFlightTime;

    @FieldDoc("当前飞行时长")
    @JsonProperty("CurrentFlightTime")
    @XmlElement(name = "CurrentFlightTime")
    private long currentFlightTime;

    @FieldDoc("前序航班或其他导致延误和取消的原因")
    @JsonProperty("DelayOrCancelReason")
    @XmlElement(name = "DelayOrCancelReason")
    private String delayOrCancelReason;

    @FieldDoc("登机状态 0:无 1:正在值机 2：值机结束 3：正在登机 4：催促登机 5：登机结束")
    @JsonProperty("CjflightstatusStr")
    @XmlElement(name = "CjflightstatusStr")
    private String cjflightstatusStr;

    @FieldDoc("阶段状态（5.0.1之后使用，废除之前的枚举字段）")
    @JsonProperty("StageStatusStr")
    @XmlElement(name = "StageStatusStr")
    private String stageStatusStr;

    /**
     * 出发城市ID
     */
    public int getDCityID() {
        return this.dCityID;
    }

    public void setDCityID(int dCityID) {
        this.dCityID = dCityID;
    }

    /**
     * 出发城市Code
     */
    public String getDCityCode() {
        return this.dCityCode;
    }

    public void setDCityCode(String dCityCode) {
        this.dCityCode = dCityCode;
    }

    /**
     * 是否国际出发城市
     */
    public boolean getIsIntlDCity() {
        return this.isIntlDCity;
    }

    public void setIsIntlDCity(boolean isIntlDCity) {
        this.isIntlDCity = isIntlDCity;
    }

    /**
     * 到达城市ID
     */
    public int getACityID() {
        return this.aCityID;
    }

    public void setACityID(int aCityID) {
        this.aCityID = aCityID;
    }

    /**
     * 到达城市Code
     */
    public String getACityCode() {
        return this.aCityCode;
    }

    public void setACityCode(String aCityCode) {
        this.aCityCode = aCityCode;
    }

    /**
     * 是否国际到达城市
     */
    public boolean getIsIntlACity() {
        return this.isIntlACity;
    }

    public void setIsIntlACity(boolean isIntlACity) {
        this.isIntlACity = isIntlACity;
    }

    /**
     * 出发城市名
     */
    public String getDCityName() {
        return this.dCityName;
    }

    public void setDCityName(String dCityName) {
        this.dCityName = dCityName;
    }

    /**
     * 到达城市名
     */
    public String getACityName() {
        return this.aCityName;
    }

    public void setACityName(String aCityName) {
        this.aCityName = aCityName;
    }

    /**
     * 机型
     */
    public String getAirmodel() {
        return this.airmodel;
    }

    public void setAirmodel(String airmodel) {
        this.airmodel = airmodel;
    }

    /**
     * 备降机场
     */
    public String getAltAirportCode() {
        return this.altAirportCode;
    }

    public void setAltAirportCode(String altAirportCode) {
        this.altAirportCode = altAirportCode;
    }

    /**
     * 到达地区
     */
    public String getArrZones() {
        return this.arrZones;
    }

    public void setArrZones(String arrZones) {
        this.arrZones = arrZones;
    }

    /**
     * 登机口
     */
    public String getBoardingGate() {
        return this.boardingGate;
    }

    public void setBoardingGate(String boardingGate) {
        this.boardingGate = boardingGate;
    }

    /**
     * 值机柜台
     */
    public String getCheckInCounter() {
        return this.checkInCounter;
    }

    public void setCheckInCounter(String checkInCounter) {
        this.checkInCounter = checkInCounter;
    }

    /**
     * 登机状态 0:无 1:正在值机 2：值机结束 3：正在登机 4：催促登机 5：登机结束
     */
    public int getCjflightstatus() {
        return this.cjflightstatus;
    }

    public void setCjflightstatus(int cjflightstatus) {
        this.cjflightstatus = cjflightstatus;
    }

    /**
     * 延误原因
     */
    public String getDelayReason() {
        return this.delayReason;
    }

    public void setDelayReason(String delayReason) {
        this.delayReason = delayReason;
    }

    /**
     * 出发地时区
     */
    public String getDepZones() {
        return this.depZones;
    }

    public void setDepZones(String depZones) {
        this.depZones = depZones;
    }

    /**
     * 全程公里数
     */
    public String getDistance() {
        return this.distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    /**
     * 到达机场
     */
    public String getFlightArr() {
        return this.flightArr;
    }

    public void setFlightArr(String flightArr) {
        this.flightArr = flightArr;
    }

    /**
     * 到达机场三字码
     */
    public String getFlightArrcode() {
        return this.flightArrcode;
    }

    public void setFlightArrcode(String flightArrcode) {
        this.flightArrcode = flightArrcode;
    }

    /**
     * 实际到达时间
     */
    public String getFlightArrDatetime() {
        return this.flightArrDatetime;
    }

    public void setFlightArrDatetime(String flightArrDatetime) {
        this.flightArrDatetime = flightArrDatetime;
    }

    /**
     * 预计到达时间
     */
    public String getFlightArrDatetimeReady() {
        return this.flightArrDatetimeReady;
    }

    public void setFlightArrDatetimeReady(String flightArrDatetimeReady) {
        this.flightArrDatetimeReady = flightArrDatetimeReady;
    }

    /**
     * 航空公司
     */
    public String getFlightCompany() {
        return this.flightCompany;
    }

    public void setFlightCompany(String flightCompany) {
        this.flightCompany = flightCompany;
    }

    /**
     * 航空公司英文名
     */
    public String getFlightCompanyEName() {
        return this.flightCompanyEName;
    }

    public void setFlightCompanyEName(String flightCompanyEName) {
        this.flightCompanyEName = flightCompanyEName;
    }

    /**
     * 航班日期
     */
    public String getFlightDate() {
        return this.flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    /**
     * 准点率
     */
    public String getFlightDelayInfo() {
        return this.flightDelayInfo;
    }

    public void setFlightDelayInfo(String flightDelayInfo) {
        this.flightDelayInfo = flightDelayInfo;
    }

    /**
     * 出发机场
     */
    public String getFlightDep() {
        return this.flightDep;
    }

    public void setFlightDep(String flightDep) {
        this.flightDep = flightDep;
    }

    /**
     * 出发机场三字码
     */
    public String getFlightDepcode() {
        return this.flightDepcode;
    }

    public void setFlightDepcode(String flightDepcode) {
        this.flightDepcode = flightDepcode;
    }

    /**
     * 实际起飞时间
     */
    public String getFlightDepDatetime() {
        return this.flightDepDatetime;
    }

    public void setFlightDepDatetime(String flightDepDatetime) {
        this.flightDepDatetime = flightDepDatetime;
    }

    /**
     * 预计起飞时间
     */
    public String getFlightDepDatetimeReady() {
        return this.flightDepDatetimeReady;
    }

    public void setFlightDepDatetimeReady(String flightDepDatetimeReady) {
        this.flightDepDatetimeReady = flightDepDatetimeReady;
    }

    /**
     * 登机楼
     */
    public String getFlightHTerminal() {
        return this.flightHTerminal;
    }

    public void setFlightHTerminal(String flightHTerminal) {
        this.flightHTerminal = flightHTerminal;
    }

    /**
     * 航班号
     */
    public String getFlightNo() {
        return this.flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    /**
     * 航班状态
     */
    public String getFlightState() {
        return this.flightState;
    }

    public void setFlightState(String flightState) {
        this.flightState = flightState;
    }

    /**
     * 接机楼
     */
    public String getFlightTerminal() {
        return this.flightTerminal;
    }

    public void setFlightTerminal(String flightTerminal) {
        this.flightTerminal = flightTerminal;
    }

    /**
     * 行李转盘
     */
    public String getLuggageCarousel() {
        return this.luggageCarousel;
    }

    public void setLuggageCarousel(String luggageCarousel) {
        this.luggageCarousel = luggageCarousel;
    }

    /**
     * 计划降落时间(航班时刻表时间)
     */
    public String getPlannedArrtime() {
        return this.plannedArrtime;
    }

    public void setPlannedArrtime(String plannedArrtime) {
        this.plannedArrtime = plannedArrtime;
    }

    /**
     * 计划起飞时间(航班时刻表时间)
     */
    public String getPlannedDeptime() {
        return this.plannedDeptime;
    }

    public void setPlannedDeptime(String plannedDeptime) {
        this.plannedDeptime = plannedDeptime;
    }

    /**
     * 前序航班到达机场
     */
    public String getPreArrcode() {
        return this.preArrcode;
    }

    public void setPreArrcode(String preArrcode) {
        this.preArrcode = preArrcode;
    }

    /**
     * 前序航班起飞机场
     */
    public String getPreDepcode() {
        return this.preDepcode;
    }

    public void setPreDepcode(String preDepcode) {
        this.preDepcode = preDepcode;
    }

    /**
     * 前序航班
     */
    public String getPreorderFlight() {
        return this.preorderFlight;
    }

    public void setPreorderFlight(String preorderFlight) {
        this.preorderFlight = preorderFlight;
    }

    /**
     * 前序航班状态
     */
    public String getPreStatus() {
        return this.preStatus;
    }

    public void setPreStatus(String preStatus) {
        this.preStatus = preStatus;
    }

    /**
     * FSID
     */
    public int getFsid() {
        return this.fsid;
    }

    public void setFsid(int fsid) {
        this.fsid = fsid;
    }

    /**
     * 廊桥（上行;下行） 0摆渡车 1廊桥 2步行
     */
    public String getBridge() {
        return this.bridge;
    }

    public void setBridge(String bridge) {
        this.bridge = bridge;
    }

    /**
     * 时间状态
     */
    public TimeStatus getTimeStatus() {
        return this.timeStatus;
    }

    public void setTimeStatus(TimeStatus timeStatus) {
        this.timeStatus = timeStatus;
    }

    /**
     * 阶段状态（5.0.1之前使用）
     */
    public StageStatus getStageStatus() {
        return this.stageStatus;
    }

    public void setStageStatus(StageStatus stageStatus) {
        this.stageStatus = stageStatus;
    }

    /**
     * 阶段状态多语言
     */
    public String getStageMultiLanugae() {
        return this.stageMultiLanugae;
    }

    public void setStageMultiLanugae(String stageMultiLanugae) {
        this.stageMultiLanugae = stageMultiLanugae;
    }

    /**
     * 总共飞行时长
     */
    public long getTotalFlightTime() {
        return this.totalFlightTime;
    }

    public void setTotalFlightTime(long totalFlightTime) {
        this.totalFlightTime = totalFlightTime;
    }

    /**
     * 当前飞行时长
     */
    public long getCurrentFlightTime() {
        return this.currentFlightTime;
    }

    public void setCurrentFlightTime(long currentFlightTime) {
        this.currentFlightTime = currentFlightTime;
    }

    /**
     * 前序航班或其他导致延误和取消的原因
     */
    public String getDelayOrCancelReason() {
        return this.delayOrCancelReason;
    }

    public void setDelayOrCancelReason(String delayOrCancelReason) {
        this.delayOrCancelReason = delayOrCancelReason;
    }

    /**
     * 登机状态 0:无 1:正在值机 2：值机结束 3：正在登机 4：催促登机 5：登机结束
     */
    public String getCjflightstatusStr() {
        return this.cjflightstatusStr;
    }

    public void setCjflightstatusStr(String cjflightstatusStr) {
        this.cjflightstatusStr = cjflightstatusStr;
    }

    /**
     * 阶段状态（5.0.1之后使用，废除之前的枚举字段）
     */
    public String getStageStatusStr() {
        return this.stageStatusStr;
    }

    public void setStageStatusStr(String stageStatusStr) {
        this.stageStatusStr = stageStatusStr;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final FlightVariInfoType other = (FlightVariInfoType)obj;
        return
            Objects.equal(this.dCityID, other.dCityID) && 
            Objects.equal(this.dCityCode, other.dCityCode) && 
            Objects.equal(this.isIntlDCity, other.isIntlDCity) && 
            Objects.equal(this.aCityID, other.aCityID) && 
            Objects.equal(this.aCityCode, other.aCityCode) && 
            Objects.equal(this.isIntlACity, other.isIntlACity) && 
            Objects.equal(this.dCityName, other.dCityName) && 
            Objects.equal(this.aCityName, other.aCityName) && 
            Objects.equal(this.airmodel, other.airmodel) && 
            Objects.equal(this.altAirportCode, other.altAirportCode) && 
            Objects.equal(this.arrZones, other.arrZones) && 
            Objects.equal(this.boardingGate, other.boardingGate) && 
            Objects.equal(this.checkInCounter, other.checkInCounter) && 
            Objects.equal(this.cjflightstatus, other.cjflightstatus) && 
            Objects.equal(this.delayReason, other.delayReason) && 
            Objects.equal(this.depZones, other.depZones) && 
            Objects.equal(this.distance, other.distance) && 
            Objects.equal(this.flightArr, other.flightArr) && 
            Objects.equal(this.flightArrcode, other.flightArrcode) && 
            Objects.equal(this.flightArrDatetime, other.flightArrDatetime) && 
            Objects.equal(this.flightArrDatetimeReady, other.flightArrDatetimeReady) && 
            Objects.equal(this.flightCompany, other.flightCompany) && 
            Objects.equal(this.flightCompanyEName, other.flightCompanyEName) && 
            Objects.equal(this.flightDate, other.flightDate) && 
            Objects.equal(this.flightDelayInfo, other.flightDelayInfo) && 
            Objects.equal(this.flightDep, other.flightDep) && 
            Objects.equal(this.flightDepcode, other.flightDepcode) && 
            Objects.equal(this.flightDepDatetime, other.flightDepDatetime) && 
            Objects.equal(this.flightDepDatetimeReady, other.flightDepDatetimeReady) && 
            Objects.equal(this.flightHTerminal, other.flightHTerminal) && 
            Objects.equal(this.flightNo, other.flightNo) && 
            Objects.equal(this.flightState, other.flightState) && 
            Objects.equal(this.flightTerminal, other.flightTerminal) && 
            Objects.equal(this.luggageCarousel, other.luggageCarousel) && 
            Objects.equal(this.plannedArrtime, other.plannedArrtime) && 
            Objects.equal(this.plannedDeptime, other.plannedDeptime) && 
            Objects.equal(this.preArrcode, other.preArrcode) && 
            Objects.equal(this.preDepcode, other.preDepcode) && 
            Objects.equal(this.preorderFlight, other.preorderFlight) && 
            Objects.equal(this.preStatus, other.preStatus) && 
            Objects.equal(this.fsid, other.fsid) && 
            Objects.equal(this.bridge, other.bridge) && 
            Objects.equal(this.timeStatus, other.timeStatus) && 
            Objects.equal(this.stageStatus, other.stageStatus) && 
            Objects.equal(this.stageMultiLanugae, other.stageMultiLanugae) && 
            Objects.equal(this.totalFlightTime, other.totalFlightTime) && 
            Objects.equal(this.currentFlightTime, other.currentFlightTime) && 
            Objects.equal(this.delayOrCancelReason, other.delayOrCancelReason) && 
            Objects.equal(this.cjflightstatusStr, other.cjflightstatusStr) && 
            Objects.equal(this.stageStatusStr, other.stageStatusStr);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.dCityID);
        result = 31 * result + Objects.hashCode(this.dCityCode);
        result = 31 * result + Objects.hashCode(this.isIntlDCity);
        result = 31 * result + Objects.hashCode(this.aCityID);
        result = 31 * result + Objects.hashCode(this.aCityCode);
        result = 31 * result + Objects.hashCode(this.isIntlACity);
        result = 31 * result + Objects.hashCode(this.dCityName);
        result = 31 * result + Objects.hashCode(this.aCityName);
        result = 31 * result + Objects.hashCode(this.airmodel);
        result = 31 * result + Objects.hashCode(this.altAirportCode);
        result = 31 * result + Objects.hashCode(this.arrZones);
        result = 31 * result + Objects.hashCode(this.boardingGate);
        result = 31 * result + Objects.hashCode(this.checkInCounter);
        result = 31 * result + Objects.hashCode(this.cjflightstatus);
        result = 31 * result + Objects.hashCode(this.delayReason);
        result = 31 * result + Objects.hashCode(this.depZones);
        result = 31 * result + Objects.hashCode(this.distance);
        result = 31 * result + Objects.hashCode(this.flightArr);
        result = 31 * result + Objects.hashCode(this.flightArrcode);
        result = 31 * result + Objects.hashCode(this.flightArrDatetime);
        result = 31 * result + Objects.hashCode(this.flightArrDatetimeReady);
        result = 31 * result + Objects.hashCode(this.flightCompany);
        result = 31 * result + Objects.hashCode(this.flightCompanyEName);
        result = 31 * result + Objects.hashCode(this.flightDate);
        result = 31 * result + Objects.hashCode(this.flightDelayInfo);
        result = 31 * result + Objects.hashCode(this.flightDep);
        result = 31 * result + Objects.hashCode(this.flightDepcode);
        result = 31 * result + Objects.hashCode(this.flightDepDatetime);
        result = 31 * result + Objects.hashCode(this.flightDepDatetimeReady);
        result = 31 * result + Objects.hashCode(this.flightHTerminal);
        result = 31 * result + Objects.hashCode(this.flightNo);
        result = 31 * result + Objects.hashCode(this.flightState);
        result = 31 * result + Objects.hashCode(this.flightTerminal);
        result = 31 * result + Objects.hashCode(this.luggageCarousel);
        result = 31 * result + Objects.hashCode(this.plannedArrtime);
        result = 31 * result + Objects.hashCode(this.plannedDeptime);
        result = 31 * result + Objects.hashCode(this.preArrcode);
        result = 31 * result + Objects.hashCode(this.preDepcode);
        result = 31 * result + Objects.hashCode(this.preorderFlight);
        result = 31 * result + Objects.hashCode(this.preStatus);
        result = 31 * result + Objects.hashCode(this.fsid);
        result = 31 * result + Objects.hashCode(this.bridge);
        result = 31 * result + Objects.hashCode(this.timeStatus);
        result = 31 * result + Objects.hashCode(this.stageStatus);
        result = 31 * result + Objects.hashCode(this.stageMultiLanugae);
        result = 31 * result + Objects.hashCode(this.totalFlightTime);
        result = 31 * result + Objects.hashCode(this.currentFlightTime);
        result = 31 * result + Objects.hashCode(this.delayOrCancelReason);
        result = 31 * result + Objects.hashCode(this.cjflightstatusStr);
        result = 31 * result + Objects.hashCode(this.stageStatusStr);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("dCityID", dCityID)
            .add("dCityCode", dCityCode)
            .add("isIntlDCity", isIntlDCity)
            .add("aCityID", aCityID)
            .add("aCityCode", aCityCode)
            .add("isIntlACity", isIntlACity)
            .add("dCityName", dCityName)
            .add("aCityName", aCityName)
            .add("airmodel", airmodel)
            .add("altAirportCode", altAirportCode)
            .add("arrZones", arrZones)
            .add("boardingGate", boardingGate)
            .add("checkInCounter", checkInCounter)
            .add("cjflightstatus", cjflightstatus)
            .add("delayReason", delayReason)
            .add("depZones", depZones)
            .add("distance", distance)
            .add("flightArr", flightArr)
            .add("flightArrcode", flightArrcode)
            .add("flightArrDatetime", flightArrDatetime)
            .add("flightArrDatetimeReady", flightArrDatetimeReady)
            .add("flightCompany", flightCompany)
            .add("flightCompanyEName", flightCompanyEName)
            .add("flightDate", flightDate)
            .add("flightDelayInfo", flightDelayInfo)
            .add("flightDep", flightDep)
            .add("flightDepcode", flightDepcode)
            .add("flightDepDatetime", flightDepDatetime)
            .add("flightDepDatetimeReady", flightDepDatetimeReady)
            .add("flightHTerminal", flightHTerminal)
            .add("flightNo", flightNo)
            .add("flightState", flightState)
            .add("flightTerminal", flightTerminal)
            .add("luggageCarousel", luggageCarousel)
            .add("plannedArrtime", plannedArrtime)
            .add("plannedDeptime", plannedDeptime)
            .add("preArrcode", preArrcode)
            .add("preDepcode", preDepcode)
            .add("preorderFlight", preorderFlight)
            .add("preStatus", preStatus)
            .add("fsid", fsid)
            .add("bridge", bridge)
            .add("timeStatus", timeStatus)
            .add("stageStatus", stageStatus)
            .add("stageMultiLanugae", stageMultiLanugae)
            .add("totalFlightTime", totalFlightTime)
            .add("currentFlightTime", currentFlightTime)
            .add("delayOrCancelReason", delayOrCancelReason)
            .add("cjflightstatusStr", cjflightstatusStr)
            .add("stageStatusStr", stageStatusStr)
            .toString();
    }
}