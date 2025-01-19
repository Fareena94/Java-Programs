package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCountInSentence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String sen= sc.nextLine();
        String[] word = sen.split(""); // sen.split("");
        int size = word.length;
        System.out.println(size);
        int count = 0;
        System.out.println("word count : " +count);
        Map<String,Integer> map = new HashMap<>();
        for(int i=0; i<size; i++)
        {
            if(map.containsKey(word[i]))
            {
                count = map.get(word[i]);
                map.put(word[i],count+1);
            }

            else
                map.put(word[i],1);
        }
        System.out.println(map);

    }

}
