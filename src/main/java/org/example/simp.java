package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class simp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String words = text.trim();
        char[] word = words.toCharArray();
        int size = word.length;
        int count = 0;
        Character currCh;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (Character.isAlphabetic(word[i])) {
                currCh = word[i];
                if (map.containsKey(currCh)) {
                    map.put(word[i], count + 1);
                } else {
                    map.put(word[i], 1);
                }
            }
        }
        System.out.println(map);
    }
}
