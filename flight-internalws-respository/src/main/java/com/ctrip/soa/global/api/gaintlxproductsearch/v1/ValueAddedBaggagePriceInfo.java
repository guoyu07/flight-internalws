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
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 行李额价格信息
 */
@DtoDoc("行李额价格信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueAddedBaggagePriceInfo", propOrder = {
    "currency",
    "exchangeRateForCNY",
    "bookSalePrice",
    "ticketSalePrice",
    "airportSalePrice",
    "refundFee"
})
@SuppressWarnings("all")
public class ValueAddedBaggagePriceInfo  {

    private static final long serialVersionUID = 1L;

    public ValueAddedBaggagePriceInfo(
        String currency, 
        BigDecimal exchangeRateForCNY, 
        BigDecimal bookSalePrice, 
        BigDecimal ticketSalePrice, 
        BigDecimal airportSalePrice, 
        BigDecimal refundFee) {
        this.currency = currency;
        this.exchangeRateForCNY = exchangeRateForCNY;
        this.bookSalePrice = bookSalePrice;
        this.ticketSalePrice = ticketSalePrice;
        this.airportSalePrice = airportSalePrice;
        this.refundFee = refundFee;
    }

    public ValueAddedBaggagePriceInfo() {
    }

    @FieldDoc("币种")
    @JsonProperty("Currency")
    @XmlElement(name = "Currency")
    private String currency;

    @FieldDoc("当前币种对人民币汇率")
    @JsonProperty("ExchangeRateForCNY")
    @XmlElement(name = "ExchangeRateForCNY")
    private BigDecimal exchangeRateForCNY;

    @FieldDoc("预定时购买价格")
    @JsonProperty("BookSalePrice")
    @XmlElement(name = "BookSalePrice")
    private BigDecimal bookSalePrice;

    @FieldDoc("预定后购买价格")
    @JsonProperty("TicketSalePrice")
    @XmlElement(name = "TicketSalePrice")
    private BigDecimal ticketSalePrice;

    @FieldDoc("机场购买价格")
    @JsonProperty("AirportSalePrice")
    @XmlElement(name = "AirportSalePrice")
    private BigDecimal airportSalePrice;

    @FieldDoc("退增值行李手续费")
    @JsonProperty("RefundFee")
    @XmlElement(name = "RefundFee")
    private BigDecimal refundFee;

    /**
     * 币种
     */
    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * 当前币种对人民币汇率
     */
    public BigDecimal getExchangeRateForCNY() {
        return this.exchangeRateForCNY;
    }

    public void setExchangeRateForCNY(BigDecimal exchangeRateForCNY) {
        this.exchangeRateForCNY = exchangeRateForCNY;
    }

    /**
     * 预定时购买价格
     */
    public BigDecimal getBookSalePrice() {
        return this.bookSalePrice;
    }

    public void setBookSalePrice(BigDecimal bookSalePrice) {
        this.bookSalePrice = bookSalePrice;
    }

    /**
     * 预定后购买价格
     */
    public BigDecimal getTicketSalePrice() {
        return this.ticketSalePrice;
    }

    public void setTicketSalePrice(BigDecimal ticketSalePrice) {
        this.ticketSalePrice = ticketSalePrice;
    }

    /**
     * 机场购买价格
     */
    public BigDecimal getAirportSalePrice() {
        return this.airportSalePrice;
    }

    public void setAirportSalePrice(BigDecimal airportSalePrice) {
        this.airportSalePrice = airportSalePrice;
    }

    /**
     * 退增值行李手续费
     */
    public BigDecimal getRefundFee() {
        return this.refundFee;
    }

    public void setRefundFee(BigDecimal refundFee) {
        this.refundFee = refundFee;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final ValueAddedBaggagePriceInfo other = (ValueAddedBaggagePriceInfo)obj;
        return
            Objects.equal(this.currency, other.currency) && 
            Objects.equal(this.exchangeRateForCNY, other.exchangeRateForCNY) && 
            Objects.equal(this.bookSalePrice, other.bookSalePrice) && 
            Objects.equal(this.ticketSalePrice, other.ticketSalePrice) && 
            Objects.equal(this.airportSalePrice, other.airportSalePrice) && 
            Objects.equal(this.refundFee, other.refundFee);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.currency);
        result = 31 * result + Objects.hashCode(this.exchangeRateForCNY);
        result = 31 * result + Objects.hashCode(this.bookSalePrice);
        result = 31 * result + Objects.hashCode(this.ticketSalePrice);
        result = 31 * result + Objects.hashCode(this.airportSalePrice);
        result = 31 * result + Objects.hashCode(this.refundFee);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("currency", currency)
            .add("exchangeRateForCNY", exchangeRateForCNY)
            .add("bookSalePrice", bookSalePrice)
            .add("ticketSalePrice", ticketSalePrice)
            .add("airportSalePrice", airportSalePrice)
            .add("refundFee", refundFee)
            .toString();
    }
}