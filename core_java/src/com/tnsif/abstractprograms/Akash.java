package com.tnsif.abstractprograms;

public class Akash  extends Taxpayer {
	
	public Akash ( double salary ) {
		super(salary);
		
	}

	@Override
	public double calTax() {
		// TODO Auto-generated method stub
		 if (salary <= 5000) {
	            return 0;
	        } else if (salary <= 10000) {
	            return salary * 0.1; // 10% tax for salary between 5001 and 10000
	        } else {
	            return salary * 0.2; // 20% tax for salary above 10000
	        }
	}

}
