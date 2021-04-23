package com.example.trell.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.trell.Activity.Curricullum;

import com.example.trell.Adapters.CurriculumAdapter;
import com.example.trell.R;

import java.util.ArrayList;

public class CurricullumFragment extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager layoutManager;
    public static ArrayList<Curricullum> curricullums;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_curricullum, container, false);
        recyclerView = view.findViewById(R.id.rvExpendableView);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        //lorem ipsum text daal de beshak
        curricullums = new ArrayList<Curricullum>();
        curricullums.add(new Curricullum("Introduction to Lighting Effects", "2 hrs", "10 lectures"));
        curricullums.add(new Curricullum("How to get more likes and comments", "30 mins", "3 lectures"));
        curricullums.add(new Curricullum("Advanced Lighting Effects and Cinematography", "10 hrs", "17 lectures"));
        curricullums.add(new Curricullum("Understanding the Music effects", "1.5 hrs", "5 lectures"));
        curricullums.add(new Curricullum("How to make more engaging content", "5 hrs", "6 lectures"));
        curricullums.add(new Curricullum("Importance of expressions", "30 mins", "3 lectures"));
        curricullums.add(new Curricullum("Understanding the trend", "1 hr 30 mins", "5 lectures"));

        myAdapter = new CurriculumAdapter(getContext(), curricullums);
        recyclerView.setAdapter(myAdapter);
        return view;
    }

    public void notifydatachanged(){
        myAdapter.notifyDataSetChanged();

    }
}