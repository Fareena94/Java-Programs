package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListDesc {

	public static void main(String args[])
	{
		ArrayList list=new ArrayList<>();

		list.add(23);
		list.add(34);
		list.add(12);
		list.add(64);

	Iterator i=list.iterator();
	System.out.println("the elements of list are:");
	while(i.hasNext())
	{
		System.out.println(i.next());

	}

	Comparator cmp=Collections.reverseOrder();
	Collections.sort(list,cmp);

	Iterator i2=list.iterator();
	System.out.println("the elements of Sorted list are:");
	while(i2.hasNext())
	{
		System.out.println(i2.next());

	}
	}
}
