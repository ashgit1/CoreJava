package com.ashish.interfaceDemo;

interface Printable {
	void print();
}

interface Showable {
	void print();
}

class TestTnterface1 implements Printable, Showable {
	
	public static void main(String args[]) {
		TestTnterface1 obj = new TestTnterface1();
		obj.print();
	}

	@Override
	public void print() {
	System.out.println("Multiple inheritance ... ");
		
	}
}

/**
 * Printable and Showable interface have same methods but its implementation is provided by class TestTnterface1, 
 * so there is no ambiguity.
 */