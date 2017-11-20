package com.example.asus.cartavirtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class VerCarta extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_carta);

        Button btnVerProducto = (Button) findViewById(R.id.button_ConsultarMenu);
        btnVerProducto.setOnClickListener(this);

        Button btnRealizarReserva = (Button) findViewById(R.id.button_realizarReserva);
        btnRealizarReserva.setOnClickListener(this);

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
                i = new Intent(this, Main.class);
                startActivity(i);
                break;
            case R.id.button_home:
                i = new Intent(this, Main.class);
                startActivity(i);
                break;
            case R.id.button_ConsultarMenu:
                i = new Intent(this, VerProducto.class);
                startActivity(i);
                break;
            case R.id.button_realizarReserva:
                i = new Intent(this, Login.class);
                startActivity(i);
                break;
            default:
                break;

        }
    }
}
