package com.example.mvazquez.puppy.db;

import android.content.ContentValues;
import android.content.Context;

import com.example.mvazquez.puppy.R;
import com.example.mvazquez.puppy.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by MVazquez on 14/11/2016.
 */
public class ConstructorMascotas {
    private static final int LIKE = 1;
    private Context context;

    public ConstructorMascotas(Context context) {
        this.context = context;
    }

    public ArrayList<Mascota> obtenerDatos(){
       /* ArrayList<Mascota> mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.mascota02, R.mipmap.huesobco, "Maya", "0",R.mipmap.huesoama));
        mascotas.add(new Mascota(R.drawable.mascota01, R.mipmap.huesobco, "Legolas", "0",R.mipmap.huesoama));
        mascotas.add(new Mascota(R.drawable.mascota03, R.mipmap.huesobco, "Goliat", "0",R.mipmap.huesoama));
        mascotas.add(new Mascota(R.drawable.mascota04, R.mipmap.huesobco, "Lea", "0",R.mipmap.huesoama));
        mascotas.add(new Mascota(R.drawable.mascota05, R.mipmap.huesobco, "Reina", "0",R.mipmap.huesoama));
        mascotas.add(new Mascota(R.drawable.mascota06, R.mipmap.huesobco, "Firulais", "0",R.mipmap.huesoama));
        mascotas.add(new Mascota(R.drawable.mascota07, R.mipmap.huesobco, "Sabueso", "0",R.mipmap.huesoama));

        return mascotas; */
        BaseDatos db = new BaseDatos(context);
        insertarSieteMascotas(db);
        return db.obtenerTodasLasMascotas();
    }
    public void insertarSieteMascotas(BaseDatos db){
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Maya");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.mascota02);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Legolas");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.mascota01);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Goliat");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.mascota03);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Lea");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.mascota04);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Reina");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.mascota05);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Firulais");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.mascota06);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE,"Sabueso");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.mascota07);
        db.insertarMascota(contentValues);
    }

    public void darLikeMascota(Mascota mascota){
        BaseDatos db = new BaseDatos(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_LIKES_MASCOTA_ID_MASCOTA, mascota.getId_mascota());
        contentValues.put(ConstantesBaseDatos.TABLE_LIKES_MASCOTA_LIKE, LIKE);
        db.insertarLikeMascota(contentValues);

    }
    public int obtenerLikesMascota(Mascota mascota){
        BaseDatos db = new BaseDatos(context);
        return db.obtenerLikesMascota(mascota);
    }
}
