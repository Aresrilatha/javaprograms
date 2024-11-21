package com.interface1;

public abstract class B implements A {

	@Override
	public void sum() {
		System.out.println("Sum is :"+(a+b));		
	}

	@Override
	public void sub() {
		System.out.println("Difference is:"+(b-a));
		
	}

	@Override
	public abstract void multi();
	
}
