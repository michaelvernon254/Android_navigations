package com.vernon.vernonskideltanavigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class gallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
    }

    public void home(View view) {
        Intent home = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(home);
    }
}
