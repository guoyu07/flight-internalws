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
@XmlType(name = "ResultControlType", propOrder = {
    "maxResultCount",
    "sortInstruction",
    "transferType",
    "defaultPriceOnly",
    "lowestPriceOnly"
})
@SuppressWarnings("all")
public class ResultControlType  {

    private static final long serialVersionUID = 1L;

    public ResultControlType(
        int maxResultCount, 
        ProductSortType sortInstruction, 
        int transferType, 
        boolean defaultPriceOnly, 
        boolean lowestPriceOnly) {
        this.maxResultCount = maxResultCount;
        this.sortInstruction = sortInstruction;
        this.transferType = transferType;
        this.defaultPriceOnly = defaultPriceOnly;
        this.lowestPriceOnly = lowestPriceOnly;
    }

    public ResultControlType() {
    }

    @FieldDoc("Set the result count")
    @JsonProperty("MaxResultCount")
    @XmlElement(name = "MaxResultCount")
    private int maxResultCount;

    @FieldDoc("Result sort parameter")
    @JsonProperty("SortInstruction")
    @XmlElement(name = "SortInstruction")
    private ProductSortType sortInstruction;

    @JsonProperty("TransferType")
    @XmlElement(name = "TransferType")
    private int transferType;

    @FieldDoc("Whether only returns the price info of the default price under each PU")
    @JsonProperty("DefaultPriceOnly")
    @XmlElement(name = "DefaultPriceOnly")
    private boolean defaultPriceOnly;

    @FieldDoc("Whether only returns the lowest price under each Flight Prodoct Group")
    @JsonProperty("LowestPriceOnly")
    @XmlElement(name = "LowestPriceOnly")
    private boolean lowestPriceOnly;

    /**
     * Set the result count
     */
    public int getMaxResultCount() {
        return this.maxResultCount;
    }

    public void setMaxResultCount(int maxResultCount) {
        this.maxResultCount = maxResultCount;
    }

    /**
     * Result sort parameter
     */
    public ProductSortType getSortInstruction() {
        return this.sortInstruction;
    }

    public void setSortInstruction(ProductSortType sortInstruction) {
        this.sortInstruction = sortInstruction;
    }

    public int getTransferType() {
        return this.transferType;
    }

    public void setTransferType(int transferType) {
        this.transferType = transferType;
    }

    /**
     * Whether only returns the price info of the default price under each PU
     */
    public boolean getDefaultPriceOnly() {
        return this.defaultPriceOnly;
    }

    public void setDefaultPriceOnly(boolean defaultPriceOnly) {
        this.defaultPriceOnly = defaultPriceOnly;
    }

    /**
     * Whether only returns the lowest price under each Flight Prodoct Group
     */
    public boolean getLowestPriceOnly() {
        return this.lowestPriceOnly;
    }

    public void setLowestPriceOnly(boolean lowestPriceOnly) {
        this.lowestPriceOnly = lowestPriceOnly;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final ResultControlType other = (ResultControlType)obj;
        return
            Objects.equal(this.maxResultCount, other.maxResultCount) && 
            Objects.equal(this.sortInstruction, other.sortInstruction) && 
            Objects.equal(this.transferType, other.transferType) && 
            Objects.equal(this.defaultPriceOnly, other.defaultPriceOnly) && 
            Objects.equal(this.lowestPriceOnly, other.lowestPriceOnly);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.maxResultCount);
        result = 31 * result + Objects.hashCode(this.sortInstruction);
        result = 31 * result + Objects.hashCode(this.transferType);
        result = 31 * result + Objects.hashCode(this.defaultPriceOnly);
        result = 31 * result + Objects.hashCode(this.lowestPriceOnly);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("maxResultCount", maxResultCount)
            .add("sortInstruction", sortInstruction)
            .add("transferType", transferType)
            .add("defaultPriceOnly", defaultPriceOnly)
            .add("lowestPriceOnly", lowestPriceOnly)
            .toString();
    }
}