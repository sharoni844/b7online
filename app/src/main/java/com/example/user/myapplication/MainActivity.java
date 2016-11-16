package com.example.user.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2;
    ImageView iv1;
    TextView tv1,tv2,tv3,tv4;
    EditText et1,et2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ArrayList<Show> shows = new ArrayList<>();
        shows.add(new Show("fds", "fds", 4));

        setContentView(R.layout.activity_main);
        tv1=(TextView) findViewById(R.id.tv1);
        tv2=(TextView) findViewById(R.id.tv2);
        tv3=(TextView) findViewById(R.id.tv3);
        tv4=(TextView) findViewById(R.id.tv4);
        iv1=(ImageView) findViewById(R.id.iv1);
        et1=(EditText) findViewById(R.id.email_input_text);
        et2=(EditText) findViewById(R.id.password_input_text);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
                prefs.edit().putString("email", et1.getText().toString()).putString("password", et2.getText().toString()).apply();
            }
        });

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
        et1.setText(prefs.getString("email", ""));
        et2.setText(prefs.getString("password", ""));
    }

    public void Register(View view) {
        Intent intent= new Intent(this,Register.class);
        startActivity(intent);

    }

    public void registerAs(View view) {


    }

    public void guest(View view) {

    }
}
