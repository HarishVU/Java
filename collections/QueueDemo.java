package com.collections;
import java.util.*;

public class QueueDemo{

	public static void main(String[] args) {
		
		Queue<Integer> q =new LinkedList<Integer>();
		
		q.add(3);
		q.add(2);
		q.add(12);
		q.add(1);
		
		Iterator<Integer> i = q.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("head is " + q.peek());
		System.out.println("removed " + q.remove());
		System.out.println("head is " + q.peek());
		System.out.println("poll is " + q.poll());
		System.out.println("size is " + q.size()); // queue have so many methods. try it another way....
		System.out.println(q);
	}
}
