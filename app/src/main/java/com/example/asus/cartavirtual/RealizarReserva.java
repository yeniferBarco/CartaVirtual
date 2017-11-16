package com.example.asus.cartavirtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class RealizarReserva extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realizar_reserva);

        Button btnRealizarReserva =(Button) findViewById(R.id.button_confReserva);
        btnRealizarReserva.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        lanzarActivity(v.getId());
    }

    public void lanzarActivity(int idView){

        Intent i;
        switch (idView){
            case R.id.button_confReserva:
                i = new Intent(this, VerCarta.class);
                startActivity(i);
                break;

            default:
                break;
        }
    }

}
