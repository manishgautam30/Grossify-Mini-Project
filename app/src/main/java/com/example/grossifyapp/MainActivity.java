package com.example.grossifyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.grossifyapp.adpter.CategoryAdapter;
import com.example.grossifyapp.adpter.DiscountedProductAdapter;
import com.example.grossifyapp.model.Category;
import com.example.grossifyapp.model.DiscountedProducts;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView discountRecyclerView,categoryRecyclerView;
    DiscountedProductAdapter discountedProductAdapter;
    List<DiscountedProducts> discountedProductsList;

    CategoryAdapter categoryAdapter;
    List<Category> categoryList;

    ImageView allCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        discountRecyclerView = findViewById(R.id.discountedRecycler);
        categoryRecyclerView = findViewById(R.id.categoryRecycler);
        allCategory = findViewById(R.id.allCategoryImage);

        allCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,AllCategory.class);
                startActivity(i);
            }
        });

        //adding data to model
        discountedProductsList=new ArrayList<>();
        discountedProductsList.add(new DiscountedProducts(1,R.drawable.dis));
        discountedProductsList.add(new DiscountedProducts(2, R.drawable.dis));
        discountedProductsList.add(new DiscountedProducts(3,R.drawable.dis));
        discountedProductsList.add(new DiscountedProducts(4,R.drawable.dis));
        discountedProductsList.add(new DiscountedProducts(5, R.drawable.dis));
        discountedProductsList.add(new DiscountedProducts(6,R.drawable.dis));

        //adding data to model
        categoryList=new ArrayList<>();
        categoryList.add(new Category(1,R.drawable.ic_baseline_fiber_manual_record_24));
        categoryList.add(new Category(2,R.drawable.ic_baseline_fiber_manual_record_24));
        categoryList.add(new Category(3,R.drawable.ic_baseline_fiber_manual_record_24));
        categoryList.add(new Category(4,R.drawable.ic_baseline_fiber_manual_record_24));
        categoryList.add(new Category(5,R.drawable.ic_baseline_fiber_manual_record_24));
        categoryList.add(new Category(6,R.drawable.ic_baseline_fiber_manual_record_24));
        categoryList.add(new Category(7,R.drawable.ic_baseline_fiber_manual_record_24));


        setDiscountedRecycler(discountedProductsList);
        setCategoryRecycler(categoryList);
    }


    private void setDiscountedRecycler(List<DiscountedProducts> dataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        discountRecyclerView.setLayoutManager(layoutManager);
        discountedProductAdapter=new DiscountedProductAdapter(this,dataList);
        discountRecyclerView.setAdapter(discountedProductAdapter);
    }


    private void setCategoryRecycler(List<Category> CategoryDataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        categoryRecyclerView.setLayoutManager(layoutManager);
        categoryAdapter=new CategoryAdapter(this,CategoryDataList);
        categoryRecyclerView.setAdapter(categoryAdapter);
    }
}