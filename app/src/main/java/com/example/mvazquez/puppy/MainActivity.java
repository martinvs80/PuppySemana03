package com.example.mvazquez.puppy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    ImageButton star;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        star = (ImageButton) findViewById(R.id.btnStar);
        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Toast.makeText(getBaseContext(), "Click en estrella" ,Toast.LENGTH_SHORT).show();*/
                Intent intent = new Intent(MainActivity.this, TopFive.class);
                startActivity(intent);
                Toast.makeText(getBaseContext(), "Click en estrella nuevo intent" ,Toast.LENGTH_SHORT).show();
            }
        });

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializaAdaptador();

    }
    public void irSegundaActividad(View v){
        Toast.makeText(this, "Click en metodo" ,Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,TopFive.class);
        startActivity(intent);
    }

    public void inicializaAdaptador(){
       MascotaAdaptador adaptador = new MascotaAdaptador(mascotas,this);
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
