package com.ankitech.hackerrank.test;

import com.ankitech.hackerrank.src.PlusMinus;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PlusMinusTest {

    @Test
    public void test1() {
        double[] expectedResult = {0.400000f, 0.400000f, 0.200000f};
        double[] result = PlusMinus.plusMinus(new int[]{1, 1, 0, -1, -1});
        assertArrayEquals(expectedResult,result,0.000001f);
    }

    @Test
    public void test2() {
        double[] expectedResult = {0.500000f, 0.333333f, 0.166667f};
        double[] result = PlusMinus.plusMinus(new int[]{-4, 3, -9, 0, 4, 1});
        assertArrayEquals(expectedResult,result,0.000001f);
    }

}