package com.example.ali.lsss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.example.ali.lsss.R;

public class Volunteer_Research_Assistant extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer__research__assistant);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("ربط مساعد الباحث مع القيادي(Leader)");
        setSupportActionBar(toolbar);
    }

}
