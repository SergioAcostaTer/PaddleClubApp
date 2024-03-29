package org.ulpgc.is1.model;

import java.util.Objects;

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

    public String getName() {
        return name;
    }

    public CourtType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Court Name: " + name + "\n" +
                "Price: " + price + "€\n" +
                "Type: " + type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Court court = (Court) o;
        return price == court.price &&
                Objects.equals(name, court.name) &&
                type == court.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, type);
    }
}
