package com.collections;
import java.util.*;

public class DeQueueDemo {

	public static void main(String[] args) {

		Deque<String> deq = new ArrayDeque<String>();
		deq.add("hello");
		deq.add("wworld");
		deq.add("from eclipse");
		deq.offer("you know");
		deq.offerLast("it is");
		deq.offerLast("not queue");
		deq.offerFirst("siuu");
		for(String s: deq) {
		System.out.println(s);
		}
		deq.poll(); // poll and pollFirst is also same. just remove the first element
		deq.pollFirst();
		deq.pollLast();
		/*
		 * Iterator<String> i = deq.iterator(); while(i.hasNext())
		 * System.out.println(i.next());
		 */
		for(String s: deq) {
			System.out.println(s);
		}
		
	}
}

