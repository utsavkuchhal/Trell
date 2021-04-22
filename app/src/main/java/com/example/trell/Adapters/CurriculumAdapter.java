package com.example.trell.Adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class CurriculumAdapter extends RecyclerView.Adapter<CurriculumAdapter.Parent> {
    @NonNull
    @Override
    public Parent onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull Parent holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 0;
    }

    class Parent extends RecyclerView.ViewHolder {
        TextView title;
        TextView lectures;
        TextView lectureTime;
        public Parent(@NonNull View itemView) {
            super(itemView);

        }
    }
}
