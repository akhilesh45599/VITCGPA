package com.example.nemaliakhilesh.vitcgpa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.dd.CircularProgressButton;

import java.text.DecimalFormat;

public class Main3Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        final EditText e = (EditText) findViewById(R.id.editText);
        final EditText e1 = (EditText) findViewById(R.id.editText2);
        final EditText e2 = (EditText) findViewById(R.id.editText3);
        final EditText e3 = (EditText) findViewById(R.id.editText1);
        final TextView textView = (TextView) findViewById(R.id.textView4);



        CircularProgressButton circularProgressButton = (CircularProgressButton) findViewById(R.id.cc);
        circularProgressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double s = Double.parseDouble(e.getText().toString());
                Integer s1= Integer.parseInt(e1.getText().toString());
                Double s2 = Double.parseDouble(e2.getText().toString());
                Integer s3 = Integer.parseInt(e3.getText().toString());

                Integer c =s1+s3;
                Double t=s2*s3;
                Double t1 = s*s1;
                Double CGPA =(t+t1)/c;
                DecimalFormat akhi = new DecimalFormat("0.00");
                String a= akhi.format(CGPA);
                textView.setText(a);

            }
        });




    }


    }










