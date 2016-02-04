package io.threads.java.http;

import com.goolla.http.BaseHttpApi;
import com.goolla.http.HttpExecutor;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import sun.misc.BASE64Encoder;

/**
 * @author szagriichuk.
 */
public class ThreadsHttpApi extends BaseHttpApi {

    public ThreadsHttpApi(String key) {
        super(key, new HttpExecutor());
    }

    @Override
    protected HttpEntityEnclosingRequestBase createPostRequest(String postData, String url) {
        HttpEntityEnclosingRequestBase requestBase = super.createPostRequest(postData, url);
        requestBase.addHeader("Authorization", "Basic " + new BASE64Encoder().encode((key + ":" + "").getBytes()));
        return requestBase;
    }
}
