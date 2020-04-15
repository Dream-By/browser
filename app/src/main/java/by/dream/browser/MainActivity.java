package by.dream.browser;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://tvrgomel.by/");

        webView.setWebViewClient(new MyWebViewClient());
    }

    @Override
    public void onBackPressed(){
        if (webView.canGoBack()){
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }

    public void onClick(View view) {

        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://tvrgomel.by/"));

        //Intent intent = new Intent ("by.dream.browser");
        //intent.setData(Uri.parse("https://tvrgomel.by/"));
        startActivity(intent);
    }
}
