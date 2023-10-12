package com.serializable;
//this is deserialization example
import java.io.*;

public class Deserializable {
	public static void main(String[] args) {
		try {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Haris\\tex.txt"));
		Student s1 = (Student)ois.readObject();
		System.out.println(s1.id + " " + s1.name);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
