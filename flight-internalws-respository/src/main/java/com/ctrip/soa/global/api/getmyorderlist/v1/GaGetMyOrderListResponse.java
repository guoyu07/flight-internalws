/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.getmyorderlist.v1;

import com.ctrip.soa.global.api.comm.responsehead.v1.ResponseHead;
import com.ctriposs.baiji.rpc.common.HasResponseStatus;
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

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaGetMyOrderListResponse", namespace = "http://soa.ctrip.com/Global/API/GetMyOrderList/v1")
@XmlType(name = "GaGetMyOrderListResponse", propOrder = {
    "responseStatus",
    "responseHead",
    "myOrderInfoList",
    "pageCount",
    "pageIndex",
    "pageSize",
    "recordCount"
})
@SuppressWarnings("all")
public class GaGetMyOrderListResponse implements HasResponseStatus {

    private static final long serialVersionUID = 1L;

    public GaGetMyOrderListResponse(
        ResponseStatusType responseStatus, 
        ResponseHead responseHead, 
        List<MyOrderInfo> myOrderInfoList, 
        int pageCount, 
        int pageIndex, 
        int pageSize, 
        int recordCount) {
        this.responseStatus = responseStatus;
        this.responseHead = responseHead;
        this.myOrderInfoList = myOrderInfoList;
        this.pageCount = pageCount;
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.recordCount = recordCount;
    }

    public GaGetMyOrderListResponse() {
    }

    @JsonProperty("ResponseStatus")
    @XmlElement(name = "ResponseStatus")
    private ResponseStatusType responseStatus;

    @JsonProperty("ResponseHead")
    @XmlElement(name = "ResponseHead")
    private ResponseHead responseHead;

    @JsonProperty("MyOrderInfoList")
    @XmlElement(name = "MyOrderInfoList")
    private List<MyOrderInfo> myOrderInfoList;

    @FieldDoc("总页数")
    @JsonProperty("PageCount")
    @XmlElement(name = "PageCount")
    private int pageCount;

    @FieldDoc("分页索引")
    @JsonProperty("PageIndex")
    @XmlElement(name = "PageIndex")
    private int pageIndex;

    @FieldDoc("分页页面大小")
    @JsonProperty("PageSize")
    @XmlElement(name = "PageSize")
    private int pageSize;

    @FieldDoc("查询订单总记录条数")
    @JsonProperty("RecordCount")
    @XmlElement(name = "RecordCount")
    private int recordCount;

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

    public List<MyOrderInfo> getMyOrderInfoList() {
        return this.myOrderInfoList;
    }

    public void setMyOrderInfoList(List<MyOrderInfo> myOrderInfoList) {
        this.myOrderInfoList = myOrderInfoList;
    }

    /**
     * 总页数
     */
    public int getPageCount() {
        return this.pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    /**
     * 分页索引
     */
    public int getPageIndex() {
        return this.pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    /**
     * 分页页面大小
     */
    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 查询订单总记录条数
     */
    public int getRecordCount() {
        return this.recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaGetMyOrderListResponse other = (GaGetMyOrderListResponse)obj;
        return
            Objects.equal(this.responseStatus, other.responseStatus) && 
            Objects.equal(this.responseHead, other.responseHead) && 
            Objects.equal(this.myOrderInfoList, other.myOrderInfoList) && 
            Objects.equal(this.pageCount, other.pageCount) && 
            Objects.equal(this.pageIndex, other.pageIndex) && 
            Objects.equal(this.pageSize, other.pageSize) && 
            Objects.equal(this.recordCount, other.recordCount);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.responseStatus);
        result = 31 * result + Objects.hashCode(this.responseHead);
        result = 31 * result + Objects.hashCode(this.myOrderInfoList);
        result = 31 * result + Objects.hashCode(this.pageCount);
        result = 31 * result + Objects.hashCode(this.pageIndex);
        result = 31 * result + Objects.hashCode(this.pageSize);
        result = 31 * result + Objects.hashCode(this.recordCount);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("responseStatus", responseStatus)
            .add("responseHead", responseHead)
            .add("myOrderInfoList", myOrderInfoList)
            .add("pageCount", pageCount)
            .add("pageIndex", pageIndex)
            .add("pageSize", pageSize)
            .add("recordCount", recordCount)
            .toString();
    }
}