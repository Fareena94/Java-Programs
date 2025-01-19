package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String passage = sc.nextLine();
        String word = passage.trim();
        char currChar;
        Set<Character> sets = new HashSet<>();
        for(int i=0;i<word.length();i++)
        {
            currChar = word.charAt(i);
            if(!sets.contains(currChar))
            {
                sets.add(currChar);
            }
        }
        System.out.println("Unique chars are: ");
        for(char ch : sets)
        {
            System.out.println(ch);
        }
//        int size = word.length();
//        int count = 0;
//        for (int i = 0; i < size; i++) {
//            for (int j = i + 1; j < size; j++) {
//                if (word.charAt(i) == word.charAt(j)) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//                System.out.println(word.charAt(i));
//            }
//        }
    }
}
