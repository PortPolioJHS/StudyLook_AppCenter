package com.c.studyroominfo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.CustomViewHolder> {

    ArrayList<InfoData> arrayList;

    public InfoAdapter(ArrayList<InfoData> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public InfoAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.info_item, null);
        CustomViewHolder holder = new CustomViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull InfoAdapter.CustomViewHolder holder, int position) {
        holder.iv_info_pic.setImageResource(arrayList.get(position).getIv_info_pic());
        holder.tv_info_exp.setText(arrayList.get(position).getTv_info_exp());

        holder.itemView.setTag(position);
    }

    @Override
    public int getItemCount() {
        return (null!=arrayList? arrayList.size():0);
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        ImageView iv_info_pic;
        TextView tv_info_exp;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            this.iv_info_pic = itemView.findViewById(R.id.iv_info_pic);
            this.tv_info_exp = itemView.findViewById(R.id.tv_info_exp);
        }
    }
}
