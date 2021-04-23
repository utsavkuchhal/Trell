package com.example.trell.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.trell.Fragments.HomeFragment;
import com.example.trell.Fragments.PofilePageFragment;
import com.example.trell.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    FrameLayout frame_layout;
    private Fragment selectorFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bottomNavigationView = findViewById(R.id.dashboardBottomNav);
        frame_layout = findViewById(R.id.frame_layout);
        selectorFragment = new HomeFragment();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.dashboard_library:
                        selectorFragment = new PofilePageFragment();
                        break;
                    case R.id.dashboard_courses:
                        selectorFragment = new PofilePageFragment();
                        break;
                    case R.id.dashboard_home:
                        selectorFragment = new PofilePageFragment();
                        break;
                    case R.id.dashboard_doubts:
                        selectorFragment = new PofilePageFragment();
                        break;
                    default:
                        selectorFragment = new PofilePageFragment();
                        break;
                }

                if (selectorFragment != null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, selectorFragment).commit();

                }
                return true;
            }
        });

    }


}