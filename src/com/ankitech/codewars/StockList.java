/*
A bookseller has lots of books classified in 26 categories labeled A, B, ... Z. Each book has a code c of 3, 4, 5 or more capitals letters. The 1st letter of a code is the capital letter of the book category. In the bookseller's stocklist each code c is followed by a space and by a positive integer n (int n >= 0) which indicates the quantity of books of this code in stock.

For example an extract of one of the stocklists could be:

L = {"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"}.
or

L = ["ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"] or ....
You will be given a stocklist (e.g. : L) and a list of categories in capital letters e.g :

M = {"A", "B", "C", "W"}
or

M = ["A", "B", "C", "W"] or ...
and your task is to find all the books of L with codes belonging to each category of M and to sum their quantity according to each category.

For the lists L and M of example you have to return the string (in Haskell/Clojure/Racket a list of pairs):

(A : 20) - (B : 114) - (C : 50) - (W : 0)
where A, B, C, W are the categories, 20 is the sum of the unique book of category A, 114 the sum corresponding to "BKWRK" and "BTSQZ", 50 corresponding to "CDXEF" and 0 to category 'W' since there are no code beginning with W.

If L or M are empty return string is "" (Clojure and Racket should return an empty array/list instead).

http://www.codewars.com/kata/54dc6f5a224c26032800005c/train/java
*/

package com.ankitech.codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

class StockList {


    // 1st parameter is the stocklist (L in example),
    // 2nd parameter is list of categories (M in example)
    static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {

        if(lstOfArt.length == 0 || lstOf1stLetter.length == 0){
            return "";
        }

        HashMap<String,Integer> listOfStocks = new HashMap<>();
        StringBuilder summery = new StringBuilder();
        List<String> artList = Arrays.stream(lstOfArt).collect(Collectors.toList());

        List<String[]> collect = artList
                .stream()
                .map(art -> art.split(" "))
                .collect(Collectors.toList());

        collect.forEach(strings -> {
            Integer bookCount = listOfStocks.get(strings[0].substring(0, 1));
            if(bookCount == null ){
                listOfStocks.put(strings[0].substring(0, 1), Integer.parseInt(strings[1]));
            }else {
                listOfStocks.put(strings[0].substring(0, 1), bookCount + Integer.parseInt(strings[1]));
            }
        });

        for (String letter: lstOf1stLetter) {
            summery
                    .append("(")
                    .append(letter)
                    .append(" : ")
                    .append(listOfStocks.getOrDefault(letter, 0))
                    .append(") - ");
        }

        if (!summery.toString().equals("")){
            return summery.substring(0,summery.length()-3);
        }

        return summery.toString();
    }
}
