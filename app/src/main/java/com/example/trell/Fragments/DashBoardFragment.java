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

public class DashBoardFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dash_board, container, false);
        PieChart mPieChart = (PieChart) view.findViewById(R.id.piechart);
        mPieChart.addPieSlice(new PieModel("Current Progress", 30, Color.parseColor("#f2734c")));
        mPieChart.addPieSlice(new PieModel("Course Left", 70, Color.parseColor("#25d366")));
        mPieChart.startAnimation();
        return view;
    }
}