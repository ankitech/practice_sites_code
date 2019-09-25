package com.ankitech.hackerrank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectronicShopTest {

    @Test
    public void test1() {
        assertEquals(9,ElectronicShop.getMoneySpent(new int[]{3,1},new int[]{5,2,8},10));
    }

    @Test
    public void test2() {
        assertEquals(-1,ElectronicShop.getMoneySpent(new int[]{4},new int[]{5},5));
    }
}