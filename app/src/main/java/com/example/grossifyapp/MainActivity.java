package com.example.grossifyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.LocusId;
import android.os.Bundle;

import com.example.grossifyapp.adpter.DiscountedProductAdapter;
import com.example.grossifyapp.model.DiscountedProducts;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView discountRecyclerView;
    DiscountedProductAdapter discountedProductAdapter;
    List<DiscountedProducts> discountedProductsList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        discountRecyclerView = findViewById(R.id.discountedRecycler);

        discountedProductsList=new ArrayList<>();
        discountedProductsList.add(new DiscountedProducts(1,R.drawable.dis));
        discountedProductsList.add(new DiscountedProducts(1,R.drawable.dis));
        discountedProductsList.add(new DiscountedProducts(1,R.drawable.dis));

        setDiscountedRecycler();
    }


    private void setDiscountedRecycler(ArrayList<DiscountedProducts> dataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        discountRecyclerView.setLayoutManager(layoutManager);
        discountedProductAdapter = new DiscountedProductAdapter(this,dataList);
        discountRecyclerView.setAdapter(discountedProductAdapter);
    }
}