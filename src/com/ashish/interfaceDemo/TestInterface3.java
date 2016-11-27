package com.ashish.interfaceDemo;

interface Printable2 {
	void print();
}

interface Showable2 {
	void print();
}

public class TestInterface3 implements Printable2, Showable2{

	public static void main(String args[]){
		Showable2 obj = new TestInterface3();  // Showable2 or Printable2
		obj.print();
	}
	
	@Override
	public void print() {
		System.out.println("Print() is called...(Multiple inheritance)");
	}

}
