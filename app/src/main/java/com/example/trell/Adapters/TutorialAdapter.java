package com.example.trell.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trell.Activity.Curricullum;
import com.example.trell.R;

import java.util.ArrayList;

public class TutorialAdapter extends RecyclerView.Adapter<TutorialAdapter.ViewHolder> {

    private ArrayList<Curricullum> curricullums;

    Context context;


    public TutorialAdapter(Context context, ArrayList<Curricullum> curricullums) {
        this.curricullums = curricullums;
        this.context = context;
    }


    @NonNull
    @Override
    public TutorialAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_create_tutorial, parent, false);


        return new TutorialAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TutorialAdapter.ViewHolder holder, int i) {

        holder.itemView.setTag(curricullums.get(i));
        holder.title.setText(curricullums.get(i).getTitle());
        holder.lectureTime.setText(curricullums.get(i).getLectureTime());
        holder.lectures.setText(curricullums.get(i).getLectures());

    }


    @Override
    public int getItemCount() {
        return curricullums.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView lectures;
        TextView lectureTime;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            lectures = itemView.findViewById(R.id.lectures);
            lectureTime = itemView.findViewById(R.id.lectureTime);
        }
    }
}