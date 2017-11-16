package com.example.asus.cartavirtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VerProducto extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_producto);

        Button btnCarneAsada =(Button) findViewById(R.id.button_carne);
        btnCarneAsada.setOnClickListener(this);

        Button btnPolloApanado =(Button) findViewById(R.id.button_pollo);
        btnPolloApanado.setOnClickListener(this);

        Button btnPolloTeriyaki =(Button) findViewById(R.id.button_pollot);
        btnPolloTeriyaki.setOnClickListener(this);

        Button btnSancocho =(Button) findViewById(R.id.button_sancocho);
        btnSancocho.setOnClickListener(this);

        Button btnSeco =(Button) findViewById(R.id.button_seco);
        btnSeco.setOnClickListener(this);

        Button btnSopa =(Button) findViewById(R.id.button_sopa);
        btnSopa.setOnClickListener(this);

        Button btnCerdo =(Button) findViewById(R.id.button_cerdo);
        btnCerdo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        lanzarActivity(v.getId());
    }

    public void lanzarActivity(int idView){

        Intent i;

        switch (idView){
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
            case R.id.button_cerdo:
                i=new Intent(this, cerdo_horno.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }
}
