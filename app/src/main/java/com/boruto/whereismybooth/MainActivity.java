package com.boruto.whereismybooth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button boothdetails,applyVoterID,trackStatus,locateActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boothdetails = findViewById(R.id.boothdetailsactivity);
        applyVoterID = findViewById(R.id.applyvoterid);
        trackStatus = findViewById(R.id.trackstatus);
        locateActivity = findViewById(R.id.locatebooth);

        boothdetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent boothAct = new Intent(MainActivity.this,BoothDetails.class);
                startActivity(boothAct);
            }
        });

        applyVoterID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ApplyVoterID.class);
                startActivity(intent);
            }
        });

        locateActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LocateActivity.class);
                startActivity(intent);
            }
        });

        trackStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TrackStatus.class);
                startActivity(intent);
            }
        });
    }
}
