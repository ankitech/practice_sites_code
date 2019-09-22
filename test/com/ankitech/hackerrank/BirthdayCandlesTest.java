package com.ankitech.hackerrank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BirthdayCandlesTest {

    @Test
    public void birthdayCakeCandles() {
        assertEquals(2, BirthdayCandles.birthdayCakeCandles(new int[]{3, 2, 1, 3}));
        assertEquals(2, BirthdayCandles.birthdayCakeCandles(new int[]{4, 4, 1, 3}));
    }
}