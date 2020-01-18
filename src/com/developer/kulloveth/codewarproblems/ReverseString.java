package com.developer.kulloveth.codewarproblems;

public class ReverseString {

    public static String solution(String str) {
        // Your code here...
        String reverse="";
        for(int i = str.length()-1; i>=0; i--)
            reverse =reverse + str.charAt(i);

        return reverse;
    }

    public static void main(String[]args){
        System.out.println(solution("programming"));
    }
}
