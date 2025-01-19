package org.example;

import io.cucumber.java.sl.In;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);

        // Using forEach
        map.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });

        for(Map.Entry<String, Integer> entry : map.entrySet())
        {
            System.out.println("entryset");
            System.out.println("key : "+entry.getKey() +" value : "+ entry.getValue());
        }

        for(String key: map.keySet()){
            System.out.println("key : "+key +" value : "+ map.get(key));
        }

        for(int val: map.values()){
            System.out.println("key : "+val +" value : "+ map.get(val));
            for(Map.Entry<String,Integer> entry : map.entrySet()){
                if(entry.getValue().equals(val)){
                    System.out.println("key: "+entry.getKey() + "value: "+val);
                }
            }
        }

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("key :"+ entry.getKey() +" value: "+entry.getValue());
        }
    }
}
