package com.interface1;

public class D extends B{
	int d=4;
	@Override
	public void multi() {
		System.out.println("Multiplication is:"+(a*d));
		
	}
	public void rem() {
		System.out.println("Remainder is:"+(b%d));
	}
	public static void main(String args[]) {
		D b1 = new D();
		b1.rem();
	}

}
