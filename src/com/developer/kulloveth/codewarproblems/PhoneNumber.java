package com.developer.kulloveth.codewarproblems;


//Write a function that accepts an array of 10
//        integers (between 0 and 9),
//        that returns a string of those numbers in the form of a phone number.
public class PhoneNumber {

    public static String createPhoneNo(int [] numbers){
        StringBuilder buildNo = new StringBuilder();
        for (int number : numbers) {
            buildNo.append(number);
        }

        String phoneNo = buildNo.toString();
        String countryCode = phoneNo.substring(0,3);
        String firstThree = phoneNo.substring(3,6);
        String last = phoneNo.substring(6,10);
   return "(" + countryCode + ") " + firstThree + "-" + last;
    }

    public static void main(String [] args){
        System.out.println(createPhoneNo(new int []{0,1,2,3,4,5,6,7,8,9}));
    }
}
