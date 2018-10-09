package com.example.ali.lsss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
        ;import com.example.ali.lsss.R;

public class add_meeting extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_metting);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle( "إضافة ورشة العمل");
        setSupportActionBar(toolbar);
    }

    }


