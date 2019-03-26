package com.boruto.whereismybooth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ApplyVoterID extends AppCompatActivity {

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
        setContentView(R.layout.activity_apply_voter_id);
        wb=(WebView)findViewById(R.id.applyvoterid_wb);
        wb.getSettings().setJavaScriptEnabled(true);
        wb.getSettings().setLoadWithOverviewMode(true);
        wb.getSettings().setUseWideViewPort(true);
        wb.getSettings().setBuiltInZoomControls(true);
        wb.getSettings().setPluginState(WebSettings.PluginState.ON);
        wb.getSettings().setBuiltInZoomControls(true);
        wb.getSettings().setDisplayZoomControls(false);
        wb.setWebViewClient(new ApplyVoterID.HelloWebViewClient());
        wb.loadUrl("https://www.nvsp.in/Forms/Forms/form6");
    }
}
