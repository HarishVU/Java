package com.streamdemo;
//this is sample program for understanding the concept simply.
import java.io.*;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D://Haris//hh.png");
		FileOutputStream fos = new FileOutputStream("D://Haris//hhhh.png");
		
		byte[] buffer = new byte[221024];
		int data;
		while((data = fis.read(buffer))!=-1) {
			fos.write(buffer, 0, data);
		}
		System.out.println("file copied");
		fis.close();
		fos.close();
	}
}
