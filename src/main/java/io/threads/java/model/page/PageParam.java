package io.threads.java.model.page;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.threads.java.model.JsonParam;

/**
 * @author szagriichuk.
 */
@JsonDeserialize(as = Page.class)
public class PageParam extends JsonParam<Page> {
    public PageParam(Page param) {
        super(param);
    }
}
