package com.java.oops.inheritance;

public class ElectronicGadgets extends Product{
    int warrentyYears;
    int powerUsage;

    ElectronicGadgets(int id,String name,int maxRetailPrice,float rating,int discountPercentage,int warrentyYears,int powerConsumedInKw){
        super(id, name, maxRetailPrice, rating, discountPercentage);
        this.warrentyYears = warrentyYears;
        this.powerUsage = powerUsage;
    }

    void displayElectronicsInfo(){
        System.out.println(
                "Warrenty in Years: " + warrentyYears + "\n" +
                 "Power Used: " + powerUsage
        );
    }
}
