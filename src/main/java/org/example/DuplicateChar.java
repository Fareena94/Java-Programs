package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String words = word.trim();
        char[] letter = words.toCharArray() ;
        Arrays.sort(letter);
        int size = words.length();
        int count=0;
        System.out.println(size);
        for(int i=0; i<size-1; i++)
        {
            if(letter[i]==letter[i+1] )
            {
                System.out.print(letter[i]);
            }
                while(i<size-1 && letter[i]==letter[i+1])
                    i++;
        }


        //**********using nested loops
//        Scanner sc= new Scanner(System.in);
//        String passage = sc.nextLine();
//        String word = passage.trim();
//        char[] ch = word.toCharArray();
//        int size = ch.length;
//        int count =0;
//
//        for(int i=0 ;i<size; i++) {
////            if()
//            for (int j = i + 1; j < size; j++) {
//                if (ch[i] == ch[j]) {
//                    System.out.println(ch[j]);
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
    }
}
