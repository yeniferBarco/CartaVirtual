package com.cartavirtual.upb.cartavirtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void lanzarActivity (int idView){

        Intent i;
        switch(idView){

        }
    }

    public void lanzarMaps(View view){

        Intent i;

        i = new Intent(this, MapsActivity.class);
        startActivity(i);
    }

    public void lanzarMenu(View view){

        Intent i;

        i = new Intent(this, VerCarta.class );
        startActivity(i);
    }

    @Override
    public void onClick(View v) {

    }
}