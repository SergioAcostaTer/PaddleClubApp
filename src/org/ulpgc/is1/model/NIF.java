package org.ulpgc.is1.model;

public class NIF {
    private String number;

    public NIF(String number) {
        if (isValidNIF(number)) {
            this.number = number;
        } else {
            this.number = "XXXX";
        }
    }

    private boolean isValidNIF(String number) {
        return number != null && number.length() == 10;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (isValidNIF(number)) {
            this.number = number;
        } else {
            this.number = "XXXX";
        }
    }

    @Override
    public String toString() {
        return number;
    }
}
