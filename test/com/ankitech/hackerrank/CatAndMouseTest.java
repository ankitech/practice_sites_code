package com.ankitech.hackerrank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatAndMouseTest {

    @Test
    public void test1() {
        assertEquals("Cat B", CatAndMouse.catAndMouse(1,2,3));
    }
    @Test
    public void test2() {
        assertEquals("Mouse C", CatAndMouse.catAndMouse(1,3,2));
    }
    @Test
    public void test3() {
        assertEquals("Cat A", CatAndMouse.catAndMouse(2,1,3));
    }
}