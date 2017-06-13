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
import javax.xml.bind.annotation.XmlType;

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomResourceList", propOrder = {
    "roomID",
    "roomResource"
})
@SuppressWarnings("all")
public class RoomResourceList  {

    private static final long serialVersionUID = 1L;

    public RoomResourceList(
        int roomID, 
        List<Resource> roomResource) {
        this.roomID = roomID;
        this.roomResource = roomResource;
    }

    public RoomResourceList() {
    }

    @JsonProperty("RoomID")
    @XmlElement(name = "RoomID")
    private int roomID;

    @JsonProperty("RoomResource")
    @XmlElement(name = "RoomResource")
    private List<Resource> roomResource;

    public int getRoomID() {
        return this.roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public List<Resource> getRoomResource() {
        return this.roomResource;
    }

    public void setRoomResource(List<Resource> roomResource) {
        this.roomResource = roomResource;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final RoomResourceList other = (RoomResourceList)obj;
        return
            Objects.equal(this.roomID, other.roomID) && 
            Objects.equal(this.roomResource, other.roomResource);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.roomID);
        result = 31 * result + Objects.hashCode(this.roomResource);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("roomID", roomID)
            .add("roomResource", roomResource)
            .toString();
    }
}