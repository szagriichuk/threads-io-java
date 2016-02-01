package io.threads.java.model.track;

import com.goolla.serializer.Serializer;
import io.threads.java.model.Properties;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author szagriichuk.
 */
public class TrackTest {

    @Test
    public void testTrackPropertiesSerialization() throws Exception {
        Track track = new Track();
        track.setEvent("test");
        track.setUserId("111");
        Properties properties = new Properties();
        properties.setAdditionalProperty("prop1", 1);
        properties.setAdditionalProperty("prop2", 2);
        track.setProperties(properties);

        String data = Serializer.serialize(track);
        System.out.println(data);
        assertNotNull(data);

        Track track1 = Serializer.deserialize(data, Track.class);
        assertNotNull(track1);
        assertEquals(track, track1);
    }
}