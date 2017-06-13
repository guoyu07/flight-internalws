/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.flightcommon.v1;

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
 * 重要通知实体
 */
@DtoDoc("重要通知实体")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppSloganInfo", propOrder = {
    "appSloganClass",
    "appSloganText"
})
@SuppressWarnings("all")
public class AppSloganInfo  {

    private static final long serialVersionUID = 1L;

    public AppSloganInfo(
        int appSloganClass, 
        String appSloganText) {
        this.appSloganClass = appSloganClass;
        this.appSloganText = appSloganText;
    }

    public AppSloganInfo() {
    }

    @FieldDoc("层级别")
    @JsonProperty("APPSloganClass")
    @XmlElement(name = "APPSloganClass")
    private int appSloganClass;

    @FieldDoc("内容")
    @JsonProperty("APPSloganText")
    @XmlElement(name = "APPSloganText")
    private String appSloganText;

    /**
     * 层级别
     */
    public int getAppSloganClass() {
        return this.appSloganClass;
    }

    public void setAppSloganClass(int appSloganClass) {
        this.appSloganClass = appSloganClass;
    }

    /**
     * 内容
     */
    public String getAppSloganText() {
        return this.appSloganText;
    }

    public void setAppSloganText(String appSloganText) {
        this.appSloganText = appSloganText;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final AppSloganInfo other = (AppSloganInfo)obj;
        return
            Objects.equal(this.appSloganClass, other.appSloganClass) && 
            Objects.equal(this.appSloganText, other.appSloganText);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.appSloganClass);
        result = 31 * result + Objects.hashCode(this.appSloganText);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("appSloganClass", appSloganClass)
            .add("appSloganText", appSloganText)
            .toString();
    }
}