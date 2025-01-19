package org.example;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int count = sc1.nextInt();
        int num1=0;
        int num2=1;
        int sum = 0;
        System.out.println(num1);
        System.out.println(num2);
        for(int i=2; i<count; i++)
        {
            sum=num1+num2;
            num1=num2;
            num2=sum;

            System.out.println(sum);
        }

    }
}
