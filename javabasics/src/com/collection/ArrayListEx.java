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
		
		ArrayList<String> lst1 = new ArrayList<>();
		lst1.add("Hello 7");
		lst1.add("Hello 8");
		lst1.add("Hello 9");
		lst1.add("Hello 10");
		lst1.add("Hello 11");
		lst1.add("Hello 12");
		lst1.add("Hello 13");
		
		lst.remove(5);
		lst.add(3, "hari");
		lst.set(2,"ravi");
		System.out.println(lst);
		System.out.println(lst1);
		System.out.println(lst.get(7));
		System.out.println(lst.hashCode());
		System.out.println(lst.contains("hari"));
		System.out.println(lst.equals(lst1));
		System.out.println(lst.lastIndexOf("Hello 4"));
		System.out.println(lst.remove("Hello 3"));
		System.out.println(lst.size());
		//lst.add(45);
		
		System.out.println("\n\n");
		//or
		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i));
		}
	}

}
