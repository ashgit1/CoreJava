package com.ashish.programinternal;

abstract class AC1{
	abstract void abstract1();
}

abstract class AC2 extends AC1{
	abstract void abstract2();
	void abstract1(){
	}
}

public class TestAbstraction2 extends AC2 {
	public static void main(String[] args) {
	}

	@Override
	void abstract2() {
	}
}
