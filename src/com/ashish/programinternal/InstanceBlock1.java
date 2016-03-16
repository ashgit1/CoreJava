package com.ashish.programinternal;

class InstanceBlock1 {

	int speed;

	InstanceBlock1() {
		System.out.println("speed is " + speed);
	}

	{
		speed = 100;
	}

	@SuppressWarnings("unused")
	public static void main(String args[]) {
		InstanceBlock1 b1 = new InstanceBlock1();
		InstanceBlock1 b2 = new InstanceBlock1();
	}
}
