/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.gaintlxproductsearch.v1;

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
 * 国际机票X产品查询Request
 */
@DtoDoc("国际机票X产品查询Request")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaIntlXProductSearchRequest", namespace = "http://soa.ctrip.com/Global/API/GaIntlXProductSearch/v1")
@XmlType(name = "GaIntlXProductSearchRequest", propOrder = {
    "head",
    "flightSearchInfo"
})
@SuppressWarnings("all")
public class GaIntlXProductSearchRequest  {

    private static final long serialVersionUID = 1L;

    public GaIntlXProductSearchRequest(
        Head head, 
        FlightSearchInfo flightSearchInfo) {
        this.head = head;
        this.flightSearchInfo = flightSearchInfo;
    }

    public GaIntlXProductSearchRequest() {
    }

    @FieldDoc("公共请求头")
    @JsonProperty("Head")
    @XmlElement(name = "Head")
    private Head head;

    @FieldDoc("查询反查关键信息(所需参数较多,不建议前端传参,由API反查组装,有缓存一般情况下性能影响不大)")
    @JsonProperty("FlightSearchInfo")
    @XmlElement(name = "FlightSearchInfo")
    private FlightSearchInfo flightSearchInfo;

    /**
     * 公共请求头
     */
    public Head getHead() {
        return this.head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    /**
     * 查询反查关键信息(所需参数较多,不建议前端传参,由API反查组装,有缓存一般情况下性能影响不大)
     */
    public FlightSearchInfo getFlightSearchInfo() {
        return this.flightSearchInfo;
    }

    public void setFlightSearchInfo(FlightSearchInfo flightSearchInfo) {
        this.flightSearchInfo = flightSearchInfo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaIntlXProductSearchRequest other = (GaIntlXProductSearchRequest)obj;
        return
            Objects.equal(this.head, other.head) && 
            Objects.equal(this.flightSearchInfo, other.flightSearchInfo);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.head);
        result = 31 * result + Objects.hashCode(this.flightSearchInfo);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("head", head)
            .add("flightSearchInfo", flightSearchInfo)
            .toString();
    }
}