/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.gagetfltunsubmit.v1;

import com.ctrip.soa.global.api.comm.head.v1.Head;
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
 * 国际机票提交订单
 */
@DtoDoc("国际机票提交订单")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaGetFltUnSubmitRequest", namespace = "http://soa.ctrip.com/Global/API/GaGetFltUnSubmit/v1")
@XmlType(name = "GaGetFltUnSubmitRequest", propOrder = {
    "head",
    "beginDate",
    "endDate"
})
@SuppressWarnings("all")
public class GaGetFltUnSubmitRequest  {

    private static final long serialVersionUID = 1L;

    public GaGetFltUnSubmitRequest(
        Head head, 
        String beginDate, 
        String endDate) {
        this.head = head;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public GaGetFltUnSubmitRequest() {
    }

    @FieldDoc("SOA2.0请求头部信息")
    @JsonProperty("Head")
    @XmlElement(name = "Head")
    private Head head;

    @FieldDoc("查询开始时间")
    @JsonProperty("BeginDate")
    @XmlElement(name = "BeginDate")
    private String beginDate;

    @FieldDoc("查询结束时间")
    @JsonProperty("EndDate")
    @XmlElement(name = "EndDate")
    private String endDate;

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
     * 查询开始时间
     */
    public String getBeginDate() {
        return this.beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * 查询结束时间
     */
    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaGetFltUnSubmitRequest other = (GaGetFltUnSubmitRequest)obj;
        return
            Objects.equal(this.head, other.head) && 
            Objects.equal(this.beginDate, other.beginDate) && 
            Objects.equal(this.endDate, other.endDate);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.head);
        result = 31 * result + Objects.hashCode(this.beginDate);
        result = 31 * result + Objects.hashCode(this.endDate);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("head", head)
            .add("beginDate", beginDate)
            .add("endDate", endDate)
            .toString();
    }
}