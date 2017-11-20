package com.example.asus.cartavirtual;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class RealizarReserva extends AppCompatActivity implements View.OnClickListener {

    TextView et1, et2, etNum_mesas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realizar_reserva);

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
                i = new Intent(this, Login.class);
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

    public void lanzarReserva(View view){
        Intent ven=new Intent(this,VerCarta.class);
        startActivity(ven);
    }

    public void cancelar(View view){
        Intent ven=new Intent(this,Login.class);
        startActivity(ven);

    }
}
