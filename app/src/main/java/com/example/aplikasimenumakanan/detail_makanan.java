package com.example.aplikasimenumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detail_makanan extends AppCompatActivity {

    TextView namaMakanan, deskripsiMakanan, hargaMakanan;
    ImageView fotoMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_makanan);

        namaMakanan = findViewById(R.id.nama);
        deskripsiMakanan = findViewById(R.id.deskripsi);
        hargaMakanan = findViewById(R.id.harga);
        fotoMakanan = findViewById(R.id.foto);

        String nama = "";
        String deskripsi = "";
        String harga = "";
        int foto = 0;

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            nama = extras.getString("nama");
            deskripsi = extras.getString("deskripsi");
            harga = extras.getString("harga");
            foto = extras.getInt("foto");
        }

        namaMakanan.setText(nama);
        deskripsiMakanan.setText(deskripsi);
        hargaMakanan.setText(harga);
        fotoMakanan.setImageResource(foto);
    }
}