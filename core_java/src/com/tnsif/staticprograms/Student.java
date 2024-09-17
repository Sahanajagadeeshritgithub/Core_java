package com.tnsif.staticprograms;

public class Student {
	
	private String name;
	private int id;
	
	static String collageName = "DBIT";
	
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
		
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

}
