/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.soa.resource.v1;

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
@XmlRootElement(name = "ResourceUpdateByIDRequest", namespace = "http://soa.ctrip.com/global/soa/resource/v1")
@XmlType(name = "ResourceUpdateByIDRequest", propOrder = {
    "resourceList"
})
@SuppressWarnings("all")
public class ResourceUpdateByIDRequest  {

    private static final long serialVersionUID = 1L;

    public ResourceUpdateByIDRequest(
        List<Resource> resourceList) {
        this.resourceList = resourceList;
    }

    public ResourceUpdateByIDRequest() {
    }

    @JsonProperty("ResourceList")
    @XmlElement(name = "ResourceList")
    private List<Resource> resourceList;

    public List<Resource> getResourceList() {
        return this.resourceList;
    }

    public void setResourceList(List<Resource> resourceList) {
        this.resourceList = resourceList;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final ResourceUpdateByIDRequest other = (ResourceUpdateByIDRequest)obj;
        return
            Objects.equal(this.resourceList, other.resourceList);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.resourceList);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("resourceList", resourceList)
            .toString();
    }
}