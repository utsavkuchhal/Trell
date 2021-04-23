package com.example.trell.Fragments;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.trell.R;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;


public class StatsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_stats, container, false);
        PieChart mPieChart = (PieChart) view.findViewById(R.id.piechart);
        mPieChart.addPieSlice(new PieModel("Subscribed Users", 15, R.color.colorPrimary));
        mPieChart.addPieSlice(new PieModel("Active Users", 25, R.color.pastel_red));
        mPieChart.addPieSlice(new PieModel("Users Completed", 35, R.color.algae_green));
        mPieChart.startAnimation();
        return view;
    }
}