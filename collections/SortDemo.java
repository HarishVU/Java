package com.collections;
import java.util.*;

public class SortDemo {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("tom");
		al.add("jerry");
		al.add("press");
		System.out.println(al);
		System.out.println("output printing sorting order");
		Collections.sort(al);
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("output printing reversing order");
		Collections.sort(al,Collections.reverseOrder());
		Iterator<String> it2 = al.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
	}
	
}
