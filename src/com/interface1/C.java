package com.interface1;

public class C extends B {
	int c=5;
	@Override
	public void multi() {
		System.out.println("Multiplication of 2 numbers:"+(a*b));
	}
	public void div() {
		System.out.println("Division is:"+(a/c));
	}
	public static void main(String args[]) {
		B b1 = new C();
		b1.sum();
		b1.multi();
		b1.sub();
	}

}
