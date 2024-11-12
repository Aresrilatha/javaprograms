package com.collection;

import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String args[]) {
		LinkedList<Integer> lst1 = new LinkedList<>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);
		lst1.add(5);
		lst1.add(6);
		lst1.add(7);
		lst1.add(8);
		lst1.add(9);
		lst1.add(10);
		lst1.add(11);
		lst1.add(12);
		lst1.add(13);
		lst1.add(5);
		lst1.add(8);
		System.out.println(lst1+"\n");
		
		System.out.println(lst1.contains(4));
		System.out.println(lst1.lastIndexOf(5));
		System.out.println(lst1.offer(18)); // adds the element at the end 
		System.out.println(lst1.indexOf(7));
		System.out.println(lst1.remove(0)); // removed element at particular index
		System.out.println(lst1.removeFirstOccurrence(5));
		System.out.println(lst1.get(6));
		System.out.println(lst1.size());
		System.out.println(lst1.set(3, 15));
		System.out.println(lst1.element());// returns the  head element
		
		//OR
		System.out.println("\n\n");
		for(int i=0;i<lst1.size();i++) {
			System.out.println(lst1.get(i));
		}
	}
}
