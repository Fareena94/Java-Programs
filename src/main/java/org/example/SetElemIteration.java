package org.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetElemIteration {
    public static void main(String[] args) {
        Set friends = new HashSet();
        friends.add("Fareena");
        friends.add("Jyo");
        friends.add("Cals");

        System.out.println("Using enhanced for loop");
        for(Object dost :friends){
            System.out.println(dost);
        }
        System.out.println(friends.toArray());
        System.out.println("using while");
        Iterator itr = friends.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
