package com.ankitech.hackerrank;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TripletTest {

    @Test
    public void compareTriplets() {

        assertEquals(Arrays.asList(2,1), Triplet.compareTriplets(Arrays.asList(17,28,30),Arrays.asList(99,16,8)));
        assertEquals(Arrays.asList(1,1),Triplet.compareTriplets(Arrays.asList(5,6,7),Arrays.asList(3,6,10)));

    }
}