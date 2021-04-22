package com.example.trell.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.trell.Fragments.CurricullumFragment;
import com.example.trell.Fragments.DashBoardFragment;
import com.example.trell.Fragments.FragementLibrary;

public class TabAdapter extends FragmentStateAdapter {


    public TabAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1:
                return new CurricullumFragment();
            case 2:
                return new FragementLibrary();
            default:
                return new DashBoardFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
