package com.streamdemo;
//this is file read demo
import java.io.*;

public class FilesDemo {
	public static void main(String[] args) {
		/*
		 * try { File f1 = new File("D:\\Haris\\demo files\\Fileoperation.txt");
		 * if(f1.createNewFile()) { System.out.println("your file is " + f1.getName() +
		 * " created successfully"); } else {
		 * System.out.println("this file is already created"); }
		 * 
		 * } catch(Exception e) { System.out.println("an unexpected error occurred");
		 * e.printStackTrace();
		 * 
		 * }
		 */
		try {
		File f1 = new File("D:\\Haris\\demo files\\Fileoperation.txt");
		if(f1.exists()) {
			System.out.println("this file is existed " + f1.getName());
			System.out.println("file path is " + f1.getAbsolutePath());
			System.out.println("is it writable " + f1.canWrite());
			System.out.println("is it readable " + f1.canRead());
			System.out.println("this file length is " + f1.length());
			System.out.println("last modified is " + f1.lastModified());
		}
		else {
			System.out.println("this file is not existed");
		}
		}
		catch(Exception e) {
			System.out.println("an unexpected error is occurred");
			e.printStackTrace();
		}
		}
	}
