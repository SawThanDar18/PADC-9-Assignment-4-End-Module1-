package com.padcmyanmar.padc9.end_module1_assignment.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.padc9.end_module1_assignment.R;
import com.padcmyanmar.padc9.end_module1_assignment.views.holders.RecyclerItemViewHolder;

public class RecyclerItemViewAdapter extends RecyclerView.Adapter {

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_itemview, viewGroup, false);
        return new RecyclerItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
