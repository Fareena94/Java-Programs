package org.example;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
//        //***String
        String passage = sc.nextLine();
        String word = passage.trim();
        String rev = "";
        for(int i = word.length()-1; i>=0; i--)
        {
            rev = rev+word.charAt(i);
        }
        System.out.println(rev);
        if(rev.equals(word))
        {
            System.out.println(word + " is Palindrome");
        }
        else
            System.out.println(word+" is not a palindrome");

//        Scanner sc1 = new Scanner(System.in);
//        int num = sc1.nextInt();
//        int mirror = 0;
//        int origNum = num;
//        while(num>0)
//        {
//            mirror = mirror*10 +num%10;
//            num = num/10;
//        }
  //      if(origNum == mirror)
//        {
//            System.out.println(origNum+ " is mirror number");
//        }
//        else
//            System.out.println(origNum+ " is not mirror number");
//
//        String s1= new String("sam");
//        String s2= new String("sam");
//        if(s1 != s2)
//        {
//            System.out.println("true");
//        }
//        String number = Integer.toString(num);
//        System.out.println(number.getClass());
//        String reverse = new StringBuilder(number).reverse().toString();
//        System.out.println(reverse.getClass());
//        if(number.equals(reverse) )
//        {
//            System.out.println(number+ " is mirror number");
//        }
//        else
//            System.out.println(number+ " is not mirror number");

//        String scb = new StringBuilder(word).reverse().toString();
//        if (scb.equals(word))
//        {
//            System.out.println("palindrome");
//        }
//        else
//            System.out.println("not palindrome");
    }
}