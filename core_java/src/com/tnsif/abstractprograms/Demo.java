package com.tnsif.abstractprograms;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in);
		System.out.println("enter the salary of akash ");
		double akashsalary = sc.nextDouble();
//Taxpayer obj = new Taxpayer();// cannot create object for abstract class , but can do it using implemattational class 
        Taxpayer obj = new Akash (akashsalary) ; // create reference 

System.out.println("enter the salary of hitesh ");
double hiteshsalary = sc.nextDouble();
//Taxpayer obj = new Taxpayer();// cannot create object for abstract class , but can do it using implemattational class 
Taxpayer obj1 = new Akash (hiteshsalary ) ;

System.out.println("tax akash");
obj.display();



System.out.println("tax hitesh");
obj1.display();


sc.close();


	}

}
