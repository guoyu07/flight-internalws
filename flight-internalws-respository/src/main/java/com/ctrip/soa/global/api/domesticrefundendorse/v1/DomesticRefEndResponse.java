/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.domesticrefundendorse.v1;

import com.ctrip.soa.global.api.comm.responsehead.v1.ResponseHead;
import com.ctrip.soa.global.api.flightcommon.v1.FeeEntity;
import com.ctriposs.baiji.rpc.common.HasResponseStatus;
import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.ctriposs.baiji.rpc.common.types.ResponseStatusType;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 退改签返回参数
 */
@DtoDoc("退改签返回参数")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaDomesticRefundEndorseResponse", namespace = "http://soa.ctrip.com/Global/API/DomesticRefundEndorse/v1")
@XmlType(name = "DomesticRefEndResponse", propOrder = {
    "responseStatus",
    "responseHead",
    "refundText",
    "endorseText",
    "refundList",
    "endorseList",
    "childRefundList",
    "childEndorseList",
    "infantRefundList",
    "infantEndorseList",
    "conCurrentRule",
    "concurrentDescription"
})
@SuppressWarnings("all")
public class DomesticRefEndResponse implements HasResponseStatus {

    private static final long serialVersionUID = 1L;

    public DomesticRefEndResponse(
        ResponseStatusType responseStatus, 
        ResponseHead responseHead, 
        String refundText, 
        String endorseText, 
        List<FeeEntity> refundList, 
        List<FeeEntity> endorseList, 
        List<FeeEntity> childRefundList, 
        List<FeeEntity> childEndorseList, 
        List<FeeEntity> infantRefundList, 
        List<FeeEntity> infantEndorseList, 
        int conCurrentRule, 
        String concurrentDescription) {
        this.responseStatus = responseStatus;
        this.responseHead = responseHead;
        this.refundText = refundText;
        this.endorseText = endorseText;
        this.refundList = refundList;
        this.endorseList = endorseList;
        this.childRefundList = childRefundList;
        this.childEndorseList = childEndorseList;
        this.infantRefundList = infantRefundList;
        this.infantEndorseList = infantEndorseList;
        this.conCurrentRule = conCurrentRule;
        this.concurrentDescription = concurrentDescription;
    }

    public DomesticRefEndResponse() {
    }

    @JsonProperty("ResponseStatus")
    @XmlElement(name = "ResponseStatus")
    private ResponseStatusType responseStatus;

    @JsonProperty("ResponseHead")
    @XmlElement(name = "ResponseHead")
    private ResponseHead responseHead;

    @FieldDoc("退费信息描述")
    @JsonProperty("RefundText")
    @XmlElement(name = "RefundText")
    private String refundText;

    @FieldDoc("改期信息描述")
    @JsonProperty("EndorseText")
    @XmlElement(name = "EndorseText")
    private String endorseText;

    @FieldDoc("默认的退票费")
    @JsonProperty("RefundList")
    @XmlElement(name = "RefundList")
    private List<FeeEntity> refundList;

    @FieldDoc("默认的改期费")
    @JsonProperty("EndorseList")
    @XmlElement(name = "EndorseList")
    private List<FeeEntity> endorseList;

    @FieldDoc("儿童退票费")
    @JsonProperty("ChildRefundList")
    @XmlElement(name = "ChildRefundList")
    private List<FeeEntity> childRefundList;

    @FieldDoc("儿童改期费")
    @JsonProperty("ChildEndorseList")
    @XmlElement(name = "ChildEndorseList")
    private List<FeeEntity> childEndorseList;

    @FieldDoc("婴儿退票费")
    @JsonProperty("InfantRefundList")
    @XmlElement(name = "InfantRefundList")
    private List<FeeEntity> infantRefundList;

    @FieldDoc("婴儿改期费")
    @JsonProperty("InfantEndorseList")
    @XmlElement(name = "InfantEndorseList")
    private List<FeeEntity> infantEndorseList;

    @FieldDoc("读取中文传过来的")
    @JsonProperty("ConCurrentRule")
    @XmlElement(name = "ConCurrentRule")
    private int conCurrentRule;

    @FieldDoc("改签与升舱同时发生费用描述")
    @JsonProperty("ConcurrentDescription")
    @XmlElement(name = "ConcurrentDescription")
    private String concurrentDescription;

    public ResponseStatusType getResponseStatus() {
        return this.responseStatus;
    }

    public void setResponseStatus(ResponseStatusType responseStatus) {
        this.responseStatus = responseStatus;
    }

    public ResponseHead getResponseHead() {
        return this.responseHead;
    }

    public void setResponseHead(ResponseHead responseHead) {
        this.responseHead = responseHead;
    }

    /**
     * 退费信息描述
     */
    public String getRefundText() {
        return this.refundText;
    }

    public void setRefundText(String refundText) {
        this.refundText = refundText;
    }

    /**
     * 改期信息描述
     */
    public String getEndorseText() {
        return this.endorseText;
    }

    public void setEndorseText(String endorseText) {
        this.endorseText = endorseText;
    }

    /**
     * 默认的退票费
     */
    public List<FeeEntity> getRefundList() {
        return this.refundList;
    }

    public void setRefundList(List<FeeEntity> refundList) {
        this.refundList = refundList;
    }

    /**
     * 默认的改期费
     */
    public List<FeeEntity> getEndorseList() {
        return this.endorseList;
    }

    public void setEndorseList(List<FeeEntity> endorseList) {
        this.endorseList = endorseList;
    }

    /**
     * 儿童退票费
     */
    public List<FeeEntity> getChildRefundList() {
        return this.childRefundList;
    }

    public void setChildRefundList(List<FeeEntity> childRefundList) {
        this.childRefundList = childRefundList;
    }

    /**
     * 儿童改期费
     */
    public List<FeeEntity> getChildEndorseList() {
        return this.childEndorseList;
    }

    public void setChildEndorseList(List<FeeEntity> childEndorseList) {
        this.childEndorseList = childEndorseList;
    }

    /**
     * 婴儿退票费
     */
    public List<FeeEntity> getInfantRefundList() {
        return this.infantRefundList;
    }

    public void setInfantRefundList(List<FeeEntity> infantRefundList) {
        this.infantRefundList = infantRefundList;
    }

    /**
     * 婴儿改期费
     */
    public List<FeeEntity> getInfantEndorseList() {
        return this.infantEndorseList;
    }

    public void setInfantEndorseList(List<FeeEntity> infantEndorseList) {
        this.infantEndorseList = infantEndorseList;
    }

    /**
     * 读取中文传过来的
     */
    public int getConCurrentRule() {
        return this.conCurrentRule;
    }

    public void setConCurrentRule(int conCurrentRule) {
        this.conCurrentRule = conCurrentRule;
    }

    /**
     * 改签与升舱同时发生费用描述
     */
    public String getConcurrentDescription() {
        return this.concurrentDescription;
    }

    public void setConcurrentDescription(String concurrentDescription) {
        this.concurrentDescription = concurrentDescription;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final DomesticRefEndResponse other = (DomesticRefEndResponse)obj;
        return
            Objects.equal(this.responseStatus, other.responseStatus) && 
            Objects.equal(this.responseHead, other.responseHead) && 
            Objects.equal(this.refundText, other.refundText) && 
            Objects.equal(this.endorseText, other.endorseText) && 
            Objects.equal(this.refundList, other.refundList) && 
            Objects.equal(this.endorseList, other.endorseList) && 
            Objects.equal(this.childRefundList, other.childRefundList) && 
            Objects.equal(this.childEndorseList, other.childEndorseList) && 
            Objects.equal(this.infantRefundList, other.infantRefundList) && 
            Objects.equal(this.infantEndorseList, other.infantEndorseList) && 
            Objects.equal(this.conCurrentRule, other.conCurrentRule) && 
            Objects.equal(this.concurrentDescription, other.concurrentDescription);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.responseStatus);
        result = 31 * result + Objects.hashCode(this.responseHead);
        result = 31 * result + Objects.hashCode(this.refundText);
        result = 31 * result + Objects.hashCode(this.endorseText);
        result = 31 * result + Objects.hashCode(this.refundList);
        result = 31 * result + Objects.hashCode(this.endorseList);
        result = 31 * result + Objects.hashCode(this.childRefundList);
        result = 31 * result + Objects.hashCode(this.childEndorseList);
        result = 31 * result + Objects.hashCode(this.infantRefundList);
        result = 31 * result + Objects.hashCode(this.infantEndorseList);
        result = 31 * result + Objects.hashCode(this.conCurrentRule);
        result = 31 * result + Objects.hashCode(this.concurrentDescription);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("responseStatus", responseStatus)
            .add("responseHead", responseHead)
            .add("refundText", refundText)
            .add("endorseText", endorseText)
            .add("refundList", refundList)
            .add("endorseList", endorseList)
            .add("childRefundList", childRefundList)
            .add("childEndorseList", childEndorseList)
            .add("infantRefundList", infantRefundList)
            .add("infantEndorseList", infantEndorseList)
            .add("conCurrentRule", conCurrentRule)
            .add("concurrentDescription", concurrentDescription)
            .toString();
    }
}