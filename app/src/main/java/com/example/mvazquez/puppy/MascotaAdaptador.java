package com.example.mvazquez.puppy;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by MVazquez on 30/10/2016.
 */
public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>{
    ArrayList<Mascota> mascotas;
    Activity activity;
    public  MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity  = activity;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent,false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int position) {
        final Mascota mascota = mascotas.get(position);
        mascotaViewHolder.imgFoto.setImageResource(mascota.getFotoMascota());
        mascotaViewHolder.tvNombreMascota.setText(mascota.getNombreMascota());
        mascotaViewHolder.tvLikes.setText(mascota.getCuentaLikes());

        mascotaViewHolder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String contador;
                int suma;
                Toast.makeText(activity ,"Diste like a: " + mascota.getNombreMascota(),Toast.LENGTH_SHORT).show();
                contador = mascota.getCuentaLikes();
                suma = Integer.parseInt(contador);
                suma = suma + 1;
                mascota.setCuentaLikes(String.valueOf(suma));
            }
        });
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFoto;
        private ImageButton btnLike;
        private TextView tvNombreMascota;
        private TextView tvLikes;
        private ImageView imgLike;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgFoto         = (ImageView) itemView.findViewById(R.id.imgFoto);
            btnLike         = (ImageButton) itemView.findViewById(R.id.btnLike);
            tvNombreMascota = (TextView) itemView.findViewById(R.id.tvNombreMascota);
            tvLikes         = (TextView) itemView.findViewById(R.id.tvLikes);
            imgLike         = (ImageView) itemView.findViewById(R.id.imgLike);

        }
    }
}
