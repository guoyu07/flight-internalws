package com.ctrip.ibu.flight.internalws.service;

import java.util.*;
import com.ctriposs.baiji.exception.*;
import com.ctriposs.baiji.rpc.common.*;
import com.ctriposs.baiji.schema.*;
import com.ctriposs.baiji.specific.*;
import com.google.common.base.Objects;
import com.google.common.base.MoreObjects;

@SuppressWarnings("all")
public class SendMessageRequestType implements SpecificRecord {
    private static final long serialVersionUID = 1L;

    public static final Schema SCHEMA = Schema.parse("{\"type\":\"record\",\"name\":\"SendMessageRequestType\",\"namespace\":\"" + SendMessageRequestType.class.getPackage().getName() + "\",\"doc\":null,\"fields\":[{\"name\":\"orderID\",\"type\":[\"long\",\"null\"]},{\"name\":\"uid\",\"type\":[\"string\",\"null\"]},{\"name\":\"languageType\",\"type\":[{\"type\":\"enum\",\"name\":\"LanguageType\",\"namespace\":\"" + LanguageType.class.getPackage().getName() + "\",\"doc\":null,\"symbols\":[\"CN\",\"JA\",\"KO\",\"FR\",\"DE\",\"RU\",\"ES\",\"EN\",\"VI\",\"ZH_HK\",\"MY\",\"TH\",\"ID\",\"NULL\"]},\"null\"]},{\"name\":\"messageType\",\"type\":[{\"type\":\"enum\",\"name\":\"MessageType\",\"namespace\":\"" + MessageType.class.getPackage().getName() + "\",\"doc\":null,\"symbols\":[\"Email_Flight_ReservationConfirmation\",\"Email_Flight_PaymentSuccess\"]},\"null\"]},{\"name\":\"cc\",\"type\":[\"string\",\"null\"]},{\"name\":\"bcc\",\"type\":[\"string\",\"null\"]},{\"name\":\"recipient\",\"type\":[\"string\",\"null\"]},{\"name\":\"subject\",\"type\":[\"string\",\"null\"]},{\"name\":\"messageContent\",\"type\":[\"string\",\"null\"]},{\"name\":\"uniqueID\",\"type\":[\"string\",\"null\"]}]}");

    @Override
    public Schema getSchema() { return SCHEMA; }

    public SendMessageRequestType(
        Long orderID,
        String uid,
        LanguageType languageType,
        MessageType messageType,
        String cc,
        String bcc,
        String recipient,
        String subject,
        String messageContent,
        String uniqueID) {
        this.orderID = orderID;
        this.uid = uid;
        this.languageType = languageType;
        this.messageType = messageType;
        this.cc = cc;
        this.bcc = bcc;
        this.recipient = recipient;
        this.subject = subject;
        this.messageContent = messageContent;
        this.uniqueID = uniqueID;
    }

    public SendMessageRequestType() {
    }

    public Long orderID;

    public String uid;

    public LanguageType languageType;

    public MessageType messageType;

    public String cc;

    public String bcc;

    public String recipient;

    public String subject;

    public String messageContent;

    public String uniqueID;

    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(final Long orderID) {
        this.orderID = orderID;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(final String uid) {
        this.uid = uid;
    }

    public LanguageType getLanguageType() {
        return languageType;
    }

    public void setLanguageType(final LanguageType languageType) {
        this.languageType = languageType;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(final MessageType messageType) {
        this.messageType = messageType;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(final String cc) {
        this.cc = cc;
    }

    public String getBcc() {
        return bcc;
    }

    public void setBcc(final String bcc) {
        this.bcc = bcc;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(final String recipient) {
        this.recipient = recipient;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(final String subject) {
        this.subject = subject;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(final String messageContent) {
        this.messageContent = messageContent;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(final String uniqueID) {
        this.uniqueID = uniqueID;
    }

    // Used by DatumWriter. Applications should not call.
    public Object get(int fieldPos) {
        switch (fieldPos) {
            case 0: return this.orderID;
            case 1: return this.uid;
            case 2: return this.languageType;
            case 3: return this.messageType;
            case 4: return this.cc;
            case 5: return this.bcc;
            case 6: return this.recipient;
            case 7: return this.subject;
            case 8: return this.messageContent;
            case 9: return this.uniqueID;
            default: throw new BaijiRuntimeException("Bad index " + fieldPos + " in get()");
        }
    }

    // Used by DatumReader. Applications should not call.
    @SuppressWarnings(value="unchecked")
    public void put(int fieldPos, Object fieldValue) {
        switch (fieldPos) {
            case 0: this.orderID = (Long)fieldValue; break;
            case 1: this.uid = (String)fieldValue; break;
            case 2: this.languageType = (LanguageType)fieldValue; break;
            case 3: this.messageType = (MessageType)fieldValue; break;
            case 4: this.cc = (String)fieldValue; break;
            case 5: this.bcc = (String)fieldValue; break;
            case 6: this.recipient = (String)fieldValue; break;
            case 7: this.subject = (String)fieldValue; break;
            case 8: this.messageContent = (String)fieldValue; break;
            case 9: this.uniqueID = (String)fieldValue; break;
            default: throw new BaijiRuntimeException("Bad index " + fieldPos + " in put()");
        }
    }

    @Override
    public Object get(String fieldName) {
        Schema schema = getSchema();
        if (!(schema instanceof RecordSchema)) {
            return null;
        }
        Field field = ((RecordSchema) schema).getField(fieldName);
        return field != null ? get(field.getPos()) : null;
    }

    @Override
    public void put(String fieldName, Object fieldValue) {
        Schema schema = getSchema();
        if (!(schema instanceof RecordSchema)) {
            return;
        }
        Field field = ((RecordSchema) schema).getField(fieldName);
        if (field != null) {
            put(field.getPos(), fieldValue);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final SendMessageRequestType other = (SendMessageRequestType)obj;
        return 
            Objects.equal(this.orderID, other.orderID) &&
            Objects.equal(this.uid, other.uid) &&
            Objects.equal(this.languageType, other.languageType) &&
            Objects.equal(this.messageType, other.messageType) &&
            Objects.equal(this.cc, other.cc) &&
            Objects.equal(this.bcc, other.bcc) &&
            Objects.equal(this.recipient, other.recipient) &&
            Objects.equal(this.subject, other.subject) &&
            Objects.equal(this.messageContent, other.messageContent) &&
            Objects.equal(this.uniqueID, other.uniqueID);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + (this.orderID == null ? 0 : this.orderID.hashCode());
        result = 31 * result + (this.uid == null ? 0 : this.uid.hashCode());
        result = 31 * result + (this.languageType == null ? 0 : this.languageType.hashCode());
        result = 31 * result + (this.messageType == null ? 0 : this.messageType.hashCode());
        result = 31 * result + (this.cc == null ? 0 : this.cc.hashCode());
        result = 31 * result + (this.bcc == null ? 0 : this.bcc.hashCode());
        result = 31 * result + (this.recipient == null ? 0 : this.recipient.hashCode());
        result = 31 * result + (this.subject == null ? 0 : this.subject.hashCode());
        result = 31 * result + (this.messageContent == null ? 0 : this.messageContent.hashCode());
        result = 31 * result + (this.uniqueID == null ? 0 : this.uniqueID.hashCode());

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("orderID", orderID)
            .add("uid", uid)
            .add("languageType", languageType)
            .add("messageType", messageType)
            .add("cc", cc)
            .add("bcc", bcc)
            .add("recipient", recipient)
            .add("subject", subject)
            .add("messageContent", messageContent)
            .add("uniqueID", uniqueID)
            .toString();
    }
}
