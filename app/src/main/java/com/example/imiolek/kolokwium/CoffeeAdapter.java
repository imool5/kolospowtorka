package com.example.imiolek.kolokwium;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Daniel on 16.01.2018.
 */

public class CoffeeAdapter extends RecyclerView.Adapter<CoffeeAdapter.ViewHolder> {

    private ArrayList<Coffee> CoffeeArray = new ArrayList<>();

    public CoffeeAdapter(ArrayList<Coffee> CoffeeArray) {
        this.CoffeeArray = CoffeeArray;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, null);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setName(CoffeeArray.get(position).getName() + "");
        holder.setPrice(CoffeeArray.get(position).getPrice() + "");
    }

    @Override
    public int getItemCount() {
        return CoffeeArray.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

        @BindView(R.id.CoffeeName)
        TextView CoffeeName;

        @BindView(R.id.CoffeePrice)
                TextView CoffeePrice;

        private void setName(String name) {
            CoffeeName.setText(name);
        }

        private void setPrice(String price) {
            CoffeePrice.setText(price);
        }
    @BindView(R.id.PickCoffee_btn)
    Button zamow_btn;

    @BindView(R.id.Picture)
    ImageView Picture;

    @OnClick(R.id.PickCoffee_btn)


      public void onClick(View v) {

        if (View.INVISIBLE==Picture.getVisibility())
            Picture.setVisibility(View.VISIBLE);

        else

            Picture.setVisibility(View.INVISIBLE);

            }
    }
}
