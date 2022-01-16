package com.anjani.akrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.LinearLayout;

import com.anjani.akrecycleview.Addapters.RecipeAddapters;
import com.anjani.akrecycleview.Models.RecipeModels;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

    recyclerView = findViewById (R.id.recycleview);


    // make list add in Recycleview

        ArrayList<RecipeModels> list = new ArrayList<> ( );

        // Add data in list (image+text like sameple).......INSERT

        list.add(new RecipeModels (R.drawable.burger, "Burger"));
        list.add(new RecipeModels (R.drawable.biryani, "Biryani"));
        list.add(new RecipeModels (R.drawable.cake, "Cake"));
        list.add(new RecipeModels (R.drawable.chknsamosa, "Chicken Samosa"));
        list.add(new RecipeModels (R.drawable.fancyfood, "fancyfood"));
        list.add(new RecipeModels (R.drawable.idli, "Idli"));
        list.add(new RecipeModels (R.drawable.samosa, "Samosa"));
        list.add(new RecipeModels (R.drawable.thali, "Thali"));
        list.add(new RecipeModels (R.drawable.img1, "Sample"));
        list.add(new RecipeModels (R.drawable.img1, "Sample"));
        list.add(new RecipeModels (R.drawable.img1, "Sample"));
        list.add(new RecipeModels (R.drawable.img1, "Sample"));
        list.add(new RecipeModels (R.drawable.img1, "Sample"));
        list.add(new RecipeModels (R.drawable.img1, "Sample"));
        list.add(new RecipeModels (R.drawable.img1, "Sample"));
        list.add(new RecipeModels (R.drawable.img1, "Sample"));
        list.add(new RecipeModels (R.drawable.img1, "Sample"));
        list.add(new RecipeModels (R.drawable.img1, "Sample"));
        list.add(new RecipeModels (R.drawable.img1, "Sample"));
        list.add(new RecipeModels (R.drawable.img1, "Sample"));
        list.add(new RecipeModels (R.drawable.img1, "Sample"));
        list.add(new RecipeModels (R.drawable.img1, "Sample"));
        list.add(new RecipeModels (R.drawable.img1, "Sample"));
        list.add(new RecipeModels (R.drawable.img1, "Sample"));







   // use Adapter

        RecipeAddapters addapters = new RecipeAddapters (list,this);
        recyclerView.setAdapter(addapters);


        //set layout manager to show your list in main page in verticleWay(like facebook scrolwala)

//        LinearLayoutManager layoutManager = new LinearLayoutManager (this);
//        recyclerView.setLayoutManager (layoutManager);


        //set layout manager to show your list in main page in verticleWay(like insta story)

//        LinearLayoutManager layoutManager = new LinearLayoutManager (this, LinearLayoutManager.HORIZONTAL,true);
//        recyclerView.setLayoutManager (layoutManager);

 //  GrideLayout mai set(gallary jaisa)

        GridLayoutManager gridLayoutManager = new GridLayoutManager (this,3);
        recyclerView.setLayoutManager (gridLayoutManager);

    //Staggered Layout manager

//        StaggeredGridLayoutManager stagged = new StaggeredGridLayoutManager (1,StaggeredGridLayoutManager.HORIZONTAL);
//        recyclerView.setLayoutManager (stagged);


    }
}