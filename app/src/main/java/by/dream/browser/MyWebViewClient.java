package by.dream.browser;

import android.annotation.TargetApi;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import javax.sql.RowSet;

public class MyWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading (WebView view, String url){

    if (Uri.parse(url).getHost().length()==0){
            return false;
        }

    Intent intent = new Intent (Intent.ACTION_VIEW,Uri.parse(url));
    view.getContext().startActivity(intent);
    return true;
    }
}
