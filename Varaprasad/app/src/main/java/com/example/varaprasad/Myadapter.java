package com.example.varaprasad;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Myadapter extends RecyclerView.Adapter<Myadapter.HoldView> {
    @NonNull
    @Override
    public Myadapter.HoldView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull Myadapter.HoldView holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class HoldView extends RecyclerView.ViewHolder {
        public HoldView(@NonNull View itemView) {
            super(itemView);
        }
    }
}
