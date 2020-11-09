package com.example.grossifyapp.adpter;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grossifyapp.model.RecentlyViewed;

import java.util.List;

public class RecentlyViewedAdapter extends RecyclerView.Adapter<RecentlyViewedAdapter.RecentlyViewedViewHolder> {

    Context context;
    List<RecentlyViewed> recentlyViewedList;

    public RecentlyViewedAdapter(Context context, List<RecentlyViewed> recentlyViewedList) {
        this.context = context;
        this.recentlyViewedList = recentlyViewedList;
    }

    @NonNull
    @Override
    public RecentlyViewedAdapter.RecentlyViewedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecentlyViewedAdapter.RecentlyViewedViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
