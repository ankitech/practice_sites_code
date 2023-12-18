package com.ankitech.leetcode;

import junit.framework.TestCase;

public class MergeSortedArrayTest extends TestCase {

    public void testMerge() {
        MergeSortedArray.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
    }
}