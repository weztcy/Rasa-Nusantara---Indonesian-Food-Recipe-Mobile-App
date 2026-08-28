package com.example.aplikasimenumakanan;

import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class kuliner_adapter extends RecyclerView.Adapter<kuliner_adapter.ViewHolder> {

    private ArrayList<com.example.aplikasimenumakanan.Kuliner> listKuliner;
    private RecyclerViewClickListener listener;

    public kuliner_adapter(ArrayList<com.example.aplikasimenumakanan.Kuliner> listKuliner, RecyclerViewClickListener listener) {
        this.listKuliner = listKuliner;
        this.listener = listener;
    }

    @NonNull
    @Override
    public kuliner_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder holder = new ViewHolder(inflater.inflate(R.layout.item_makanan,parent,false));

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull kuliner_adapter.ViewHolder holder, int position) {
        com.example.aplikasimenumakanan.Kuliner kuliner = listKuliner.get(position);
        holder.nama.setText(kuliner.getNama());
        holder.deskripsi.setText(kuliner.getDeskripsi());
        holder.harga.setText(kuliner.getHarga());
        holder.foto.setImageResource(kuliner.getId_foto());
    }

    @Override
    public int getItemCount() {
        return listKuliner.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView nama, deskripsi, harga;
        public ImageView foto;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nama = (TextView) itemView.findViewById(R.id.nama);
            deskripsi = (TextView) itemView.findViewById(R.id.deskripsi);
            harga = (TextView) itemView.findViewById(R.id.harga);
            foto = (ImageView) itemView.findViewById(R.id.foto);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listener.onClick(view, getAdapterPosition());
        }
    }

    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }
}
