package com.java8;
import java.io.*;
import java.util.*;

// for each is internal part of collection
// internal loops - java 8 and it is faster than normal for loop

public class ForEachDemo {
	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(1,2,3,4,5);// new ArrayList<Integer>();
		
		// this is normal for loop
		/* 
		 * for(int i=0;i<values.size();i++) { System.out.println(values.get(i)); }
		 */
		
		// this is for enhanced loop
		/*
			 * for(int i:values) { System.out.println(i); }
			 */
		// but, here we are using for each loop
		values.forEach(i -> System.out.println(i));// -> lambda expression
		
	}
	
}
