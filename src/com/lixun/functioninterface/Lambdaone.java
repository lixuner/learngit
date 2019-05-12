package com.lixun.functioninterface;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambdaone {

	public static void main(String[] args) {
		Runnable r = () -> System.out.println("Lambda");
		r.run();
		one(() -> System.out.print("hello"));
		
		List<String> str = Arrays.asList("a","b","A","B");
		/*str.sort((s1,s2) -> s1.compareToIgnoreCase(s2));
		for (String string : str) {
			System.out.println(string);
		}*/
		str.sort(String :: compareTo);
		for (String string : str) {
			System.out.println(string);
		}
	}
	
	public static void one(Runnable r){
		r.run();
	}
	
	public static String processFile() throws IOException{
		try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
			return br.readLine();
		}
	}
}
