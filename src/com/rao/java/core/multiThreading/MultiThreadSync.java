package com.rao.java.core.multiThreading;


public class MultiThreadSync {

	public static void main(String[] args) {
		NewThread ob1 = new NewThread("One");
		NewThread ob2 = new NewThread("Two");
		NewThread ob3 = new NewThread("Three");
		/**
		 * isAlive is way to knoe thread status
		 */
		System.out.println("Thread One is alive: "
				+ ob1.t.isAlive());
		System.out.println("Thread Two is alive: "
				+ ob2.t.isAlive());
		System.out.println("Thread Three is alive: "
				+ ob3.t.isAlive());
		// wait for threads to finish
		try {
			System.out.println("Waiting for threads to finish.");
			/**
			 * "Join" This method waits until the thread on which it is called terminates.
			 * Additional forms of join also available*
			 */
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Thread One is alive: "
				+ ob1.t.isAlive());
		System.out.println("Thread Two is alive: "
				+ ob2.t.isAlive());
		System.out.println("Thread Three is alive: "
				+ ob3.t.isAlive());
		System.out.println("Main thread exiting.");
	}

}

