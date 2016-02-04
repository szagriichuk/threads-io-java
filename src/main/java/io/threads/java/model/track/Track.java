package io.threads.java.model.track;

/**
 * @author szagriichuk.
 */

import com.fasterxml.jackson.annotation.*;
import io.threads.java.model.JsonParam;
import io.threads.java.model.Properties;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "userId",
        "event",
        "properties",
        "timestamp"
})
public class Track extends JsonParam<Track> {

    @JsonProperty("userId")
    private String userId;
    @JsonProperty("event")
    private String event;
    @JsonProperty("properties")
    private Properties properties;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    @JsonProperty("timestamp")
    private Date timestamp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @JsonProperty("event")
    public String getEvent() {
        return event;
    }

    @JsonProperty("event")
    public void setEvent(String event) {
        this.event = event;
    }

    @JsonProperty("properties")
    public Properties getProperties() {
        return properties;
    }

    @JsonProperty("properties")
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    @JsonProperty("timestamp")
    public Date getTimestamp() {
        return timestamp;
    }

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    @JsonProperty("timestamp")
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Track track = (Track) o;

        if (userId != null ? !userId.equals(track.userId) : track.userId != null) return false;
        if (event != null ? !event.equals(track.event) : track.event != null) return false;
        if (properties != null ? !properties.equals(track.properties) : track.properties != null) return false;
        if (timestamp != null ? !timestamp.equals(track.timestamp) : track.timestamp != null) return false;
        return additionalProperties != null ? additionalProperties.equals(track.additionalProperties) : track.additionalProperties == null;

    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (event != null ? event.hashCode() : 0);
        result = 31 * result + (properties != null ? properties.hashCode() : 0);
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        result = 31 * result + (additionalProperties != null ? additionalProperties.hashCode() : 0);
        return result;
    }
}