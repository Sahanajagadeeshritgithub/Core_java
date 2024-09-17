package com.tnsif.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList ob = new ArrayList();// raw type 
		//System.out.println("the size of the arraylist" +""+ ob.size());
        //ob.add(2);
        //ob.add('a');
        //ob.add(22.35);
        //System.out.println("the elements in the array are " + ob);
        //System.out.println("check the element" +ob.contains(22.35));
		
		ArrayList<String> ob =  new  ArrayList<String>() ; //generic type , that is the specified data type 
        ob.add("rakshitha");
        ob.add("shri");
        ob.add("Poornima");
        
        System.out.print(" the element is array is " + ob);
        Collections.sort(ob);
        System.out.print(" the element is array is " + ob);
        Iterator<String> i = ob.iterator();
        while(i.hasNext()) {
        	String nm = i.next();
        	ob.remove(0);
        	System.out.println(nm);
        	
        }
        
        
        
	}

}
