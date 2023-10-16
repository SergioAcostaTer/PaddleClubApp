package org.ulpgc.is1.model;

public class Member extends Customer{
    private final int points;
    private final Address address;

    public Member(int points, Address address) {
        this.points = points;
        this.address = address;
    }
}
