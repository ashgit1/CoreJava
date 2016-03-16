package com.ashish.programinternal;

class Hard {
	public static void main(String[] args) {
		System.out.println("Class name and program name not same. Good since class is not public...");
	}
}

class A {
	static{
		System.out.println("Static A...");
	}
	public static void main(String[] args) {
		System.out.println("Class A...");
	}
}

class B {
	static{
		System.out.println("Static B...");
	}
	public static void main(String[] args) {
		System.out.println("Class B...");
	}
}

/**
 * To compile: javac Hard.java To execute: java Simple
 */
