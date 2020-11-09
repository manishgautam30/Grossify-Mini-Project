package com.example.grossifyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.grossifyapp.adpter.CategoryAdapter;
import com.example.grossifyapp.adpter.DiscountedProductAdapter;
import com.example.grossifyapp.adpter.RecentlyViewedAdapter;
import com.example.grossifyapp.model.Category;
import com.example.grossifyapp.model.DiscountedProducts;
import com.example.grossifyapp.model.RecentlyViewed;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView discountRecyclerView,categoryRecyclerView, recentlyViewedRecycler;
    DiscountedProductAdapter discountedProductAdapter;
    List<DiscountedProducts> discountedProductsList;

    CategoryAdapter categoryAdapter;
    List<Category> categoryList;

    RecentlyViewedAdapter recentlyViewedAdapter;
    List<RecentlyViewed> recentlyViewedList;

    ImageView allCategory;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        discountRecyclerView = findViewById(R.id.discountedRecycler);
        categoryRecyclerView = findViewById(R.id.categoryRecycler);
        allCategory = findViewById(R.id.allCategoryImage);
        recentlyViewedRecycler = findViewById(R.id.recently_item);


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


        // adding data to model
        recentlyViewedList = new ArrayList<>();
        recentlyViewedList.add(new RecentlyViewed("Watermelon", "Watermelon has high water content and also provides some fiber.", "₹ 80", "1", "KG", card4, b4));
        recentlyViewedList.add(new RecentlyViewed("Papaya", "Papayas are spherical or pear-shaped fruits that can be as long as 20 inches.", "₹ 85", "1", "KG", card3, b3));
        recentlyViewedList.add(new RecentlyViewed("Strawberry", "The strawberry is a highly nutritious fruit, loaded with vitamin C.", "₹ 30", "1", "KG", card2, b1));
        recentlyViewedList.add(new RecentlyViewed("Kiwi", "Full of nutrients like vitamin C, vitamin K, vitamin E, folate, and potassium.", "₹ 30", "1", "PC", card1, b2));



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


    // a new adapter class for the recently viewed section
    private void setRecentlyViewedRecycler(List<RecentlyViewed> recentlyViewedDataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recentlyViewedRecycler.setLayoutManager(layoutManager);
        recentlyViewedAdapter = new RecentlyViewedAdapter(this,recentlyViewedDataList);
        recentlyViewedRecycler.setAdapter(recentlyViewedAdapter);
    }
}