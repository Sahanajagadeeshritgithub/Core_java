package com.tnsif.Newthreads;

public class Firstway  extends Thread{
	public void run() {
		System.out.println("creation of thread by extending thread class");
		
	}
	
	public static void main(String[] args){
		
		Firstway ob = new Firstway();
		
		ob.start();//runnable method
		ob.stop();
		ob.start();
	}

}
