package com.example.museo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class daoContacto {
    SQLiteDatabase cx:
    ArrayList<Contacto> lista;
    Contacto c;
    Context ct;
    String nombreBD="BDContactos";
    String table = "create table if not exists contacto(id int primary key autoincrement, nombre text, )";
    
    public daoContacto(Context c){
        this.ct=c;

    }
}
