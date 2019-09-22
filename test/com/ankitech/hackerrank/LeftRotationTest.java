package com.ankitech.hackerrank;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class LeftRotationTest {

    @Test
    public void leftRotate() {
        int[] arr = {1,2,3,4,5};
        int[] expectedArr = {5,1,2,3,4};
        assertArrayEquals(expectedArr, LeftRotation.leftRotate(arr, 4));
    }
}