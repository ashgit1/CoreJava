package com.ashish.acl;

class Parent {
	protected int id = 2;
	protected String name = "Ashish";
	final static String country = "India";
}

public class StaticNotInherited extends Parent{

	public static void main(String[] args) {
		StaticNotInherited st = new StaticNotInherited();
		st.id=2;
		st.name="Tanya";
		//st.country = "Pakistan";
		st.display();
	}

	void display() {
		System.out.println("id: " + id + ", name: " + name + ", country: " + country);
	}
	

}
