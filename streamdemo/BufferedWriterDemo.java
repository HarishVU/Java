package com.streamdemo;
import java.io.*;

public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException{
		
		FileWriter file = new FileWriter("D:\\Haris\\demo files\\Fileoperation.txt");
		BufferedWriter buffer = new BufferedWriter(file);
		buffer.write("it is writer method using buffered writer \n");
		buffer.write(123);
		String s = new String(" afhlskajklsjfljslsfksjflsf lajsflka");
		buffer.write(s, 2, 10);
		buffer.close();
		System.out.println("success");
	}
}
