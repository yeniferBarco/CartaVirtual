package com.cartavirtual.upb.cartavirtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VerCarta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_carta);
    }

    public void lanzarMenu(View view){

        Intent i;

        i = new Intent(this, VerProducto.class );
        startActivity(i);
    }
}
