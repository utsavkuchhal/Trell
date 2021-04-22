package com.example.trell;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ActivityCreatorCourses extends AppCompatActivity {

    @BindView(R.id.myCourseTabs)
    TabLayout myCourseTabs;

    @BindView(R.id.coursePager)
    ViewPager coursePager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creator_courses);
        ButterKnife.bind(this);

    }
}