package com.example.trell.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.trell.Adapters.CommonVideoAdapter;
import com.example.trell.Adapters.GifAdapter;
import com.example.trell.R;

import java.util.ArrayList;


public class AllTrailsFragment extends Fragment {

    RecyclerView winningsRv;
    private static ArrayList<Integer> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_all_trails, container, false);
        winningsRv = view.findViewById(R.id.winningsRv);
        list = new ArrayList<>();
        createList();
        winningsRv.setHasFixedSize(true);
        winningsRv.setLayoutManager(new GridLayoutManager(getContext(), 2));
        GifAdapter commonVideoAdapter = new GifAdapter(getContext(), list);
        winningsRv.setAdapter(commonVideoAdapter);
        return view;
    }

    public static void createList() {
        list.add(R.drawable.food);
        list.add(R.drawable.movie);
        list.add(R.drawable.make1);
        list.add(R.drawable.sports);
    }
}