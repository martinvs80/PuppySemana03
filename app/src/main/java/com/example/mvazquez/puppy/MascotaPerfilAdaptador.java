package com.example.mvazquez.puppy;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mvazquez.puppy.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by MVazquez on 06/11/2016.
 */
public class MascotaPerfilAdaptador extends RecyclerView.Adapter<MascotaPerfilAdaptador.MascotaViewHolder>{
    ArrayList<Mascota> mascotas;
    Activity activity;
    public  MascotaPerfilAdaptador(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity  = activity;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_perfil,parent,false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int position) {
        final Mascota mascota = mascotas.get(position);
        mascotaViewHolder.imgFotoPerfil.setImageResource(mascota.getFotoMascota());
        mascotaViewHolder.tvLikesPerfil.setText(mascota.getCuentaLikes());
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFotoPerfil;
        private TextView tvLikesPerfil;
        private ImageView imgLikePerfil;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgFotoPerfil         = (ImageView) itemView.findViewById(R.id.imgFotoPerfil);
            tvLikesPerfil         = (TextView) itemView.findViewById(R.id.tvLikesPerfil);
            imgLikePerfil         = (ImageView) itemView.findViewById(R.id.imgLikePerfil);

        }
    }
}

