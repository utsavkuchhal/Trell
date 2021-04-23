package com.example.trell.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trell.Activity.Announcement;
import com.example.trell.Activity.Curricullum;
import com.example.trell.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CurriculumAdapter extends RecyclerView.Adapter<CurriculumAdapter.ViewHolder> {

    private ArrayList<Curricullum> curricullums;

    Context context;

    /*public interface ItemClicked{

        void onItemClicked(int index);

    }*/

    public CurriculumAdapter( Context context, ArrayList<Curricullum> curricullums) {
        this.curricullums = curricullums;
        this.context = context;
        //activity = (ItemClicked) context;
    }


    @NonNull
    @Override
    public CurriculumAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pojo, parent, false);


        return new CurriculumAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CurriculumAdapter.ViewHolder holder, int i) {

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
