package com.streamdemo;
import java.io.*;

public class FileDeleteDemo {
	public static void main(String[] args) {
		File f1 = new File("D:Fileopertion.txt");
		if(f1.delete()) {
			System.out.println(f1.getName() + " - this file deleted successfully");
		}
		else {
			System.out.println("some error on your deletion file");
		}
	}
}
