package io.threads.java;

import io.threads.java.http.ThreadsHttpApi;

/**
 * @author szagriichuk.
 */
public final class ThreadsApiFactory {
    private ThreadsApiFactory() {
    }

    public static ThreadsApi createBaseApi(String apiKey) {
        return new BaseThreadsApi(new ThreadsHttpApi(apiKey));
    }
}
