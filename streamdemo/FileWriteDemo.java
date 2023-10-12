package com.streamdemo;
//this is file write demo
import java.io.*;

public class FileWriteDemo {
	public static void main(String[] args) {
		
		try {
		FileWriter fwrite = new FileWriter("D:\\Haris\\demo files\\Fileoperation.txt");
		fwrite.write("we are learning java");
		fwrite.close();
		System.out.println("file writing is successfully");
		}
		catch(Exception e) {
			System.out.println("an unexpected error is occurred");
			e.printStackTrace();
		}
	}
}
