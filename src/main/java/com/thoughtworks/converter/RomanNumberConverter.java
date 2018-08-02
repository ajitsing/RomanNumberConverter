package com.thoughtworks.converter;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumberConverter {
    private static Map<String, Integer> romanNumbers = new LinkedHashMap<>();

    static {
        romanNumbers.put("C", 100);
        romanNumbers.put("XC", 99);
        romanNumbers.put("L", 50);
        romanNumbers.put("XL", 49);
        romanNumbers.put("X", 10);
        romanNumbers.put("IX", 9);
        romanNumbers.put("V", 5);
        romanNumbers.put("IV", 4);
        romanNumbers.put("I", 1);
    }

    public String convert(int number) {
        StringBuilder result = new StringBuilder();

        for (Map.Entry<String, Integer> entry : romanNumbers.entrySet()) {
            while (number >= entry.getValue()) {
                result.append(entry.getKey());
                number -= entry.getValue();
            }
        }

        return result.toString();
    }
}
