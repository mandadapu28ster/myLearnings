package com.rao.java.core.multiThreading;


public class RunnableInterfaceThread {

	public static void main(String args[ ] ) {
		/**
		 * If we want multiple threads call below command as many times as we want :)
		 */
		new NewThread(); // create a new thread
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println("Main Thread: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread exiting.");
	}

}

class NewThread implements Runnable {			//observe class def as "implements" (as interface)
	Thread t;

	NewThread() {
		// Create a new, second thread
		t = new Thread(this, "Demo Thread");
		System.out.println("Child thread: " + t);
		t.start(); // Start the thread
	}

	//Another constructor for variation coverage

	NewThread(String threadname) {
		t = new Thread(this, threadname);
		System.out.println("New thread: " + t);
		t.start(); // Start the thread
	}

	// This is the entry point for the second thread.
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}
}
