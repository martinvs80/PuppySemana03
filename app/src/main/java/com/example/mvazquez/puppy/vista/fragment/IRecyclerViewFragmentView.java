package com.example.mvazquez.puppy.vista.fragment;

import com.example.mvazquez.puppy.adapter.MascotaAdaptador;
import com.example.mvazquez.puppy.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by MVazquez on 14/11/2016.
 */
public interface IRecyclerViewFragmentView {

    public void generarLinearLayoutVertical();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas);

    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);
}
