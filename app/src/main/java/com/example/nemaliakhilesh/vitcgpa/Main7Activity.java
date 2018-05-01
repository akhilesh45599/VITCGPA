package com.example.nemaliakhilesh.vitcgpa;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main7Activity extends AppCompatActivity {
    private static int FLASH=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);



        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent =new Intent(Main7Activity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },FLASH);
    }
}
