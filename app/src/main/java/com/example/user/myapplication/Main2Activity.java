package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;

public class Main2Activity extends AppCompatActivity {
CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        cb1=(CheckBox) findViewById(R.id.cb1);
        cb2=(CheckBox) findViewById(R.id.cb2);
        cb3=(CheckBox) findViewById(R.id.cb3);
        cb4=(CheckBox) findViewById(R.id.cb4);
        cb5=(CheckBox) findViewById(R.id.cb5);
        cb6=(CheckBox) findViewById(R.id.cb6);
        cb7=(CheckBox) findViewById(R.id.cb7);
        cb8=(CheckBox) findViewById(R.id.cb8);
        cb9=(CheckBox) findViewById(R.id.cb9);
    }
}
