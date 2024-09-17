package com.sahana.assignment2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating Student object
        Student student = new Student();

        // Creating Commission object
        Commission commission = new Commission();

        // Accepting details of the sales employee
        commission.acceptDetails("John Doe", "123 Elm Street", "555-1234", 75000);

        // Calculating and displaying the commission
        commission.displayCommission();
    }

	}
