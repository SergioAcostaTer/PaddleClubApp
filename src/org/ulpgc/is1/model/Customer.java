package org.ulpgc.is1.model;

public class Customer {
    protected String name;
    protected String surname;
    protected NIF nif;

    public Customer(String name, String surname, NIF nif) {
        this.name = name;
        this.surname = surname;
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Surname: " + surname + "\n" +
                "NIF: " + nif;
    }
}
