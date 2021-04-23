package com.example.trell.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.trell.ActivityCreatorCourses;
import com.example.trell.Adapters.ProfileTabAdapter;
import com.example.trell.R;
import com.google.android.material.tabs.TabLayout;

public class CreatorsProfileActivity extends AppCompatActivity {
    ProfileTabAdapter tabAdapter;
    TabLayout myCourseTabs;
    ViewPager2 coursePager;
    LinearLayout line1;
    Button vote, getPremium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creators_profile);
        coursePager = findViewById(R.id.coursePager);
        myCourseTabs = findViewById(R.id.myCourseTabs);
        vote = findViewById(R.id.button);
        getPremium = findViewById(R.id.button2);

        getPremium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CreatorsProfileActivity.this, ActivityCreatorCourses.class));
            }
        });

        FragmentManager fragmentManager = getSupportFragmentManager();
        tabAdapter = new ProfileTabAdapter(fragmentManager, getLifecycle());
        coursePager.setAdapter(tabAdapter);

        myCourseTabs.addTab(myCourseTabs.newTab().setText("All Trails"));
        myCourseTabs.addTab(myCourseTabs.newTab().setText("Trell Learning"));
        myCourseTabs.addTab(myCourseTabs.newTab().setText("BTS"));

        myCourseTabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                coursePager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        coursePager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                myCourseTabs.selectTab(myCourseTabs.getTabAt(position));
            }
        });

    }
}