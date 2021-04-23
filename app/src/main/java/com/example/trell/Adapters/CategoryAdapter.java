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
import com.example.trell.model.Categories;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private ArrayList<Categories> categories;
    Context context;
   // CategoryAdapter.ItemClicked activity;

    //    public interface ItemClicked{
    //
      //      void onItemClicked(int index);

        //}

    public CategoryAdapter(Context context, ArrayList<Categories> categories) {
        this.categories = categories;
       // activity = (ItemClicked) context;
        this.context = context;
    }




    @NonNull
    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category, parent, false);


        return new CategoryAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.ViewHolder holder, int i) {

        holder.itemView.setTag(categories.get(i));
        holder.title.setText(categories.get(i).getTitle());

    }


    @Override
    public int getItemCount() {
        return categories.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.subTitleTv);




        }
    }


}
