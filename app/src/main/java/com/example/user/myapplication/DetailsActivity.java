package com.example.user.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    EditText edName,edTB,edE,edPass,edT,edPH,edA,edH,edNB;
    TextView tvname,tvE,tvPass,tvT,tvtx,tvA,tvH,tvNB,tvPH;
    LinearLayout ln1;
    Button btnR;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        tvname=(TextView) findViewById(R.id.tvname);
        tvE=(TextView) findViewById(R.id.tvE);
        tvPass=(TextView) findViewById(R.id.tvPass);
        tvT=(TextView) findViewById(R.id.tvT);
        tvA=(TextView) findViewById(R.id.tvA);
        tvH=(TextView) findViewById(R.id.tvH);
        tvNB=(TextView) findViewById(R.id.tvNB);
        tvPH=(TextView) findViewById(R.id.tvPH);
        edName=(EditText) findViewById(R.id.edTB);
        edE=(EditText) findViewById(R.id.edT);
        edPass=(EditText) findViewById(R.id.edPass);
        edTB=(EditText) findViewById(R.id.edTB);
        edT=(EditText) findViewById(R.id.edT);
        edPH=(EditText) findViewById(R.id.edPH);
        edA=(EditText) findViewById(R.id.edA);
        edH=(EditText) findViewById(R.id.edH);
        edNB=(EditText) findViewById(R.id.edNB);
        edPH=(EditText) findViewById(R.id.edPH);
        ln1=(LinearLayout) findViewById(R.id.ln1);
        btnR=(Button) findViewById(R.id.btnR);






        TextView tv = new TextView(this);

        Boolean isPRV = getIntent().getBooleanExtra("isPrivate", true);

        if (isPRV) {
            tv.setText("is private");
        } else {
            tv.setText("is business");
        }
        //setContentView(tv);

        if (tv.getText().equals("is private"))
        {
            tvNB.setVisibility(View.INVISIBLE);
            edNB.setVisibility(View.INVISIBLE);
            tvT.setVisibility(View.INVISIBLE);
            edT.setVisibility(View.INVISIBLE);

            edTB.setVisibility(View.INVISIBLE);
            tvPH.setVisibility(View.INVISIBLE);
            edPH.setVisibility(View.INVISIBLE);
            tvA.setVisibility(View.INVISIBLE);
            edA.setVisibility(View.INVISIBLE);
            tvH.setVisibility(View.INVISIBLE);
            edH.setVisibility(View.INVISIBLE);

            //ln1.setVisibility(View.INVISIBLE);




        }


    }

    public void SignUp(View view) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(DetailsActivity.this);
        prefs.edit().putString("email", edE.getText().toString()).putString("password", edPass.getText().toString()).putString("name", edName.getText().toString()).putString("bussinessname",edNB.getText().toString()).apply();
        prefs.edit().putString("Type", edT.getText().toString()).putString("text",edTB.getText().toString()).putString("phone",edPH.getText().toString()).apply();
        prefs.edit().putString("adress",edA.getText().toString()).putString("hours",edH.getText().toString()).apply();
        Intent intent=new Intent(this, Main2Activity.class);
        startActivity(intent);


    }

    }

