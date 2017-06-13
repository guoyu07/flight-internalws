/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.loadingmessage.loadingmessage_v2.v1;

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
 * 响应类
 */
@DtoDoc("响应类")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaLoadingMessageResponse", namespace = "http://soa.ctrip.com/Global/API/LoadingMessage/LoadingMessage_V2/v1")
@XmlType(name = "GaLoadingMessageResponse", propOrder = {
    "responseStatus",
    "messages"
})
@SuppressWarnings("all")
public class GaLoadingMessageResponse implements HasResponseStatus {

    private static final long serialVersionUID = 1L;

    public GaLoadingMessageResponse(
        ResponseStatusType responseStatus, 
        List<LoadingMessages> messages) {
        this.responseStatus = responseStatus;
        this.messages = messages;
    }

    public GaLoadingMessageResponse() {
    }

    @JsonProperty("ResponseStatus")
    @XmlElement(name = "ResponseStatus")
    private ResponseStatusType responseStatus;

    @FieldDoc("loading内容，纯文字不超过40个字符")
    @JsonProperty("Messages")
    @XmlElement(name = "Messages")
    private List<LoadingMessages> messages;

    public ResponseStatusType getResponseStatus() {
        return this.responseStatus;
    }

    public void setResponseStatus(ResponseStatusType responseStatus) {
        this.responseStatus = responseStatus;
    }

    /**
     * loading内容，纯文字不超过40个字符
     */
    public List<LoadingMessages> getMessages() {
        return this.messages;
    }

    public void setMessages(List<LoadingMessages> messages) {
        this.messages = messages;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaLoadingMessageResponse other = (GaLoadingMessageResponse)obj;
        return
            Objects.equal(this.responseStatus, other.responseStatus) && 
            Objects.equal(this.messages, other.messages);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.responseStatus);
        result = 31 * result + Objects.hashCode(this.messages);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("responseStatus", responseStatus)
            .add("messages", messages)
            .toString();
    }
}