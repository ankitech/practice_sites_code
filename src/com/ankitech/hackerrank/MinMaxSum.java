/*
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

For example, . Our minimum sum is  and our maximum sum is . We would print

16 24
Function Description

Complete the miniMaxSum function in the editor below. It should print two space-separated integers on one line: the minimum sum and the maximum sum of  of  elements.

miniMaxSum has the following parameter(s):

arr: an array of  integers
Input Format

A single line of five space-separated integers.

Constraints


Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)

Sample Input

1 2 3 4 5
Sample Output

10 14
https://www.hackerrank.com/challenges/mini-max-sum/problem
*/
package com.ankitech.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class MinMaxSum {
    static String miniMaxSum(int[] arr) {
        long[] numbers = Arrays.stream(arr).mapToLong(i -> i).toArray();
        List<List<Long>> allCombinations = getAllCombination(numbers, numbers.length, numbers.length-1);
        List<Long> sumOfAllCombination = allCombinations.stream()
                .map(integers -> integers.stream().reduce(Long.valueOf(0), Long::sum))
                .collect(Collectors.toList());
        System.out.println(sumOfAllCombination.stream().min(Long::compareTo).get()
                + " "+
                sumOfAllCombination.stream().max(Long::compareTo).get());

        return sumOfAllCombination.stream().min(Long::compareTo).get()
                + " "+
                sumOfAllCombination.stream().max(Long::compareTo).get();

    }

    private static void combinationUtil(long[] arr, int n, int r, int index,
                                        long[] data, int i, List<List<Long>> result)
    {
        if (index == r)
        {
            List<Long> temp = new ArrayList<>();
            for (int j=0; j<r; j++) {
                temp.add(data[j]);
            }
            result.add(temp);
            return;
        }
        if (i >= n)
            return;
        data[index] = arr[i];
        combinationUtil(arr, n, r, index+1, data, i+1, result);
        combinationUtil(arr, n, r, index, data, i+1, result);

    }

    private static List<List<Long>> getAllCombination(long[] arr, int n, int r)
    {
        long[] data=new long[r];
        List<List<Long>> result = new ArrayList<>();
        combinationUtil(arr, n, r, 0, data, 0, result);
        return result;
    }
}
