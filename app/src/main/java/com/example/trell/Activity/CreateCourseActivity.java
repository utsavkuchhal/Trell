package com.example.trell.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.trell.Adapters.CreatorsTabAdapter;
import com.example.trell.Adapters.TabAdapter;
import com.example.trell.R;
import com.google.android.material.tabs.TabLayout;

public class CreateCourseActivity extends AppCompatActivity {
    CreatorsTabAdapter tabAdapter;
    TabLayout myCourseTabs;
    ViewPager2 coursePager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_course);
        coursePager = findViewById(R.id.coursePager);
        myCourseTabs = findViewById(R.id.myCourseTabs);
        FragmentManager fragmentManager = getSupportFragmentManager();
        tabAdapter = new CreatorsTabAdapter(fragmentManager, getLifecycle());
        coursePager.setAdapter(tabAdapter);

        myCourseTabs.addTab(myCourseTabs.newTab().setText("Add Tutorials"));
        myCourseTabs.addTab(myCourseTabs.newTab().setText("Make Announcements"));
        myCourseTabs.addTab(myCourseTabs.newTab().setText("Go Live"));
        myCourseTabs.addTab(myCourseTabs.newTab().setText("Trell Stats"));

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