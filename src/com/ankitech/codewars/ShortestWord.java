/*
Simple, given a string of words, return the length of the shortest word(s).
String will never be empty and you do not need to account for different data types.
*/

package com.ankitech.codewars;

class ShortestWord {

    static int findShort(String s) {

        int smallestLength;
        String[] words = s.split(" ");
        smallestLength = words[0].length();
        for (String word : words) {
            if(word.length() < smallestLength) {
                smallestLength = word.length();
            }
        }
        return smallestLength;
    }
}
