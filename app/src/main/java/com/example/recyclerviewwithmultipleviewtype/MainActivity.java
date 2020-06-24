package com.example.recyclerviewwithmultipleviewtype;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewwithmultipleviewtype.adapter.TripsAdapter;
import com.example.recyclerviewwithmultipleviewtype.models.Ads;
import com.example.recyclerviewwithmultipleviewtype.models.Item;
import com.example.recyclerviewwithmultipleviewtype.models.News;
import com.example.recyclerviewwithmultipleviewtype.models.Trip;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=findViewById(R.id.recyclerView);

        List<Item> items=new ArrayList<>();
        Trip trip1=new Trip(R.drawable.boat,"river","tourism will increase");
        items.add(new Item(0,trip1));

        Ads ads1=new Ads("ad","billion dollar invested");
        items.add(new Item(1,ads1));

        News news1=new News("News,News regarding cricket",
                "You will find beaches,volcano,voldemorto");
        items.add(new Item(2,news1));

        Trip trip2=new Trip(R.drawable.scenery,"want to go peshwar","want to eat chapli kebab");
        items.add(new Item(1,trip2));

        News news2=new News("news regarding death","of susanth singh rajput");
        items.add(new Item(2,news2));

        Trip trip3=new Trip(R.drawable.tree,"my dream tour","spain");
        items.add(new Item(1,trip3));

        Ads ads2=new Ads("ad regarding usa","scholarship in harvard,mit,stanford");
        items.add(new Item(0,ads2));

        News news3=new News("news regarding","nepotism in bollywood the dirty people and dirty mind");
        items.add(new Item(2,news3));

        recyclerView.setAdapter(new TripsAdapter(items));
    }
}