package com.example.trell.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.trell.Activity.Curricullum;
import com.example.trell.Adapters.CommonVideoAdapter;
import com.example.trell.Adapters.CurriculumAdapter;
import com.example.trell.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

import java.util.ArrayList;


public class CreateContentFragment extends Fragment {

    RecyclerView recyclerView;
    ExtendedFloatingActionButton floating_action;
    ImageView ivimage;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager layoutManager;
    public static ArrayList<Curricullum> tutorials;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_create_content, container, false);
//        winningsRv = view.findViewById(R.id.winningsRv);
//        floating_action = view.findViewById(R.id.floating_action);
//
//        ArrayList<String> list = new ArrayList<>();
//        for (int i = 0; i < 6; i++) {
//            list.add("");
//        }
//        winningsRv.setHasFixedSize(true);
//        winningsRv.setLayoutManager(new GridLayoutManager(getContext(), 2));
//        CommonVideoAdapter commonVideoAdapter = new CommonVideoAdapter(getContext(), list, true);
//        winningsRv.setAdapter(commonVideoAdapter);
        ivimage = view.findViewById(R.id.iv_image);
        recyclerView = view.findViewById(R.id.winningsRv);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        //lorem ipsum text daal de beshak
        tutorials = new ArrayList<Curricullum>();
        tutorials.add(new Curricullum("Introduction to Lighting Effects", "2 hrs", "10 lectures"));
        tutorials.add(new Curricullum("How to get more likes and comments", "30 mins", "3 lectures"));
        tutorials.add(new Curricullum("Advanced Lighting Effects and Cinematography", "10 hrs", "17 lectures"));
        tutorials.add(new Curricullum("Understanding the Music effects", "1.5 hrs", "5 lectures"));
        tutorials.add(new Curricullum("How to make more engaging content", "5 hrs", "6 lectures"));
        tutorials.add(new Curricullum("Importance of expressions", "30 mins", "3 lectures"));
        tutorials.add(new Curricullum("Understanding the trend", "1 hr 30 mins", "5 lectures"));

        myAdapter = new CurriculumAdapter(getContext(), tutorials);
        recyclerView.setAdapter(myAdapter);
        return view;
    }


}