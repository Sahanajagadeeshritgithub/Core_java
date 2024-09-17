package com.tnsif.Streamprgrms;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamOperations {
	public static void main(String [] args)
	{
		//Stream<Integer> ob = Stream.of(10,20,30,40,50);// of methods
		//System.out.print(ob);// prints the reference 
		//ob.forEach(System.out:: println);// terminal operation
		 
		// using stream method 
		 //Integer[] values = new Integer[] {2,3,5,7};
		 //ob = Arrays.stream(values);
		//System.out.print(ob);
		//ob.forEach(System.out:: println);
		
		// intermediate operations 
		
		Integer[] values = new Integer [] { 1,2,3,4,5};// get input from arrays
		Stream<Integer> stream = Arrays.stream(values);// create stream by stream method
		
		// map function
		System.out.println("Square of a number" + Arrays.toString(values));
		stream.map(num->num*num).forEach(System.out::println); // map method
		
	    stream.filter(ele-> ele%2 == 0).forEach(System.out::println);
	    
	    
	}
	

}
