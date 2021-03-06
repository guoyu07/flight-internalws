/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.soa.resource.v1;

import com.ctrip.soa.global.api.comm.head.v1.Language;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Resource", propOrder = {
    "language",
    "resourceId",
    "resourceValue",
    "resourceKey",
    "resourceType",
    "resourceValueCN",
    "dataChangeLastTime",
    "resourceValueEN"
})
@SuppressWarnings("all")
public class Resource  {

    private static final long serialVersionUID = 1L;

    public Resource(
        Language language, 
        long resourceId, 
        String resourceValue, 
        String resourceKey, 
        String resourceType, 
        String resourceValueCN, 
        Calendar dataChangeLastTime, 
        String resourceValueEN) {
        this.language = language;
        this.resourceId = resourceId;
        this.resourceValue = resourceValue;
        this.resourceKey = resourceKey;
        this.resourceType = resourceType;
        this.resourceValueCN = resourceValueCN;
        this.dataChangeLastTime = dataChangeLastTime;
        this.resourceValueEN = resourceValueEN;
    }

    public Resource() {
    }

    @FieldDoc("语言")
    @JsonProperty("Language")
    @XmlElement(name = "Language")
    private Language language;

    @FieldDoc("资源ID")
    @JsonProperty("ResourceId")
    @XmlElement(name = "ResourceId")
    private long resourceId;

    @FieldDoc("多语言资源值")
    @JsonProperty("ResourceValue")
    @XmlElement(name = "ResourceValue")
    private String resourceValue;

    @FieldDoc("资源key")
    @JsonProperty("ResourceKey")
    @XmlElement(name = "ResourceKey")
    private String resourceKey;

    @FieldDoc("资源类型")
    @JsonProperty("ResourceType")
    @XmlElement(name = "ResourceType")
    private String resourceType;

    @JsonProperty("ResourceValueCN")
    @XmlElement(name = "ResourceValueCN")
    private String resourceValueCN;

    @FieldDoc("变更时间")
    @JsonProperty("DataChangeLastTime")
    @XmlElement(name = "DataChangeLastTime")
    private Calendar dataChangeLastTime;

    @FieldDoc("英文资源值")
    @JsonProperty("ResourceValueEN")
    @XmlElement(name = "ResourceValueEN")
    private String resourceValueEN;

    /**
     * 语言
     */
    public Language getLanguage() {
        return this.language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    /**
     * 资源ID
     */
    public long getResourceId() {
        return this.resourceId;
    }

    public void setResourceId(long resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * 多语言资源值
     */
    public String getResourceValue() {
        return this.resourceValue;
    }

    public void setResourceValue(String resourceValue) {
        this.resourceValue = resourceValue;
    }

    /**
     * 资源key
     */
    public String getResourceKey() {
        return this.resourceKey;
    }

    public void setResourceKey(String resourceKey) {
        this.resourceKey = resourceKey;
    }

    /**
     * 资源类型
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceValueCN() {
        return this.resourceValueCN;
    }

    public void setResourceValueCN(String resourceValueCN) {
        this.resourceValueCN = resourceValueCN;
    }

    /**
     * 变更时间
     */
    public Calendar getDataChangeLastTime() {
        return this.dataChangeLastTime;
    }

    public void setDataChangeLastTime(Calendar dataChangeLastTime) {
        this.dataChangeLastTime = dataChangeLastTime;
    }

    /**
     * 英文资源值
     */
    public String getResourceValueEN() {
        return this.resourceValueEN;
    }

    public void setResourceValueEN(String resourceValueEN) {
        this.resourceValueEN = resourceValueEN;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final Resource other = (Resource)obj;
        return
            Objects.equal(this.language, other.language) && 
            Objects.equal(this.resourceId, other.resourceId) && 
            Objects.equal(this.resourceValue, other.resourceValue) && 
            Objects.equal(this.resourceKey, other.resourceKey) && 
            Objects.equal(this.resourceType, other.resourceType) && 
            Objects.equal(this.resourceValueCN, other.resourceValueCN) && 
            Objects.equal(this.dataChangeLastTime, other.dataChangeLastTime) && 
            Objects.equal(this.resourceValueEN, other.resourceValueEN);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.language);
        result = 31 * result + Objects.hashCode(this.resourceId);
        result = 31 * result + Objects.hashCode(this.resourceValue);
        result = 31 * result + Objects.hashCode(this.resourceKey);
        result = 31 * result + Objects.hashCode(this.resourceType);
        result = 31 * result + Objects.hashCode(this.resourceValueCN);
        result = 31 * result + Objects.hashCode(this.dataChangeLastTime);
        result = 31 * result + Objects.hashCode(this.resourceValueEN);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("language", language)
            .add("resourceId", resourceId)
            .add("resourceValue", resourceValue)
            .add("resourceKey", resourceKey)
            .add("resourceType", resourceType)
            .add("resourceValueCN", resourceValueCN)
            .add("dataChangeLastTime", dataChangeLastTime)
            .add("resourceValueEN", resourceValueEN)
            .toString();
    }
}