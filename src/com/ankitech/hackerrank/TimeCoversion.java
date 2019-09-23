/*
Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

Function Description

Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

s: a string representing time in  hour format
Input Format

A single string  containing a time in -hour clock format (i.e.:  or ), where  and .

Constraints

All input times are valid
Output Format

Convert and print the given time in -hour format, where .

Sample Input 0

07:05:45PM
Sample Output 0

19:05:45

https://www.hackerrank.com/challenges/time-conversion/problem
*/

package com.ankitech.hackerrank;

class TimeCoversion {

    static String timeConversion(String s) {
        boolean isAM = s.contains("AM");
        String[] splitTime = s.substring(0,s.length()-2).split(":");
        if(isAM){
            if(splitTime[0].equals("12")){
                splitTime[0] = "00";
            }
            return String.join(":",splitTime);
        }else{
            if(!splitTime[0].equals("12")){
                splitTime[0] = ""+(Integer.parseInt(splitTime[0]) + 12);
            }
            return String.join(":",splitTime);
        }
    }
}
