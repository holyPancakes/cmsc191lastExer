package com.exercise3.jollibee;


public class Product {

    private String name;
    private String description;
    private int imageResourceId;

    protected Product(String productName, String productDescription, int productImgResourceId) {
        this.name = productName;
        this.description = productDescription;
        this.imageResourceId = productImgResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return name;
    }

}
