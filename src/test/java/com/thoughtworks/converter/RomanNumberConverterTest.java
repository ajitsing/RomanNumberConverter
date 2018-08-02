package com.thoughtworks.converter;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomanNumberConverterTest {
    @Test
    public void shouldReturnRomanNumberFor_1() {
        RomanNumberConverter converter = new RomanNumberConverter();
        assertThat(converter.convert(1), is("I"));
    }

    @Test
    public void shouldReturnRomanNumberFor_3() {
        RomanNumberConverter converter = new RomanNumberConverter();
        assertThat(converter.convert(3), is("III"));
    }

    @Test
    public void shouldReturnRomanNumberFor_5() {
        RomanNumberConverter converter = new RomanNumberConverter();
        assertThat(converter.convert(5), is("V"));
    }
}
