package com.example.grossifyapp.adpter;

import android.content.Context;
import android.view.View;

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

   public static class RecentlyViewedHolder extends RecyclerView.ViewHolder{
        public RecentlyViewedHolder(@NonNull View itemView){
            super(itemView);
        }
   }

}
