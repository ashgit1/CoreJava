package com.ashish.interfaceDemo;

interface Printable1 {
	void print();
}

interface Showable1 extends Printable1 {
	void show();
}

public class Testinterface2 implements Showable1 {

	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String args[]) {
		Testinterface2 obj = new Testinterface2();
		obj.print();
		obj.show();
	}
}
