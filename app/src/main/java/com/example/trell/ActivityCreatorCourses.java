package com.example.trell;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.app.Fragment;
import android.os.Bundle;

import com.example.trell.Adapters.TabAdapter;
import com.google.android.material.tabs.TabLayout;

public class ActivityCreatorCourses extends AppCompatActivity {


    TabAdapter tabAdapter;
    TabLayout myCourseTabs;
    ViewPager2 coursePager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creator_courses);
        coursePager = findViewById(R.id.coursePager);
        myCourseTabs = findViewById(R.id.myCourseTabs);
        FragmentManager fragmentManager = getSupportFragmentManager();
        tabAdapter = new TabAdapter(fragmentManager, getLifecycle());
        coursePager.setAdapter(tabAdapter);

        myCourseTabs.addTab(myCourseTabs.newTab().setText("DashBoard"));
        myCourseTabs.addTab(myCourseTabs.newTab().setText("Curriculum"));
        myCourseTabs.addTab(myCourseTabs.newTab().setText("MyLibrary"));

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