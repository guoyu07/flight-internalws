/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.searhflightporduct.v1;

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
 * 排序信息
 */
@DtoDoc("排序信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequenceInfo", propOrder = {
    "sequenceType",
    "collationsType",
    "isDirectFirst"
})
@SuppressWarnings("all")
public class SequenceInfo  {

    private static final long serialVersionUID = 1L;

    public SequenceInfo(
        SequenceType sequenceType, 
        CollationsType collationsType, 
        boolean isDirectFirst) {
        this.sequenceType = sequenceType;
        this.collationsType = collationsType;
        this.isDirectFirst = isDirectFirst;
    }

    public SequenceInfo() {
    }

    @FieldDoc("排序类型")
    @JsonProperty("SequenceType")
    @XmlElement(name = "SequenceType", nillable = true)
    private SequenceType sequenceType;

    @FieldDoc("排序规则")
    @JsonProperty("CollationsType")
    @XmlElement(name = "CollationsType", nillable = true)
    private CollationsType collationsType;

    @FieldDoc("5.0新增字段，是否直飞优先")
    @JsonProperty("IsDirectFirst")
    @XmlElement(name = "IsDirectFirst")
    private boolean isDirectFirst;

    /**
     * 排序类型
     */
    public SequenceType getSequenceType() {
        return this.sequenceType;
    }

    public void setSequenceType(SequenceType sequenceType) {
        this.sequenceType = sequenceType;
    }

    /**
     * 排序规则
     */
    public CollationsType getCollationsType() {
        return this.collationsType;
    }

    public void setCollationsType(CollationsType collationsType) {
        this.collationsType = collationsType;
    }

    /**
     * 5.0新增字段，是否直飞优先
     */
    public boolean getIsDirectFirst() {
        return this.isDirectFirst;
    }

    public void setIsDirectFirst(boolean isDirectFirst) {
        this.isDirectFirst = isDirectFirst;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final SequenceInfo other = (SequenceInfo)obj;
        return
            Objects.equal(this.sequenceType, other.sequenceType) && 
            Objects.equal(this.collationsType, other.collationsType) && 
            Objects.equal(this.isDirectFirst, other.isDirectFirst);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.sequenceType);
        result = 31 * result + Objects.hashCode(this.collationsType);
        result = 31 * result + Objects.hashCode(this.isDirectFirst);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("sequenceType", sequenceType)
            .add("collationsType", collationsType)
            .add("isDirectFirst", isDirectFirst)
            .toString();
    }
}