package com.java.oops.inheritance;

public class Laptop extends ElectronicGadgets{
    String processer;
    String gpu;

    public Laptop(int id, String name, int maxRetailPrice, float rating, int discountPercentage, int warrentyYears, int powerConsumedInKw, String processer, String gpu) {
        super(id, name, maxRetailPrice, rating, discountPercentage, warrentyYears, powerConsumedInKw);
        this.processer = processer;
        this.gpu = gpu;
    }

    void displayLaptopDetails(){
        displayProductDetails();
        displayElectronicsInfo();
        System.out.println(
                "Processer Used: " + processer + "\n" +
                "GPU: " + gpu
        );
    }
}
