package io.threads.java.model.identify;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.threads.java.model.JsonParam;

/**
 * @author szagriichuk.
 */
@JsonDeserialize(as = Identify.class)
public class IdentifyParam extends JsonParam<Identify> {
    public IdentifyParam(Identify param) {
        super(param);
    }
}
