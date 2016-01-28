package io.threads.java.http;

import com.goolla.http.BaseHttpApi;
import com.goolla.http.HttpExecutor;
import com.goolla.http.callback.ResponseCallback;
import com.goolla.http.params.Param;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.impl.client.BasicCredentialsProvider;
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
        HttpEntityEnclosingRequestBase requestBase =  super.createPostRequest(postData, url);
        requestBase.addHeader("Authorization","Basic " + new BASE64Encoder().encode((key + ":" + "").getBytes()));
        return requestBase;
    }
}
