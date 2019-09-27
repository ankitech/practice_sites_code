/*
Consider the following problem:

Write a short program that prints each number from 1 to 100 on a new line.

For each multiple of 3, print "Fizz" instead of the number.

For each multiple of 5, print "Buzz" instead of the number.

For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
Write a solution (or reduce an existing one) so it has as few characters as possible.

https://www.hackerrank.com/challenges/fizzbuzz/problem
*/

package com.ankitech.hackerrank;

import java.util.ArrayList;
import java.util.List;

class FizzBuzz {

    static List<String> generate(int n){

        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if(!(i%3==0||i%5==0))result.add(String.valueOf(i));
            else result.add((i % 3 == 0 ? "Fizz" : "") + (i % 5 == 0 ? "Buzz" : ""));
        }
        return result;
    }
}
