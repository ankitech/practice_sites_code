package com.ankitech.hackerrank.test;

import com.ankitech.hackerrank.src.PrimeCheck;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrimeCheckTest {

    @Test
    public void isPrime() {
        assertTrue(PrimeCheck.isPrime(13));
        assertTrue(PrimeCheck.isPrime(17));
        assertFalse(PrimeCheck.isPrime(9));
        assertFalse(PrimeCheck.isPrime(32));
    }
}