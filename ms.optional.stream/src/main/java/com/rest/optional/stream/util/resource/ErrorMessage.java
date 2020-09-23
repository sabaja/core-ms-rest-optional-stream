package com.rest.optional.stream.util.resource;


import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public class ErrorMessage implements Serializable {
    private static final long serialVersionUID = -6302300118630801639L;
    private String message;
    private String messageTitle;
    private String messageKey;
    private Boolean retry;
    private String errorCode;
    private List<MessageForm> messagesForm;
    private String severity;
    private String language;

    public ErrorMessage() {
        /*Empty Constructor*/
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageTitle() {
        return this.messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    public String getMessageKey() {
        return this.messageKey;
    }

    public void setMessageKey(String messageKey) {
        this.messageKey = messageKey;
    }

    public Boolean getRetry() {
        return this.retry;
    }

    public void setRetry(Boolean retry) {
        this.retry = retry;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public List<MessageForm> getMessagesForm() {
        return this.messagesForm;
    }

    public void setMessagesForm(List<MessageForm> messagesForm) {
        this.messagesForm = messagesForm;
    }

    public void setMessageForm(MessageForm messagesForm) {
        if (messagesForm == null) {
            this.messagesForm = null;
        }

        this.messagesForm = Collections.singletonList(messagesForm);
    }

    public String getSeverity() {
        return this.severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}