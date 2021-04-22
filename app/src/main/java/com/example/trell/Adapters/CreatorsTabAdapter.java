package com.example.trell.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.trell.Fragments.AnnoucementFragment;
import com.example.trell.Fragments.CreateContentFragment;
import com.example.trell.Fragments.CurricullumFragment;
import com.example.trell.Fragments.DashBoardFragment;
import com.example.trell.Fragments.FragementLibrary;
import com.example.trell.Fragments.LiveFragment;
import com.example.trell.Fragments.StatsFragment;

public class CreatorsTabAdapter extends FragmentStateAdapter {


    public CreatorsTabAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1:
                return new AnnoucementFragment();
            case 2:
                return new LiveFragment();
            case 3:
                return new StatsFragment();
            default:
                return new CreateContentFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}