package com.example.asus.cartavirtual;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class BaseDeDatosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_de_datos);

        ListView list = (ListView) findViewById(R.id.clientList);

        Cliente cliente1 = new Cliente("Andres", "martinez","andresm@apres.com","12345");
        Cliente cliente2 = new Cliente("Maria","jaramillo", "mariaj@apres.com", "perro");
        Cliente cliente3 = new Cliente("Daniel", "garcia", "danielg@apres.com", "1garcia");
        Cliente cliente4 = new Cliente("Yenifer", "barco", "yenifer@apres.com", "01234");
        Cliente cliente5 = new Cliente("Julian", "sucerquia", "julianq@apres.com", "password");

        UsuarioBBDD clienteBbdd = new UsuarioBBDD(this);
        clienteBbdd.openForWrite();
        clienteBbdd.insertClient(cliente1);
        clienteBbdd.insertClient(cliente2);
        clienteBbdd.insertClient(cliente3);
        clienteBbdd.insertClient(cliente4);
        clienteBbdd.insertClient(cliente5);

        ArrayList<Cliente> clientList = clienteBbdd.getAllClientes();
        clienteBbdd.close();
        ArrayAdapter<Cliente> adapter = new ArrayAdapter<Cliente>(this, android.R.layout.simple_list_item_1,clientList);
        list.setAdapter(adapter);
    }
}
