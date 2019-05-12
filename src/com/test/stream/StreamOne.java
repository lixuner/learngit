package com.test.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.swing.GroupLayout.ParallelGroup;

public class StreamOne {

	public static void main(String[] args) {
		List<Transaction> list = Arrays.asList(
			new Transaction("123", "rmb", 2019),	
			new Transaction("1233", "rmb", 2017),	
			new Transaction("tom", "rm", 2019)	
		);
		/*Map<String, List<Transaction>> map = list.stream().collect(Collectors.groupingBy(Transaction::getCurrency));
		
		long c = list.stream().collect(Collectors.counting());
		long d = list.stream().count();
		System.out.println(c);
		System.out.println(d);
		list.stream().findAny();
		
		Comparator<Transaction> yearComparator = Comparator.comparingInt(Transaction::getYear);
		Optional<Transaction> max = list.stream().collect(Collectors.maxBy(yearComparator));
		double a = list.stream().collect(Collectors.averagingInt(Transaction::getYear));
		System.out.println(a);
		
		IntSummaryStatistics sumn = list.stream().collect(Collectors.summarizingInt(Transaction::getYear));
		System.out.println(sumn);*/
		
		String str = list.stream().map(o -> o.getName()).collect(Collectors.joining(", "));
		System.out.println(str);
		
		Optional<Transaction> op = list.stream().collect(Collectors.reducing((d1,d2) -> d1.getYear() > d2.getYear() ? d1 : d2));
		System.out.println(op);
		
		int a = list.stream().map(o -> o.getYear()).reduce(Integer::sum).get();
		System.out.println(a);
		int b = list.stream().map(o -> o.getYear()).collect(Collectors.reducing(Integer::sum)).get();
		System.out.println(b);
		
		Map<String, List<Transaction>> m = list.stream().collect(Collectors.groupingBy(o -> o.getYear() < 2018 ? "early" : "last"));
		//Map<String, List<Transaction>> m = list.stream().collect(Collectors.groupingBy(o -> o.getYear() < 2018 ? "early" : "last"));
		//System.out.println(m);
		Map<Boolean, List<Transaction>> map =  list.stream().collect(Collectors.partitioningBy(o -> o.getYear() > 2018));
		Optional<Transaction> pp =  list.stream().collect(Collectors.maxBy(Comparator.comparingInt(Transaction::getYear)));
		System.out.println(pp.get().getName());
		
		int sqrt = (int) Math.sqrt(8);
		System.out.println(sqrt);
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		
		
	}
}
