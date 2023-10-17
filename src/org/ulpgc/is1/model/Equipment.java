package org.ulpgc.is1.model;

public class Equipment extends Extra{

    private final String name;

    public Equipment(String name, int price){
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Equipment: " + name + " - Price: " + price + "€";
    }
}