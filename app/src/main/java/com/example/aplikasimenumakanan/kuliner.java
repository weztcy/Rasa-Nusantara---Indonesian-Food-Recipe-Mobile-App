package com.example.aplikasimenumakanan;

class Kuliner{

    private String nama, deskripsi, harga;
    private int id_foto;

    public Kuliner(String nama, String deskripsi, String harga, int id_gambar) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.id_foto = id_gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public int getId_foto() {
        return id_foto;
    }

    public void setId_foto(int id_foto) {
        this.id_foto = id_foto;
    }
}
