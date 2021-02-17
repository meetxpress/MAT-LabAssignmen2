package com.example.labassignmen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoMainActivity(View v) {
        switch (v.getId()) {
            case R.id.btnSC:
                startActivity(new Intent(getApplicationContext(), SplashScreen.class));
                break;

            case R.id.btnQ1:
                startActivity(new Intent(getApplicationContext(), Q1.class));
                break;

            default:
                break;
        }

    }
}