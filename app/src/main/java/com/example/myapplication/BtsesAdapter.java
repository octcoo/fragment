package com.example.myapplication;

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

import java.util.ArrayList;

public class BtsesAdapter extends RecyclerView.Adapter<BtsesAdapter.ViewHolder> {
    private ArrayList<BtsesModel> listBts = new ArrayList<>();
    private Context context;

//    public BtsesAdapter(ArrayList<BtsesModel> listBts, Context context) {
//        this.listBts = listBts;
//        this.context = context;
//    }

    public BtsesAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<BtsesModel> getListBts() {
        return listBts;
    }

    public void setListBts(ArrayList<BtsesModel> listBts) {
        this.listBts = listBts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bts, parent, false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        //Glide.with(context).load(getListBts().get(position).getBtsImage()).into(holder.ivBts);
        holder.ivBts.setImageResource(getListBts().get(position).getBtsImg());
        holder.tvTitle.setText(getListBts().get(position).getBtsName());
        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String btsName = "Nama BTS " + getListBts().get(position).getBtsName();
                intent.putExtra(Intent.EXTRA_TEXT, btsName);
                context.startActivity(Intent.createChooser(intent, "Kirim"));
            }
        });
        holder.btnPreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PreviewBts.class);
                intent.putExtra("img_url", getListBts().get(position).getBtsImg());
                intent.putExtra("title", getListBts().get(position).getBtsName());
                intent.putExtra("detail", getListBts().get(position).getBtsDetail());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return getListBts().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivBts;
        TextView tvTitle;
        Button btnShare, btnPreview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivBts = itemView.findViewById(R.id.iv_bts);
            tvTitle = itemView.findViewById(R.id.tv_name);
            btnShare = itemView.findViewById(R.id.btn_share);
            btnPreview = itemView.findViewById(R.id.btn_lihat);
        }
    }
}