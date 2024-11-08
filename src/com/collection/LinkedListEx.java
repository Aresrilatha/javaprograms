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
		System.out.println(lst1);
		
		//OR
		
		for(int i=0;i<lst1.size();i++) {
			System.out.println(lst1.get(i));
		}
	}
}
