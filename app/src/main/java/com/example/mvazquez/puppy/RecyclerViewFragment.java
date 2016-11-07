package com.example.mvazquez.puppy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by MVazquez on 06/11/2016.
 */
public class RecyclerViewFragment extends Fragment {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recyclerview,container,false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializaAdaptador();

        return v;
    }
    public void inicializaAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas,getActivity());
        listaMascotas.setAdapter(adaptador);
    }
    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.mascota02, R.mipmap.huesobco, "Maya", "0",R.mipmap.huesoama));
        mascotas.add(new Mascota(R.drawable.mascota01, R.mipmap.huesobco, "Legolas", "0",R.mipmap.huesoama));
        mascotas.add(new Mascota(R.drawable.mascota03, R.mipmap.huesobco, "Goliat", "0",R.mipmap.huesoama));
        mascotas.add(new Mascota(R.drawable.mascota04, R.mipmap.huesobco, "Lea", "0",R.mipmap.huesoama));
        mascotas.add(new Mascota(R.drawable.mascota05, R.mipmap.huesobco, "Reina", "0",R.mipmap.huesoama));
        mascotas.add(new Mascota(R.drawable.mascota06, R.mipmap.huesobco, "Firulais", "0",R.mipmap.huesoama));
        mascotas.add(new Mascota(R.drawable.mascota07, R.mipmap.huesobco, "Sabueso", "0",R.mipmap.huesoama));


    }
}
