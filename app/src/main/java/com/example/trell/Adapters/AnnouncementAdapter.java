package com.example.trell.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trell.Activity.Announcement;
import com.example.trell.R;

import java.util.ArrayList;

public class AnnouncementAdapter extends RecyclerView.Adapter<AnnouncementAdapter.ViewHolder> {


    private ArrayList<Announcement> announcements;

    Context context;

//    public interface ItemClicked{
//
//        void onItemClicked(int index);
//
//    }

    public AnnouncementAdapter(Context context, ArrayList<Announcement> list) {
        announcements = list;
        this.context =  context;
    }


    @NonNull
    @Override
    public AnnouncementAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_announcement, parent, false);


        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AnnouncementAdapter.ViewHolder holder, int i) {

        holder.itemView.setTag(announcements.get(i));
        holder.An_headings.setText(announcements.get(i).getHeading());
        holder.An_description.setText(announcements.get(i).getDescription());

    }

    @Override
    public int getItemCount() {
        return announcements.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView An_headings;
        TextView An_time;
        TextView An_description;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);

            An_headings = itemView.findViewById(R.id.commentUserTv);
            An_time = itemView.findViewById(R.id.commentTimeTv);
            An_description = itemView.findViewById(R.id.commentBodyTv);
//
//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                    activity.onItemClicked(announcements.indexOf((Announcement) v.getTag()));
//
//                }
//            });


        }
    }
}
