package com.example.mvazquez.puppy.pojo;

/**
 * Created by MVazquez on 30/10/2016.
 */
public class Mascota {
    private int id_mascota;
    private int fotoMascota;
    private int huesoBlanco;
    private String nombreMascota;
    private String cuentaLikes;
    private int huesoAmarillo;

    public Mascota(int fotoMascota, int huesoBlanco, String nombreMascota, String cuentaLikes, int huesoAmarillo) {
        this.fotoMascota = fotoMascota;
        this.huesoBlanco = huesoBlanco;
        this.nombreMascota = nombreMascota;
        this.cuentaLikes = cuentaLikes;
        this.huesoAmarillo = huesoAmarillo;
    }
    public Mascota(int fotoMascota, String cuentaLikes, int huesoAmarillo) {
        this.fotoMascota = fotoMascota;
        this.cuentaLikes = cuentaLikes;
        this.huesoAmarillo = huesoAmarillo;
    }

    public Mascota() {

    }

    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public int getFotoMascota() {
        return fotoMascota;
    }

    public void setFotoMascota(int fotoMascota) {
        this.fotoMascota = fotoMascota;
    }

    public int getHuesoBlanco() {
        return huesoBlanco;
    }

    public void setHuesoBlanco(int huesoBlanco) {
        this.huesoBlanco = huesoBlanco;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getCuentaLikes() {
        return cuentaLikes;
    }

    public void setCuentaLikes(String cuentaLikes) {
        this.cuentaLikes = cuentaLikes;
    }

    public int getHuesoAmarillo() {
        return huesoAmarillo;
    }

    public void setHuesoAmarillo(int huesoAmarillo) {
        this.huesoAmarillo = huesoAmarillo;
    }
}
