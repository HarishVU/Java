package com.serializable;

import java.io.Serializable;

class Student implements Serializable{
	transient int id;
	String name;
	
	Student(int id, String name){
		this.id = id;
		this.name = name;	
	}
}