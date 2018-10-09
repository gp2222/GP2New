package com.example.ali.lsss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.example.ali.lsss.R;

public class Issue_Certificate extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issue__certificate);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("إصدار الشهادات");
        setSupportActionBar(toolbar);
    }

}
