package com.developer.kulloveth.codewarproblems;

public class NextPerfectSquare {



    public static long findNextSquare(long sq){
        long firstRoot;
        long nextRoot;
        if(Math.sqrt(sq)%1 ==0){
            firstRoot=(long)Math.sqrt(sq);
            nextRoot=firstRoot+1;
        }else{
            return -1;
        }
        return nextRoot * nextRoot;
    }

    public static void main (String[]args){
    System.out.println(findNextSquare(16));
    }
}
