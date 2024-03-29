package com.ankitech.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StockListTest {

    @Test
    public void test1() {
        String[] art = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String[] cd = new String[] {"A", "B", "W"};
        assertEquals("(A : 200) - (B : 1140) - (W : 0)",
                StockList.stockSummary(art, cd));
    }
}