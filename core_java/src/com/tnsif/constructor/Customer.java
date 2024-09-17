//program to demonstrate constructor
package com.tnsif.constructor;

public class Customer {
	private int id;
	private String name;
	
	//default constructor
	public Customer() {
		super();// used to call super class constructor , instance variable or method 
		System.out.println("-- default constructor");
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
