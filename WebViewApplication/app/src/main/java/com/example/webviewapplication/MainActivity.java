package com.example.webviewapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView=(WebView)findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());

        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        if(bundle!=null){
            String signal=bundle.getString("signal");
            webView.loadUrl(signal);
        }
    }
}
