package com.example.nemaliakhilesh.vitcgpa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.dd.CircularProgressButton;

import java.text.DecimalFormat;

public class FiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        TextView t1=(TextView)findViewById(R.id.textView1);
        TextView t2=(TextView)findViewById(R.id.textView2);
        TextView t3=(TextView)findViewById(R.id.textView3);
        TextView t4=(TextView)findViewById(R.id.textView4);
        final TextView t5=(TextView)findViewById(R.id.textView5);
        final TextView t6=(TextView)findViewById(R.id.textView6);
        final TextView t7=(TextView)findViewById(R.id.textView7);

        final EditText e1 =(EditText)findViewById(R.id.editText1);
        final EditText e2 =(EditText)findViewById(R.id.editText2);
        final EditText e3 =(EditText)findViewById(R.id.editText3);
        final EditText e4 =(EditText)findViewById(R.id.editText4);
        final EditText e5 =(EditText)findViewById(R.id.editText5);
        final EditText e6 =(EditText)findViewById(R.id.editText6);

        CircularProgressButton circularProgressButton =(CircularProgressButton)findViewById(R.id.in);
        circularProgressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat akhi = new DecimalFormat("0.00");
                Double a =Double.parseDouble(e1.getText().toString());
                Double b =Double.parseDouble(e2.getText().toString());
                Double c =Double.parseDouble(e3.getText().toString());
                Double c1= (a*15*1.0)/50;
                Double c2 =(b*15*1.0)/50;
                Double internal = c1+c2+c;
                String akl= akhi.format(internal);
                t7.setText(akl);
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
                Double p =Double.parseDouble(e4.getText().toString());
                Double l =Double.parseDouble(e5.getText().toString());
                Double f =Double.parseDouble(e6.getText().toString());
                Double c1= (a*15*1.0)/50;
                Double c2 =(b*15*1.0)/50;
                Double internal =c1+c2+c;
                Double to =(f*40*1.0)/100;
                Double total = internal+to;
                Double res =(total*60)/100;
                Double la =(l*20)/100;
                Double po =(p*20)/100;
                Double TTC=po+la+res;
                String ak= akhi.format(TTC);
                t7.setText(ak);



            }
        });


















    }
}
