package com.ankitech.codewars;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Troll {

    static String disemvowel(String str) {

        StringBuilder sb = new StringBuilder();
        Stream<Character> characterStream = str.chars().mapToObj(c -> (char) c);
        List<Character> cleanedString =  characterStream.filter(character -> !isVowel(character)).collect(Collectors.toList());
        cleanedString.forEach(sb::append);
        return sb.toString();
    }

    private static boolean isVowel(int value) {
        return value == 'a' ||
                value == 'e' ||
                value == 'i' ||
                value == 'o' ||
                value == 'u' ||
                value == 'A' ||
                value == 'E' ||
                value == 'I' ||
                value == 'O' ||
                value == 'U';
    }
}
