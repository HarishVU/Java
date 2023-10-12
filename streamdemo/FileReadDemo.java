package com.streamdemo;
import java.io.*;
import java.util.*;
public class FileReadDemo {
	public static void main(String[] args) {
		File f1 = new File("D:\\Haris\\demo files\\Fileoperation.txt");
		try {
			Scanner dataReader = new Scanner(f1);
			while((dataReader.hasNextLine())) {
				String fileData = dataReader.next();
				System.out.println(fileData);
			}
			dataReader.close();
		}
		catch(Exception e) {
				System.out.println("an unexpected error occured");
				e.printStackTrace();
			}
		}
	}

