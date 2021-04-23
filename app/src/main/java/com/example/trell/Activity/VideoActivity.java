package com.example.trell.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.trell.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class VideoActivity extends AppCompatActivity {
    CircleImageView iv_profile;
    ImageView imageView;
    TextView btn_category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        iv_profile = findViewById(R.id.iv_profile);
        imageView = findViewById(R.id.image_view);
        btn_category = findViewById(R.id.btn_category);
        Glide.with(this).load(R.drawable.video).into(imageView);
        iv_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VideoActivity.this, CreatorsProfileActivity.class));
            }
        });

        btn_category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VideoActivity.this, CategoryActivity.class));
            }
        });
    }
}