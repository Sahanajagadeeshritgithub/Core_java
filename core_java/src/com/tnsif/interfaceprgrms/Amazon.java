// prgrm to demonstrate interface 
package com.tnsif.interfaceprgrms;

public interface Amazon {
	
	void welcome();
	void thankyou();// abstract method 
	
  default void  servicecharge() {
	  int amt = 100;
	  System.out.println("the service charge is "+amt);
	
}
  
static void aboutUs() {
	System.out.println("it is a ecommerce ");
	
	
}
	


}
