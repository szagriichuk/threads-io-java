package io.threads.java;

import com.goolla.Goolla;
import com.goolla.http.callback.ResponseCallback;
import io.threads.java.http.ThreadsHttpApi;
import io.threads.java.model.identify.Identify;
import io.threads.java.model.page.Page;
import io.threads.java.model.remove.Remove;
import io.threads.java.model.track.Track;

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
        asyncApi.post("https://input.threads.io/v1/identify", createCallback(), identify);
    }

    @Override
    public void track(Track track) {
        asyncApi.post("https://input.threads.io/v1/track", createCallback(), track);
    }

    @Override
    public void page(Page page) {
        asyncApi.post("https://input.threads.io/v1/page", createCallback(), page);
    }

    @Override
    public void remove(Remove remove) {
        asyncApi.post("https://input.threads.io/v1/remove", createCallback(), remove);
    }

    protected abstract ResponseCallback createCallback();
}
