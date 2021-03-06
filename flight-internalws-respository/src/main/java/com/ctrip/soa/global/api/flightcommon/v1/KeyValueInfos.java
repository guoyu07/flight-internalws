/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.flightcommon.v1;

import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
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
 * 键值对信息
 */
@DtoDoc("键值对信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValueInfos", propOrder = {
    "title",
    "desc"
})
@SuppressWarnings("all")
public class KeyValueInfos  {

    private static final long serialVersionUID = 1L;

    public KeyValueInfos(
        String title, 
        String desc) {
        this.title = title;
        this.desc = desc;
    }

    public KeyValueInfos() {
    }

    @JsonProperty("Title")
    @XmlElement(name = "Title")
    private String title;

    @JsonProperty("Desc")
    @XmlElement(name = "Desc")
    private String desc;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final KeyValueInfos other = (KeyValueInfos)obj;
        return
            Objects.equal(this.title, other.title) && 
            Objects.equal(this.desc, other.desc);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.title);
        result = 31 * result + Objects.hashCode(this.desc);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("title", title)
            .add("desc", desc)
            .toString();
    }
}