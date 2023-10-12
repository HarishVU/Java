package com.streamdemo;
import java.io.*;

public class CharArrayWriteDemo {
	public static void main(String[] args) throws IOException {
		CharArrayWriter out = new CharArrayWriter();
		out.write("welcome to programming");
		FileWriter f1 = new FileWriter("D:\\Haris\\a.txt");
		FileWriter f2 = new FileWriter("D:\\Haris\\b.txt");
		FileWriter f3 = new FileWriter("D:\\Haris\\c.txt");
		FileWriter f4 = new FileWriter("D:\\Haris\\d.txt");
		out.writeTo(f1);
		out.writeTo(f2);
		out.writeTo(f3);
		out.writeTo(f4);
		f1.close();
		f2.close();
		f3.close();
		f4.close();
		System.out.println("done");
	}
}
