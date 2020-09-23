package com.rest.optional.stream.util.resource;


import java.io.Serializable;

public class MessageForm implements Serializable {
    private String formName;
    private String fieldName;

    public MessageForm() {
        /*Empty Constructor*/
    }

    public String getFormName() {
        return this.formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}
