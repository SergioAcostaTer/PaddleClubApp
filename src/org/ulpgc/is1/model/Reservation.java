package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reservation {
    private static int NEXT_ID = 1;
    private final int id;
    private final Date date;
    private final List<Extra> extras;

    public Reservation() {
        this.id = NEXT_ID++;
        this.date = new Date();
        this.extras = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return new Date(date.getTime());
    }

    public int price() {
        int reservationPrice = 10;
        int total = 0;

        total += reservationPrice;

        for (Extra extra: extras){
            total += extra.getPrice();
        }

        return total;
    }

    public void addExtra(Extra extra) {
        extras.add(extra);
    }
}
