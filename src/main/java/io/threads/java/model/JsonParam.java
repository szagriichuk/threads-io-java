package io.threads.java.model;

import com.goolla.http.params.Param;
import com.goolla.serializer.Serializer;

/**
 * @author szagriichuk.
 */
public class JsonParam<T> extends Param<T> {
    public JsonParam(T param) {
        super(param);
    }

    @Override
    public String name() {
        return "";
    }

    @Override
    public String toString() {
        return String.valueOf(value());
    }
}
