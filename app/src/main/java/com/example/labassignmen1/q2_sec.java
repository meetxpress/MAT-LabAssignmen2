package com.example.labassignmen1;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class q2_sec extends AppCompatActivity {
    TextView t1, t2, t3, t4, t5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2_sec);
        getSupportActionBar().setDisplayShowCustomEnabled(true);

        t1 = findViewById(R.id.q2_tw1);
        t2 = findViewById(R.id.q2_tw2);
        t3 = findViewById(R.id.q2_tw3);
        t4 = findViewById(R.id.q2_tw4);
        t5 = findViewById(R.id.q2_tw5);

        Intent in = getIntent();
        t1.setText("Id: " + in.getStringExtra("id"));
        t2.setText("Name: " + in.getStringExtra("name"));
        t3.setText("Branch: " + in.getStringExtra("branch"));
        t4.setText("Contact No: " + in.getStringExtra("phno"));
        t5.setText("Date of Birth: " + in.getStringExtra("dob"));
    }

    public void gotoHome(View v) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}