package org.ulpgc.is1.model;

public class Member extends Customer {
    private final int points;
    private final Address address;

    public Member(String name, String surname, NIF nif, int points, Address address) {
        super(name, surname, nif);
        this.points = points;
        this.address = address;
    }

    public int getPoints() {
        return points;
    }

    public Address getAddress() {
        return address;
    }
}
