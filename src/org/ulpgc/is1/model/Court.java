package org.ulpgc.is1.model;

public class Court {
    private final String name;
    private final int price;
    private final CourtType type;

    public Court(String name, int price, CourtType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }


    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Court Name: " + name + "\n" +
                "Price: " + price + "€\n" +
                "Type: " + type;
    }
}
