package com.developer.kulloveth.codewarproblems;

public class PangramChecker {
    public static boolean check(String sentence) {
        return sentence.length() - sentence.toLowerCase().replaceAll("[a-z]", "").length() > 25;
    }

    public static void main(String[] args) {
        System.out.println(check("its alright okay"));
    }
}
