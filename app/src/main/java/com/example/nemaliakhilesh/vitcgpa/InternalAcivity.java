package com.example.nemaliakhilesh.vitcgpa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.dd.CircularProgressButton;


public class InternalAcivity extends AppCompatActivity {
    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internal_acivity);
        final Spinner e =(Spinner)findViewById(R.id.sp);
        String [] inter ={"3","4","5"};
        TextView textView =(TextView)findViewById(R.id.textView9);
        adapter =ArrayAdapter.createFromResource(this,R.array.inter,android.R.layout.simple_spinner_item);
        e.setAdapter(adapter);
        CircularProgressButton circularProgressButton9 =(CircularProgressButton)findViewById(R.id.dd);

        circularProgressButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    int k =Integer.parseInt(e.getSelectedItem().toString());



                if(k == 3)
                {
                    Intent intent1= new Intent(InternalAcivity.this,threeActivity.class);
                    startActivity(intent1);
                }
                if( k== 5)
                {
                    Intent intent2= new Intent(InternalAcivity.this,FiveActivity.class);
                    startActivity(intent2);
                }
                if (k==4)
                {
                    Intent intent3= new Intent(InternalAcivity.this,FourActivity.class);
                    startActivity(intent3);
                }
            }
        });

    }





}