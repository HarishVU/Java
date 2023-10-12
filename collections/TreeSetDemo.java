package com.collections;

/*treeset have so many methods
 * duplicates are not allowed
 * elements will be retrieved on (ascending order)NATURAL SORTNING ORDER
 * underlying DSis Binary search treee
 * heterogeneous objects are not allowed(different type of objects like 1,A,2,B)
 * we can't use null in treeset. it shows nullpointerexception when we use null inside treeset(tset.add(null);)
*/
import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> tset = new TreeSet<Integer>();
//		tset.add(null);
		tset.add(10);
		tset.add(1);
		tset.add(9);
		tset.add(8);
		tset.add(2);
		tset.add(4);
		tset.add(5);
		System.out.println("ascending order " +tset);
		System.out.println("first element  "+ tset.first());
		System.out.println("last element " + tset.last());
		System.out.println("headset " + tset.headSet(4));
		System.out.println("tailset " + tset.tailSet(5));
		System.out.println("subset " + tset.subSet(2, 9));

		System.out.println("higher " + tset.higher(5));
		System.out.println("lower " + tset.lower(9));
		System.out.println("pollfirst " + tset.pollFirst());
		System.out.println("polllast " + tset.pollLast());
		System.out.println("descending order " +tset.descendingSet());
		
		Iterator<Integer> i = tset.iterator();
		System.out.println("ascending order is below ");
		while(i.hasNext()) {
			System.out.println(i.next());
		}

		Iterator<Integer> desci = tset.descendingIterator();
		System.out.println("descending order is below ");
		while(desci.hasNext()) {
			System.out.println(desci.next());
		}
	}
}
