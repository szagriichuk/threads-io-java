package io.threads.java.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Properties {
    private Map<String, Object> anyProperties = new HashMap<String, Object>();
    @JsonAnyGetter
    public Map<String, Object> getAnyProperties() {
        return this.anyProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.anyProperties.put(name, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Properties that = (Properties) o;

        return anyProperties != null ? anyProperties.equals(that.anyProperties) : that.anyProperties == null;

    }

    @Override
    public int hashCode() {
        return anyProperties != null ? anyProperties.hashCode() : 0;
    }
}