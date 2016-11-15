package com.example.mvazquez.puppy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.mvazquez.puppy.adapter.MascotaAdaptador;
import com.example.mvazquez.puppy.pojo.Mascota;

import java.util.ArrayList;

public class TopFive extends AppCompatActivity {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_five);


        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBarTop);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotasTop);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializaAdaptador();

    }
    public void inicializaAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas,this);
        listaMascotas.setAdapter(adaptador);
    }
    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.mascota02, R.mipmap.huesobco, "Maya", "5",R.mipmap.huesoama));
        mascotas.add(new Mascota(R.drawable.mascota01, R.mipmap.huesobco, "Legolas", "3",R.mipmap.huesoama));
        mascotas.add(new Mascota(R.drawable.mascota03, R.mipmap.huesobco, "Goliat", "0",R.mipmap.huesoama));
        mascotas.add(new Mascota(R.drawable.mascota05, R.mipmap.huesobco, "Reina", "0",R.mipmap.huesoama));
        mascotas.add(new Mascota(R.drawable.mascota07, R.mipmap.huesobco, "Sabueso", "0",R.mipmap.huesoama));


    }

}
