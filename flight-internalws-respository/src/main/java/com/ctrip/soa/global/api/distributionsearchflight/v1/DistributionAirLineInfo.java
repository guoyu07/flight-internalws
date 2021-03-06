/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.distributionsearchflight.v1;

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
 * 航空公司信息
 */
@DtoDoc("航空公司信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionAirLineInfo", propOrder = {
    "code",
    "name",
    "enName"
})
@SuppressWarnings("all")
public class DistributionAirLineInfo  {

    private static final long serialVersionUID = 1L;

    public DistributionAirLineInfo(
        String code, 
        String name, 
        String enName) {
        this.code = code;
        this.name = name;
        this.enName = enName;
    }

    public DistributionAirLineInfo() {
    }

    @FieldDoc("航司二字码")
    @JsonProperty("Code")
    @XmlElement(name = "Code")
    private String code;

    @FieldDoc("航司多语言名称")
    @JsonProperty("Name")
    @XmlElement(name = "Name")
    private String name;

    @FieldDoc("航司英文名称")
    @JsonProperty("ENName")
    @XmlElement(name = "ENName")
    private String enName;

    /**
     * 航司二字码
     */
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 航司多语言名称
     */
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 航司英文名称
     */
    public String getEnName() {
        return this.enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final DistributionAirLineInfo other = (DistributionAirLineInfo)obj;
        return
            Objects.equal(this.code, other.code) && 
            Objects.equal(this.name, other.name) && 
            Objects.equal(this.enName, other.enName);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.code);
        result = 31 * result + Objects.hashCode(this.name);
        result = 31 * result + Objects.hashCode(this.enName);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("code", code)
            .add("name", name)
            .add("enName", enName)
            .toString();
    }
}