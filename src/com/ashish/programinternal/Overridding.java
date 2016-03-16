package com.ashish.programinternal;

class Parent {
	Parent(){
		System.out.println("Parent Class.");
	}
	 protected void msg() {
		System.out.println("Hello java...");
	}
}

public class Overridding extends Parent {
	public void msg() {
		super.msg();
		System.out.println("chile...");
	}

	public static void main(String args[]) {
		Overridding obj = new Overridding();
		obj.msg();
	}
}