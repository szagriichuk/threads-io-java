package io.threads.java;

import io.threads.java.model.identify.Identify;
import io.threads.java.model.identify.Traits;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author szagriichuk.
 */
public class BaseThreadsApiTest {

    @Test
    public void identify() throws Exception {
        ThreadsApi api = ThreadsApiFactory.createBaseApi("KEY");
        Identify identify = new Identify();
        identify.setUserId("1111");
        identify.setTimestamp("2222");
        Traits traits = new Traits();
        traits.setEmail("email");
        traits.setName("name");
        identify.setTraits(traits);
        api.identify(identify);
        TimeUnit.SECONDS.sleep(5);
    }
}