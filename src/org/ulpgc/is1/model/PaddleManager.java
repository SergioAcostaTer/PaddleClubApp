package org.ulpgc.is1.model;

import java.util.ArrayList;

public class PaddleManager {
    private ArrayList<Court> courts;
    private ArrayList<Customer> customers;
    private ArrayList<Reservation> reservations;

    public PaddleManager() {
        courts = new ArrayList<>();
        customers = new ArrayList<>();
        reservations = new ArrayList<>();
    }

    public void addCourt(Court court) {
        if (!courts.contains(court)) {
            courts.add(court);
        }
    }

    public void addCustomer(Customer customer) {
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
    }


    public Court getCourt(int index) {
        if (index >= 0 && index < courts.size()) {
            return courts.get(index);
        } else {
            return null;
        }
    }

    public Customer getCustomer(int index) {
        if (index >= 0 && index < customers.size()) {
            return customers.get(index);
        } else {
            return null;
        }
    }

    public void remove(int index){
        if (index >= 0 && index < customers.size()) {
            this.customers.remove(index);
        }
    }

    public int countCustomer(){
        return this.customers.size();
    }

    public void reserve(Reservation reservation) {
        this.reservations.add(reservation);
    }


    public ArrayList<Reservation> getReservations() {
        return new ArrayList<>(reservations);
    }
}
