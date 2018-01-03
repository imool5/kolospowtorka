package com.example.imiolek.kolokwium;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

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
    }
}
