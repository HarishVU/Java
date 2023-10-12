package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(8,7,5,8,3);
		
//		Stream<Integer> data = nums.stream();
//		Stream<Integer> mappedData = data.map(n -> n*2);
//		mappedData.forEach(n -> System.out.println(n));
		nums.stream()
			.map(n -> n*2)
			.forEach(n -> System.out.println(n));
		/* this is also correct and that is also correct(above the code 
		 * starts with stream<integer> data etc.,
		 */
	}
}
