package io.threads.java;

import com.goolla.Goolla;
import com.goolla.http.callback.ResponseCallback;
import io.threads.java.http.ThreadsHttpApi;
import io.threads.java.model.identify.Identify;
import io.threads.java.model.identify.IdentifyParam;
import io.threads.java.model.page.Page;
import io.threads.java.model.page.PageParam;
import io.threads.java.model.remove.Remove;
import io.threads.java.model.remove.RemoveParam;
import io.threads.java.model.track.Track;
import io.threads.java.model.track.TrackParam;

import static com.goolla.Goolla.asyncApi;

/**
 * @author szagriichuk.
 */
public abstract class AbstractThreadsApi implements ThreadsApi {
    private Goolla.AsyncApi asyncApi;

    public AbstractThreadsApi(ThreadsHttpApi threadsHttpApi) {
        this.asyncApi = asyncApi(threadsHttpApi);
    }

    @Override
    public void identify(Identify identify) {
        asyncApi.post("https://input.threads.io/v1/identify", createCallback(), new IdentifyParam(identify));
    }

    @Override
    public void track(Track track) {
        asyncApi.post("https://input.threads.io/v1/track", createCallback(), new TrackParam(track));
    }

    @Override
    public void page(Page page) {
        asyncApi.post("https://input.threads.io/v1/page", createCallback(), new PageParam(page));
    }

    @Override
    public void remove(Remove remove) {
        asyncApi.post("https://input.threads.io/v1/remove", createCallback(), new RemoveParam(remove));
    }

    protected abstract ResponseCallback createCallback();
}
