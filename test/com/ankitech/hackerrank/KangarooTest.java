package com.ankitech.hackerrank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KangarooTest {

    @Test
    public void test1() {
        assertEquals("YES",Kangaroo.kangaroo(0,3,4,2));
    }

    @Test
    public void test2() {
        assertEquals("NO",Kangaroo.kangaroo(0,2,5,3));
    }

    @Test
    public void test3() {
        assertEquals("NO",Kangaroo.kangaroo(45, 7, 56, 2));
    }

    @Test
    public void test4() {
        assertEquals("NO",Kangaroo.kangaroo(43, 2, 70, 2));
    }
}