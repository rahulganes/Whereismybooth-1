package com.boruto.whereismybooth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class booth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booth);
    }
    public void showLocation(View view){
        Intent intent = new Intent(this,MapsActivity.class);
        startActivity(intent);
    }
}
