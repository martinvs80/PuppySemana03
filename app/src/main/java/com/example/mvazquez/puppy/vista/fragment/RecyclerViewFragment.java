package com.example.mvazquez.puppy.vista.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mvazquez.puppy.R;
import com.example.mvazquez.puppy.adapter.MascotaAdaptador;
import com.example.mvazquez.puppy.pojo.Mascota;
import com.example.mvazquez.puppy.presentador.IRecyclerViewFragmentPresenter;
import com.example.mvazquez.puppy.presentador.RecyclerViewFragmentPresenter;

import java.util.ArrayList;

/**
 * Created by MVazquez on 06/11/2016.
 */
public class RecyclerViewFragment extends Fragment implements IRecyclerViewFragmentView {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    private IRecyclerViewFragmentPresenter presenter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recyclerview,container,false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);
        presenter = new RecyclerViewFragmentPresenter(this,getContext());
        return v;
    }

    /*public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.mascota02, R.mipmap.huesobco, "Maya", "0",R.mipmap.huesoama));
        mascotas.add(new Mascota(R.drawable.mascota01, R.mipmap.huesobco, "Legolas", "0",R.mipmap.huesoama));
        mascotas.add(new Mascota(R.drawable.mascota03, R.mipmap.huesobco, "Goliat", "0",R.mipmap.huesoama));
        mascotas.add(new Mascota(R.drawable.mascota04, R.mipmap.huesobco, "Lea", "0",R.mipmap.huesoama));
        mascotas.add(new Mascota(R.drawable.mascota05, R.mipmap.huesobco, "Reina", "0",R.mipmap.huesoama));
        mascotas.add(new Mascota(R.drawable.mascota06, R.mipmap.huesobco, "Firulais", "0",R.mipmap.huesoama));
        mascotas.add(new Mascota(R.drawable.mascota07, R.mipmap.huesobco, "Sabueso", "0",R.mipmap.huesoama));


    }*/

    @Override
    public void generarLinearLayoutVertical() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
    }

    @Override
    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas) {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas,getActivity());
        return adaptador;
    }

    @Override
    public void inicializarAdaptadorRV(MascotaAdaptador adaptador) {
        listaMascotas.setAdapter(adaptador);
    }
}
