/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package org.tempuri.sendofflinerebookemail;

import com.ctrip.soa.global.api.comm.responsehead.v1.ResponseHead;
import com.ctriposs.baiji.rpc.common.HasResponseStatus;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.ctriposs.baiji.rpc.common.types.ResponseStatusType;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "SendOfflineRebookEmailResponse", namespace = "http://tempuri.org/SendOfflineRebookEmail.xsd")
@XmlType(name = "SendOfflineRebookEmailResponse", propOrder = {
    "responseStatus",
    "responseHead",
    "result"
})
@SuppressWarnings("all")
public class SendOfflineRebookEmailResponse implements HasResponseStatus {

    private static final long serialVersionUID = 1L;

    public SendOfflineRebookEmailResponse(
        ResponseStatusType responseStatus, 
        ResponseHead responseHead, 
        boolean result) {
        this.responseStatus = responseStatus;
        this.responseHead = responseHead;
        this.result = result;
    }

    public SendOfflineRebookEmailResponse() {
    }

    @JsonProperty("ResponseStatus")
    @XmlElement(name = "ResponseStatus")
    private ResponseStatusType responseStatus;

    @JsonProperty("ResponseHead")
    @XmlElement(name = "ResponseHead")
    private ResponseHead responseHead;

    @FieldDoc("执行结果" +
            "true  -成功" +
            "false -失败")
    @JsonProperty("Result")
    @XmlElement(name = "Result")
    private boolean result;

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
     * 执行结果
     *             true  -成功
     *             false -失败
     */
    public boolean getResult() {
        return this.result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final SendOfflineRebookEmailResponse other = (SendOfflineRebookEmailResponse)obj;
        return
            Objects.equal(this.responseStatus, other.responseStatus) && 
            Objects.equal(this.responseHead, other.responseHead) && 
            Objects.equal(this.result, other.result);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.responseStatus);
        result = 31 * result + Objects.hashCode(this.responseHead);
        result = 31 * result + Objects.hashCode(this.result);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("responseStatus", responseStatus)
            .add("responseHead", responseHead)
            .add("result", result)
            .toString();
    }
}