package io.threads.java.model.remove;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.threads.java.model.JsonParam;

/**
 * @author szagriichuk.
 */
@JsonDeserialize(as = Remove.class)
public class RemoveParam extends JsonParam<Remove> {
    public RemoveParam(Remove param) {
        super(param);
    }
}
