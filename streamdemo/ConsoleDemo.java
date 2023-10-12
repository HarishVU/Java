package com.streamdemo;
import java.io.*;
public class ConsoleDemo {
	public static void main(String[] args) {
		Console c = System.console();
		System.out.println("enter your text : ");
		String s = c.readLine();
		System.out.println("this is your text"+ s);
	}
	
}
