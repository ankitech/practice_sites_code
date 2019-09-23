package com.ankitech.hackerrank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlatlandSpaceStationTest {

    @Test
    public void test1() {
        assertEquals(0,FlatlandSpaceStation.flatlandSpaceStations(6,new int[]{0,1,2,3,4,5}));
    }

    @Test
    public void test2() {
        assertEquals(2,FlatlandSpaceStation.flatlandSpaceStations(5,new int[]{0,4}));
    }
}