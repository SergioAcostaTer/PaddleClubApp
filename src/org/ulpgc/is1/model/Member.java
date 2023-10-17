package org.ulpgc.is1.model;

public class Member extends Customer {
    private final int points;
    private final Address address;

    public Member(String name, String surname, NIF nif, int points, Address address) {
        super(name, surname, nif); // Call the constructor of the superclass
        this.points = points;
        this.address = address;
    }
}
