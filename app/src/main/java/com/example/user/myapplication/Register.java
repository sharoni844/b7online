package com.example.user.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Register extends AppCompatActivity {
    RadioGroup rg1;
    RadioButton rd2, rd3;
    TextView tvchoose;
    Boolean isPrivate = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        rg1 = (RadioGroup) findViewById(R.id.rg1);

        rd2 = (RadioButton) findViewById(R.id.rd2);
        rd3 = (RadioButton) findViewById(R.id.rd3);
        tvchoose = (TextView) findViewById(R.id.tvchoose);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        rd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isPrivate = !rd2.isChecked();
                registerAs(v);
            }
        });
        rd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isPrivate = rd3.isChecked();
                registerAs(v);
            }
        });
    }

    public void registerAs(View v) {
        Intent intent1 = new Intent(this, DetailsActivity.class);

        Bundle bundle = new Bundle();
        bundle.putBoolean("isPrivate",isPrivate);
        intent1.putExtras(bundle);

        Log.d("test",isPrivate.toString());
        startActivity(intent1);

    }
}