package com.ashish.programinternal;

class G {
	G get() {
		return this;
	}
}

public class Covariant extends G{
	Covariant get(){
		return this;
	}
	public void message() {
		System.out.println("This is covariant");
	}
	public static void main(String[] args) {
		new Covariant().get().message();
	}
}
/**
 * Both methods have different return type but it is method overriding. This is known as covariant return type.
 */