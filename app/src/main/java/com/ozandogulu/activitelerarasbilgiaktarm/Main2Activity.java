package com.ozandogulu.activitelerarasbilgiaktarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    String gelen = "deger yok";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = findViewById(R.id.textView);

        Intent intent = getIntent();
        gelen = intent.getStringExtra("giden");
        textView.setText(gelen);
    }
}
