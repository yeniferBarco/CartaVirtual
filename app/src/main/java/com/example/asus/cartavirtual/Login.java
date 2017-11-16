package com.example.asus.cartavirtual;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener {

    EditText etContrasena,etCorreo;
    BaseDeDatosActivity baseDeDatosActivity;
    Cliente cliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        Button btnVerProducto =(Button) findViewById(R.id.buttonRegistrarse);
        btnVerProducto.setOnClickListener(this);

        Button btnRealizarReserva =(Button) findViewById(R.id.buttonIngresar);
        btnRealizarReserva.setOnClickListener(this);

        etContrasena = (EditText)findViewById(R.id.Text_contrasena);

        etCorreo = (EditText)findViewById(R.id.Text_correo);

    }

    @Override
    public void onClick(View v) {
        lanzarActivity(v.getId());
    }

    public void lanzarActivity(int idView){

        Intent i;
        String valor1 = etCorreo.getText().toString();
        String valor2 = etContrasena.getText().toString();

        switch (idView){
            case R.id.buttonIngresar:
                i = new Intent(this, RealizarReserva.class);
                startActivity(i);
                break;

/*
                if(valor1.equals("yenifer@apres.com") && valor2.equals("01234") ){
                    i = new Intent(this, BaseDeDatosActivity.class);
                    startActivity(i);
                    break;
                }
                else{
                    i = new Intent(this, RealizarReserva.class);
                    startActivity(i);
                    break;
                }
*/
            case R.id.buttonRegistrarse:
                i=new Intent(this, Registrarse.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }
    /*
    public void validacion(View v){

        String valor=etCorreo.getText().toString();
        if (valor.equals("")){
        }

        if (cliente.getCorreo().equals(etCorreo)){


        }

    }
*/
}
