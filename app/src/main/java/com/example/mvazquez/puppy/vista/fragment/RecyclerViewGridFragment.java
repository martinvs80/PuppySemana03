package com.example.mvazquez.puppy.vista.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mvazquez.puppy.R;
import com.example.mvazquez.puppy.MascotaPerfilAdaptador;
import com.example.mvazquez.puppy.pojo.Mascota;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.ArrayList;

/**
 * Created by MVazquez on 06/11/2016.
 */
public class RecyclerViewGridFragment extends Fragment {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recyclerviewgrid,container,false);

        CircularImageView circularImageView = (CircularImageView) v.findViewById(R.id.civFotoPerfil);
        // Set Border
        circularImageView.setBorderColor(getResources().getColor(R.color.GrayLight));
        circularImageView.setBorderWidth(10);
        // Add Shadow with default param
        circularImageView.addShadow();
        // or with custom param
        circularImageView.setShadowRadius(15);
        circularImageView.setShadowColor(Color.RED);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvPerfil);

        GridLayoutManager glm = new GridLayoutManager(getActivity(),3);

        listaMascotas.setLayoutManager(glm);
        inicializarListaMascotas();
        inicializaAdaptador();

        return v;
    }
    public void inicializaAdaptador(){
        MascotaPerfilAdaptador adaptador = new MascotaPerfilAdaptador(mascotas,getActivity());
        listaMascotas.setAdapter(adaptador);
    }
    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.mascota02, "3",R.mipmap.huesoama));
        mascotas.add(new Mascota(R.drawable.mascota01, "7",R.mipmap.huesoama));
        mascotas.add(new Mascota(R.drawable.mascota03, "9",R.mipmap.huesoama));
        mascotas.add(new Mascota(R.drawable.mascota04, "0",R.mipmap.huesoama));
        mascotas.add(new Mascota(R.drawable.mascota05, "6",R.mipmap.huesoama));
        mascotas.add(new Mascota(R.drawable.mascota06, "12",R.mipmap.huesoama));
        mascotas.add(new Mascota(R.drawable.mascota07, "5",R.mipmap.huesoama));


    }
}
