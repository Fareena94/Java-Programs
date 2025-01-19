package org.example;


public class IterationStmts {
    public static void main(String[] args) {
            int age=10;

            while(age<=15)
            {
                System.out.println("he/she is minor");
                age++;
            }
        for(int i=0; i<10; i++)
        {
            System.out.println("it is for loop");
        }

        do {
            System.out.println("he/she is minor");
            age++;
        }
        while(age>19);
    }

}
