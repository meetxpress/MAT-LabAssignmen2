package com.example.labassignmen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class q6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q6);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
    }

    public void gotoActivity6(View v) {
        switch (v.getId()) {
            case R.id.q6_btnvisitsite:
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://google.com")));
                break;

            case R.id.q6_btnmakecall:
                startActivity(new Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:1234567890")));
                break;

            case R.id.q6_btnshowmap:
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://maps.google.co.in/maps?q=")));
                break;

            case R.id.q6_btncontact:
                startActivity(new Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:")));
                break;

            default:
                break;
        }
    }
}