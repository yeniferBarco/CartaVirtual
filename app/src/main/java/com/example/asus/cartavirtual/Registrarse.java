package com.example.asus.cartavirtual;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registrarse extends AppCompatActivity {

    EditText etcontrasena, etcorreo, etcedula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);

        etcorreo = (EditText) findViewById(R.id.Text_user);
        etcontrasena = (EditText) findViewById(R.id.Text_password);
        etcedula = (EditText) findViewById(R.id.Text_cedula);

    }

    public void confRegistro(View view){

        DBHelper admin=new DBHelper(this,"instituto",null,1);
        SQLiteDatabase db=admin.getWritableDatabase();
        String cedula= etcedula.getText().toString();
        String usuario= etcorreo.getText().toString();
        String contraseña=etcontrasena.getText().toString();

        ContentValues values=new ContentValues();
        values.put("cedula",cedula);
        values.put("usuario",usuario);
        values.put("contrasena",contraseña);

        if (usuario.contains("@apres.com") && !contraseña.equals(null)){
            db.insert("usuarios",null,values);
            db.close();

            Intent ven=new Intent(this,Login.class);
            startActivity(ven);
        }

    }

    public void cancelar(View view){
        finish();

    }

}
