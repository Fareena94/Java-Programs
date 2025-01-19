package org.example;

import io.cucumber.java.bs.A;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIteration {
    public static void main(String[] args) {
//        ArrayList arr =new ArrayList();
//        arr.add("Fareena");
//        arr.add("Maanya");
//        arr.add("Maanvi");
//        arr.add("Moksha");
//        System.out.println("using for loop");
//        for(int i = 0; i<arr.size(); i++)
//        {
//            System.out.println(arr.get(i));
//        }
//        System.out.println("using while");
//        Iterator itr = arr.iterator();
//        while(itr.hasNext())
//        {
//            System.out.println(itr.next());
//        }
//        System.out.println("Using enhanced for loop");
//        for(Object a:arr){
//            System.out.println(a);
 //       }
        int[] arr ={1,3,5,6,7};
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}


