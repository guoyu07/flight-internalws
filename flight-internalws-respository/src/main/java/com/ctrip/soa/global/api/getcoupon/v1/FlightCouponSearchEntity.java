/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.getcoupon.v1;

import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightCouponSearchEntity", propOrder = {
    "departCityCode",
    "arriveCityCode",
    "flight",
    "subClass",
    "segmentNo",
    "productSource",
    "productType",
    "takeOffTime",
    "discount",
    "airline"
})
@SuppressWarnings("all")
public class FlightCouponSearchEntity  {

    private static final long serialVersionUID = 1L;

    public FlightCouponSearchEntity(
        String departCityCode, 
        String arriveCityCode, 
        String flight, 
        String subClass, 
        int segmentNo, 
        String productSource, 
        String productType, 
        long takeOffTime, 
        BigDecimal discount, 
        String airline) {
        this.departCityCode = departCityCode;
        this.arriveCityCode = arriveCityCode;
        this.flight = flight;
        this.subClass = subClass;
        this.segmentNo = segmentNo;
        this.productSource = productSource;
        this.productType = productType;
        this.takeOffTime = takeOffTime;
        this.discount = discount;
        this.airline = airline;
    }

    public FlightCouponSearchEntity() {
    }

    @FieldDoc("出发城市三字码")
    @JsonProperty("DepartCityCode")
    @XmlElement(name = "DepartCityCode")
    private String departCityCode;

    @FieldDoc("到达城市三字码")
    @JsonProperty("ArriveCityCode")
    @XmlElement(name = "ArriveCityCode")
    private String arriveCityCode;

    @FieldDoc("航班号")
    @JsonProperty("Flight")
    @XmlElement(name = "Flight")
    private String flight;

    @FieldDoc("子舱位")
    @JsonProperty("SubClass")
    @XmlElement(name = "SubClass")
    private String subClass;

    @FieldDoc("航段")
    @JsonProperty("SegmentNo")
    @XmlElement(name = "SegmentNo")
    private int segmentNo;

    @FieldDoc("产品来源")
    @JsonProperty("ProductSource")
    @XmlElement(name = "ProductSource")
    private String productSource;

    @FieldDoc("产品类型")
    @JsonProperty("ProductType")
    @XmlElement(name = "ProductType")
    private String productType;

    @FieldDoc("起飞时间")
    @JsonProperty("TakeOffTime")
    @XmlElement(name = "TakeOffTime")
    private long takeOffTime;

    @FieldDoc("折扣")
    @JsonProperty("Discount")
    @XmlElement(name = "Discount")
    private BigDecimal discount;

    @FieldDoc("航司")
    @JsonProperty("Airline")
    @XmlElement(name = "Airline")
    private String airline;

    /**
     * 出发城市三字码
     */
    public String getDepartCityCode() {
        return this.departCityCode;
    }

    public void setDepartCityCode(String departCityCode) {
        this.departCityCode = departCityCode;
    }

    /**
     * 到达城市三字码
     */
    public String getArriveCityCode() {
        return this.arriveCityCode;
    }

    public void setArriveCityCode(String arriveCityCode) {
        this.arriveCityCode = arriveCityCode;
    }

    /**
     * 航班号
     */
    public String getFlight() {
        return this.flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    /**
     * 子舱位
     */
    public String getSubClass() {
        return this.subClass;
    }

    public void setSubClass(String subClass) {
        this.subClass = subClass;
    }

    /**
     * 航段
     */
    public int getSegmentNo() {
        return this.segmentNo;
    }

    public void setSegmentNo(int segmentNo) {
        this.segmentNo = segmentNo;
    }

    /**
     * 产品来源
     */
    public String getProductSource() {
        return this.productSource;
    }

    public void setProductSource(String productSource) {
        this.productSource = productSource;
    }

    /**
     * 产品类型
     */
    public String getProductType() {
        return this.productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * 起飞时间
     */
    public long getTakeOffTime() {
        return this.takeOffTime;
    }

    public void setTakeOffTime(long takeOffTime) {
        this.takeOffTime = takeOffTime;
    }

    /**
     * 折扣
     */
    public BigDecimal getDiscount() {
        return this.discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * 航司
     */
    public String getAirline() {
        return this.airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final FlightCouponSearchEntity other = (FlightCouponSearchEntity)obj;
        return
            Objects.equal(this.departCityCode, other.departCityCode) && 
            Objects.equal(this.arriveCityCode, other.arriveCityCode) && 
            Objects.equal(this.flight, other.flight) && 
            Objects.equal(this.subClass, other.subClass) && 
            Objects.equal(this.segmentNo, other.segmentNo) && 
            Objects.equal(this.productSource, other.productSource) && 
            Objects.equal(this.productType, other.productType) && 
            Objects.equal(this.takeOffTime, other.takeOffTime) && 
            Objects.equal(this.discount, other.discount) && 
            Objects.equal(this.airline, other.airline);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.departCityCode);
        result = 31 * result + Objects.hashCode(this.arriveCityCode);
        result = 31 * result + Objects.hashCode(this.flight);
        result = 31 * result + Objects.hashCode(this.subClass);
        result = 31 * result + Objects.hashCode(this.segmentNo);
        result = 31 * result + Objects.hashCode(this.productSource);
        result = 31 * result + Objects.hashCode(this.productType);
        result = 31 * result + Objects.hashCode(this.takeOffTime);
        result = 31 * result + Objects.hashCode(this.discount);
        result = 31 * result + Objects.hashCode(this.airline);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("departCityCode", departCityCode)
            .add("arriveCityCode", arriveCityCode)
            .add("flight", flight)
            .add("subClass", subClass)
            .add("segmentNo", segmentNo)
            .add("productSource", productSource)
            .add("productType", productType)
            .add("takeOffTime", takeOffTime)
            .add("discount", discount)
            .add("airline", airline)
            .toString();
    }
}