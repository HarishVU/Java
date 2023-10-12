package com.comparable;
import java.util.*;

public class TestSortDemo {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "hari", 23));
		al.add(new Student(102, "haris", 24));
		al.add(new Student(103, "harish", 25));
		
		Collections.sort(al);
		for(Student st: al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		
	}
}
