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
        if (number == null || number.length() != 9) {
            return false;
        }

        String digitsPart = number.substring(0, 8);
        char controlLetter = Character.toUpperCase(number.charAt(8));

        if (!digitsPart.matches("\\d{8}")) {
            return false; // The first 8 characters should be digits.
        }

        int numericPart = Integer.parseInt(digitsPart);
        int remainder = numericPart % 23;

        // Define a mapping of remainder values to control letters.
        char[] controlLetters = "TRWAGMYFPDXBNJZSQVHLCKE".toCharArray();
        char expectedControlLetter = controlLetters[remainder];

        return controlLetter == expectedControlLetter;
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
