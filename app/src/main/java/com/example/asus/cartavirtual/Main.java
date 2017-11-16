package com.example.asus.cartavirtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMap =(Button) findViewById(R.id.button_VerUbicacion);
        btnMap.setOnClickListener(this);

        Button btnVerCarta =(Button) findViewById(R.id.buttonVerCarta);
        btnVerCarta.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        lanzarActivity(v.getId());
    }

    public void lanzarActivity(int idView){

        Intent i;

        switch (idView){
            case R.id.button_VerUbicacion:
                i=new Intent(this, MapsActivity.class);
                startActivity(i);
                break;
            case R.id.buttonVerCarta:
                i=new Intent(this, VerCarta.class);
                startActivity(i);
                break;
            case R.id.button_carne:
                i=new Intent(this, producto_carne_asada.class);
                startActivity(i);
                break;
            case R.id.button_pollo:
                i=new Intent(this, producto_pollo_apanado.class);
                startActivity(i);
                break;
            case R.id.button_pollot:
                i=new Intent(this, producto_pollo_teriyaki.class);
                startActivity(i);
                break;
            case R.id.button_sancocho:
                i=new Intent(this, producto_sancocho.class);
                startActivity(i);
                break;
            case R.id.button_seco:
                i=new Intent(this, producto_seco.class);
                startActivity(i);
                break;
            case R.id.button_sopa:
                i=new Intent(this, ProductoSopa.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }

}
