package com.ankitech.hackerrank;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LeftRotationTest {

    @Test
    public void leftRotate() {
        int[] arr = {1,2,3,4,5};
        int[] expectedArr = {5,1,2,3,4};
        assertArrayEquals(expectedArr, LeftRotation.leftRotate(arr, 4));
    }
}