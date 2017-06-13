/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.myflightstatelist.v1;

import com.ctrip.soa.global.api.comm.responsehead.v1.ResponseHead;
import com.ctrip.soa.global.api.flightvariinforesponse.v1.FlightVariInfoType;
import com.ctriposs.baiji.rpc.common.HasResponseStatus;
import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.ctriposs.baiji.rpc.common.types.ResponseStatusType;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 用户关注的航班动态管理返回
 */
@DtoDoc("用户关注的航班动态管理返回")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "MyFlightStateListResponse", namespace = "http://soa.ctrip.com/Global/API/MyFlightStateList/v1")
@XmlType(name = "MyFlightStateListResponse", propOrder = {
    "responseStatus",
    "responseHead",
    "retValue",
    "airPortScreenInfos",
    "flightVariInfos",
    "pageIndex",
    "totalPage",
    "totalCounts"
})
@SuppressWarnings("all")
public class MyFlightStateListResponse implements HasResponseStatus {

    private static final long serialVersionUID = 1L;

    public MyFlightStateListResponse(
        ResponseStatusType responseStatus, 
        ResponseHead responseHead, 
        int retValue, 
        List<FlightVariInfoType> airPortScreenInfos, 
        List<FlightVariInfoType> flightVariInfos, 
        int pageIndex, 
        int totalPage, 
        int totalCounts) {
        this.responseStatus = responseStatus;
        this.responseHead = responseHead;
        this.retValue = retValue;
        this.airPortScreenInfos = airPortScreenInfos;
        this.flightVariInfos = flightVariInfos;
        this.pageIndex = pageIndex;
        this.totalPage = totalPage;
        this.totalCounts = totalCounts;
    }

    public MyFlightStateListResponse() {
    }

    @FieldDoc("SOA2.0返回头部信息")
    @JsonProperty("ResponseStatus")
    @XmlElement(name = "ResponseStatus")
    private ResponseStatusType responseStatus;

    @JsonProperty("ResponseHead")
    @XmlElement(name = "ResponseHead")
    private ResponseHead responseHead;

    @FieldDoc("结果代码 0成功 1添加关注失败 2超过关注数量限制 3重复关注  -1取消关注时发现没有关注过该航班  -2取消关注失败 -3取消的关注航班不是自己关注的航班，不能取消")
    @JsonProperty("RetValue")
    @XmlElement(name = "RetValue")
    private int retValue;

    @FieldDoc("航班动态信息集合")
    @JsonProperty("AirPortScreenInfos")
    @XmlElement(name = "AirPortScreenInfos")
    private List<FlightVariInfoType> airPortScreenInfos;

    @FieldDoc("航班动态信息集合")
    @JsonProperty("FlightVariInfos")
    @XmlElement(name = "FlightVariInfos")
    private List<FlightVariInfoType> flightVariInfos;

    @FieldDoc("当前页")
    @JsonProperty("PageIndex")
    @XmlElement(name = "PageIndex")
    private int pageIndex;

    @FieldDoc("页总数")
    @JsonProperty("TotalPage")
    @XmlElement(name = "TotalPage")
    private int totalPage;

    @FieldDoc("页条数")
    @JsonProperty("TotalCounts")
    @XmlElement(name = "TotalCounts")
    private int totalCounts;

    /**
     * SOA2.0返回头部信息
     */
    public ResponseStatusType getResponseStatus() {
        return this.responseStatus;
    }

    public void setResponseStatus(ResponseStatusType responseStatus) {
        this.responseStatus = responseStatus;
    }

    public ResponseHead getResponseHead() {
        return this.responseHead;
    }

    public void setResponseHead(ResponseHead responseHead) {
        this.responseHead = responseHead;
    }

    /**
     * 结果代码 0成功 1添加关注失败 2超过关注数量限制 3重复关注  -1取消关注时发现没有关注过该航班  -2取消关注失败 -3取消的关注航班不是自己关注的航班，不能取消
     */
    public int getRetValue() {
        return this.retValue;
    }

    public void setRetValue(int retValue) {
        this.retValue = retValue;
    }

    /**
     * 航班动态信息集合
     */
    public List<FlightVariInfoType> getAirPortScreenInfos() {
        return this.airPortScreenInfos;
    }

    public void setAirPortScreenInfos(List<FlightVariInfoType> airPortScreenInfos) {
        this.airPortScreenInfos = airPortScreenInfos;
    }

    /**
     * 航班动态信息集合
     */
    public List<FlightVariInfoType> getFlightVariInfos() {
        return this.flightVariInfos;
    }

    public void setFlightVariInfos(List<FlightVariInfoType> flightVariInfos) {
        this.flightVariInfos = flightVariInfos;
    }

    /**
     * 当前页
     */
    public int getPageIndex() {
        return this.pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    /**
     * 页总数
     */
    public int getTotalPage() {
        return this.totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    /**
     * 页条数
     */
    public int getTotalCounts() {
        return this.totalCounts;
    }

    public void setTotalCounts(int totalCounts) {
        this.totalCounts = totalCounts;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final MyFlightStateListResponse other = (MyFlightStateListResponse)obj;
        return
            Objects.equal(this.responseStatus, other.responseStatus) && 
            Objects.equal(this.responseHead, other.responseHead) && 
            Objects.equal(this.retValue, other.retValue) && 
            Objects.equal(this.airPortScreenInfos, other.airPortScreenInfos) && 
            Objects.equal(this.flightVariInfos, other.flightVariInfos) && 
            Objects.equal(this.pageIndex, other.pageIndex) && 
            Objects.equal(this.totalPage, other.totalPage) && 
            Objects.equal(this.totalCounts, other.totalCounts);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.responseStatus);
        result = 31 * result + Objects.hashCode(this.responseHead);
        result = 31 * result + Objects.hashCode(this.retValue);
        result = 31 * result + Objects.hashCode(this.airPortScreenInfos);
        result = 31 * result + Objects.hashCode(this.flightVariInfos);
        result = 31 * result + Objects.hashCode(this.pageIndex);
        result = 31 * result + Objects.hashCode(this.totalPage);
        result = 31 * result + Objects.hashCode(this.totalCounts);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("responseStatus", responseStatus)
            .add("responseHead", responseHead)
            .add("retValue", retValue)
            .add("airPortScreenInfos", airPortScreenInfos)
            .add("flightVariInfos", flightVariInfos)
            .add("pageIndex", pageIndex)
            .add("totalPage", totalPage)
            .add("totalCounts", totalCounts)
            .toString();
    }
}