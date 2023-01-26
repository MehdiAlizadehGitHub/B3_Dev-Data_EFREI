package com.example.theapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Intent i = getIntent();
        String name = i.getStringExtra("dataPassed");
        ((TextView)findViewById(R.id.welcomeGuest)).setText(getString(R.string.welcomeGuest,name));
    }

    public void btnClickGame (View v){
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }

    public void btnClickFood (View v){
        Intent i = new Intent(this, MainActivity6.class);
        startActivity(i);
    }
}