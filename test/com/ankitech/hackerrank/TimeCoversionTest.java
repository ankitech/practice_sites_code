package com.ankitech.hackerrank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeCoversionTest {

    @Test
    public void testAM() {
        assertEquals("09:05:45",TimeCoversion.timeConversion("09:05:45AM"));
    }

    @Test
    public void testMidnight() {
        assertEquals("00:00:00",TimeCoversion.timeConversion("12:00:00AM"));
    }

    @Test
    public void pastMidnight() {
        assertEquals("00:05:45",TimeCoversion.timeConversion("12:05:45AM"));
    }

    @Test
    public void testPM() {
        assertEquals("19:05:45",TimeCoversion.timeConversion("07:05:45PM"));
    }

    @Test
    public void testNoon() {
        assertEquals("12:00:00",TimeCoversion.timeConversion("12:00:00PM"));
    }

    @Test
    public void postNoon() {
        assertEquals("12:05:00",TimeCoversion.timeConversion("12:05:00PM"));
    }


}