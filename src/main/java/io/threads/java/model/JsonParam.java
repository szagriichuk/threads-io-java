package io.threads.java.model;

import com.goolla.http.params.Param;
import com.goolla.serializer.Serializer;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author szagriichuk.
 */
public class JsonParam<T> extends Param<T> {
    public JsonParam() {
        super(null);
    }

    @Override
    public T value() {
        return (T) this;
    }

    @Override
    public String name() {
        return "";
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
