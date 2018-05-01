package com.example.nemaliakhilesh.vitcgpa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.dd.CircularProgressButton;

import java.text.DecimalFormat;

import static com.example.nemaliakhilesh.vitcgpa.R.id.GPA;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        final EditText e=(EditText)findViewById(R.id.editText5);
        final EditText e1 =(EditText)findViewById(R.id.editText1);
        final EditText e2 =(EditText)findViewById(R.id.editText2);

        final TextView t1= (TextView)findViewById(R.id.textView7);
        CircularProgressButton circularProgressButton =(CircularProgressButton)findViewById(GPA);
        final int point=9;

        circularProgressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DecimalFormat akhi = new DecimalFormat("0.00");
                final Double a= Double.parseDouble(e.getText().toString());
                final int b= Integer.parseInt(e1.getText().toString());
                final int c= Integer.parseInt(e2.getText().toString());
                if( a < 9.0)
                {
                    Toast.makeText(Main5Activity.this,"wrong input",Toast.LENGTH_SHORT).show();
                }
                else {
                    Double m = b *a;
                    int tc= b+c;
                    int p = point*tc;
                    Double GPA = (p-m)/c;
                    String ak=akhi.format(GPA);
                    t1.setText(ak);

                }
            }
        });
    }
}
