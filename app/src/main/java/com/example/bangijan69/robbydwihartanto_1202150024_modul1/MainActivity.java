package com.example.bangijan69.robbydwihartanto_1202150024_modul1;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    Context ctx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(3000);
                    Intent myIntent = new Intent(MainActivity.this,
                            MenuUtama.class);
                    startActivity(myIntent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        };
        thread.start();
    }
}
