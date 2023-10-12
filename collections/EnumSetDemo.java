package com.collections;

import java.util.EnumSet;
import java.util.Iterator;

/*the enumset class of the java collection framework
it provides a set implementation of a  single enum
it implements the Set interface*/

enum Size{
	SMALL, MEDIUM, LARGE, EXTRALARGE
}
public class EnumSetDemo {
	public static void main(String[] args) {
		//EnumSet<Size> eset = EnumSet.allOf(Size.class);
		//EnumSet<Size> eset = EnumSet.noneOf(Size.class);
		//EnumSet<Size> eset = EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);
		EnumSet<Size> eset = EnumSet.of(Size.MEDIUM, Size.EXTRALARGE);
		eset.add(Size.SMALL);
		System.out.println(eset);
		EnumSet<Size> eset1 = EnumSet.allOf(Size.class);
		eset1.remove(Size.SMALL);
		Iterator<Size> it = eset1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
