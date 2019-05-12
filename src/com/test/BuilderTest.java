package com.test;

import com.test.Apple.Builder;

public class BuilderTest {

	class inner {
		int i;
		 public void show(){
			 System.out.println("inner");
		 }
	}
	
	public static void main(String[] args) {
		/*inner i = new BuilderTest().new inner();
		i.show();*/
		Apple a = new Apple.Builder("ºì¸»Ê¿","ºìÉ«").builder();
		System.out.println(a);
	}
}
class Apple {
	private String name;
	private String color;
	private String taste;
	private int weight;
	
	private Apple(Builder builder){
		this.name = builder.name;
		this.color = builder.color;
		this.taste = builder.taste;
		this.weight = builder.weight;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name="+this.name+"color"+this.color+"taste="+this.taste+"weight="+this.weight;
	}



	public static class Builder {
		private String name;
		private String color;
		
		private String taste;
		private int weight;
		
		public Builder(String name,String color){
			this.name = name;
			this.color = color;
		}
		public Builder taste(String taste){
			this.taste = taste;
			return this;
		}
		
		public Builder weight(int weight){
			this.weight = weight;
			return this;
		}
		
		public Apple builder() {
			return new Apple(this);
		}
	}
}
