package com.ozandogulu.activitelerarasbilgiaktarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String giden = "deger";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        intent.putExtra("giden",giden);
        startActivity(intent);
    }
}
