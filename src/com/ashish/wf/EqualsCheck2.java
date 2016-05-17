package com.ashish.wf;

public class EqualsCheck2 {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Ashish", "Gupta");
		Employee e2 = new Employee(1, "Ashish", "Gupta");
		
		System.out.println("Employee e1 is equals to e2 : " + e1.equals(e2));
		System.out.println("hachcode of e1 : " + e1.hashCode());
		System.out.println("hachcode of e2 : " + e2.hashCode());
	}

}
