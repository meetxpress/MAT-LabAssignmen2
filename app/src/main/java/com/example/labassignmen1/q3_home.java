package com.example.labassignmen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class q3_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3_home);
        getSupportActionBar().setDisplayShowCustomEnabled(true);

        TextView t=findViewById(R.id.q3_tw1);
        Intent i =getIntent();
        t.setText("Welcome "+ i.getStringExtra("uname"));
    }
}