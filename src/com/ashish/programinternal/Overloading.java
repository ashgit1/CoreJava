package com.ashish.programinternal;

public class Overloading {

	public static void main(int num) {
		System.out.println(num);
	}
	public static void main(String[] args) {
		System.out.println("main() invoked...");
		main(567);
	}
	static {
		System.out.println("Always first static block...");
	}
}