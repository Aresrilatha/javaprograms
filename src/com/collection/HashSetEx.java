package com.collection;

import java.util.HashSet;

public class HashSetEx {
	public static void main(String args[]) {
		HashSet<String> s1 = new HashSet<String>();
		s1.add("Hello 1");
		s1.add("Hello 2");
		s1.add("Hello 3");
		s1.add("Hello 4");
		s1.add("Hello 5");
		
		HashSet<String> s2 = new HashSet<String>();
		s2.add("Hello 4");
		s2.add("Hello 6");
		s2.add("Hello 7");
		s2.add("Hello 8");
		s2.add("Hello 9");
		
		HashSet<String> s3 = new HashSet<String>();
		s3.addAll(s1);
		s3.addAll(s2);
		
		System.out.println(s1+"\n");
		System.out.println(s2+"\n");
		System.out.println(s3+"\n");
		
		System.out.println(s3.contains("Hello 4"));
		System.out.println(s3.containsAll(s1));
		System.out.println(s3.equals(s2));
		System.out.println(s3.remove("Hello 2"));
		System.out.println(s3.size());
		System.out.println(s3.removeAll(s2));
		
		System.out.println("\n"+s3+"\n");
		
		}
		
	}
