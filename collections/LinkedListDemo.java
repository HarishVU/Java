package com.collections;
import java.util.*;

class Books{
	int id;
	String name,author,publisher;
	int quantity;
	
	Books(int id,String name,String author,String publisher,int quantity){
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}
public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<Books> list = new LinkedList<Books>();
		
		Books b1 = new Books(101,"C programming","chris","john ",2);
		Books b2 = new Books(102,"Java programming","robert","savan ", 3);
		Books b3 = new Books(103,"Python programming","pratt","tommy ", 1);
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		for(Books b:list)
		System.out.println(b.id +" " + b.name +" " +b.author+ " "+b.publisher+"" + b.quantity);
		
	}
//		
//		LinkedList<String> l = new LinkedList<String>();
//		
//		l.add("Ravi");
//		l.add("Hari");
//		l.add("Vinod");
//		l.add("Vicky");
//		System.out.println(l);
//		l.add(1, "Dinesh");
//		System.out.println(l);
//		
//		LinkedList<String> l2 = new LinkedList<String>();
//		
//		l2.add("Manoj");
//		l2.add("Vijay");
//		l2.removeFirst();		
//		System.out.println(l2);
//	}
}
