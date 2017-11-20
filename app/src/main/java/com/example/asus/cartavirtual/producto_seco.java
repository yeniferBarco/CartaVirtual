package com.example.asus.cartavirtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class producto_seco extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_seco);

        ImageButton btnAtras = (ImageButton) findViewById(R.id.button_atras);
        btnAtras.setOnClickListener(this);

        ImageButton btnHome = (ImageButton) findViewById(R.id.button_home);
        btnHome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        lanzarActivity(v.getId());
    }

    public void lanzarActivity(int idView) {

        Intent i;

        switch (idView) {
            case R.id.button_atras:
                i = new Intent(this, VerProducto.class);
                startActivity(i);
                break;
            case R.id.button_home:
                i = new Intent(this, Main.class);
                startActivity(i);
                break;
            default:
                break;

        }
    }
}