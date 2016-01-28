package io.threads.java.model.track;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.threads.java.model.JsonParam;

/**
 * @author szagriichuk.
 */
@JsonDeserialize(as = Track.class)
public class TrackParam extends JsonParam<Track> {
    public TrackParam(Track param) {
        super(param);
    }
}
