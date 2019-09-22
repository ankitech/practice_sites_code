/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:

1 2 3
4 5 6
9 8 9
The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .

Function description

Complete the  function in the editor below. It must return an integer representing the absolute diagonal difference.

diagonalDifference takes the following parameter:

arr: an array of integers .
Sample Input

3
11 2 4
4 5 6
10 8 -12
Sample Output
15

Explanation
The primary diagonal is:

11
   5
     -12
Sum across the primary diagonal: 11 + 5 - 12 = 4
The secondary diagonal is:

     4
   5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19
Difference: |4 - 19| = 15

Note: |x| is the absolute value of x

https://www.hackerrank.com/challenges/diagonal-difference/problem

*/

package com.ankitech.hackerrank.test;

import com.ankitech.hackerrank.src.DiagonalDifference;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DiagonalDifferenceTest {

    @Test
    public void calculateDifference() {

        List<List<Integer>> arr1 = Arrays.asList(
                Arrays.asList(11,2,4),
                Arrays.asList(4,5,6),
                Arrays.asList(10,8,-12));


        List<List<Integer>> arr2 = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(9,8,9));

        assertEquals(15, DiagonalDifference.calculateDifference(arr1));
        assertEquals(2, DiagonalDifference.calculateDifference(arr2));
    }
}