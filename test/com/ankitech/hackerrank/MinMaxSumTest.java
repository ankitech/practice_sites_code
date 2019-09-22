package com.ankitech.hackerrank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinMaxSumTest {

    @Test
    public void miniMaxSum() {
        assertEquals("10 14",MinMaxSum.miniMaxSum(new int[]{1,2,3,4,5}));
    }

    @Test
    public void test2() {

        assertEquals("2063524951 2802298787",MinMaxSum.miniMaxSum(new int[]{156873294, 719583602, 581240736, 605827319, 895647130}));
    }
}