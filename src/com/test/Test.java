package com.test;

public class Test {

	public static void main(String[] args) {
		B b = new B();
	}
}

class A {
	private int i = 1;
	
	public void show(){
		System.out.println(i);
	}
	
	A(){
		this.show();
	}
}

class B extends A{
	private int j = 2;

	@Override
	public void show() {
		System.out.println(111);
	}
	
	
	
}
