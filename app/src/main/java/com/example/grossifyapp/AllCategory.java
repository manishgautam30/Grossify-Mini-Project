package com.example.grossifyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.grossifyapp.adpter.AllCategoryAdapter;
import com.example.grossifyapp.model.AllCategoryModal;

import java.util.List;

public class AllCategory extends AppCompatActivity {

    RecyclerView allCategoryRecycler;
    AllCategoryAdapter allCategoryAdapter;
    List<AllCategoryModal> categoryModalList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_category);
    }
}