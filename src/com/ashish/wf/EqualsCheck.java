package com.ashish.wf;

public class EqualsCheck {

	public static void main(String[] args) {

		Country c1 = new Country();
		c1.setCode(1);
		c1.setName("India");
		
		Country c2 = new Country();
		c2.setCode(1);
		c2.setName("India");
		
		System.out.println("Is c1 equals to c2 : " + c1.equals(c2) );
		System.out.println("hashcode of c1 : " + c1.hashCode());
		System.out.println("hashcode of c2 : " + c2.hashCode());
	}

}
