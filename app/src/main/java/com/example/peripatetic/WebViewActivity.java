package com.example.peripatetic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);


        WebView link = findViewById(R.id.Webv);

        link.setWebViewClient(new WebViewClient());
        link.getSettings().setJavaScriptEnabled(true);


        link.getSettings().setLoadWithOverviewMode(true);
        link.getSettings().setUseWideViewPort(true);

        link.getSettings().setBuiltInZoomControls(true);

        Bundle b = getIntent().getExtras();

        String webv = b.getString("data");

        link.loadUrl(webv);


    }
}