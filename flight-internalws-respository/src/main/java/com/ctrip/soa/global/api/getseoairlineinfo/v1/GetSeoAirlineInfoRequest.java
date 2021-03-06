/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.getseoairlineinfo.v1;

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
 * 机票Seo航线信息请求
 */
@DtoDoc("机票Seo航线信息请求")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GetSeoAirlineInfoRequest", namespace = "http://soa.ctrip.com/Global/API/GetSeoAirlineInfo/v1")
@XmlType(name = "GetSeoAirlineInfoRequest", propOrder = {
    "head",
    "dCityCode",
    "aCityCode"
})
@SuppressWarnings("all")
public class GetSeoAirlineInfoRequest  {

    private static final long serialVersionUID = 1L;

    public GetSeoAirlineInfoRequest(
        Head head, 
        String dCityCode, 
        String aCityCode) {
        this.head = head;
        this.dCityCode = dCityCode;
        this.aCityCode = aCityCode;
    }

    public GetSeoAirlineInfoRequest() {
    }

    @FieldDoc("SOA2.0请求头部信息")
    @JsonProperty("Head")
    @XmlElement(name = "Head")
    private Head head;

    @FieldDoc("出发城市三字码")
    @JsonProperty("dCityCode")
    @XmlElement(name = "dCityCode")
    private String dCityCode;

    @FieldDoc("到达城市三字码")
    @JsonProperty("aCityCode")
    @XmlElement(name = "aCityCode")
    private String aCityCode;

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
     * 出发城市三字码
     */
    public String getDCityCode() {
        return this.dCityCode;
    }

    public void setDCityCode(String dCityCode) {
        this.dCityCode = dCityCode;
    }

    /**
     * 到达城市三字码
     */
    public String getACityCode() {
        return this.aCityCode;
    }

    public void setACityCode(String aCityCode) {
        this.aCityCode = aCityCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GetSeoAirlineInfoRequest other = (GetSeoAirlineInfoRequest)obj;
        return
            Objects.equal(this.head, other.head) && 
            Objects.equal(this.dCityCode, other.dCityCode) && 
            Objects.equal(this.aCityCode, other.aCityCode);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.head);
        result = 31 * result + Objects.hashCode(this.dCityCode);
        result = 31 * result + Objects.hashCode(this.aCityCode);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("head", head)
            .add("dCityCode", dCityCode)
            .add("aCityCode", aCityCode)
            .toString();
    }
}