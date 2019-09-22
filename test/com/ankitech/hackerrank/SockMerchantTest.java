package com.ankitech.hackerrank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SockMerchantTest {

    @Test
    public void sockMerchant() {

        assertEquals(2, SockMerchant.countSock(new int[]{1, 2, 1, 2, 1, 3, 2}));
        assertEquals(3, SockMerchant.countSock(new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
    }
}