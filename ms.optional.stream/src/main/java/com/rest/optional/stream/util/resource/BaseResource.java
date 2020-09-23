package com.rest.optional.stream.util.resource;


import com.fasterxml.jackson.annotation.JsonProperty;


public class BaseResource extends ErrorResource {

    private String entityId;

    public BaseResource() {
        /*Default construct*/
    }

    @JsonProperty("id")
    public String getEntityId() {
        return this.entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseResource)) return false;
        if (!super.equals(o)) return false;

        BaseResource that = (BaseResource) o;

        return getEntityId() != null ? getEntityId().equals(that.getEntityId()) : that.getEntityId() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getEntityId() != null ? getEntityId().hashCode() : 0);
        return result;
    }

}