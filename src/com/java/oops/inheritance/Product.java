package com.java.oops.inheritance;

public class Product {
    int id;
    String name;
    int maxRetailPrice;
    float rating;
    int discountPercentage;

    public Product(int id, String name, int maxRetailPrice, float rating, int discountPercentage) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.rating = rating;
        this.discountPercentage = discountPercentage;
    }

    void displayProductDetails(){
        System.out.println(
                "Product ID: " + id + "\n" +
                "Product Name: " + name + "\n" +
                "Product Price: " + maxRetailPrice + "\n" +
                "Product Rating: " + rating + "\n" +
                "Discount Percentage: " + discountPercentage

        );
    }

}
