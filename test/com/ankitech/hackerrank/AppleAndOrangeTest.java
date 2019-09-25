package com.ankitech.hackerrank;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class AppleAndOrangeTest {

    @Test
    public void test1() {
        assertArrayEquals(new int[]{1,1},AppleAndOrange.countApplesAndOranges(7,11,5,15, new int[]{-2,2,1},new int[]{5,-6}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1,2},AppleAndOrange.countApplesAndOranges(7,10,4,12, new int[]{2,3,-4},new int[]{3,-2,-4}));
    }
}