package com.ankitech.hackerrank;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReverseArrayTest {

    @Test
    public void reverese() {
        int[] arr = {1,4,3,2};
        int[] expectedArray = {2,3,4,1};
        assertArrayEquals(expectedArray, ReverseArray.reverese(arr));
    }
}