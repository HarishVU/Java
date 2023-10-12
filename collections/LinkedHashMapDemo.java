package com.collections;
import java.util.*;

//LinkedHashMap is almost same as HashMap. but, it is insertion order is maintained
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<String, String> heros = new LinkedHashMap<String, String>();
		heros.put("ironman" , "tony");
		heros.put("batman", "bruce");
		heros.put("spiderman","peter");
		
		System.out.println(heros);
		
		HashMap<String,String> hasmapheros = new HashMap<String, String>();
		hasmapheros.put("ironman" , "tony");
		hasmapheros.put("batman", "bruce");
		hasmapheros.put("spiderman","peter");
		
		System.out.println(hasmapheros);
	}
}
