package com.example.grossifyapp.adpter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grossifyapp.model.DiscountedProducts;

import java.util.List;

public class DiscountedProductAdapter extends RecyclerView.Adapter<DiscountedProductAdapter.DiscountedProductViewHolder>{

    Context context;

    List<DiscountedProducts> discountedProductsList;

    @NonNull
    @Override
    public DiscountedProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull DiscountedProductViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return discountedProductsList.size();
    }

    public static class DiscountedProductViewHolder extends RecyclerView.ViewHolder{

        public DiscountedProductViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }


}
