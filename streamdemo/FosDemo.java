package com.streamdemo;
import java.io.*;

public class FosDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		FileOutputStream fos = new FileOutputStream("D:\\Haris\\hi.txt");
		String s= "are u ready";
		byte b[] = s.getBytes();
		fos.write(b);
		System.out.println("data is saved");
		fos.close();
	}
}
