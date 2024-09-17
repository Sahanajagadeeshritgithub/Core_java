package com.tnsif.Generic;

import java.util.ArrayList;

public class GenericsinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();// generic object 
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list.add("Java");
		list1.add(123);
		
		for(Object object : list ) {
			String str = (String) object;
			System.out.println(str);
		}
	}

}
