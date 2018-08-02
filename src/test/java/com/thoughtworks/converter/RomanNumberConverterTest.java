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
}
