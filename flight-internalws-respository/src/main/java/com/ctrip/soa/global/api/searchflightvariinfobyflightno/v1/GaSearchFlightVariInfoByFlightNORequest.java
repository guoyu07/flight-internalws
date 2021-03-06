/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.searchflightvariinfobyflightno.v1;

import com.ctrip.soa.global.api.comm.head.v1.RequestHead;
import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 请求实体
 */
@DtoDoc("请求实体")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaSearchFlightVariInfoByFlightNORequest", namespace = "http://soa.ctrip.com/Global/API/SearchFlightVariInfoByFlightNO/v1")
@XmlType(name = "GaSearchFlightVariInfoByFlightNORequest", propOrder = {
    "flightNo",
    "flightDate",
    "flightDateLong",
    "aAirportCode",
    "dAirportCode"
})
@SuppressWarnings("all")
public class GaSearchFlightVariInfoByFlightNORequest extends RequestHead  {

    private static final long serialVersionUID = 1L;

    public GaSearchFlightVariInfoByFlightNORequest(
        String flightNo, 
        Calendar flightDate, 
        long flightDateLong, 
        String aAirportCode, 
        String dAirportCode) {
        this.flightNo = flightNo;
        this.flightDate = flightDate;
        this.flightDateLong = flightDateLong;
        this.aAirportCode = aAirportCode;
        this.dAirportCode = dAirportCode;
    }

    public GaSearchFlightVariInfoByFlightNORequest() {
    }

    @FieldDoc("航班号")
    @JsonProperty("FlightNo")
    @XmlElement(name = "FlightNo")
    private String flightNo;

    @FieldDoc("航班日期")
    @JsonProperty("FlightDate")
    @XmlElement(name = "FlightDate")
    private Calendar flightDate;

    @FieldDoc("航班日期")
    @JsonProperty("FlightDateLong")
    @XmlElement(name = "FlightDateLong")
    private long flightDateLong;

    @FieldDoc("到达机场")
    @JsonProperty("AAirportCode")
    @XmlElement(name = "AAirportCode")
    private String aAirportCode;

    @FieldDoc("出发机场")
    @JsonProperty("DAirportCode")
    @XmlElement(name = "DAirportCode")
    private String dAirportCode;

    /**
     * 航班号
     */
    public String getFlightNo() {
        return this.flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    /**
     * 航班日期
     */
    public Calendar getFlightDate() {
        return this.flightDate;
    }

    public void setFlightDate(Calendar flightDate) {
        this.flightDate = flightDate;
    }

    /**
     * 航班日期
     */
    public long getFlightDateLong() {
        return this.flightDateLong;
    }

    public void setFlightDateLong(long flightDateLong) {
        this.flightDateLong = flightDateLong;
    }

    /**
     * 到达机场
     */
    public String getAAirportCode() {
        return this.aAirportCode;
    }

    public void setAAirportCode(String aAirportCode) {
        this.aAirportCode = aAirportCode;
    }

    /**
     * 出发机场
     */
    public String getDAirportCode() {
        return this.dAirportCode;
    }

    public void setDAirportCode(String dAirportCode) {
        this.dAirportCode = dAirportCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaSearchFlightVariInfoByFlightNORequest other = (GaSearchFlightVariInfoByFlightNORequest)obj;
        return
            Objects.equal(this.flightNo, other.flightNo) && 
            Objects.equal(this.flightDate, other.flightDate) && 
            Objects.equal(this.flightDateLong, other.flightDateLong) && 
            Objects.equal(this.aAirportCode, other.aAirportCode) && 
            Objects.equal(this.dAirportCode, other.dAirportCode);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.flightNo);
        result = 31 * result + Objects.hashCode(this.flightDate);
        result = 31 * result + Objects.hashCode(this.flightDateLong);
        result = 31 * result + Objects.hashCode(this.aAirportCode);
        result = 31 * result + Objects.hashCode(this.dAirportCode);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("flightNo", flightNo)
            .add("flightDate", flightDate)
            .add("flightDateLong", flightDateLong)
            .add("aAirportCode", aAirportCode)
            .add("dAirportCode", dAirportCode)
            .toString();
    }
}