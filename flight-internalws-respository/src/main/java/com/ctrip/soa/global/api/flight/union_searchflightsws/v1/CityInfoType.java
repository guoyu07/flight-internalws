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
@XmlType(name = "CityInfoType", propOrder = {
    "cityID",
    "cityCode",
    "cityName",
    "cityNameEN",
    "provinceID",
    "countryID",
    "countryName"
})
@SuppressWarnings("all")
public class CityInfoType  {

    private static final long serialVersionUID = 1L;

    public CityInfoType(
        int cityID, 
        String cityCode, 
        String cityName, 
        String cityNameEN, 
        int provinceID, 
        int countryID, 
        String countryName) {
        this.cityID = cityID;
        this.cityCode = cityCode;
        this.cityName = cityName;
        this.cityNameEN = cityNameEN;
        this.provinceID = provinceID;
        this.countryID = countryID;
        this.countryName = countryName;
    }

    public CityInfoType() {
    }

    @FieldDoc("城市ID")
    @JsonProperty("CityID")
    @XmlElement(name = "CityID")
    private int cityID;

    @FieldDoc("城市代码")
    @JsonProperty("CityCode")
    @XmlElement(name = "CityCode")
    private String cityCode;

    @FieldDoc("城市名称")
    @JsonProperty("CityName")
    @XmlElement(name = "CityName")
    private String cityName;

    @FieldDoc("城市英文名称")
    @JsonProperty("CityNameEN")
    @XmlElement(name = "CityNameEN")
    private String cityNameEN;

    @FieldDoc("省份ID-")
    @JsonProperty("ProvinceID")
    @XmlElement(name = "ProvinceID")
    private int provinceID;

    @FieldDoc("国家ID")
    @JsonProperty("CountryID")
    @XmlElement(name = "CountryID")
    private int countryID;

    @FieldDoc("国家名称")
    @JsonProperty("CountryName")
    @XmlElement(name = "CountryName")
    private String countryName;

    /**
     * 城市ID
     */
    public int getCityID() {
        return this.cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    /**
     * 城市代码
     */
    public String getCityCode() {
        return this.cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * 城市名称
     */
    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * 城市英文名称
     */
    public String getCityNameEN() {
        return this.cityNameEN;
    }

    public void setCityNameEN(String cityNameEN) {
        this.cityNameEN = cityNameEN;
    }

    /**
     * 省份ID-
     */
    public int getProvinceID() {
        return this.provinceID;
    }

    public void setProvinceID(int provinceID) {
        this.provinceID = provinceID;
    }

    /**
     * 国家ID
     */
    public int getCountryID() {
        return this.countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    /**
     * 国家名称
     */
    public String getCountryName() {
        return this.countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final CityInfoType other = (CityInfoType)obj;
        return
            Objects.equal(this.cityID, other.cityID) && 
            Objects.equal(this.cityCode, other.cityCode) && 
            Objects.equal(this.cityName, other.cityName) && 
            Objects.equal(this.cityNameEN, other.cityNameEN) && 
            Objects.equal(this.provinceID, other.provinceID) && 
            Objects.equal(this.countryID, other.countryID) && 
            Objects.equal(this.countryName, other.countryName);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.cityID);
        result = 31 * result + Objects.hashCode(this.cityCode);
        result = 31 * result + Objects.hashCode(this.cityName);
        result = 31 * result + Objects.hashCode(this.cityNameEN);
        result = 31 * result + Objects.hashCode(this.provinceID);
        result = 31 * result + Objects.hashCode(this.countryID);
        result = 31 * result + Objects.hashCode(this.countryName);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("cityID", cityID)
            .add("cityCode", cityCode)
            .add("cityName", cityName)
            .add("cityNameEN", cityNameEN)
            .add("provinceID", provinceID)
            .add("countryID", countryID)
            .add("countryName", countryName)
            .toString();
    }
}