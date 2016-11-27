package com.ashish.interfaceDemo;

public class Student18 extends Object implements Cloneable {

	int rollno;
	String name;

	Student18(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof Student18)) {
			return false;
		}

		Student18 s2 = (Student18) obj;
		if (this.rollno == s2.rollno && this.name == s2.name) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		int code = 37;
		return this.rollno * code * this.name.hashCode();

	}

	public static void main(String[] args) {

		try {
			Student18 s1 = new Student18(101, "amit");
			Student18 s2 = (Student18) s1.clone();

			System.out.println(s1.rollno + " " + s1.name);
			System.out.println(s2.rollno + " " + s2.name);

			if (s1.equals(s2)) {
				System.out.println("s1 equals s2");
			} else {
				System.out.println("s1 not equals s2");
			}

			if (s1.hashCode() == s2.hashCode()) {
				System.out.println("s1 hash equals s2 hash");
				System.out.println("s1: " + s1.hashCode());
				System.out.println("s2: " + s2.hashCode());
			} else {
				System.out.println("s1 hash not equals s2 hash");
				System.out.println("s1: " + s1.hashCode());
				System.out.println("s2: " + s2.hashCode());
			}

		} catch (CloneNotSupportedException c) {
			c.printStackTrace();
		}
	}
}
