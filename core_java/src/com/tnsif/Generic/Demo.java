package com.tnsif.Generic;

public class Demo {
	public static void main(String args[]) {
	Generic<String>stringobj = new Generic();
	stringobj.setData("hello");
	System.out.println(" the string object " + stringobj.getData());
	
	Generic<Integer>intobj = new Generic();
	intobj.setData(22);
	System.out.println(" the string object " + intobj.getData());
	
	Generic<Double>doubleobj = new Generic();
	doubleobj.setData(22.55);
	System.out.println(" the string object " + doubleobj.getData());

	}
}
