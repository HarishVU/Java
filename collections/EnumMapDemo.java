package com.collections;

import java.util.EnumMap;

/*the enummap class of the java collection framework
it provides a map implementation for elements of an enum
in enum, enum elements are used as keys. it implements the map interface*/

enum Sizes{
	SMALL, MEDIUM, LARGE, EXTRALARGE
}

public class EnumMapDemo {
	public static void main(String[] args) {
		
		EnumMap<Size, Integer> emap  = new EnumMap<Size, Integer>(Size.class);
		
		emap.put(Size.SMALL, 1);
		emap.put(Size.MEDIUM, 2);
		emap.put(Size.LARGE, 3);
		emap.put(Size.EXTRALARGE, 4);
		
		System.out.println("emap content = " +emap);
		System.out.println("emap content getting large = " + Size.LARGE);
		
		emap.remove(Size.MEDIUM);
		System.out.println("removing the medium = " + Size.MEDIUM);
	}
}
