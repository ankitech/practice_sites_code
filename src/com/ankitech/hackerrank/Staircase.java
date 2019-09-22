/*
Consider a staircase of size :

   #
  ##
 ###
####
Observe that its base and height are both equal to , and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size .

Function Description

Complete the staircase function in the editor below. It should print a staircase as described above.

staircase has the following parameter(s):

n: an integer

Print a staircase of size  using # symbols and spaces.

Note: The last line must have  spaces in it.

Sample Input

6
Sample Output

     #
    ##
   ###
  ####
 #####
######
Explanation

The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of .

https://www.hackerrank.com/challenges/staircase/problem
*/

package com.ankitech.hackerrank;

import java.util.ArrayList;
import java.util.List;

class Staircase {

    static void staircase(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String sb = new String(new char[n - (i + 1)]).replace("\0", " ") +
                    new String(new char[i + 1]).replace("\0", "#");
            result.add(sb);
        }
        result.forEach(System.out::println);
    }
}
