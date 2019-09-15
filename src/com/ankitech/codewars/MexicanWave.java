/*
Task
In this simple Kata your task is to create a function that turns a string into a Mexican Wave. You will be passed a string and you must return that string in an array where an uppercase letter is a person standing up.
Rules
1.  The input string will always be lower case but maybe empty.
2.  If the character in the string is whitespace then pass over it as if it was an empty seat.
Example
wave("hello") => []string{"Hello", "hEllo", "heLlo", "helLo", "hellO"}

http://www.codewars.com/kata/58f5c63f1e26ecda7e000029/train/java
*/

package com.ankitech.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class MexicanWave {

    static String[] wave(String crowd) {

        if(crowd.equals("")){
            return new String[] {};
        }

        List<String> strings = new ArrayList<>();
        char[] charArray = crowd.toCharArray();

        for (int i = 0; i < crowd.length(); i++) {
            charArray[i] = Character.toUpperCase(charArray[i]);
            strings.add(new String(charArray));
            charArray[i] = Character.toLowerCase(charArray[i]);
        }

        strings = strings.stream().filter(s -> !s.equals(crowd)).collect(Collectors.toList());

        Object[] objects = strings.toArray();
        return Arrays.copyOf(objects,
                objects.length,
                String[].class);
    }
}
