package com.masterCore;

/*
 * You can create thread by using both methods
 * implements - Runnable Interface
 * extends - Thread Class
 * but you need to override the @void() method with proper definition
 * */
public class P19_ThreadCreation implements Runnable{
	
	public void run() {
		System.out.println("running instance..");
	}
	public static void main(String[] args) {
	P19_ThreadCreation obj = new P19_ThreadCreation();
	Thread thread = new Thread(obj); 
	thread.start();
	System.out.println("inside the main....");
	}

}

// OR

//public class P19_ThreadCreation extends Thread{
//	
//	public void run() {
//		System.out.println("running instance..");
//	}
//	public static void main(String[] args) {
//		P19_ThreadCreation thread1 = new P19_ThreadCreation();
//		thread1.start();
//		System.out.println("inside the main....");
//	}
//	
//}
