package io.threads.java;

import com.goolla.http.callback.ResponseCallback;
import com.goolla.http.callback.objects.ResultObject;
import io.threads.java.http.ThreadsHttpApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author szagriichuk.
 */
class BaseThreadsApi extends AbstractThreadsApi {
    private static final Logger LOG = LoggerFactory.getLogger(BaseThreadsApi.class);

    public BaseThreadsApi(ThreadsHttpApi threadsHttpApi) {
        super(threadsHttpApi);
    }

    @Override
    protected ResponseCallback createCallback() {
        return new ResponseCallback() {
            @Override
            public void onComplete(ResultObject resultObject) {
                LOG.info(resultObject.toString());
            }

            @Override
            public void onError(Throwable throwable) {
                LOG.error(throwable.getMessage(), throwable);
            }
        };
    }
}
