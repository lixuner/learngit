package com.test.stream;

public class Transaction {

	private String name;
	
	private String currency;
	
	private int year;

	
	public Transaction(String name, String currency, int year) {
		super();
		this.name = name;
		this.currency = currency;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	
	
}
