package com.example.nemaliakhilesh.vitcgpa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.dd.CircularProgressButton;

import java.text.DecimalFormat;

public class Main4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        TextView t= (TextView)findViewById(R.id.textView2);
        final TextView t1= (TextView)findViewById(R.id.textView3);

        final EditText e =(EditText)findViewById(R.id.editText1);
        final EditText e1=(EditText)findViewById(R.id.editText2);
        final EditText e2 =(EditText)findViewById(R.id.editText3);
        final EditText e3 =(EditText)findViewById(R.id.editText4);
        CircularProgressButton circularProgressButton = (CircularProgressButton)findViewById(R.id.po);
        circularProgressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int point =9;
                final int point1 =8;
                final int point2 =7;
                int s2= Integer.parseInt(e1.getText().toString());
                int s3 =Integer.parseInt(e2.getText().toString());
                Double s1 = Double.parseDouble(e.getText().toString());
                Double s= Double.parseDouble(e3.getText().toString());
                int tc= s2 +s3;
                Double m =  (s1*s2);
                DecimalFormat akhi = new DecimalFormat("0.00");

                if(s==9 || s==9.0)
                {
                    Double GPA =((9.0*tc)-(m))/s3;

                    String a= akhi.format(GPA);
                    if(GPA >10.0)
                    {
                        t1.setText("It is impossible to get  "+point+" better luck next sem");
                    }
                    if(GPA<10.0)
                    {
                        t1.setText(a);

                    }
                }

                if(s==8 || s==8.0)
                {


                    Double GPA =((8.0*tc)-(m))/s3;
                    String a= akhi.format(GPA);
                    if(GPA >10.0)
                    {
                        t1.setText("It is impossible to get  "+point1+"  better luck next sem");
                    }
                    if(GPA<10.0)
                    {
                        t1.setText(a);

                    }
                }

                if(s==7 || s==7.0)
                {

                    Double GPA =((7.0*tc)-(m))/s3;
                    String a= akhi.format(GPA);
                    if(GPA >10.0)
                    {
                        t1.setText("It is impossible to get  "+point2+"  better luck next sem");
                    }
                    if(GPA<10.0)
                    {
                        t1.setText(a);

                    }
                }







            }
        });




    }



}
