package by.dream.browser;

import android.annotation.TargetApi;
import android.os.Build;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import javax.sql.RowSet;

public class MyWebViewClient extends WebViewClient {
    @TargetApi(Build.VERSION_CODES.N)
    @Override
    public boolean shouldOverrideUrlLoading (WebView view, WebResourceRequest request){

        view.loadUrl(request.getUrl().toString());
        return true;



    }

}