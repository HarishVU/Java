package com.streamdemo;
import java.io.*;

public class FileDemo {
	public static void main(String[] args) {
		try {
			
		File f1 = new File("D:\\Haris\\demo files\\Fileoperation.txt");
		if(f1.createNewFile()) {
			System.out.println("your file is " + f1.getName() + " is created successfully");
		}
		else {
			System.out.println("file is existed");
		}
	}
		catch(Exception e) {
			System.out.println("an unexpected error");
			e.printStackTrace();
		}
	
}
}