package org.example;

public class ContinueAndBreak {
    public static void main(String[] args) {
        for(int i = 0; i<10; i++)
        {
            if(i==7)
            {
                break;
            }
            System.out.println("HI" +i);
        }
        for(int j=0; j<10;j++)
        {
            if(j==4)
            {
                continue;
            }
            System.out.println("Hello"+j);
        }
    }
}
