package com.example.trell.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.trell.Fragments.AllTrailsFragment;
import com.example.trell.Fragments.AnnoucementFragment;
import com.example.trell.Fragments.BTSFragment;
import com.example.trell.Fragments.CreateContentFragment;
import com.example.trell.Fragments.LiveFragment;
import com.example.trell.Fragments.StatsFragment;
import com.example.trell.Fragments.TrellLearningFragment;

public class ProfileTabAdapter extends FragmentStateAdapter {


    public ProfileTabAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 2:
                return new BTSFragment();
            case 1:
                return new TrellLearningFragment();
            default:
                return new AllTrailsFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
