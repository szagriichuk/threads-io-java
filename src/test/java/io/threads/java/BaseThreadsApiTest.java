package io.threads.java;

import io.threads.java.model.Properties;
import io.threads.java.model.identify.Identify;
import io.threads.java.model.identify.Traits;
import io.threads.java.model.track.Track;
import org.junit.Test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author szagriichuk.
 */
public class BaseThreadsApiTest {

    @Test
    public void identify() throws Exception {
        ThreadsApi api = ThreadsApiFactory.createBaseApi("key");
        Identify identify = new Identify();
        identify.setUserId("1111");
        identify.setTimestamp(new Date());
        Traits traits = new Traits();
        traits.setEmail("email");
        traits.setName("name");
        identify.setTraits(traits);
        api.identify(identify);
        TimeUnit.SECONDS.sleep(5);
    }

    @Test
    public void testTrack() throws Exception {
        ThreadsApi api = ThreadsApiFactory.createBaseApi("key");
        Track track = new Track();
        track.setEvent("test");
        track.setUserId("111");
        track.setTimestamp(new Date());
        Properties properties = new Properties();
        properties.setAnyProperty("prop1", 1);
        properties.setAnyProperty("prop2", 2);
        track.setProperties(properties);

        api.track(track);
        TimeUnit.SECONDS.sleep(5);
    }
}