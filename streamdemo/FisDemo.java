package com.streamdemo;
//when you want to print all data try while loop

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FisDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		/*
		 * try { FileInputStream fis = new FileInputStream("D:\\Haris\\hello.txt"); int
		 * i = 0; while((i=fis.read())!=-1) { System.out.println((char)i); }
		 * fis.close(); } catch (Exception e) {System.out.println(e);}
		 */
		FileInputStream fis = new FileInputStream("D:\\Haris\\hi.txt");
//		int data1 = fis.read();
//		int data2 = fis.read();
//		int data3 = fis.read();
		int i=0;			
		while((i=fis.read())!=-1) {System.out.println((char)i);}
		
//		System.out.println(data);
//		System.out.println(" " + (char)data1 + " " + (char)data2 + " " + (char)data3);
		fis.close();
		
	}
	
}

