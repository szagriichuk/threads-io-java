package io.threads.java.model.track;

import com.goolla.http.params.Param;
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
        properties.setAnyProperty("prop1", 1);
        properties.setAnyProperty("prop2", 2);
        track.setProperties(properties);

        String data = ser(track);
        System.out.println(data);
        assertNotNull(data);

        Track track1 = des(data, Track.class);
        assertNotNull(track1);
        assertEquals(track, track1);
    }


    private String ser(Param<?> param){
        return Serializer.serialize(param);
    }
    private <T> T des(String data, Class<T> clazz){
        return Serializer.deserialize(data, clazz);
    }
}