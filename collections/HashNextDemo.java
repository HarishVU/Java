package com.collections;
import java.util.*;

public class HashNextDemo {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("nine");
		al.add("ten");
		System.out.println(al);
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five"); //hashset also ignores duplicate values
		set.add("five");
		System.out.println(set);
		/*
		 * Iterator<String> i = set.iterator();
		 * 
		 * while(i.hasNext()) System.out.println(i.next());
		 */
		set.remove("one");
		System.out.println(set); //after invoking remove method
		
		HashSet<String> set1 = new HashSet<String>();
		set1.add("six");
		set1.add("seven");
		System.out.println(set1);
		set1.addAll(set);
		System.out.println(set1);	//after invoking addAll method
//		set1.removeAll(set1);
//		System.out.println(set1);	//after  invoking removeall method
		set1.removeIf(str->str.contains("two"));
		System.out.println(set1);
		
		Iterator<String> i = set.iterator();	//here, hashset from another collection
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
