package com.ashish.threadcommunication;

public class CarServiceDemo {

	public static void main(String[] args) {
		CarQueueClass q = new CarQueueClass();
		new CarOwner(q);
		new CarMechanic(q);
		System.out.println("Press Control-C to stop.");
	}
}
