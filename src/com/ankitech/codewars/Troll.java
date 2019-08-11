/*
Trolls are attacking your comment section!
A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
Your task is to write a function that takes a string and return a new string with all vowels removed.

For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

Note: for this kata y isn't considered a vowel.
*/

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
