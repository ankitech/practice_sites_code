package com.ankitech.hackerrank.test;

import com.ankitech.hackerrank.src.IPaddressValidation;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IPaddressValidationTest {

    @Test
    public void validate() {
        assertTrue(IPaddressValidation.validate("000.12.12.034"));
        assertTrue(IPaddressValidation.validate("000.12.12.034"));
        assertTrue(IPaddressValidation.validate("000.12.12.034"));
        assertFalse(IPaddressValidation.validate("00.12.123.123123.123"));
        assertFalse(IPaddressValidation.validate("122.23"));
        assertFalse(IPaddressValidation.validate("Hello.IP"));
    }
}