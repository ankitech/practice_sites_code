/*
http://www.codewars.com/kata/54b42f9314d9229fd6000d9c/train/java

The goal of this exercise is to convert a string to a new string where each character in the new string is "("
if that character appears only once in the original string, or ")" if that character appears more than once in
the original string. Ignore capitalization when determining if a character is a duplicate.

    Examples
    "din"      =>  "((("
    "recede"   =>  "()()()"
    "Success"  =>  ")())())"
    "(( @"     =>  "))(("

    Notes
    Assertion messages may be unclear about what they display in some languages.
    If you read "...It Should encode XXX", the "XXX" is the expected result, not the input!
*/

package com.ankitech.codewars;

import java.util.HashMap;
import java.util.Map;

class DuplicateEncoder {
    static String encode(String word){
        char[] charaters = word.toLowerCase().toCharArray();
        Map<Character, Character> charMap = new HashMap<>();
        for (char c : charaters) {
            if(charMap.get(c) != null)
            {
                charMap.put(c, ')');
            } else {
                charMap.put(c, '(');
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : charaters) {
            stringBuilder.append(charMap.get(c));
        }
        return stringBuilder.toString();
    }
}