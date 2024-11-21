package com.collection;

import java.util.HashMap;

public class HashMapEx {
	public static void main(String args[]) {
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "Ravi");
		m.put(5, "Hari");
		m.put(20, "Ram");
		m.put(30, "Seetha");
		m.put(15, "Krishna");
		System.out.println(m+"\n");
		
		System.out.println(m.get(5));
		System.out.println(m.containsKey(20));
		System.out.println(m.containsValue("Ram"));
		System.out.println(m.remove(1));
		System.out.println(m.replace(15, "Hanuman"));
		System.out.println(m.size());
		System.out.println(m.keySet()); // keys are arranged in the form of set
		System.out.println(m.values());
		
		System.out.println("\n"+m);
		
	}
}
