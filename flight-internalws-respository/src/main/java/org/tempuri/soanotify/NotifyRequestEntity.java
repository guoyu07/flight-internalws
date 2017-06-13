/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package org.tempuri.soanotify;

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
@XmlRootElement(name = "NotifyRequest", namespace = "http://tempuri.org/SOANotify.xsd")
@XmlType(name = "NotifyRequestEntity", propOrder = {
    "transactionId",
    "content"
})
@SuppressWarnings("all")
public class NotifyRequestEntity  {

    private static final long serialVersionUID = 1L;

    public NotifyRequestEntity(
        String transactionId, 
        String content) {
        this.transactionId = transactionId;
        this.content = content;
    }

    public NotifyRequestEntity() {
    }

    @JsonProperty("TransactionId")
    @XmlElement(name = "TransactionId")
    private String transactionId;

    @JsonProperty("Content")
    @XmlElement(name = "Content")
    private String content;

    public String getTransactionId() {
        return this.transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final NotifyRequestEntity other = (NotifyRequestEntity)obj;
        return
            Objects.equal(this.transactionId, other.transactionId) && 
            Objects.equal(this.content, other.content);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.transactionId);
        result = 31 * result + Objects.hashCode(this.content);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("transactionId", transactionId)
            .add("content", content)
            .toString();
    }
}