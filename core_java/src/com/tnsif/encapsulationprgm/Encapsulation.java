package com.tnsif.encapsulationprgm;

public class Encapsulation {//if no access specifier mentioned then it will be default
	private int serialNum=10;//Data variables
	private String name;
	private int age;
	
	// to display string representation of the objects
	@Override
	public String toString() {
		return "Encapsulation [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
	}

	//by using getters and setters method i can access private data members       
	
	public int getSerialNum() {//read the value
		return serialNum;
	}
	public void setSerialNum(int serialNum) {//set the value
		this.serialNum = serialNum;
	}
	public String getName() {                        
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}


