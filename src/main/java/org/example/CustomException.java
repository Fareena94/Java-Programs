package org.example;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

class EmptyQueueException extends Exception{
    public EmptyQueueException(String message){
        super(message);
    }
}
public class CustomException{
    public static void main(String[] args) {
        String name="Fareena Syed Far";
        String word=name.trim();
        System.out.println(word);
        Queue<String> queue=new PriorityQueue<>();
        queue.add("Apple");
        queue.add("Ball");
        queue.add("Cat");
        queue.add("Dog");
        queue.add("Elephant");

        Iterator<String> itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(queue.peek());
        System.out.println(queue.element());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);


        Queue<String> queue1=new PriorityQueue<>();
        try {
            if (queue1.isEmpty())
                throw new EmptyQueueException("Queue is empty add elements to it");
        }
        catch (EmptyQueueException e){
            System.out.println("Queue is empty"+e.getMessage());
        }
//        try {
//            queue1.remove();
//        }
//        catch(NoSuchElementException e){
//            System.out.println("queue1 is empty"+e.getMessage());
//        }
    }

}



