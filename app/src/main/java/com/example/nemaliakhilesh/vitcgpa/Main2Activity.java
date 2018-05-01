package com.example.nemaliakhilesh.vitcgpa;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.dd.CircularProgressButton;

import java.text.DecimalFormat;

public class Main2Activity extends AppCompatActivity {
    ArrayAdapter<CharSequence>adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String [] grades={"S","A","B","C","B","F","N"};
        final Spinner e1 =(Spinner)findViewById(R.id.spinner);
        final Spinner e2 =(Spinner)findViewById(R.id.spinner1);
        final  Spinner e3 =(Spinner)findViewById(R.id.spinner2);
        final  Spinner e4 =(Spinner)findViewById(R.id.spinner3);
        final Spinner e5 =(Spinner)findViewById(R.id.spinner4);
        final   Spinner e6 =(Spinner)findViewById(R.id.spinner5);
        final  Spinner e7 =(Spinner)findViewById(R.id.spinner6);
        final Spinner e8 =(Spinner)findViewById(R.id.spinner7);
        final Spinner e9 =(Spinner)findViewById(R.id.spinner8);
        final Spinner e10 =(Spinner)findViewById(R.id.spinner9);




        final Spinner g1 =(Spinner)findViewById(R.id.spinner11);

        final Spinner g2 =(Spinner)findViewById(R.id.spinner12);
        final Spinner g3 =(Spinner)findViewById(R.id.spinner13);
        final Spinner g4 =(Spinner)findViewById(R.id.spinner14);
        final Spinner g5 =(Spinner)findViewById(R.id.spinner15);
        final Spinner g6 =(Spinner)findViewById(R.id.spinner16);
        final Spinner g7 =(Spinner)findViewById(R.id.spinner17);
        final Spinner g8 =(Spinner)findViewById(R.id.spinner18);
        final Spinner g9 =(Spinner)findViewById(R.id.spinner19);
        final Spinner g10 =(Spinner)findViewById(R.id.spinner20);

       /* final AutoCompleteTextView e1=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        final AutoCompleteTextView e2=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        final AutoCompleteTextView e3=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView2);
        final AutoCompleteTextView e4=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView3);
        final AutoCompleteTextView e5=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView4);
        final AutoCompleteTextView e6=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView5);
        final AutoCompleteTextView e7=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView6);
        final AutoCompleteTextView e8=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView7);
        final AutoCompleteTextView e9=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView8);
        final AutoCompleteTextView e10=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView9);

        final AutoCompleteTextView g1=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView11);
        final AutoCompleteTextView g2=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView12);
        final AutoCompleteTextView g3=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView13);
        final AutoCompleteTextView g4=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView14);
        final AutoCompleteTextView g5=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView15);
        final AutoCompleteTextView g6=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView16);
        final AutoCompleteTextView g7=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView17);
        final AutoCompleteTextView g8=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView18);
        final AutoCompleteTextView g9=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView19);
        final AutoCompleteTextView g10=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView20);*/


        final TextView textView =(TextView)findViewById(R.id.textView);



        adapter =ArrayAdapter.createFromResource(this,R.array.Grade,android.R.layout.simple_spinner_item);

        g1.setAdapter(adapter);
        g2.setAdapter(adapter);
        g3.setAdapter(adapter);
        g4.setAdapter(adapter);
        g5.setAdapter(adapter);
        g6.setAdapter(adapter);
        g7.setAdapter(adapter);
        g8.setAdapter(adapter);
        g9.setAdapter(adapter);
        g10.setAdapter(adapter);


        adapter =ArrayAdapter.createFromResource(this,R.array.credits,android.R.layout.simple_spinner_item);

        e1.setAdapter(adapter);
        e2.setAdapter(adapter);
        e3.setAdapter(adapter);
        e4.setAdapter(adapter);
        e5.setAdapter(adapter);
        e6.setAdapter(adapter);
        e7.setAdapter(adapter);
        e8.setAdapter(adapter);
        e9.setAdapter(adapter);
        e10.setAdapter(adapter);


        CircularProgressButton circularProgressButton =(CircularProgressButton)findViewById(R.id.oo);
        circularProgressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int w1=0,w2=0,w3=0,w4=0,w5=0,w6=0,w7=0,w9=0,w8=0,w10=0;
                String q1="F",q2="F",q3="F",q4="F",q5="F",q6="F",q7="F",q9="F",q8="F",q10="F";

                if (!(e1.getSelectedItem().toString()).equals(""))
                {
                     w1=Integer.parseInt(e1.getSelectedItem().toString());
                }
                if (!(e2.getSelectedItem().toString()).equals(""))
                {
                    w2=Integer.parseInt(e2.getSelectedItem().toString());
                }
                if (!(e3.getSelectedItem().toString()).equals(""))
                {
                   w3=Integer.parseInt(e3.getSelectedItem().toString());
                }
                if (!(e4.getSelectedItem().toString()).equals(""))
                {
                     w4=Integer.parseInt(e4.getSelectedItem().toString());
                }
                if (!(e5.getSelectedItem().toString()).equals(""))
                {
                     w5=Integer.parseInt(e5.getSelectedItem().toString());
                }
                if (!(e6.getSelectedItem().toString()).equals(""))
                {
                   w6=Integer.parseInt(e6.getSelectedItem().toString());
                }
                if (!(e7.getSelectedItem().toString()).equals(""))
                { w7=Integer.parseInt(e7.getSelectedItem().toString());
                }
                if (!(e8.getSelectedItem().toString()).equals(""))
                {
                    w8=Integer.parseInt(e8.getSelectedItem().toString());
                }

                if (!(e9.getSelectedItem().toString()).equals(""))
                {
                    w9=Integer.parseInt(e9.getSelectedItem().toString());
                } if (!(e10.getSelectedItem().toString()).equals(""))
                {
                     w10=Integer.parseInt(e10.getSelectedItem().toString());
                }

                int c=0;int c1=0;int c2=0;int c3=0;int c4=0;int c5=0;int c6=0;int c7=0;int c8=0,c9=0;


                if (!(g1.getSelectedItem().toString()).equals(""))
                {
                   q1= g1.getSelectedItem().toString();
                }
                if (!(g2.getSelectedItem().toString()).equals(""))
                {
                     q2= g2.getSelectedItem().toString();
                }

                if (!(g3.getSelectedItem().toString()).equals(""))
                {
                     q3= g3.getSelectedItem().toString();
                }if (!(g4.getSelectedItem().toString()).equals(""))
                {
                     q4= g4.getSelectedItem().toString();
                }if (!(g5.getSelectedItem().toString()).equals(""))
                {
                     q5= g5.getSelectedItem().toString();
                }if (!(g6.getSelectedItem().toString()).equals(""))
                {
                     q6= g6.getSelectedItem().toString();
                }if (!(g7.getSelectedItem().toString()).equals(""))
                {
                    q7= g7.getSelectedItem().toString();
                }

                if (!(g8.getSelectedItem().toString()).equals(""))
                {
                    q8= g8.getSelectedItem().toString();
                }if (!(g9.getSelectedItem().toString()).equals(""))
                {
                     q9= g9.getSelectedItem().toString();
                }if (!(g10.getSelectedItem().toString()).equals(""))
                {
                     q10= g10.getSelectedItem().toString();
                }

                switch (q1)
                {
                    case "S":c=10;break;
                    case "A":c=9;break;
                    case "B":c=8;break;
                    case "C":c=7;break;
                    case "D":c=6;break;
                    case "E":c=5;break;
                    case "F":c=0;break;
                    case "N":c=0;break;
                    case "":c=0;break;

                }
                switch (q2)
                {
                    case "S":c1=10;break;
                    case "A":c1=9;break;
                    case "B":c1=8;break;
                    case "C":c1=7;break;
                    case "D":c1=6;break;
                    case "E":c1=5;break;
                    case "F":c1=0;break;
                    case "N":c1=0;break;
                    case "":c1=0;break;

                }
                switch (q3)
                {
                    case "S":c2=10;break;
                    case "A":c2=9;break;
                    case "B":c2=8;break;
                    case "C":c2=7;break;
                    case "D":c2=6;break;
                    case "E":c2=5;break;
                    case "F":c2=0;break;
                    case "N":c2=0;break;
                    case "":c2=0;break;

                }
                switch (q4)
                {
                    case "S":c3=10;break;
                    case "A":c3=9;break;
                    case "B":c3=8;break;
                    case "C":c3=7;break;
                    case "D":c3=6;break;
                    case "E":c3=5;break;
                    case "F":c3=0;break;
                    case "N":c3=0;break;
                    case "":c3=0;break;

                }
                switch (q5)
                {
                    case "S":c4=10;break;
                    case "A":c4=9;break;
                    case "B":c4=8;break;
                    case "C":c4=7;break;
                    case "D":c4=6;break;
                    case "E":c4=5;break;
                    case "F":c4=0;break;
                    case "N":c4=0;break;
                    case "": c4=0;break;

                }
                switch (q6)
                {
                    case "S":c5=10;break;
                    case "A":c5=9;break;
                    case "B":c5=8;break;
                    case "C":c5=7;break;
                    case "D":c5=6;break;
                    case "E":c5=5;break;
                    case "F":c5=0;break;
                    case "N":c5=0;break;
                    case "":c5=0;break;

                }
                switch (q7)
                {
                    case "S":c6=10;break;
                    case "A":c6=9;break;
                    case "B":c6=8;break;
                    case "C":c6=7;break;
                    case "D":c6=6;break;
                    case "E":c6=5;break;
                    case "F":c6=0;break;
                    case "N":c6=0;break;
                    case "":c6=0;break;

                }

                switch (q8)
                {
                    case "S":c7=10;break;
                    case "A":c7=9;break;
                    case "B":c7=8;break;
                    case "C":c7=7;break;
                    case "D":c7=6;break;
                    case "E":c7=5;break;
                    case "F":c7=0;break;
                    case "N":c7=0;break;
                    case "":c7=0;break;

                }


                switch (q9)
                {
                    case "S":c8=10;break;
                    case "A":c8=9;break;
                    case "B":c8=8;break;
                    case "C":c8=7;break;
                    case "D":c8=6;break;
                    case "E":c8=5;break;
                    case "F":c8=0;break;
                    case "N":c8=0;break;
                    case "":c=0;break;

                }
                switch (q10)
                {
                    case "S":c9=10;break;
                    case "A":c9=9;break;
                    case "B":c9=8;break;
                    case "C":c9=7;break;
                    case "D":c9=6;break;
                    case "E":c9=5;break;
                    case "F":c9=0;break;
                    case "N":c9=0;break;
                    case "":c9=0;break;

                }


                float GPA = (float)(((c*w1)+(c1*w2)+(c2*w3)+(c3*w4)+(c4*w5)+(c5*w6)+(c6*w7)+(c7*w8)+(c8*w9)+(c9*w10)))/(w1+w2+w3+w4+w5+w6+w7+w8+w9+w10);
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                float twoDigitsF = Float.valueOf(decimalFormat.format(GPA));

            textView.setText(Float.toString(twoDigitsF));





                }
        });
    }
}
