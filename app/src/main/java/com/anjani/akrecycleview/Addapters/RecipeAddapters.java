package com.anjani.akrecycleview.Addapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.anjani.akrecycleview.Models.RecipeModels;
import com.anjani.akrecycleview.R;

import java.util.ArrayList;

public class RecipeAddapters extends  RecyclerView.Adapter<RecipeAddapters.viewHolder> {


    ArrayList<RecipeModels> list;

    public RecipeAddapters(ArrayList<RecipeModels> list, Context context) {
        this.list = list;
        this.context = context;
    }

    Context context;

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View view = LayoutInflater.from (context).inflate (R.layout.sample_recleview, parent, false);

        return new viewHolder (view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
//position set
        RecipeModels models = list.get (position );
// data set(image)
        holder.imageView.setImageResource (models.getPic ());
// data set(text)
        holder.textView.setText(models.getText ());


    }

    @Override
    public int getItemCount() {
        return list.size ( );
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;

        public viewHolder(@NonNull View itemView) {
            super (itemView);



            imageView = itemView.findViewById (R.id.imageView);
            textView = itemView.findViewById (R.id.textViewRcl2);

        }
    }


}
