package com.collections;
import java.util.*;

public class HashMapDemo {
public static void main(String[] args) {
	
	HashMap<Integer, String> h = new HashMap<Integer, String>();
	
	h.put(1, "one");
	h.put(2, "two");
	h.put(3, "three");
	h.put(4, "four");
	h.put(5, "five");
	h.put(6, "six");
	
	System.out.println("values" + h);
	Map<Integer, String> h1 = new HashMap<Integer, String>();
	h1.putAll(h);
	System.out.println("h1 values " + h1);
	System.out.println("checking empty" + h1.isEmpty());
	System.out.println("checking size" +h1.size());
	System.out.println("checking set" +h1.entrySet());
	System.out.println("checking keys" +h1.keySet());
	System.out.println("checking balues" + h1.values());
	System.out.println(h1);
	
	
}
}
