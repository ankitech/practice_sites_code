package com.ankitech.codewars;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
    static String encode(String word){
        char[] charaters = word.toLowerCase().toCharArray();
        Map<Character, Character> charMap = new HashMap<Character, Character>();
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