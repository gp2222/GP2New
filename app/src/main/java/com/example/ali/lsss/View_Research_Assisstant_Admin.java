package com.example.ali.lsss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.example.ali.lsss.R;

public class View_Research_Assisstant_Admin extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view__research__assisstant__admin);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle( "عرض مساعد الباحث");
        setSupportActionBar(toolbar);
    }


}