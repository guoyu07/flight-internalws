/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.gaintlxproductsearch.v1;

import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
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

/**
 * 增值服务价格信息
 */
@DtoDoc("增值服务价格信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueAddedSalePrice", propOrder = {
    "valueAddedToken",
    "pkgNumber",
    "origPriceInfo",
    "origWeightInfo",
    "specifiedPriceInfoList",
    "specifiedWeightInfoList",
    "description",
    "tag"
})
@SuppressWarnings("all")
public class ValueAddedSalePrice  {

    private static final long serialVersionUID = 1L;

    public ValueAddedSalePrice(
        String valueAddedToken, 
        String pkgNumber, 
        ValueAddedBaggagePriceInfo origPriceInfo, 
        ValueAddedBaggageWeightInfo origWeightInfo, 
        List<ValueAddedBaggagePriceInfo> specifiedPriceInfoList, 
        List<ValueAddedBaggageWeightInfo> specifiedWeightInfoList, 
        String description, 
        String tag) {
        this.valueAddedToken = valueAddedToken;
        this.pkgNumber = pkgNumber;
        this.origPriceInfo = origPriceInfo;
        this.origWeightInfo = origWeightInfo;
        this.specifiedPriceInfoList = specifiedPriceInfoList;
        this.specifiedWeightInfoList = specifiedWeightInfoList;
        this.description = description;
        this.tag = tag;
    }

    public ValueAddedSalePrice() {
    }

    @FieldDoc("行李额增值服务每个价格的唯一Token")
    @JsonProperty("ValueAddedToken")
    @XmlElement(name = "ValueAddedToken")
    private String valueAddedToken;

    @FieldDoc("行李额数量")
    @JsonProperty("PkgNumber")
    @XmlElement(name = "PkgNumber")
    private String pkgNumber;

    @FieldDoc("原始价格信息")
    @JsonProperty("OrigPriceInfo")
    @XmlElement(name = "OrigPriceInfo")
    private ValueAddedBaggagePriceInfo origPriceInfo;

    @FieldDoc("原始重量信息")
    @JsonProperty("OrigWeightInfo")
    @XmlElement(name = "OrigWeightInfo")
    private ValueAddedBaggageWeightInfo origWeightInfo;

    @FieldDoc("指定币种的价格信息列表")
    @JsonProperty("SpecifiedPriceInfoList")
    @XmlElement(name = "SpecifiedPriceInfoList")
    private List<ValueAddedBaggagePriceInfo> specifiedPriceInfoList;

    @FieldDoc("指定计量单位的重量信息列表")
    @JsonProperty("SpecifiedWeightInfoList")
    @XmlElement(name = "SpecifiedWeightInfoList")
    private List<ValueAddedBaggageWeightInfo> specifiedWeightInfoList;

    @FieldDoc("描述信息")
    @JsonProperty("Description")
    @XmlElement(name = "Description")
    private String description;

    @FieldDoc("标识")
    @JsonProperty("Tag")
    @XmlElement(name = "Tag")
    private String tag;

    /**
     * 行李额增值服务每个价格的唯一Token
     */
    public String getValueAddedToken() {
        return this.valueAddedToken;
    }

    public void setValueAddedToken(String valueAddedToken) {
        this.valueAddedToken = valueAddedToken;
    }

    /**
     * 行李额数量
     */
    public String getPkgNumber() {
        return this.pkgNumber;
    }

    public void setPkgNumber(String pkgNumber) {
        this.pkgNumber = pkgNumber;
    }

    /**
     * 原始价格信息
     */
    public ValueAddedBaggagePriceInfo getOrigPriceInfo() {
        return this.origPriceInfo;
    }

    public void setOrigPriceInfo(ValueAddedBaggagePriceInfo origPriceInfo) {
        this.origPriceInfo = origPriceInfo;
    }

    /**
     * 原始重量信息
     */
    public ValueAddedBaggageWeightInfo getOrigWeightInfo() {
        return this.origWeightInfo;
    }

    public void setOrigWeightInfo(ValueAddedBaggageWeightInfo origWeightInfo) {
        this.origWeightInfo = origWeightInfo;
    }

    /**
     * 指定币种的价格信息列表
     */
    public List<ValueAddedBaggagePriceInfo> getSpecifiedPriceInfoList() {
        return this.specifiedPriceInfoList;
    }

    public void setSpecifiedPriceInfoList(List<ValueAddedBaggagePriceInfo> specifiedPriceInfoList) {
        this.specifiedPriceInfoList = specifiedPriceInfoList;
    }

    /**
     * 指定计量单位的重量信息列表
     */
    public List<ValueAddedBaggageWeightInfo> getSpecifiedWeightInfoList() {
        return this.specifiedWeightInfoList;
    }

    public void setSpecifiedWeightInfoList(List<ValueAddedBaggageWeightInfo> specifiedWeightInfoList) {
        this.specifiedWeightInfoList = specifiedWeightInfoList;
    }

    /**
     * 描述信息
     */
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 标识
     */
    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final ValueAddedSalePrice other = (ValueAddedSalePrice)obj;
        return
            Objects.equal(this.valueAddedToken, other.valueAddedToken) && 
            Objects.equal(this.pkgNumber, other.pkgNumber) && 
            Objects.equal(this.origPriceInfo, other.origPriceInfo) && 
            Objects.equal(this.origWeightInfo, other.origWeightInfo) && 
            Objects.equal(this.specifiedPriceInfoList, other.specifiedPriceInfoList) && 
            Objects.equal(this.specifiedWeightInfoList, other.specifiedWeightInfoList) && 
            Objects.equal(this.description, other.description) && 
            Objects.equal(this.tag, other.tag);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.valueAddedToken);
        result = 31 * result + Objects.hashCode(this.pkgNumber);
        result = 31 * result + Objects.hashCode(this.origPriceInfo);
        result = 31 * result + Objects.hashCode(this.origWeightInfo);
        result = 31 * result + Objects.hashCode(this.specifiedPriceInfoList);
        result = 31 * result + Objects.hashCode(this.specifiedWeightInfoList);
        result = 31 * result + Objects.hashCode(this.description);
        result = 31 * result + Objects.hashCode(this.tag);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("valueAddedToken", valueAddedToken)
            .add("pkgNumber", pkgNumber)
            .add("origPriceInfo", origPriceInfo)
            .add("origWeightInfo", origWeightInfo)
            .add("specifiedPriceInfoList", specifiedPriceInfoList)
            .add("specifiedWeightInfoList", specifiedWeightInfoList)
            .add("description", description)
            .add("tag", tag)
            .toString();
    }
}