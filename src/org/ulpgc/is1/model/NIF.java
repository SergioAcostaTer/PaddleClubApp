package org.ulpgc.is1.model;

public class NIF {
    private String number;

    public NIF(String number) {
        this.number = number;
    }

    public boolean isValid() {
        return number != null && !number.isEmpty();
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
