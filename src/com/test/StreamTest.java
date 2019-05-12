package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("qqq","www","eee","r");
		Stream<String> stream = list.stream();
		List l = stream.filter(a -> a.length()>1).map(d -> d.length()).limit(2).collect(Collectors.toList());
		l.forEach(item -> System.out.println(item));
		//stream.forEach(item -> System.out.println(item));
		
	}
}
