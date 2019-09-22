/*
An array is a type of data structure that stores elements of the same type in a contiguous block of memory.
In an array,A , of size N, each memory location has some unique index,  (where ), that can be referenced as (you may also see it written as ).
Given an array, , of  integers, print each element in reverse order as a single line of space-separated integers.

https://www.hackerrank.com/challenges/arrays-ds/problem

*/
package com.ankitech.hackerrank;

import java.util.ArrayList;
import java.util.List;

class ReverseArray {

    static int[] reverese(int[] a){
        List<Integer> reverseArr = new ArrayList<>();
        for (int i = a.length - 1; i >= 0; i--) {
            reverseArr.add(a[i]);
        }
        return reverseArr.stream().mapToInt(i->i).toArray();
    }
}
