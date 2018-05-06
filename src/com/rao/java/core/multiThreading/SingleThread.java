package com.rao.java.core.multiThreading;


public class SingleThread {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("Current thread: " + t);

		// change the name of the thread
		t.setName("My Thread");
		System.out.println("After name change: " + t);
		try {
			for(int n = 5; n > 0; n--) {
				System.out.println(n);
				Thread.sleep(1000);	//use Thread ot initiation both are valid
				t.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		String s=t.getName();
		System.out.println("Thread name via getName() method ===> "+s);
	}

	/**
	 * [main,5,main] first parameter is thread name , priority and group
	 */
}
