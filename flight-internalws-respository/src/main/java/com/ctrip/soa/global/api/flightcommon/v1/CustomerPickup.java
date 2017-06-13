/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.flightcommon.v1;

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
@XmlType(name = "CustomerPickup", propOrder = {
    "provinceName",
    "cityName",
    "districtID",
    "address",
    "addressID",
    "postCode",
    "fetchAirport",
    "fetchTime",
    "spaceTime",
    "isAsSend"
})
@SuppressWarnings("all")
public class CustomerPickup  {

    private static final long serialVersionUID = 1L;

    public CustomerPickup(
        String provinceName, 
        String cityName, 
        int districtID, 
        String address, 
        int addressID, 
        String postCode, 
        String fetchAirport, 
        Calendar fetchTime, 
        int spaceTime, 
        boolean isAsSend) {
        this.provinceName = provinceName;
        this.cityName = cityName;
        this.districtID = districtID;
        this.address = address;
        this.addressID = addressID;
        this.postCode = postCode;
        this.fetchAirport = fetchAirport;
        this.fetchTime = fetchTime;
        this.spaceTime = spaceTime;
        this.isAsSend = isAsSend;
    }

    public CustomerPickup() {
    }

    @FieldDoc("省")
    @JsonProperty("ProvinceName")
    @XmlElement(name = "ProvinceName")
    private String provinceName;

    @FieldDoc("城市")
    @JsonProperty("CityName")
    @XmlElement(name = "CityName")
    private String cityName;

    @FieldDoc("取")
    @JsonProperty("DistrictID")
    @XmlElement(name = "DistrictID")
    private int districtID;

    @FieldDoc("地址")
    @JsonProperty("Address")
    @XmlElement(name = "Address")
    private String address;

    @FieldDoc("地址ID")
    @JsonProperty("AddressID")
    @XmlElement(name = "AddressID")
    private int addressID;

    @FieldDoc("邮编")
    @JsonProperty("PostCode")
    @XmlElement(name = "PostCode")
    private String postCode;

    @FieldDoc("机场三字码")
    @JsonProperty("FetchAirport")
    @XmlElement(name = "FetchAirport")
    private String fetchAirport;

    @FieldDoc("提取时间")
    @JsonProperty("FetchTime")
    @XmlElement(name = "FetchTime")
    private Calendar fetchTime;

    @JsonProperty("SpaceTime")
    @XmlElement(name = "SpaceTime")
    private int spaceTime;

    @JsonProperty("IsAsSend")
    @XmlElement(name = "IsAsSend")
    private boolean isAsSend;

    /**
     * 省
     */
    public String getProvinceName() {
        return this.provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    /**
     * 城市
     */
    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * 取
     */
    public int getDistrictID() {
        return this.districtID;
    }

    public void setDistrictID(int districtID) {
        this.districtID = districtID;
    }

    /**
     * 地址
     */
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 地址ID
     */
    public int getAddressID() {
        return this.addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    /**
     * 邮编
     */
    public String getPostCode() {
        return this.postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * 机场三字码
     */
    public String getFetchAirport() {
        return this.fetchAirport;
    }

    public void setFetchAirport(String fetchAirport) {
        this.fetchAirport = fetchAirport;
    }

    /**
     * 提取时间
     */
    public Calendar getFetchTime() {
        return this.fetchTime;
    }

    public void setFetchTime(Calendar fetchTime) {
        this.fetchTime = fetchTime;
    }

    public int getSpaceTime() {
        return this.spaceTime;
    }

    public void setSpaceTime(int spaceTime) {
        this.spaceTime = spaceTime;
    }

    public boolean getIsAsSend() {
        return this.isAsSend;
    }

    public void setIsAsSend(boolean isAsSend) {
        this.isAsSend = isAsSend;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final CustomerPickup other = (CustomerPickup)obj;
        return
            Objects.equal(this.provinceName, other.provinceName) && 
            Objects.equal(this.cityName, other.cityName) && 
            Objects.equal(this.districtID, other.districtID) && 
            Objects.equal(this.address, other.address) && 
            Objects.equal(this.addressID, other.addressID) && 
            Objects.equal(this.postCode, other.postCode) && 
            Objects.equal(this.fetchAirport, other.fetchAirport) && 
            Objects.equal(this.fetchTime, other.fetchTime) && 
            Objects.equal(this.spaceTime, other.spaceTime) && 
            Objects.equal(this.isAsSend, other.isAsSend);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.provinceName);
        result = 31 * result + Objects.hashCode(this.cityName);
        result = 31 * result + Objects.hashCode(this.districtID);
        result = 31 * result + Objects.hashCode(this.address);
        result = 31 * result + Objects.hashCode(this.addressID);
        result = 31 * result + Objects.hashCode(this.postCode);
        result = 31 * result + Objects.hashCode(this.fetchAirport);
        result = 31 * result + Objects.hashCode(this.fetchTime);
        result = 31 * result + Objects.hashCode(this.spaceTime);
        result = 31 * result + Objects.hashCode(this.isAsSend);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("provinceName", provinceName)
            .add("cityName", cityName)
            .add("districtID", districtID)
            .add("address", address)
            .add("addressID", addressID)
            .add("postCode", postCode)
            .add("fetchAirport", fetchAirport)
            .add("fetchTime", fetchTime)
            .add("spaceTime", spaceTime)
            .add("isAsSend", isAsSend)
            .toString();
    }
}