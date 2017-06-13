/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.flight.union_searchflightsws.v1;

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

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirportInfoType", propOrder = {
    "terminal",
    "portCode",
    "portName",
    "portNameEN"
})
@SuppressWarnings("all")
public class AirportInfoType  {

    private static final long serialVersionUID = 1L;

    public AirportInfoType(
        String terminal, 
        String portCode, 
        String portName, 
        String portNameEN) {
        this.terminal = terminal;
        this.portCode = portCode;
        this.portName = portName;
        this.portNameEN = portNameEN;
    }

    public AirportInfoType() {
    }

    @FieldDoc("航站楼")
    @JsonProperty("Terminal")
    @XmlElement(name = "Terminal")
    private String terminal;

    @FieldDoc("机场代码")
    @JsonProperty("PortCode")
    @XmlElement(name = "PortCode")
    private String portCode;

    @FieldDoc("机场名称")
    @JsonProperty("PortName")
    @XmlElement(name = "PortName")
    private String portName;

    @FieldDoc("机场英文名称")
    @JsonProperty("PortNameEN")
    @XmlElement(name = "PortNameEN")
    private String portNameEN;

    /**
     * 航站楼
     */
    public String getTerminal() {
        return this.terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    /**
     * 机场代码
     */
    public String getPortCode() {
        return this.portCode;
    }

    public void setPortCode(String portCode) {
        this.portCode = portCode;
    }

    /**
     * 机场名称
     */
    public String getPortName() {
        return this.portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    /**
     * 机场英文名称
     */
    public String getPortNameEN() {
        return this.portNameEN;
    }

    public void setPortNameEN(String portNameEN) {
        this.portNameEN = portNameEN;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final AirportInfoType other = (AirportInfoType)obj;
        return
            Objects.equal(this.terminal, other.terminal) && 
            Objects.equal(this.portCode, other.portCode) && 
            Objects.equal(this.portName, other.portName) && 
            Objects.equal(this.portNameEN, other.portNameEN);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.terminal);
        result = 31 * result + Objects.hashCode(this.portCode);
        result = 31 * result + Objects.hashCode(this.portName);
        result = 31 * result + Objects.hashCode(this.portNameEN);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("terminal", terminal)
            .add("portCode", portCode)
            .add("portName", portName)
            .add("portNameEN", portNameEN)
            .toString();
    }
}