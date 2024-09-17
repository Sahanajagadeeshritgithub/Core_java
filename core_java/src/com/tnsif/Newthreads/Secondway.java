package com.tnsif.Newthreads;

public class Secondway implements Runnable{
	public static void main(String[] args) {
		Secondway t = new Secondway();//new state
		Thread th = new Thread(t);
		th.start();//runnable state 
		//th.start();// illegal thread state exception 
	th.run();// normal method
		
	}
	
	public void run() {
		System.out.println("creation of thread of runnable interface");
		
	}

}
