package com.example.theapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btnClick(View v){

        Intent i = new Intent(this, MainActivity5.class);
        String name = ((EditText)findViewById(R.id.idBox)).getText().toString();
        i.putExtra("dataPassed",name);
        startActivity(i);

    }

}