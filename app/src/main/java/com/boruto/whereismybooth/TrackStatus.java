package com.boruto.whereismybooth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TrackStatus extends AppCompatActivity {

    WebView wb;
    private class HelloWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return false;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_status);

        wb=(WebView)findViewById(R.id.trackstatus_wb);
        wb.getSettings().setJavaScriptEnabled(true);
        wb.getSettings().setLoadWithOverviewMode(true);
        wb.getSettings().setUseWideViewPort(true);
        wb.getSettings().setBuiltInZoomControls(true);
        wb.getSettings().setPluginState(WebSettings.PluginState.ON);
        wb.getSettings().setBuiltInZoomControls(true);
        wb.getSettings().setDisplayZoomControls(false);
        wb.setWebViewClient(new TrackStatus.HelloWebViewClient());
        wb.loadUrl("https://www.nvsp.in/Forms/Forms/trackstatus");
    }
}
