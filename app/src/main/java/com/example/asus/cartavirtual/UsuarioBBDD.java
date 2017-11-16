package com.example.asus.cartavirtual;

import java.util.ArrayList;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class UsuarioBBDD {

    private static final int VERSION = 1;
    private static final String NOMBRE_BBDD = "cliente.db";

    private static final String TABLA_CLIENTES = "tabla_clientes";
    private static final String COL_ID = "ID";
    private static final int NUM_COL_ID = 0;
    private static final String COL_NOMBRE = "NAME";
    private static final int NUM_COL_NOMBRE = 1;
    private static final String COL_APELLIDO = "APELLIDO";
    private static final int NUM_COL_APELLIDO = 2;
    private static final String COL_CORREO = "CORREO";
    private static final int NUM_COL_CORREO = 3;
    private static final String COL_CONTRASENA = "CONTRASENA";
    private static final int NUM_COL_CONTRASENA = 4;

    private SQLiteDatabase bdd;

    private UsuarioSQLiteHelper clients;

    public UsuarioBBDD(Context context){
        clients = new UsuarioSQLiteHelper(context, NOMBRE_BBDD, null,VERSION);
    }

    public void openForWrite(){
        bdd = clients.getWritableDatabase();
    }

    public void openForRead(){
        bdd = clients.getReadableDatabase();
    }

    public void close(){
        bdd.close();
    }

    public SQLiteDatabase getBdd(){
        return bdd;
    }

    public long insertClient(Cliente cliente){
        ContentValues content = new ContentValues();
        content.put(COL_NOMBRE, cliente.getNombre());
        content.put(COL_APELLIDO, cliente.getApellido());
        content.put(COL_CORREO, cliente.getCorreo());
        content.put(COL_CONTRASENA, cliente.getContrasena());
        return bdd.insert(TABLA_CLIENTES, null,content);
    }

    public int updateClient(int id, Cliente cliente) {
        ContentValues content = new ContentValues();
        content.put(COL_NOMBRE, cliente.getNombre());
        content.put(COL_APELLIDO, cliente.getApellido());
        content.put(COL_CORREO, cliente.getCorreo());
        content.put(COL_CONTRASENA, cliente.getContrasena());
        return bdd.update(TABLA_CLIENTES, content, COL_ID + " = " + id, null);
    }

    public int removeClient(String name) {
        return bdd.delete(TABLA_CLIENTES, COL_NOMBRE + " = " + getClientes().getNombre(), null);
    }

    public Cliente getClientes() {
        Cursor c = bdd.query(TABLA_CLIENTES, new String[] { COL_ID, COL_NOMBRE,
                        COL_CORREO }, COL_NOMBRE + " LIKE \"" + getClientes().getNombre() + "\"", null, null,
                null, COL_NOMBRE);
        return cursorToClientes(c);
    }

    public Cliente cursorToClientes(Cursor c) {
        if (c.getCount() == 0) {
            c.close();
            return null;
        }
        Cliente client = new Cliente();
        client.setId(c.getInt(NUM_COL_ID));
        client.setNombre(c.getString(NUM_COL_NOMBRE));
        client.setApellido(c.getString(NUM_COL_APELLIDO));
        client.setCorreo(c.getString(NUM_COL_CORREO));
        client.setContrasena(c.getString(NUM_COL_CONTRASENA));
        c.close();
        return client;
    }

    public ArrayList<Cliente> getAllClientes() {
        Cursor c = bdd.query(TABLA_CLIENTES, new String[] { COL_ID, COL_NOMBRE,
                COL_APELLIDO, COL_CORREO, COL_CONTRASENA }, null, null, null, null, null, COL_NOMBRE);
        if (c.getCount() == 0) {
            c.close();
            return null;
        }
        ArrayList<Cliente> clientList = new ArrayList<Cliente> ();
        while (c.moveToNext()) {
            Cliente client = new Cliente();
            client.setId(c.getInt(NUM_COL_ID));
            client.setNombre(c.getString(NUM_COL_NOMBRE));
            client.setApellido(c.getString(NUM_COL_APELLIDO));
            client.setCorreo(c.getString(NUM_COL_CORREO));
            client.setContrasena(c.getString(NUM_COL_CONTRASENA));
            clientList.add(client);
        }
        c.close();
        return clientList;
    }
}

