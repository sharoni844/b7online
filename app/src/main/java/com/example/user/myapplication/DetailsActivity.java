package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView tv = new TextView(this);
        if (getIntent().getBooleanExtra("is_private", false)) {
            tv.setText("is private");
        } else {
            tv.setText("is business");
        }
        setContentView(tv);
    }
}
