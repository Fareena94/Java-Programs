package org.example;

import java.util.*;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string1 = sc.nextLine();

        String string = string1.trim();
        char[] ch = string.toCharArray();
        int size=ch.length;
        int count;
        System.out.println("Duplicate characters in a given string: ");
//        for(int i=0;i< size; i++){
//            count =1;
//            for(int j= i+1; j<size; j++){
//                if(ch[i]==ch[j])
//                {
//                    count++;
//                    ch[j]  = '0';
//                }
//            }
//            if(count>1 && ch[i]!='0'){
//                System.out.println(ch[i]);
//            }
//        }

        Map<Character, Integer> duplicateCharMap = new HashMap<>();
        for( Character cha : ch) {
            if (Character.isAlphabetic(cha)) {
                if (duplicateCharMap.containsKey(cha)) {
                    duplicateCharMap.put(cha, duplicateCharMap.getOrDefault(cha,0) + 1);
                } else {
                    duplicateCharMap.put(cha, 1);
                }
            }
        }
        Set< Map.Entry<Character,Integer>> entrySet=duplicateCharMap.entrySet();
        for(Map.Entry<Character,Integer> entry : entrySet)
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
//        duplicateCharMap.entrySet().removeIf(i-> i.getValue()==1){
//            System.out.println(duplicateCharMap);
        }
    }
}
