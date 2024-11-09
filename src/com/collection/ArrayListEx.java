package com.collection;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String args[]) {
		ArrayList<String> lst = new ArrayList<>();
		lst.add("Hello");
		lst.add("Hello 1");
		lst.add("Hello 2");
		lst.add("Hello 3");
		lst.add("Hello 4");
		lst.add("Hello 5");
		lst.add("Hello 6");
		lst.add("Hello 7");
		lst.add("Hello 8");
		lst.add("Hello 9");
		lst.add("Hello 10");
		lst.add("Hello 11");
		lst.add("Hello 12");
		lst.add("Hello 13");
		lst.remove(5);
		lst.add(3, "hari");
		System.out.println(lst.get(7));
		System.out.println(lst.hashCode());
		//lst.add(45);
		System.out.println(lst);
		
		//or
		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i));
		}
	}

}
