package com.ashish.acl;

public class TryCatchFinally {

	public static void main(String[] args) {

		int ret = returnValue();
		System.out.println(ret);
	}

	private static int returnValue() {

		int value = 5;

		try {
			return value;
		} catch (Exception e) {
			//return value;
		} finally {
			System.out.println("Ash");
			//return value;
		}
		return 0;
	}

}
