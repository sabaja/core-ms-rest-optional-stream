package com.rest.optional.stream.util.resource;

import org.springframework.hateoas.RepresentationModel;

import java.util.List;
import java.util.Map;

public class ErrorResource<T extends RepresentationModel<? extends T>> extends RepresentationModel<T> {
    private Map<String, List<ErrorMessage>> returnMessages;

    public ErrorResource() {
        /*Empty Constructor*/
    }

    public Map<String, List<ErrorMessage>> getReturnMessages() {
        return this.returnMessages;
    }

    public void setReturnMessages(Map<String, List<ErrorMessage>> returnMessages) {
        this.returnMessages = returnMessages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ErrorResource)) return false;
        if (!super.equals(o)) return false;

        ErrorResource that = (ErrorResource) o;

        return getReturnMessages() != null ? getReturnMessages().equals(that.getReturnMessages()) : that.getReturnMessages() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getReturnMessages() != null ? getReturnMessages().hashCode() : 0);
        return result;
    }
}
