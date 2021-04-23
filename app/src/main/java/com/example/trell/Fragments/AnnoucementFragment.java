package com.example.trell.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.trell.Activity.Announcement;
import com.example.trell.Adapters.AnnouncementAdapter;
import com.example.trell.R;

import java.util.ArrayList;


public class AnnoucementFragment extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager layoutManager;
    public static ArrayList<Announcement> announcements;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_annoucement, container, false);
        recyclerView = view.findViewById(R.id.reyList);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        //lorem ipsum text daal de beshak
        announcements = new ArrayList<Announcement>();
        announcements.add(new Announcement("New Video is uploaded", "New video for the cinematography course, part 1: released."));
        announcements.add(new Announcement("I have been recovering", "Thankyou all for your love and support. This is much needed."));
        announcements.add(new Announcement("Starting a new course on expressions", "Now you all learn to give optimal expressions for the video. create like proffessional."));

        myAdapter = new AnnouncementAdapter(getContext(), announcements);
        recyclerView.setAdapter(myAdapter);
        return view;
    }


    public void notifydatachanged(){
        myAdapter.notifyDataSetChanged();

    }
}