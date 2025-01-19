package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Swap2Numbers {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int temp ;
        System.out.println("Before swap: ");
        System.out.println("number1: "+number1 );
        System.out.println("number2 :"+ number2);
//        temp = number1;
//        number1= number2;
//        number2= temp;
        System.out.println("After swap: ");
        System.out.println("number1: "+number1 );
        System.out.println("number2 :"+ number2);

        //without temp
        number1= number1+number2;
        number2=number1-number2;
        number1 = number1-number2;
        System.out.println("After swap: ");
        System.out.println("number1: "+number1 );
        System.out.println("number2 :"+ number2);

    }
}
