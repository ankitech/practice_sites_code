/*
Write a function that takes a string of braces, and determines if the order of the braces is valid. It should return true if the string is valid, and false if it's invalid.

This Kata is similar to the Valid Parentheses Kata, but introduces new characters: brackets [], and curly braces {}. Thanks to @arnedag for the idea!

All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.

What is considered Valid?
A string of braces is considered valid if all braces are matched with the correct brace.

Examples
"(){}[]"   =>  True
"([{}])"   =>  True
"(}"       =>  False
"[(])"     =>  False
"[({})](]" =>  False

http://www.codewars.com/kata/5277c8a221e209d3f6000b56/train/java
*/
package com.ankitech.codewars;

import java.util.HashMap;
import java.util.Stack;

class BraceChecker {

    boolean isValid(String braces) {
        if(braces.length()%2 != 0){
            return false;
        }
        Stack<Character> characterStack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        for (char c : braces.toCharArray()) {
            if(c == '(' || c == '[' || c == '{'){
                characterStack.push(c);
            }else
            if(!characterStack.isEmpty()){
                Character temp = characterStack.pop();
                if(! (map.containsKey(c) && temp == map.get(c))){
                    return false;
                }
            }

        }
        return characterStack.isEmpty();
    }
}
