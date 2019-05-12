package com.test.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTwo {

	public static void main(String[] args) {
		Integer list = Stream.iterate(1, i -> i*2).limit(10).reduce(0,Integer::sum);
		System.out.println(list);
		
		System.out.println(measureSum(i->seqSum(i), 10000000));
		System.out.println(measureSum(i->forSum(i), 10000000));
		System.out.println(measureSum(i->parallelSum(i), 10000000));
		System.out.println(measureSum(i->parallelRangedSum(i), 10000000));
	}
	
	public static long measureSum(Function<Long, Long> addr, long n) {
		long fastest = Long.MAX_VALUE;
		for(int i = 0;i < 10;i++){
			long start = System.nanoTime();
			long sum = addr.apply(n);
			long duration = (System.nanoTime()-start)/1000000;
			System.out.println("result"+sum);
			if(duration < fastest)
				fastest = duration;
		}
		return fastest;
	}
	
	public static long seqSum(long n){
		return Stream.iterate(1L, i-> i+1).limit(n).reduce(0L, Long::sum);
	}
	
	public static long parallelSum(long n){
		return Stream.iterate(1L, i-> i+1).limit(n).parallel().reduce(0L, Long::sum);
	}
	
	public static long parallelRangedSum(long n){
		return LongStream.rangeClosed(1, n).parallel().reduce(0L, Long::sum);
	}
	
	public static long forSum(long n){
		long result = 0;
		for(long i = 1;i<=n;i++){
			result += i;
		}
		return result;
	}
}
