/*
ohn works at a clothing store. He has a large pile of socks that he must pair by color for sale.
Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

Sample Input
10 20 20 10 10 30 50 10 20
Sample Output
3
https://www.hackerrank.com/challenges/sock-merchant/problem
*/

package com.ankitech.hackerrank.src;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {
    public static int countSock(int[] arr) {
        Map<Integer, Integer> socks = new HashMap<>();
        int pairs = 0;
        for (int color : arr) {
            socks.merge(color, 1, Integer::sum);
        }
        for (Map.Entry<Integer, Integer> entry : socks.entrySet()) {
            pairs+= entry.getValue()/2;
        }
        return pairs;
    }
}
