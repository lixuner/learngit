package com.lixun.jihe;

import java.lang.reflect.Method;

@Deprecated
public class Second {

	public static void main(String[] args) {
		A a = new A();
		Class c = a.getClass();
		try {
			Method m = c.getMethod("print", String.class,String.class);
			m.invoke(a, "weSSqw","qqqAAA");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class A {
	public void print(int a,int b){
		System.out.println(a+b);
	}
	
	public void print(String a,String b){
		System.out.println(a.toLowerCase()+b.toUpperCase());
	}
}