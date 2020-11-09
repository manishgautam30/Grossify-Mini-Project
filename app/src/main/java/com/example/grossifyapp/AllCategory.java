package com.example.grossifyapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grossifyapp.adpter.AllCategoryAdapter;
import com.example.grossifyapp.model.AllCategoryModal;

import java.util.ArrayList;
import java.util.List;

public class AllCategory extends AppCompatActivity {

    RecyclerView AllCategoryRecycler;
    AllCategoryAdapter allCategoryAdapter;
    List<AllCategoryModal> allCategoryModalList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_category);

        AllCategoryRecycler = findViewById(R.id.allCategory);

        //adding data to model
        allCategoryModalList =new ArrayList<>();
        allCategoryModalList.add(new AllCategoryModal(1, R.drawable.ic_baseline_fiber_manual_record_24));
        allCategoryModalList.add(new AllCategoryModal(2,R.drawable.ic_baseline_fiber_manual_record_24));
        allCategoryModalList.add(new AllCategoryModal(3,R.drawable.ic_baseline_fiber_manual_record_24));
        allCategoryModalList.add(new AllCategoryModal(4,R.drawable.ic_baseline_fiber_manual_record_24));
        allCategoryModalList.add(new AllCategoryModal(5,R.drawable.ic_baseline_fiber_manual_record_24));
        allCategoryModalList.add(new AllCategoryModal(6,R.drawable.ic_baseline_fiber_manual_record_24));
        allCategoryModalList.add(new AllCategoryModal(7,R.drawable.ic_baseline_fiber_manual_record_24));


        AllCategoryRecycler(allCategoryModalList);

    }



    private void setCategoryRecycler(List<AllCategoryModal> allcategoryModalList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        AllCategoryRecycler.setLayoutManager(layoutManager);
        allCategoryAdapter=new AllCategoryAdapter(this,allcategoryModalList);
        AllCategoryRecycler.setAdapter(allCategoryAdapter);
    }
}