package com.collections;
import java.util.*;

public class IteratorDemo {
	@Override
	public String toString() {
		return "IteratorDemo []";
	}
	public static void main(String[] args) {
		
		ArrayList<Integer> ilist = new ArrayList<Integer>();
		ilist.add(123);
		ilist.add(1234);
//		for(int i=1;i<10;i++) {
//			ilist.add(i);
//			System.out.println(ilist);
//		}
//		for(int i: ilist)
			System.out.println(ilist);
		Iterator<Integer> i = ilist.iterator();
		System.out.println("using iterator");
//		System.out.println(i.next());
//		System.out.println(i.next());
		
//		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}
