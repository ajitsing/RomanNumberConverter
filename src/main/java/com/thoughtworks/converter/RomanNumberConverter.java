package com.thoughtworks.converter;

public class RomanNumberConverter {
    public String convert(int number) {
        StringBuilder result = new StringBuilder();
        while (number >= 1) {
            result.append("I");
            number -= 1;
        }

        return result.toString();
    }
}
