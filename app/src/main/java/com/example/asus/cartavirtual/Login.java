package com.example.asus.cartavirtual;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import org.json.JSONObject;

public class Login extends AppCompatActivity implements View.OnClickListener {

    EditText etContrasena,etCorreo;
    private Cursor fila;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        ImageButton btnAtras =(ImageButton) findViewById(R.id.button_atras);
        btnAtras.setOnClickListener(this);

        ImageButton btnHome =(ImageButton) findViewById(R.id.button_home);
        btnHome.setOnClickListener(this);

        etContrasena = (EditText)findViewById(R.id.Text_contrasena);
        etCorreo = (EditText)findViewById(R.id.Text_correo);

    }

    @Override
    public void onClick(View v) {
        lanzarActivity(v.getId());
    }

    public void lanzarActivity(int idView) {

        Intent i;

        switch (idView) {
            case R.id.button_atras:
                i = new Intent(this, VerCarta.class);
                startActivity(i);
                break;
            case R.id.button_home:
                i = new Intent(this, Main.class);
                startActivity(i);
                break;

        }
    }


    public void lanzarIngreso(View v){

        DBHelper admin=new DBHelper(this,"instituto",null,1);
        SQLiteDatabase db=admin.getWritableDatabase();
        String usuario=etCorreo.getText().toString();
        String contrasena = etContrasena.getText().toString();
        fila= db.rawQuery("select usuario, contrasena from usuarios where usuario='"+usuario+"' and contrasena='"+contrasena+"'", null);

        if (fila.moveToFirst()) {
            String usua = fila.getString(0);
            String pass = fila.getString(1);
            if (usuario.equals(usua) && contrasena.equals(pass) &&usuario.contains("@apres.com")) {
                Intent ven = new Intent(this, RealizarReserva.class);
                startActivity(ven);
                etCorreo.setText("");
                etContrasena.setText("");
            }
        }
    }

    public void lanzarRegistro(View v){
        Intent ven=new Intent(this,Registrarse.class);
        startActivity(ven);
    }

}
