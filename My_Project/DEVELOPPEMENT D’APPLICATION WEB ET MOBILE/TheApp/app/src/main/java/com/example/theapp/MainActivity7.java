package com.example.theapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        Intent i = getIntent();
        String total= i.getStringExtra("total");
        ((TextView)findViewById(R.id.txtTotal)).setText(getString(R.string.totalTxt,total));
    }

    public void reOrder(View v){
        Intent i = new Intent(this,MainActivity6.class);
        startActivity(i);
    }
}