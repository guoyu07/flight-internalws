/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.getintlinsurance.v1;

import com.ctrip.soa.global.api.comm.head.v1.Head;
import com.ctrip.soa.global.api.flightcommon.v1.GaSimpleFlightInfo;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaGetIntlInsuranceRequest", namespace = "http://soa.ctrip.com/Global/API/GetIntlInsurance/v1")
@XmlType(name = "GaGetIntlInsuranceRequest", propOrder = {
    "head",
    "flightList",
    "agentCityCode"
})
@SuppressWarnings("all")
public class GaGetIntlInsuranceRequest  {

    private static final long serialVersionUID = 1L;

    public GaGetIntlInsuranceRequest(
        Head head, 
        List<GaSimpleFlightInfo> flightList, 
        String agentCityCode) {
        this.head = head;
        this.flightList = flightList;
        this.agentCityCode = agentCityCode;
    }

    public GaGetIntlInsuranceRequest() {
    }

    @JsonProperty("Head")
    @XmlElement(name = "Head")
    private Head head;

    @JsonProperty("FlightList")
    @XmlElement(name = "FlightList")
    private List<GaSimpleFlightInfo> flightList;

    @FieldDoc("出票城市code")
    @JsonProperty("AgentCityCode")
    @XmlElement(name = "AgentCityCode")
    private String agentCityCode;

    public Head getHead() {
        return this.head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public List<GaSimpleFlightInfo> getFlightList() {
        return this.flightList;
    }

    public void setFlightList(List<GaSimpleFlightInfo> flightList) {
        this.flightList = flightList;
    }

    /**
     * 出票城市code
     */
    public String getAgentCityCode() {
        return this.agentCityCode;
    }

    public void setAgentCityCode(String agentCityCode) {
        this.agentCityCode = agentCityCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaGetIntlInsuranceRequest other = (GaGetIntlInsuranceRequest)obj;
        return
            Objects.equal(this.head, other.head) && 
            Objects.equal(this.flightList, other.flightList) && 
            Objects.equal(this.agentCityCode, other.agentCityCode);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.head);
        result = 31 * result + Objects.hashCode(this.flightList);
        result = 31 * result + Objects.hashCode(this.agentCityCode);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("head", head)
            .add("flightList", flightList)
            .add("agentCityCode", agentCityCode)
            .toString();
    }
}