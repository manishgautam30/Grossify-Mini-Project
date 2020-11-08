package com.example.grossifyapp.model;

public class DiscountedProducts {

    Integer id;
    String imageurl;
public DiscountedProducts(Integer id, int imageurl){
    this.id = id;
    this.imageurl=imageurl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
}
