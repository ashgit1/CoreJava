package com.ashish.programinternal;

class A1 {
	A1() {
		System.out.println("parent class constructor invoked");
	}
}

public class InstanceBlock2 extends A1 {

	InstanceBlock2() {
		super();
		System.out.println("child class constructor invoked");
	}

	InstanceBlock2(int a) {
		super();
		System.out.println("child class constructor invoked " + a);
	}

	{
		System.out.println("instance initializer block is invoked");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		InstanceBlock2 b1 = new InstanceBlock2();
		InstanceBlock2 b2 = new InstanceBlock2(10);
	}
}
