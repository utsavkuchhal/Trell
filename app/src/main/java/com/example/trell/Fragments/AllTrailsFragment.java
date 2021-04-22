package com.example.trell.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.trell.Adapters.CommonVideoAdapter;
import com.example.trell.R;

import java.util.ArrayList;


public class AllTrailsFragment extends Fragment {

    RecyclerView winningsRv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_all_trails, container, false);
        winningsRv = view.findViewById(R.id.winningsRv);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add("");
        }
        winningsRv.setHasFixedSize(true);
        winningsRv.setLayoutManager(new GridLayoutManager(getContext(), 2));
        CommonVideoAdapter commonVideoAdapter = new CommonVideoAdapter(getContext(), list, true);
        winningsRv.setAdapter(commonVideoAdapter);
        return view;
    }
}