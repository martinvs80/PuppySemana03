package com.example.mvazquez.puppy.db;

/**
 * Created by MVazquez on 14/11/2016.
 */
public class ConstantesBaseDatos {
    public static final String DATABASE_NAME = "mascotas";
    public static final int DATABASE_VERSION = 1;

    public static final String TABLE_MASCOTAS        = "mascota";
    public static final String TABLE_MASCOTAS_ID     = "id";
    public static final String TABLE_MASCOTAS_NOMBRE = "nombre";
    public static final String TABLE_MASCOTAS_FOTO   = "foto";

    public static final String TABLE_LIKES_MASCOTA              = "likes_mascota";
    public static final String TABLE_LIKES_MASCOTA_ID           = "id";
    public static final String TABLE_LIKES_MASCOTA_ID_MASCOTA   = "id_mascota";
    public static final String TABLE_LIKES_MASCOTA_LIKE         = "like";

}
