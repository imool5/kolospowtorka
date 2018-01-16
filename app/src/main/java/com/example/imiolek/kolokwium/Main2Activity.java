package com.example.imiolek.kolokwium;

import android.content.Intent;
import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.recyclerViewkawy)
    RecyclerView recyclerViewkawy;

//    @BindView(R.id.zamow_btn)
//    Button zamow_btn;
//
//    @BindView(R.id.Picture)
//    ImageView Picture;

//    @OnClick(R.id.zamow_btn)


//      public void onClick(View v) {
//
//        if (View.VISIBLE==0)
//            Picture.setVisibility(View.VISIBLE);
//
//        else
//
//            Picture.setVisibility(View.INVISIBLE);

//            }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ButterKnife.bind(this);

        ArrayList<Coffee> coffees = new ArrayList<>();
        coffees.add(new Coffee("Latte", "12"));
        coffees.add(new Coffee("Black", "9"));
        coffees.add(new Coffee("White", "11"));
        coffees.add(new Coffee("CaramelCoffee", "14"));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewkawy.setLayoutManager(layoutManager);
        CoffeeAdapter placeAdapter = new CoffeeAdapter(coffees);
        recyclerViewkawy.setAdapter(placeAdapter);
    }
}
