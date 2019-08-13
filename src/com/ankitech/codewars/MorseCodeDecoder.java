/*
voice and digital data communication channels, it still has its use in some applications around the world.
The Morse code encodes every character as a sequence of "dots" and "dashes". For example, the letter A is coded as ·−,
letter Q is coded as −−·−, and digit 1 is coded as ·−−−−. The Morse code is case-insensitive, traditionally capital
letters are used. When the message is written in Morse code, a single space is used to separate the character codes
and 3 spaces are used to separate words. For example, the message HEY JUDE in Morse code is ···· · −·−−   ·−−− ··− −·· ·.

NOTE: Extra spaces before or after the code have no meaning and should be ignored.

Your task is to implement a function that would take the morse code as input and return a decoded human-readable string.

For example:
MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. .")
//should return "HEY JUDE"

All the test strings would contain valid Morse code, so you may skip checking for errors and exceptions.
Good luck!
*/

package com.ankitech.codewars;

import java.util.HashMap;
import java.util.Map;

class MorseCodeDecoder {

    private static Map<String, Character> MorseCode = new HashMap<>();

    static  {
        MorseCode.put(".-", 'A');
        MorseCode.put("-...", 'B');
        MorseCode.put("-.-.", 'C');
        MorseCode.put("-..", 'D');
        MorseCode.put(".", 'E');
        MorseCode.put("..-.", 'F');
        MorseCode.put("--.", 'G');
        MorseCode.put("....", 'H');
        MorseCode.put("..", 'I');
        MorseCode.put(".---", 'J');
        MorseCode.put("-.-", 'K');
        MorseCode.put(".-..", 'L');
        MorseCode.put("--", 'M');
        MorseCode.put("-.", 'N');
        MorseCode.put("---", 'O');
        MorseCode.put(".--.", 'P');
        MorseCode.put("--.-", 'Q');
        MorseCode.put(".-.", 'R');
        MorseCode.put("...", 'S');
        MorseCode.put("-", 'T');
        MorseCode.put("..-", 'U');
        MorseCode.put("...-", 'V');
        MorseCode.put(".--", 'W');
        MorseCode.put("-..-", 'X');
        MorseCode.put("-.--", 'Y');
        MorseCode.put("--..", 'Z');
        MorseCode.put("-----", '0');
        MorseCode.put(".----", '1');
        MorseCode.put("..---", '2');
        MorseCode.put("...--", '3');
        MorseCode.put("....-", '4');
        MorseCode.put(".....", '5');
        MorseCode.put("-....", '6');
        MorseCode.put("--...", '7');
        MorseCode.put("---..", '8');
        MorseCode.put("----.", '9');
    }

    static String decode(String morseCode) {
        StringBuilder sb = new StringBuilder();
        for (String word : morseCode.trim().split(" {3}")) {
            sb.append(decodeMorseWord(word));
            sb.append(" ");
        }
        return sb.toString().substring(0,sb.toString().length()-1);
    }

    private static String decodeMorseWord(String word) {

        StringBuilder sb =  new StringBuilder();
        for (String letter : word.split(" ")) {
            sb.append(MorseCode.get(letter));
        }
        return sb.toString();
    }
}
