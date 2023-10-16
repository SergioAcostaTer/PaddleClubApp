package org.ulpgc.is1.model;

public class Umpire extends Extra {
    private final String name;
    private final String surname;

    public Umpire(String name, String surname, int price) {
        this.name = name;
        this.surname = surname;
        this.price = price;
    }

    @Override
    public String getName() {
        return name + " " + surname;
    }
}
