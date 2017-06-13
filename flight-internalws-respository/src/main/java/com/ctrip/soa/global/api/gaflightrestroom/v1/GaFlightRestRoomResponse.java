/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.gaflightrestroom.v1;

import com.ctrip.soa.global.api.comm.responsehead.v1.ResponseHead;
import com.ctrip.soa.global.api.flightcommon.v1.VipLounge;
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
 * 国内机票休息室查询返回值
 */
@DtoDoc("国内机票休息室查询返回值")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaFlightRestRoomResponse", namespace = "http://soa.ctrip.com/Global/API/GaFlightRestRoom/v1")
@XmlType(name = "GaFlightRestRoomResponse", propOrder = {
    "responseStatus",
    "responseHead",
    "vipLoungeList"
})
@SuppressWarnings("all")
public class GaFlightRestRoomResponse implements HasResponseStatus {

    private static final long serialVersionUID = 1L;

    public GaFlightRestRoomResponse(
        ResponseStatusType responseStatus, 
        ResponseHead responseHead, 
        List<VipLounge> vipLoungeList) {
        this.responseStatus = responseStatus;
        this.responseHead = responseHead;
        this.vipLoungeList = vipLoungeList;
    }

    public GaFlightRestRoomResponse() {
    }

    @FieldDoc("SOA2.0返回头部信息")
    @JsonProperty("ResponseStatus")
    @XmlElement(name = "ResponseStatus")
    private ResponseStatusType responseStatus;

    @JsonProperty("ResponseHead")
    @XmlElement(name = "ResponseHead")
    private ResponseHead responseHead;

    @FieldDoc("国内机票休息室信息")
    @JsonProperty("VipLoungeList")
    @XmlElement(name = "VipLoungeList")
    private List<VipLounge> vipLoungeList;

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
     * 国内机票休息室信息
     */
    public List<VipLounge> getVipLoungeList() {
        return this.vipLoungeList;
    }

    public void setVipLoungeList(List<VipLounge> vipLoungeList) {
        this.vipLoungeList = vipLoungeList;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaFlightRestRoomResponse other = (GaFlightRestRoomResponse)obj;
        return
            Objects.equal(this.responseStatus, other.responseStatus) && 
            Objects.equal(this.responseHead, other.responseHead) && 
            Objects.equal(this.vipLoungeList, other.vipLoungeList);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.responseStatus);
        result = 31 * result + Objects.hashCode(this.responseHead);
        result = 31 * result + Objects.hashCode(this.vipLoungeList);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("responseStatus", responseStatus)
            .add("responseHead", responseHead)
            .add("vipLoungeList", vipLoungeList)
            .toString();
    }
}