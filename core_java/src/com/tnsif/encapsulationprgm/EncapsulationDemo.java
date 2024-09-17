package com.tnsif.encapsulationprgm;

public class EncapsulationDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation ob = new Encapsulation();
//		ob.name="Rakshitha";
//		ob.age=33;
//		ob.serialNum=21;
		
		ob.setAge(20);
		ob.setName("Rakshitha");
		ob.setSerialNum(55);
		System.out.println(ob);
	}
}
