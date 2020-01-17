package com.developer.kulloveth.codewarproblems;

public class NextPerfectSquare {



    public static long findNextSquare(long sq){
        long root1;
        long nextroot;
        if(Math.sqrt(sq)%1 ==0){
            root1=(long)Math.sqrt(sq);
            nextroot=root1+1;
        }else{
            return -1;
        }
        return nextroot * nextroot;
    }

    public static void main (String[]args){
    System.out.println(findNextSquare(9));
    }
}
