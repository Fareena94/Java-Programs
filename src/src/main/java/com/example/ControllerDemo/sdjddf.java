package com.example.ControllerDemo;

import java.lang.reflect.Array;
import java.text.Collator;
import java.util.*;

class Readable{
    public void info(){
        System.out.println("Information");
    }
}

    class EmptyQueueException extends Exception {
        public EmptyQueueException(String message) {
            super(message);
        }
    }
    class Summation{
        int sum =0;
        public void sum(int...i){
            for(int j : i)
                sum = sum+j;
        }
    }

   public class sdjddf {
        public static void main(String[] args){

            Summation sum1=new Summation();
            sum1.sum(1,2,3,4,5,6,7,8,5,10);
            System.out.println(sum1.sum);
//        char[] chars = name.toCharArray();
//        Map<Character, Integer> map = new HashMap<>();
//        for (Character ch : chars) {
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }
//
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            if (entry.getValue() == 1) {
//                System.out.println(entry.getKey());
//            }
//        }
        }
    }