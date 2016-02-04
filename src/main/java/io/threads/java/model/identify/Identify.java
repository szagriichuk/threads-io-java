package io.threads.java.model.identify;

import com.fasterxml.jackson.annotation.*;
import com.goolla.http.params.Param;
import io.threads.java.model.JsonParam;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "timestamp",
        "userId",
        "traits"
})
public class Identify extends JsonParam<Identify> {

    @JsonProperty("timestamp")
    private Date timestamp;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("traits")
    private Traits traits;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("timestamp")
    public Date getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @JsonProperty("traits")
    public Traits getTraits() {
        return traits;
    }

    @JsonProperty("traits")
    public void setTraits(Traits traits) {
        this.traits = traits;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}