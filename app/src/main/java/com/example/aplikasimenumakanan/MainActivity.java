package com.example.aplikasimenumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView menu;
    private ArrayList<Kuliner> listKuliner;
    private kuliner_adapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu = findViewById(R.id.menu);
        initData();

        setOnClickListener();
        menu.setAdapter(new kuliner_adapter(listKuliner, listener));
        menu.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setOnClickListener() {
        listener = new kuliner_adapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(), detail_makanan.class);
                intent.putExtra("nama", listKuliner.get(position).getNama());
                intent.putExtra("deskripsi", listKuliner.get(position).getDeskripsi());
                intent.putExtra("harga", listKuliner.get(position).getHarga());
                intent.putExtra("foto", listKuliner.get(position).getId_foto());
                startActivity(intent);
            }
        };
    }

    private void initData(){
        this.listKuliner = new ArrayList<>();
        listKuliner.add(new com.example.aplikasimenumakanan.Kuliner("Lunpia", "Makanan khas Jawa Tengah", "Rp. 40.000", R.drawable.lunpia));
        listKuliner.add(new com.example.aplikasimenumakanan.Kuliner("Rujak Cingur", "Makanan khas Jawa Timur", "Rp. 15.000", R.drawable.rujak_cingur));
        listKuliner.add(new com.example.aplikasimenumakanan.Kuliner("Karedok", "Makanan khas Jawa Barat", "Rp. 10.000", R.drawable.karedok));
        listKuliner.add(new com.example.aplikasimenumakanan.Kuliner("Gudeg", "Makanan khas Yogyakarta", "Rp. 50.000", R.drawable.gudeg));
        listKuliner.add(new com.example.aplikasimenumakanan.Kuliner("Kerak Telor", "Makanan khas DKI Jakarta", "Rp. 20.000", R.drawable.kerak_telor));
        listKuliner.add(new com.example.aplikasimenumakanan.Kuliner("Sate Bandeng", "Makanan khas Banten", "Rp. 30.000", R.drawable.sate_bandeng));
    }
}