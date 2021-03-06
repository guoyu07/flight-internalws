/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.soa.resource.v1;

import com.ctriposs.baiji.rpc.common.HasResponseStatus;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.ctriposs.baiji.rpc.common.types.ResponseStatusType;
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

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ResourceKeysBykeyResponse", namespace = "http://soa.ctrip.com/global/soa/resource/v1")
@XmlType(name = "ResourceKeysBykeyResponse", propOrder = {
    "responseStatus",
    "resourceKey",
    "resourceValue"
})
@SuppressWarnings("all")
public class ResourceKeysBykeyResponse implements HasResponseStatus {

    private static final long serialVersionUID = 1L;

    public ResourceKeysBykeyResponse(
        ResponseStatusType responseStatus, 
        String resourceKey, 
        String resourceValue) {
        this.responseStatus = responseStatus;
        this.resourceKey = resourceKey;
        this.resourceValue = resourceValue;
    }

    public ResourceKeysBykeyResponse() {
    }

    @FieldDoc("返回的状态")
    @JsonProperty("ResponseStatus")
    @XmlElement(name = "ResponseStatus")
    private ResponseStatusType responseStatus;

    @FieldDoc("ResourceKey")
    @JsonProperty("ResourceKey")
    @XmlElement(name = "ResourceKey")
    private String resourceKey;

    @FieldDoc("ResourceValue")
    @JsonProperty("ResourceValue")
    @XmlElement(name = "ResourceValue")
    private String resourceValue;

    /**
     * 返回的状态
     */
    public ResponseStatusType getResponseStatus() {
        return this.responseStatus;
    }

    public void setResponseStatus(ResponseStatusType responseStatus) {
        this.responseStatus = responseStatus;
    }

    /**
     * ResourceKey
     */
    public String getResourceKey() {
        return this.resourceKey;
    }

    public void setResourceKey(String resourceKey) {
        this.resourceKey = resourceKey;
    }

    /**
     * ResourceValue
     */
    public String getResourceValue() {
        return this.resourceValue;
    }

    public void setResourceValue(String resourceValue) {
        this.resourceValue = resourceValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final ResourceKeysBykeyResponse other = (ResourceKeysBykeyResponse)obj;
        return
            Objects.equal(this.responseStatus, other.responseStatus) && 
            Objects.equal(this.resourceKey, other.resourceKey) && 
            Objects.equal(this.resourceValue, other.resourceValue);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.responseStatus);
        result = 31 * result + Objects.hashCode(this.resourceKey);
        result = 31 * result + Objects.hashCode(this.resourceValue);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("responseStatus", responseStatus)
            .add("resourceKey", resourceKey)
            .add("resourceValue", resourceValue)
            .toString();
    }
}