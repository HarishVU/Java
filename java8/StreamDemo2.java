package com.java8;
import java.util.*;

class Product{
	int id;
	String name;
	float price;
	
	Product(int id, String name, float price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class StreamDemo2 {
	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(101," dell " , 30000f));
		productList.add(new Product(102," HP " , 25000f));
		productList.add(new Product(103," lenovo " , 20000f));
		productList.add(new Product(104," acer " , 28000f));
		productList.add(new Product(105," apple " , 30000f));
		
		productList.stream()
			.filter(product -> product.price==30000)
			.sorted()
			.map(product -> product)
			.forEach(product -> System.out.println(product.name));
		
	}
}
