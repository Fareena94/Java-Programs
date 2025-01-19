package org.example;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int count = 0;
        for(int i=1; i<=number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println(number + " is a prime number");
        }
        else
            System.out.println(number + " is a not prime number");
    }

}
