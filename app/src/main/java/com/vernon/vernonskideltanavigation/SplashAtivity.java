package com.vernon.vernonskideltanavigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashAtivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_ativity);
        Thread splash = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(10000);
                    Intent main = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(main);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        splash.start();
    }
}
