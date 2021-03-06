package com.ashish.threadcommunication;

public class CarQueueClass {
	
	int n;
	boolean mechanic_available = false;

	synchronized int get() {
		if (!mechanic_available)
			try {
				wait(5000);
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		System.out.println("Got Request for Car Service: " + n);
		mechanic_available = false;
		notify();
		return n;
	}

	synchronized void put(int n) {
		if (mechanic_available)
			try {
				wait(5000);
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		this.n = n;
		mechanic_available = true;
		System.out.println("Put Request for Car Service: " + n);
		notify();
	}
}
