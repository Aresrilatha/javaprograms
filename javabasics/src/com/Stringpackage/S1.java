package com.Stringpackage;

public class S1 {
	public static void main(String args[]) {
		String a="Hello java";
		a="hey";
		a= "Hello world";
		String b="hello World";
		String c= "Gunshoot";
		String d= "Hello";
		String e = "Hello world";
		String f = "World";
		String g = "     hello     java  ";
		String k ="HELLO";
		System.out.println(a.concat(" Welcome")); 
		System.out.println(a);
		System.out.println(a.indexOf(101));// index of e =1;
		System.out.println(a.indexOf("o")); // o starting index is 4;
		System.out.println(a.indexOf(108, 4)); // 108 = l starting from index 4 l is at 9
		System.out.println(a.indexOf('o', 5)); // o starting from index 5 is at position 7
		System.out.println(a.indexOf(10)); // giving specified no of spaces and printing the string
		System.out.println(a.lastIndexOf(108)); // last index of l =9
		System.out.println(a.lastIndexOf('o')); // last index of o =7
		System.out.println(a.lastIndexOf(111, 9)); // last index of o before the specified index
		System.out.println(a.lastIndexOf('e', 4));// last index of e before the specified index
		System.out.println(a.charAt(6));// character at specified index
		System.out.println(a.codePointAt(1)); // returns the ASCII value of char at particular index
		System.out.println(a.codePointBefore(1));// returns the ASCII value of char which is at specified index-1 position
		System.out.println(a.codePointCount(3,7)); // returns the endindex - startindex value
		System.out.println(a.compareTo(c)); // if 2 string are same then 0 or else diffenece between the index position
		System.out.println(a.compareToIgnoreCase(b)); // ignores the case sensitive of 2 strings
		System.out.println(a.contains(d)); // if d contains in a then true or else false
		System.out.println(a.contentEquals(e)); // if both strings are same then returns true
		System.out.println(a.endsWith(f)); // suffix of the string need to be same
		System.out.println(a.equals(b));// checks whether 2 strings are same or not
		System.out.println(a.equalsIgnoreCase(b));// checks whether 2 strings are same or not by ignoring case sensitive
		System.out.println(c.hashCode()); // returns the hashcode of the particular string
		System.out.println(a.length());// returns the length of the string
		System.out.println(c.replace('n', 'k'));// replaces the particular char
		System.out.println(c.replaceAll("shoot", "man")); // replaces all the sequence of char
		System.out.println(a.startsWith(d));// if the index starts with particular string then true else false
		System.out.println(b.replaceFirst("hello", "HI"));// replaces the string with new string
//		System.out.println(g.strip());// removes all the white spaces before and after the string
//		System.out.println(g.stripLeading()); // removes the starting white spaces
//		System.out.println(g.stripTrailing());// removes the white spaces at the end
		System.out.println(a.substring(4)); // returns substring from particular index to end
		System.out.println(a.substring(2, 7));// returns substring from start index to end index
		System.out.println(k.toLowerCase());// converts the string to lower case
		System.out.println(g.toUpperCase());// converts the string to upper case
	}}

