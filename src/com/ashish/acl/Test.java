package com.ashish.acl;

public class Test {

	private int id;
	private String name;
	
	Test(int id, String name){
		this();
		this.id = id;
		this.name = name;
	}
	
	Test() {
		System.out.println("defalut const needs to be written when using args constructor...");
	}

	public static void main(String[] args) {
		new Test(1, "Ashish").display();
		new Test().display();

	}
	
	public void display(){
		System.out.println("id: " + this.id + ", name: " + this.name);
	}

}
