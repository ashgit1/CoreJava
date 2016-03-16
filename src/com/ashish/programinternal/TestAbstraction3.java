package com.ashish.programinternal;

interface A2 {
	void a();
	void b();
	void c();
	void d();
}

abstract class B1 implements A2 {
	public void c() {
		System.out.println("I am C");
	}
}

class M extends B1 {
	public void a() {
		System.out.println("I am a");
	}
	public void b() {
		System.out.println("I am b");
	}
	public void d() {
		System.out.println("I am d");
	}
}

class TestAbstraction3 {
	public static void main(String args[]) {
		A2 a = new M();
		a.a();
		a.b();
		a.c();
		a.d();
	}
}