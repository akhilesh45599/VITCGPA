package com.example.nemaliakhilesh.vitcgpa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.dd.CircularProgressButton;

import java.text.DecimalFormat;

public class threeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        TextView t1=(TextView)findViewById(R.id.textView1);
        TextView t2=(TextView)findViewById(R.id.textView2);
        TextView t3=(TextView)findViewById(R.id.textView3);
        TextView t4=(TextView)findViewById(R.id.textView4);
        final TextView t5=(TextView)findViewById(R.id.textView7);

        final EditText e1 =(EditText)findViewById(R.id.editText1);
        final EditText e2 =(EditText)findViewById(R.id.editText2);
        final EditText e3 =(EditText)findViewById(R.id.editText3);
        final EditText e4 =(EditText)findViewById(R.id.editText6);

        CircularProgressButton circularProgressButton =(CircularProgressButton)findViewById(R.id.in);

        circularProgressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double a =Double.parseDouble(e1.getText().toString());
                Double b =Double.parseDouble(e2.getText().toString());
                Double c =Double.parseDouble(e3.getText().toString());
                DecimalFormat akhi = new DecimalFormat("0.00");
                Double c1= (a*15*1.0)/50;
                Double c2 =(b*15*1.0)/50;
                Double internal = c1+c2+c;
                String ak =akhi.format(internal);
                t5.setText(ak);


            }
        });

        CircularProgressButton circularProgressButton1 =(CircularProgressButton)findViewById(R.id.to);
        circularProgressButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat akhi = new DecimalFormat("0.00");
                Double a =Double.parseDouble(e1.getText().toString());
                Double b =Double.parseDouble(e2.getText().toString());
                Double c =Double.parseDouble(e3.getText().toString());
                Double d =Double.parseDouble(e4.getText().toString());
                Double c1= (a*15*1.0)/50;
                Double c2 =(b*15*1.0)/50;
                Double internal =c1+c2+c;
                Double to =(d*40*1.0)/100;
                Double total = internal+to;
                String akk =akhi.format(total);
                t5.setText(akk);


            }
        });










    }
}
