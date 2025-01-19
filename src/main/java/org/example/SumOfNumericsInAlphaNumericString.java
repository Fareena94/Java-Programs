package org.example;

import java.util.Scanner;

public class SumOfNumericsInAlphaNumericString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String alphaNumString =  sc.nextLine();
        char[] ch=alphaNumString.toCharArray();
        int sum=0;
        for(Character cha: ch){
            if(Character.isDigit(cha)){
                sum=sum+Character.getNumericValue(cha);
            }
        }
        System.out.println(sum);
    }
}
