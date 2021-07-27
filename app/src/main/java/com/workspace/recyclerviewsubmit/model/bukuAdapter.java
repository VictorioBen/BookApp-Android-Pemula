package com.workspace.recyclerviewsubmit.model;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.workspace.recyclerviewsubmit.DetailActivity;
import com.workspace.recyclerviewsubmit.MainActivity;
import com.workspace.recyclerviewsubmit.R;
import com.workspace.recyclerviewsubmit.resources.Buku;

import java.util.ArrayList;

public class bukuAdapter extends RecyclerView.Adapter<bukuAdapter.ListViewHolder>  {
    private  ArrayList<Buku> listBuku;
    Context context;
    private Boolean isLike;

    public bukuAdapter(Context c, ArrayList<Buku>list){
        context = c;
        listBuku = list;
    }

    @NonNull
    @Override
    public bukuAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_menu_buku, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final bukuAdapter.ListViewHolder holder, final int position) {
        final Buku buku = listBuku.get(position);
        Glide.with(holder.itemView.getContext()).load(buku.getFotoBuku()).apply(new RequestOptions().override(250, 300)).into(holder.fotoBuku);
        holder.tvJudul.setText(buku.getJudul());
        holder.tvDescBuku.setText(buku.getDescJudul());
        holder.tvHargaBuku.setText("Rp."+buku.getHarga());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Hubungi admin untuk membeli : "+ listBuku.get(holder.getAdapterPosition()).getJudul(), Toast.LENGTH_SHORT).show();

            }
        });


        holder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailBook = new Intent(context, DetailActivity.class);
                detailBook.putExtra(DetailActivity.EXTRA_JuduL, buku.getJudul());
                detailBook.putExtra(DetailActivity.EXTRA_subJudul, buku.getDescJudul());
                detailBook.putExtra(DetailActivity.EXTRA_Stock, buku.getStock());
                detailBook.putExtra(DetailActivity.EXTRA_Harga, buku.getHarga());
                detailBook.putExtra(DetailActivity.EXTRA_Penulis, buku.getPenulis());
                detailBook.putExtra(DetailActivity.EXTRA_Penerbit, buku.getPenerbit());
                detailBook.putExtra(DetailActivity.EXTRA_jmlUlas, buku.getJmlReview());
                detailBook.putExtra(DetailActivity.EXTRA_Ulasan, buku.getUlasan());
                detailBook.putExtra(DetailActivity.EXTRA_Rating, buku.getRating());
                detailBook.putExtra(DetailActivity.EXTRA_Tentang, buku.getTentangBuku());
                detailBook.putExtra(DetailActivity.EXTRA_NamaUlas, buku.getNamaUlas());
                detailBook.putExtra(DetailActivity.EXTRA_Halaman, buku.getHalaman());
                detailBook.putExtra("fotoBuku", buku.getFotoBuku());
                context.startActivity(detailBook);



            }
        });
    }

    @Override
    public int getItemCount() {
        return listBuku.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView fotoBuku;
        TextView tvJudul, tvDescBuku, tvHargaBuku;
        Button btnDetail;




        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            fotoBuku = itemView.findViewById(R.id.foto_buku);
            tvJudul = itemView.findViewById(R.id.judul_buku);
            tvDescBuku = itemView.findViewById(R.id.desc_buku);
            tvHargaBuku = itemView.findViewById(R.id.harga);
            btnDetail = itemView.findViewById(R.id.btn_detail);


        }
    }




}

