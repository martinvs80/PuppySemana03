package com.example.mvazquez.puppy;

/**
 * Created by MVazquez on 30/10/2016.
 */
public class Mascota {
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
