package com.developer.kulloveth.codewarproblems;

public class ReverseString {

    public static String solution(String str) {
        // Your code here...
        StringBuilder reverse= new StringBuilder();
        for(int i = str.length()-1; i>=0; i--)
            reverse.append(str.charAt(i));

        return reverse.toString();
    }

    public static void main(String[]args){
        System.out.println(solution("programming"));
    }
}
