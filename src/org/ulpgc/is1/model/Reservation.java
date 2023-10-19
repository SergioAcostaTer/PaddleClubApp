package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reservation {
    private static int NEXT_ID = 0;
    private final int id;
    private final Date date;
    private final List<Extra> extras;
    private final Customer customer;
    private final Court court;

    public Reservation(Customer customer, Court court) {
        this.id = NEXT_ID++;
        this.date = new Date();
        this.extras = new ArrayList<>();
        this.customer = customer;
        this.court = court;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return new Date(date.getTime());
    }

    public int price() {
        int total = 0;

        for (Extra extra: extras) {
            total += extra.getPrice();
        }

        total += court.getPrice();

        return total;
    }

    public void addExtra(Extra extra) {
        extras.add(extra);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Court getCourt() {
        return court;
    }


    @Override
    public String toString() {
        String result = "Reservation ID: " + id + "\n";
        result += "Reservation Date: " + date + "\n";
        result += "Customer Info:\n" + customer + "\n";
        result += "Court Info: (\n" + court + "\n)\n";

        if (this.extras.size() > 0){
            result += "Extras: (\n";

            for (Extra extra : extras) {
                result += "    " + extra + "\n";
            }

            result += ")\n";
        }

        result += "Total Price: " + price() + "€\n";

        return result;
    }

}
