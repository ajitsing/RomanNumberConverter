package com.thoughtworks.converter;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomanNumberConverterTest {

    private RomanNumberConverter converter;

    @Before
    public void setUp() {
        converter = new RomanNumberConverter();
    }

    @Test
    public void shouldReturnRomanNumberFor_1() {
        assertThat(converter.convert(1), is("I"));
    }

    @Test
    public void shouldReturnRomanNumberFor_3() {
        assertThat(converter.convert(3), is("III"));
    }

    @Test
    public void shouldReturnRomanNumberFor_4() {
        assertThat(converter.convert(4), is("IV"));
    }

    @Test
    public void shouldReturnRomanNumberFor_5() {
        assertThat(converter.convert(5), is("V"));
    }

    @Test
    public void shouldReturnRomanNumberFor_8() {
        assertThat(converter.convert(8), is("VIII"));
    }

    @Test
    public void shouldReturnRomanNumberFor_9() {
        assertThat(converter.convert(9), is("IX"));
    }

    @Test
    public void shouldReturnRomanNumberFor_10() {
        assertThat(converter.convert(10), is("X"));
    }

    @Test
    public void shouldReturnRomanNumberFor_50() {
        assertThat(converter.convert(50), is("L"));
    }
}
