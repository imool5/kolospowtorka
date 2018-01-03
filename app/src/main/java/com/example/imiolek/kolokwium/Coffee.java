package com.example.imiolek.kolokwium;

/**
 * Created by Daniel on 03.01.2018.
 */

public class Coffee {
   private String name;
    private String price;

    public Coffee(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
