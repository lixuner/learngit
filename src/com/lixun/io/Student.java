package com.lixun.io;

import java.io.Serializable;

public class Student implements Serializable {

	private String name;
	
	private String home;
	
	private int age;

	@Override
	public String toString() {
		return "1Student [name=" + name + ", home=" + home + ", age=" + age + "]";
	}

	public Student(String name, String home, int age) {
		super();
		this.name = name;
		this.home = home;
		this.age = age;
	}
	
	
}
