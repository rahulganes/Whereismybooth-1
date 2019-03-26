package com.boruto.whereismybooth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LocateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locate);
    }
    public void goToBooth(View view){
        Intent intent = new Intent(LocateActivity.this,booth.class);
        startActivity(intent);
    }
}
