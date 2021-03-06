package com.example.trell.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.trell.Activity.CategoryActivity;
import com.example.trell.Activity.CreatorsProfileActivity;
import com.example.trell.R;

import de.hdodenhof.circleimageview.CircleImageView;


public class HomeFragment extends Fragment {


    CircleImageView iv_profile;
    ImageView imageView;
    TextView btn_category;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        iv_profile = view.findViewById(R.id.iv_profile);
        imageView = view.findViewById(R.id.image_view);
        btn_category = view.findViewById(R.id.btn_category);
        Glide.with(getContext()).load(R.drawable.video).into(imageView);
        iv_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), CreatorsProfileActivity.class));
            }
        });

        btn_category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), CategoryActivity.class));
            }
        });
        return view;
    }
}