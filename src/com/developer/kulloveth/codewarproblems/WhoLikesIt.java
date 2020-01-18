package com.developer.kulloveth.codewarproblems;

public class WhoLikesIt {


    public static void  main(String [] args){
 System.out.println(whoLikesIt());
    }
    public static String whoLikesIt(String... names) {
        //Do your magic here

        String name [] = names;
        String result ="";
        switch (name.length){
            case 0:
                result = "no one likes this";
                break;
            case 1 :
                result = name[0] +" likes this";
                break;
            case 2 :
                result = name[0] + " and "+ name[1] +" like this";
                break;
            case 3 :
                result = name[0] + ", "+ name[1] + " and "+ name[2] +" like this";
                break;

            case  4 :
            default:
                int sub2 =  name.length - 2;
                result = name[0] + ", "+ name[1] + " and "+ sub2 +" others like this";
                break;
        }
        return result;
    }
}
