package com.developer.kulloveth.codewarproblems;

public class Multiples {


    public static int solution(int number) {

        int i = 1,sum = 0;

        while(i<number){
            if(i%3 == 0 || i%5==0){
                sum += i;
            }
            i++;
        }
        return sum;
    }
    public static void main (String[]args){
        System.out.println("\n"+solution(20));
    }
}
