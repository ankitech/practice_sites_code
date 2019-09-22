/*
Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges,
awarding points on a scale from  1 to 100 for three categories: problem clarity, originality, and difficulty.

We define the rating for Alice's challenge to be the triplet , and the rating for Bob's challenge to be the triplet .

Your task is to find their comparison points by comparing  with ,  with , and  with .

If , then Alice is awarded  point.
If , then Bob is awarded  point.
If , then neither person receives a point.
Comparison points is the total points a person earned.

Given  and , determine their respective comparison points.

For example,  and . For elements , Bob is awarded a point because . For the equal elements  and , no points are earned.
Finally, for elements ,  so Alice receives a point. Your return array would be  with Alice's score first and Bob's second.

Function Description

Complete the function compareTriplets in the editor below. It must return an array of two integers,
the first being Alice's score and the second being Bob's.

compareTriplets has the following parameter(s):

a: an array of integers representing Alice's challenge rating
b: an array of integers representing Bob's challenge rating

Sample Input 0

5 6 7
3 6 10
Sample Output 0

1 1

https://www.hackerrank.com/challenges/compare-the-triplets/problem

*/

package com.ankitech.hackerrank;

import java.util.Arrays;
import java.util.List;

class Triplet {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int aliceScore = 0;
        int johnScore = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) > b.get(i)){
                aliceScore++;
            } else if (a.get(i) < b.get(i)){
                johnScore++;
            }
        }
        return Arrays.asList(aliceScore,johnScore);
    }
}
