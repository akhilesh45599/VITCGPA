package com.example.nemaliakhilesh.vitcgpa;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dd.CircularProgressButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        CircularProgressButton circularProgressButton = (CircularProgressButton) findViewById(R.id.gpa);
        CircularProgressButton circularProgressButton1 = (CircularProgressButton) findViewById(R.id.cgpa);
        CircularProgressButton circularProgressButton2 = (CircularProgressButton) findViewById(R.id.pp);
        CircularProgressButton circularProgressButton5 = (CircularProgressButton) findViewById(R.id.po);
        CircularProgressButton circularProgressButton6 =(CircularProgressButton)findViewById(R.id.ii);
        CircularProgressButton circularProgressButton7 =(CircularProgressButton)findViewById(R.id.cse);



    circularProgressButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(MainActivity.this,Main2Activity.class);
            startActivity(i);
        }
    });


        circularProgressButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent1);
            }
        });

        circularProgressButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this,Main4.class);
                startActivity(intent2);
            }
        });

        circularProgressButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 =new Intent(MainActivity.this,Main5Activity.class);
                startActivity(intent5);
            }
        });

        TextView textView7 = (TextView)findViewById(R.id.textView7);
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7= new Intent(MainActivity.this,Main6Activity.class);
                startActivity(intent7);
            }
        });

        circularProgressButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8 =new Intent(MainActivity.this,InternalAcivity.class);
                startActivity(intent8);
            }
        });
         circularProgressButton7.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent9 = new Intent(MainActivity.this,CseActivity.class);
                 startActivity(intent9);

             }
         });
    }
}
