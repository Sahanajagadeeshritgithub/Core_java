// to demonstrate scanner class
package com.tnsif.scannerclass;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int id = ob.nextInt();
		if(ob.hasNextInt()) {
			System.out.println(id);
		}
		String name = ob.nextLine();
		// to read a name
		char a = ob.next().charAt(0);// to read a character at specific index  

	}

}
