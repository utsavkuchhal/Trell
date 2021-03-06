package com.example.trell.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.trell.Activity.CreateCourseActivity;
import com.example.trell.Adapters.CreatorsTabAdapter;
import com.example.trell.Adapters.ProfileTabAdapter;
import com.example.trell.R;
import com.google.android.material.tabs.TabLayout;


public class PofilePageFragment extends Fragment {

    ProfileTabAdapter tabAdapter;
    TabLayout myCourseTabs;
    ViewPager2 coursePager;
    LinearLayout line1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pofile_page, container, false);
        coursePager = view.findViewById(R.id.coursePager);
        myCourseTabs = view.findViewById(R.id.myCourseTabs);
        line1 = view.findViewById(R.id.line1);
        FragmentManager fragmentManager = getFragmentManager();
        tabAdapter = new ProfileTabAdapter(fragmentManager, getLifecycle());
        coursePager.setAdapter(tabAdapter);

        myCourseTabs.addTab(myCourseTabs.newTab().setText("All Trails"));
        myCourseTabs.addTab(myCourseTabs.newTab().setText("Trell Learning"));
        myCourseTabs.addTab(myCourseTabs.newTab().setText("BTS"));
        myCourseTabs.addTab(myCourseTabs.newTab().setText("Liked"));

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

        line1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), CreateCourseActivity.class));
            }
        });
        return view;
    }
}