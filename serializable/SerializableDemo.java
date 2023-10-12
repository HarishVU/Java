package com.serializable;
//this is serializable example
import java.io.*;
public class SerializableDemo {
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "rooney");
		try {
		FileOutputStream fous = new FileOutputStream("D:\\Haris\\tex.txt");
		ObjectOutputStream ous = new ObjectOutputStream(fous);
		ous.writeObject(s1);
		ous.flush();
		ous.close();
		System.out.println("success");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
//		try {
//			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Haris\\tex.txt"));
//			Student s = (Student)ois.readObject();
//			System.out.println(s.id + " " + s.name);
//			}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
		
	}
}
