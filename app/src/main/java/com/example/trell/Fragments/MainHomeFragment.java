package com.example.trell.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.trell.Activity.CategoryActivity;
import com.example.trell.Adapters.CommonVideoAdapter;
import com.example.trell.Adapters.HomeAdapter;
import com.example.trell.R;

import java.util.ArrayList;

public class MainHomeFragment extends Fragment implements HomeAdapter.ClickListener {

    RecyclerView winningsRv;
    private static ArrayList<Integer> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_home, container, false);
        winningsRv = view.findViewById(R.id.winningsRv);
        list = new ArrayList<>();
        createList();
        winningsRv.setHasFixedSize(true);
        winningsRv.setLayoutManager(new GridLayoutManager(getContext(), 2));
        HomeAdapter commonVideoAdapter = new HomeAdapter(getContext(), list, MainHomeFragment.this);
        winningsRv.setAdapter(commonVideoAdapter);

        return view;
    }

    public static void createList() {
        list.add(R.drawable.make1);
        list.add(R.drawable.sports);
        list.add(R.drawable.fun);
        list.add(R.drawable.learn3gif);
        list.add(R.drawable.food);
        list.add(R.drawable.make2);
    }

    @Override
    public void onItemClick(int position) {
        startActivity(new Intent(getContext(), CategoryActivity.class));
    }
}