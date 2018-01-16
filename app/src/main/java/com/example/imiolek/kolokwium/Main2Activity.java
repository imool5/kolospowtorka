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
