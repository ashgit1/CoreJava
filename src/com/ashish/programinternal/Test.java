package com.ashish.programinternal;

public class Test {

	static int order = 0;

	Test() {
	}

	{
		System.out.println("Block : " + ++(Test.order));
	}

	static {
		System.out.println("Static Block : " + ++(Test.order));
	}

	public static void main(String[] args) {
		new Test();
		System.out.println("Main Block : " + ++(Test.order));
		new Test();
	}
}
