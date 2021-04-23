package com.example.trell.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.trell.Adapters.CategoryAdapter;
import com.example.trell.R;
import com.example.trell.model.Categories;

import java.util.ArrayList;

public class CategoryActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager layoutManager;
    public static ArrayList<Categories> categories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        recyclerView = findViewById(R.id.winningsRv);
        recyclerView.setHasFixedSize(true);

        layoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);

        categories = new ArrayList<Categories>();
        categories.add(new Categories("Learn To Grow"));
        categories.add(new Categories("Beautify Me"));
        categories.add(new Categories("Foodilicious"));
        categories.add(new Categories("Cine Masia"));
        categories.add(new Categories("Travel Junkies"));
        categories.add(new Categories("Fun Alley"));
        categories.add(new Categories("Sports Corner"));
        categories.add(new Categories("Art Zone"));
        categories.add(new Categories("Trell Learning"));

        myAdapter = new CategoryAdapter(this, categories);

        recyclerView.setAdapter(myAdapter);

        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CategoryActivity.this,HomeActivity.class));
            }
        });
    }
}