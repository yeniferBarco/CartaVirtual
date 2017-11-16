package com.example.asus.cartavirtual;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class UsuarioSQLiteHelper extends SQLiteOpenHelper{

    private static final String TABLA_CLIENTES = "tabla_clientes";
    private static final String COL_ID = "ID";
    private static final String COL_NOMBRE = "NOMBRE";
    private static final String COL_APELLIDO = "APELLIDO";
    private static final String COL_CORREO = "CORREO";
    private static final String COL_CONTRASENA = "CONTRASENA";

    private static final String CREATE_BDD = "CREATE TABLE " + TABLA_CLIENTES + " (" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_NOMBRE + " TEXT NOT NULL, " +
            COL_APELLIDO + "TEXT NOT NULL" + COL_CORREO + " TEXT NOT NULL" + COL_CONTRASENA + " TEXT NOT NULL);";

    public UsuarioSQLiteHelper(Context context, String name, CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_BDD);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE" + TABLA_CLIENTES);
        onCreate(db);
    }
}
