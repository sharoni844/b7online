package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;

public class baseactivity extends AppCompatActivity {

    Switch switch1;
    ImageButton idfamily,idshopping,idcon,idculture,idparty,idrest,idcinema;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baseactivity);


       switch1 = (Switch) findViewById(R.id.switch1);
       //switch1.setVisibility(View.INVISIBLE);



    }
}
