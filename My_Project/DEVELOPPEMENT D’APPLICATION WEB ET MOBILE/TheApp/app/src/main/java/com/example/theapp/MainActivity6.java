package com.example.theapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    private int numBigMac = 0;
    private int priceBigMac = 0;
    private int numfrites = 0;
    private int pricefrites = 0;
    private int numdrink = 0;
    private int pricedrink = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        ((TextView)findViewById(R.id.txtBigMac)).setText(getString(R.string.txtBigMac,0));
        ((TextView)findViewById(R.id.txtFrites)).setText(getString(R.string.txtFrites,0));
        ((TextView)findViewById(R.id.txtDrink)).setText(getString(R.string.txtDrink,0));


    }






    public void bigMacClick(View v) {

        priceBigMac = priceBigMac + 4;
        ((TextView)findViewById(R.id.txtBigMac)).setText(getString(R.string.txtBigMac,priceBigMac));

    };



    public void fritesClick(View v) {

        pricefrites= pricefrites + 2;
        ((TextView)findViewById(R.id.txtFrites)).setText(getString(R.string.txtFrites,pricefrites));


    };

    public void drinkClick(View v) {


        pricedrink= pricedrink + 3;
        ((TextView)findViewById(R.id.txtDrink)).setText(getString(R.string.txtDrink,pricedrink));


    };

    public void orderClick(View v){

        int a = priceBigMac + pricefrites + pricedrink;
        Intent i =  new Intent(this,MainActivity7.class);
        String b = Integer.toString(a);
        i.putExtra("total", b);
        startActivity(i);
    }

}