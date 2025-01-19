package org.example;

import java.util.PriorityQueue;

public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<Integer> queue=new PriorityQueue<Integer>();//Prioity Queue sorts the queue in ascending order
//peeking - obtaining the head of queue
//polling - remove head of the queue
for(int i=10;i>0;i--)
{
	queue.add(i);
	System.out.println(i);
}
System.out.println("queue size is:"+queue.size());
System.out.println("head of queue"+queue.peek());
System.out.println("the header removed is"+queue.poll());
System.out.println("queue size after poll is:"+queue.size());
System.out.println("the new head of queue is:"+queue.peek());
		System.out.println(queue.element());
	}

}
