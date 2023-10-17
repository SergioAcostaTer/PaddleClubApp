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

    @Override
    public String toString() {
        return number;
    }
}
