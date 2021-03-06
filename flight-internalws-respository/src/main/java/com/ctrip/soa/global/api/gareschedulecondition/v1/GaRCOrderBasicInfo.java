/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.gareschedulecondition.v1;

import com.ctrip.soa.global.api.flightcommon.v1.GaContactInfo;
import com.ctrip.soa.global.api.flightcommon.v1.GaFlightWayType;
import com.ctrip.soa.global.api.flightcommon.v1.PolicyInfo;
import com.ctrip.soa.global.api.flightcommon.v1.RelatedOrderID;
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
 * 订单基本信息
 */
@DtoDoc("订单基本信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GaRCOrderBasicInfo", propOrder = {
    "orderID",
    "actulOrderStatus",
    "uid",
    "flightWay",
    "contactInfo",
    "flightOrderClass",
    "source",
    "relatedOrderIDList",
    "segmentInfoList",
    "isSmallTeam",
    "returnPoint",
    "rescheduleAble",
    "unRescheduleAbleReason",
    "rescheduleFeeCanCompute",
    "returnPointMinStayDays",
    "returnPointMaxStayDays",
    "policyInfoList",
    "applyReasonMode",
    "canQueryFlight"
})
@SuppressWarnings("all")
public class GaRCOrderBasicInfo  {

    private static final long serialVersionUID = 1L;

    public GaRCOrderBasicInfo(
        long orderID, 
        String actulOrderStatus, 
        String uid, 
        GaFlightWayType flightWay, 
        GaContactInfo contactInfo, 
        String flightOrderClass, 
        String source, 
        List<RelatedOrderID> relatedOrderIDList, 
        List<GaRCSegmentInfo> segmentInfoList, 
        boolean isSmallTeam, 
        String returnPoint, 
        boolean rescheduleAble, 
        String unRescheduleAbleReason, 
        boolean rescheduleFeeCanCompute, 
        int returnPointMinStayDays, 
        int returnPointMaxStayDays, 
        List<PolicyInfo> policyInfoList, 
        int applyReasonMode, 
        boolean canQueryFlight) {
        this.orderID = orderID;
        this.actulOrderStatus = actulOrderStatus;
        this.uid = uid;
        this.flightWay = flightWay;
        this.contactInfo = contactInfo;
        this.flightOrderClass = flightOrderClass;
        this.source = source;
        this.relatedOrderIDList = relatedOrderIDList;
        this.segmentInfoList = segmentInfoList;
        this.isSmallTeam = isSmallTeam;
        this.returnPoint = returnPoint;
        this.rescheduleAble = rescheduleAble;
        this.unRescheduleAbleReason = unRescheduleAbleReason;
        this.rescheduleFeeCanCompute = rescheduleFeeCanCompute;
        this.returnPointMinStayDays = returnPointMinStayDays;
        this.returnPointMaxStayDays = returnPointMaxStayDays;
        this.policyInfoList = policyInfoList;
        this.applyReasonMode = applyReasonMode;
        this.canQueryFlight = canQueryFlight;
    }

    public GaRCOrderBasicInfo() {
    }

    @FieldDoc("订单号")
    @JsonProperty("OrderID")
    @XmlElement(name = "OrderID")
    private long orderID;

    @FieldDoc("订单状态" +
            "U-未提交（已创建未提交），" +
            "W-已提交未处理，" +
            "P-处理中（已出票），" +
            "J-出票中，" +
            "G-已支付出票中，" +
            "H-已扣款出票中，" +
            "R-全部退票（已退票），" +
            "C-已取消，" +
            "T-部分退票，" +
            "S-已成交，" +
            "E-待支付，" +
            "F-待扣款，" +
            "Z-未出行，" +
            "D-取消申请中，")
    @JsonProperty("ActulOrderStatus")
    @XmlElement(name = "ActulOrderStatus")
    private String actulOrderStatus;

    @FieldDoc("用户ID")
    @JsonProperty("Uid")
    @XmlElement(name = "Uid")
    private String uid;

    @FieldDoc("航程类型")
    @JsonProperty("FlightWay")
    @XmlElement(name = "FlightWay")
    private GaFlightWayType flightWay;

    @FieldDoc("联系人信息")
    @JsonProperty("ContactInfo")
    @XmlElement(name = "ContactInfo")
    private GaContactInfo contactInfo;

    @FieldDoc("航班类型-I国际 N国内")
    @JsonProperty("FlightOrderClass")
    @XmlElement(name = "FlightOrderClass")
    private String flightOrderClass;

    @FieldDoc("订单来源")
    @JsonProperty("Source")
    @XmlElement(name = "Source")
    private String source;

    @FieldDoc("订单关联订单信息")
    @JsonProperty("RelatedOrderIDList")
    @XmlElement(name = "RelatedOrderIDList")
    private List<RelatedOrderID> relatedOrderIDList;

    @FieldDoc("航段信息")
    @JsonProperty("SegmentInfoList")
    @XmlElement(name = "SegmentInfoList")
    private List<GaRCSegmentInfo> segmentInfoList;

    @FieldDoc("小团队票")
    @JsonProperty("IsSmallTeam")
    @XmlElement(name = "IsSmallTeam")
    private boolean isSmallTeam;

    @FieldDoc("折返点")
    @JsonProperty("ReturnPoint")
    @XmlElement(name = "ReturnPoint")
    private String returnPoint;

    @FieldDoc("是否可改签-订单层面")
    @JsonProperty("RescheduleAble")
    @XmlElement(name = "RescheduleAble")
    private boolean rescheduleAble;

    @FieldDoc("订单不可改签原因")
    @JsonProperty("UnRescheduleAbleReason")
    @XmlElement(name = "UnRescheduleAbleReason")
    private String unRescheduleAbleReason;

    @FieldDoc("国际机票改签费是否可计算")
    @JsonProperty("RescheduleFeeCanCompute")
    @XmlElement(name = "RescheduleFeeCanCompute")
    private boolean rescheduleFeeCanCompute;

    @FieldDoc("折返点最小停留日期")
    @JsonProperty("ReturnPointMinStayDays")
    @XmlElement(name = "ReturnPointMinStayDays")
    private int returnPointMinStayDays;

    @FieldDoc("折返点最大停留日期")
    @JsonProperty("ReturnPointMaxStayDays")
    @XmlElement(name = "ReturnPointMaxStayDays")
    private int returnPointMaxStayDays;

    @FieldDoc("退改签信息")
    @JsonProperty("PolicyInfoList")
    @XmlElement(name = "PolicyInfoList")
    private List<PolicyInfo> policyInfoList;

    @FieldDoc("改签申请原因提交模式:" +
            "1:只能提交自愿申请" +
            "2:只能提交航变非自愿申请" +
            "3:可以提交自愿申请也可以提交非自愿申请")
    @JsonProperty("ApplyReasonMode")
    @XmlElement(name = "ApplyReasonMode")
    private int applyReasonMode;

    @FieldDoc("是否支持 改签航班查询 " +
            "true 可以跳航班查询" +
            "false 不可以支持航班查询，直接提交改签申请")
    @JsonProperty("CanQueryFlight")
    @XmlElement(name = "CanQueryFlight")
    private boolean canQueryFlight;

    /**
     * 订单号
     */
    public long getOrderID() {
        return this.orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    /**
     * 订单状态
     *             U-未提交（已创建未提交），
     *             W-已提交未处理，
     *             P-处理中（已出票），
     *             J-出票中，
     *             G-已支付出票中，
     *             H-已扣款出票中，
     *             R-全部退票（已退票），
     *             C-已取消，
     *             T-部分退票，
     *             S-已成交，
     *             E-待支付，
     *             F-待扣款，
     *             Z-未出行，
     *             D-取消申请中，
     */
    public String getActulOrderStatus() {
        return this.actulOrderStatus;
    }

    public void setActulOrderStatus(String actulOrderStatus) {
        this.actulOrderStatus = actulOrderStatus;
    }

    /**
     * 用户ID
     */
    public String getUid() {
        return this.uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * 航程类型
     */
    public GaFlightWayType getFlightWay() {
        return this.flightWay;
    }

    public void setFlightWay(GaFlightWayType flightWay) {
        this.flightWay = flightWay;
    }

    /**
     * 联系人信息
     */
    public GaContactInfo getContactInfo() {
        return this.contactInfo;
    }

    public void setContactInfo(GaContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    /**
     * 航班类型-I国际 N国内
     */
    public String getFlightOrderClass() {
        return this.flightOrderClass;
    }

    public void setFlightOrderClass(String flightOrderClass) {
        this.flightOrderClass = flightOrderClass;
    }

    /**
     * 订单来源
     */
    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 订单关联订单信息
     */
    public List<RelatedOrderID> getRelatedOrderIDList() {
        return this.relatedOrderIDList;
    }

    public void setRelatedOrderIDList(List<RelatedOrderID> relatedOrderIDList) {
        this.relatedOrderIDList = relatedOrderIDList;
    }

    /**
     * 航段信息
     */
    public List<GaRCSegmentInfo> getSegmentInfoList() {
        return this.segmentInfoList;
    }

    public void setSegmentInfoList(List<GaRCSegmentInfo> segmentInfoList) {
        this.segmentInfoList = segmentInfoList;
    }

    /**
     * 小团队票
     */
    public boolean getIsSmallTeam() {
        return this.isSmallTeam;
    }

    public void setIsSmallTeam(boolean isSmallTeam) {
        this.isSmallTeam = isSmallTeam;
    }

    /**
     * 折返点
     */
    public String getReturnPoint() {
        return this.returnPoint;
    }

    public void setReturnPoint(String returnPoint) {
        this.returnPoint = returnPoint;
    }

    /**
     * 是否可改签-订单层面
     */
    public boolean getRescheduleAble() {
        return this.rescheduleAble;
    }

    public void setRescheduleAble(boolean rescheduleAble) {
        this.rescheduleAble = rescheduleAble;
    }

    /**
     * 订单不可改签原因
     */
    public String getUnRescheduleAbleReason() {
        return this.unRescheduleAbleReason;
    }

    public void setUnRescheduleAbleReason(String unRescheduleAbleReason) {
        this.unRescheduleAbleReason = unRescheduleAbleReason;
    }

    /**
     * 国际机票改签费是否可计算
     */
    public boolean getRescheduleFeeCanCompute() {
        return this.rescheduleFeeCanCompute;
    }

    public void setRescheduleFeeCanCompute(boolean rescheduleFeeCanCompute) {
        this.rescheduleFeeCanCompute = rescheduleFeeCanCompute;
    }

    /**
     * 折返点最小停留日期
     */
    public int getReturnPointMinStayDays() {
        return this.returnPointMinStayDays;
    }

    public void setReturnPointMinStayDays(int returnPointMinStayDays) {
        this.returnPointMinStayDays = returnPointMinStayDays;
    }

    /**
     * 折返点最大停留日期
     */
    public int getReturnPointMaxStayDays() {
        return this.returnPointMaxStayDays;
    }

    public void setReturnPointMaxStayDays(int returnPointMaxStayDays) {
        this.returnPointMaxStayDays = returnPointMaxStayDays;
    }

    /**
     * 退改签信息
     */
    public List<PolicyInfo> getPolicyInfoList() {
        return this.policyInfoList;
    }

    public void setPolicyInfoList(List<PolicyInfo> policyInfoList) {
        this.policyInfoList = policyInfoList;
    }

    /**
     * 改签申请原因提交模式:
     *             1:只能提交自愿申请
     *             2:只能提交航变非自愿申请
     *             3:可以提交自愿申请也可以提交非自愿申请
     */
    public int getApplyReasonMode() {
        return this.applyReasonMode;
    }

    public void setApplyReasonMode(int applyReasonMode) {
        this.applyReasonMode = applyReasonMode;
    }

    /**
     * 是否支持 改签航班查询 
     *             true 可以跳航班查询
     *             false 不可以支持航班查询，直接提交改签申请
     */
    public boolean getCanQueryFlight() {
        return this.canQueryFlight;
    }

    public void setCanQueryFlight(boolean canQueryFlight) {
        this.canQueryFlight = canQueryFlight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaRCOrderBasicInfo other = (GaRCOrderBasicInfo)obj;
        return
            Objects.equal(this.orderID, other.orderID) && 
            Objects.equal(this.actulOrderStatus, other.actulOrderStatus) && 
            Objects.equal(this.uid, other.uid) && 
            Objects.equal(this.flightWay, other.flightWay) && 
            Objects.equal(this.contactInfo, other.contactInfo) && 
            Objects.equal(this.flightOrderClass, other.flightOrderClass) && 
            Objects.equal(this.source, other.source) && 
            Objects.equal(this.relatedOrderIDList, other.relatedOrderIDList) && 
            Objects.equal(this.segmentInfoList, other.segmentInfoList) && 
            Objects.equal(this.isSmallTeam, other.isSmallTeam) && 
            Objects.equal(this.returnPoint, other.returnPoint) && 
            Objects.equal(this.rescheduleAble, other.rescheduleAble) && 
            Objects.equal(this.unRescheduleAbleReason, other.unRescheduleAbleReason) && 
            Objects.equal(this.rescheduleFeeCanCompute, other.rescheduleFeeCanCompute) && 
            Objects.equal(this.returnPointMinStayDays, other.returnPointMinStayDays) && 
            Objects.equal(this.returnPointMaxStayDays, other.returnPointMaxStayDays) && 
            Objects.equal(this.policyInfoList, other.policyInfoList) && 
            Objects.equal(this.applyReasonMode, other.applyReasonMode) && 
            Objects.equal(this.canQueryFlight, other.canQueryFlight);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.orderID);
        result = 31 * result + Objects.hashCode(this.actulOrderStatus);
        result = 31 * result + Objects.hashCode(this.uid);
        result = 31 * result + Objects.hashCode(this.flightWay);
        result = 31 * result + Objects.hashCode(this.contactInfo);
        result = 31 * result + Objects.hashCode(this.flightOrderClass);
        result = 31 * result + Objects.hashCode(this.source);
        result = 31 * result + Objects.hashCode(this.relatedOrderIDList);
        result = 31 * result + Objects.hashCode(this.segmentInfoList);
        result = 31 * result + Objects.hashCode(this.isSmallTeam);
        result = 31 * result + Objects.hashCode(this.returnPoint);
        result = 31 * result + Objects.hashCode(this.rescheduleAble);
        result = 31 * result + Objects.hashCode(this.unRescheduleAbleReason);
        result = 31 * result + Objects.hashCode(this.rescheduleFeeCanCompute);
        result = 31 * result + Objects.hashCode(this.returnPointMinStayDays);
        result = 31 * result + Objects.hashCode(this.returnPointMaxStayDays);
        result = 31 * result + Objects.hashCode(this.policyInfoList);
        result = 31 * result + Objects.hashCode(this.applyReasonMode);
        result = 31 * result + Objects.hashCode(this.canQueryFlight);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("orderID", orderID)
            .add("actulOrderStatus", actulOrderStatus)
            .add("uid", uid)
            .add("flightWay", flightWay)
            .add("contactInfo", contactInfo)
            .add("flightOrderClass", flightOrderClass)
            .add("source", source)
            .add("relatedOrderIDList", relatedOrderIDList)
            .add("segmentInfoList", segmentInfoList)
            .add("isSmallTeam", isSmallTeam)
            .add("returnPoint", returnPoint)
            .add("rescheduleAble", rescheduleAble)
            .add("unRescheduleAbleReason", unRescheduleAbleReason)
            .add("rescheduleFeeCanCompute", rescheduleFeeCanCompute)
            .add("returnPointMinStayDays", returnPointMinStayDays)
            .add("returnPointMaxStayDays", returnPointMaxStayDays)
            .add("policyInfoList", policyInfoList)
            .add("applyReasonMode", applyReasonMode)
            .add("canQueryFlight", canQueryFlight)
            .toString();
    }
}