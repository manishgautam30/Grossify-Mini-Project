package com.example.grossifyapp.model;

public class RecentlyViewed {
    String name;
    String description;
    String price;
    String quantity;
    String unit;
    int imageUrl;

    public RecentlyViewed(String name, String description, String price, String quantity, String unit, int
            imageUrl) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
        this.imageUrl = imageUrl;
    }

}
