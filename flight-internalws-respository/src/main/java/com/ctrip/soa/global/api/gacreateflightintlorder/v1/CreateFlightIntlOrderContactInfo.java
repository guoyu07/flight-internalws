/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.gacreateflightintlorder.v1;

import com.ctrip.soa.global.api.flightcommon.v1.ConfirmType;
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
 * 联系人信息
 */
@DtoDoc("联系人信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateFlightIntlOrderContactInfo", propOrder = {
    "contactName",
    "contactFax",
    "email",
    "phoneArea",
    "contactTel",
    "mobilePhone",
    "foreignMobile",
    "mobileCountryFix",
    "confirmType"
})
@SuppressWarnings("all")
public class CreateFlightIntlOrderContactInfo  {

    private static final long serialVersionUID = 1L;

    public CreateFlightIntlOrderContactInfo(
        String contactName, 
        String contactFax, 
        String email, 
        String phoneArea, 
        String contactTel, 
        String mobilePhone, 
        String foreignMobile, 
        String mobileCountryFix, 
        ConfirmType confirmType) {
        this.contactName = contactName;
        this.contactFax = contactFax;
        this.email = email;
        this.phoneArea = phoneArea;
        this.contactTel = contactTel;
        this.mobilePhone = mobilePhone;
        this.foreignMobile = foreignMobile;
        this.mobileCountryFix = mobileCountryFix;
        this.confirmType = confirmType;
    }

    public CreateFlightIntlOrderContactInfo() {
    }

    @FieldDoc("全名")
    @JsonProperty("ContactName")
    @XmlElement(name = "ContactName")
    private String contactName;

    @FieldDoc("传真")
    @JsonProperty("ContactFax")
    @XmlElement(name = "ContactFax")
    private String contactFax;

    @FieldDoc("邮箱")
    @JsonProperty("Email")
    @XmlElement(name = "Email")
    private String email;

    @FieldDoc("电话地区编号")
    @JsonProperty("PhoneArea")
    @XmlElement(name = "PhoneArea")
    private String phoneArea;

    @FieldDoc("联系电话")
    @JsonProperty("ContactTel")
    @XmlElement(name = "ContactTel")
    private String contactTel;

    @FieldDoc("手机号码")
    @JsonProperty("MobilePhone")
    @XmlElement(name = "MobilePhone")
    private String mobilePhone;

    @FieldDoc("手机号码(国外)")
    @JsonProperty("ForeignMobile")
    @XmlElement(name = "ForeignMobile")
    private String foreignMobile;

    @FieldDoc("手机号码(国外)区号")
    @JsonProperty("MobileCountryFix")
    @XmlElement(name = "MobileCountryFix")
    private String mobileCountryFix;

    @FieldDoc("联系人确认方式")
    @JsonProperty("ConfirmType")
    @XmlElement(name = "ConfirmType")
    private ConfirmType confirmType;

    /**
     * 全名
     */
    public String getContactName() {
        return this.contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * 传真
     */
    public String getContactFax() {
        return this.contactFax;
    }

    public void setContactFax(String contactFax) {
        this.contactFax = contactFax;
    }

    /**
     * 邮箱
     */
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 电话地区编号
     */
    public String getPhoneArea() {
        return this.phoneArea;
    }

    public void setPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
    }

    /**
     * 联系电话
     */
    public String getContactTel() {
        return this.contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    /**
     * 手机号码
     */
    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * 手机号码(国外)
     */
    public String getForeignMobile() {
        return this.foreignMobile;
    }

    public void setForeignMobile(String foreignMobile) {
        this.foreignMobile = foreignMobile;
    }

    /**
     * 手机号码(国外)区号
     */
    public String getMobileCountryFix() {
        return this.mobileCountryFix;
    }

    public void setMobileCountryFix(String mobileCountryFix) {
        this.mobileCountryFix = mobileCountryFix;
    }

    /**
     * 联系人确认方式
     */
    public ConfirmType getConfirmType() {
        return this.confirmType;
    }

    public void setConfirmType(ConfirmType confirmType) {
        this.confirmType = confirmType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final CreateFlightIntlOrderContactInfo other = (CreateFlightIntlOrderContactInfo)obj;
        return
            Objects.equal(this.contactName, other.contactName) && 
            Objects.equal(this.contactFax, other.contactFax) && 
            Objects.equal(this.email, other.email) && 
            Objects.equal(this.phoneArea, other.phoneArea) && 
            Objects.equal(this.contactTel, other.contactTel) && 
            Objects.equal(this.mobilePhone, other.mobilePhone) && 
            Objects.equal(this.foreignMobile, other.foreignMobile) && 
            Objects.equal(this.mobileCountryFix, other.mobileCountryFix) && 
            Objects.equal(this.confirmType, other.confirmType);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.contactName);
        result = 31 * result + Objects.hashCode(this.contactFax);
        result = 31 * result + Objects.hashCode(this.email);
        result = 31 * result + Objects.hashCode(this.phoneArea);
        result = 31 * result + Objects.hashCode(this.contactTel);
        result = 31 * result + Objects.hashCode(this.mobilePhone);
        result = 31 * result + Objects.hashCode(this.foreignMobile);
        result = 31 * result + Objects.hashCode(this.mobileCountryFix);
        result = 31 * result + Objects.hashCode(this.confirmType);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("contactName", contactName)
            .add("contactFax", contactFax)
            .add("email", email)
            .add("phoneArea", phoneArea)
            .add("contactTel", contactTel)
            .add("mobilePhone", mobilePhone)
            .add("foreignMobile", foreignMobile)
            .add("mobileCountryFix", mobileCountryFix)
            .add("confirmType", confirmType)
            .toString();
    }
}