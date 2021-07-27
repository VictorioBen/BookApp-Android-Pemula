package com.workspace.recyclerviewsubmit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.workspace.recyclerviewsubmit.resources.Buku;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    TextView judul, subJudul, stock, harga, penulis, penerbit, jmlUlas, ulasan, rating, tentang, namaUlas, halaman;
    ImageView fotoBuku;
    public static final String EXTRA_JuduL = "EXTRA_Judul";
    public static final String EXTRA_subJudul = "EXTRA_subJudul";
    public static final String EXTRA_Stock = "EXTRA_Stock";
    public static final String EXTRA_Harga = "EXTRA_Harga";
    public static final String EXTRA_Penulis = "EXTRA_Penulis";
    public static final String EXTRA_Penerbit = "EXTRA_Penerbit";
    public static final String EXTRA_jmlUlas = "EXTRA_jmlUlas";
    public static final String EXTRA_Ulasan = "EXTRA_Ulasan";
    public static final String EXTRA_Rating = "EXTRA_Rating";
    public static final String EXTRA_Tentang = "EXTRA_Tentang";
    public static final String EXTRA_NamaUlas = "EXTRA_NamaUlas";
    public static final String EXTRA_Halaman = "EXTRA_Halaman";
    public static final int EXTRA_FOTO = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //menggant titlee
        String title = "Detail Buku";
        setActionBar(title);


        //membuat button back di action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //memanggil xml
        judul = findViewById(R.id.judulBuku);
        subJudul = findViewById(R.id.desc_buku);
        stock = findViewById(R.id.stock);
        harga = findViewById(R.id.harga);
        penulis = findViewById(R.id.penulis);
        penerbit = findViewById(R.id.penerbit);
        jmlUlas = findViewById(R.id.jumlah_review);
        ulasan = findViewById(R.id.ulasan);
        rating = findViewById(R.id.nilai_rating);
        tentang = findViewById(R.id.tentang);
        namaUlas = findViewById(R.id.namaUlas);
        halaman = findViewById(R.id.halaman);
        fotoBuku = findViewById(R.id.foto_buku);

        //memasukan data intent
        int Foto = getIntent().getIntExtra("fotoBuku",EXTRA_FOTO);
        String judulBuku =getIntent().getStringExtra(EXTRA_JuduL);
        String SubJudul = getIntent().getStringExtra(EXTRA_subJudul);
        String Stock = getIntent().getStringExtra(EXTRA_Stock);
        String Harga = getIntent().getStringExtra(EXTRA_Harga);
        String Penulis = getIntent().getStringExtra(EXTRA_Penulis);
        String Penerbit = getIntent().getStringExtra(EXTRA_Penerbit);
        String JmlUlas = getIntent().getStringExtra(EXTRA_jmlUlas);
        String Ulasan = getIntent().getStringExtra(EXTRA_Ulasan);
        String Rating = getIntent().getStringExtra(EXTRA_Rating);
        String Tentang = getIntent().getStringExtra(EXTRA_Tentang);
        String NamaUlas = getIntent().getStringExtra(EXTRA_NamaUlas);
        String Halaman = getIntent().getStringExtra(EXTRA_Halaman);



        //memasukan data ke xml
        judul.setText(judulBuku);
        subJudul.setText(SubJudul);
        stock.setText(Stock);
        harga.setText("Rp. "+Harga);
        penulis.setText(Penulis);
        penerbit.setText(Penerbit);
        jmlUlas.setText(JmlUlas);
        ulasan.setText(Ulasan);
        rating.setText(Rating);
        tentang.setText(Tentang);
        namaUlas.setText(NamaUlas);
        halaman.setText(Halaman);

        Glide.with(DetailActivity.this).load(Foto).into(fotoBuku);



    }
    //mengganti title actionbar
    private void setActionBar(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}
