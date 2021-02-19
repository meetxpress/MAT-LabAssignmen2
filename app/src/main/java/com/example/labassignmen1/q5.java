package com.example.labassignmen1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class q5 extends AppCompatActivity {
    EditText et;
    TextView tw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q5);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        et = findViewById(R.id.q5_userText);
        tw = findViewById(R.id.q5_tw);
    }

    public void gotoActivity5(View v) {
        if (TextUtils.isEmpty(et.getText().toString())) {
            Toast.makeText(getApplicationContext(), "Please enter value to in the textbox.", Toast.LENGTH_SHORT).show();
        } else {
            tw.setText("String: "+et.getText().toString().toUpperCase());
        }
    }
}