package com.ashish.String;

public class StringComparePerformance {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		System.out.println("Total Memory: " + Runtime.getRuntime().totalMemory());
		
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 500000000; i++) {
			String s1 = "hello";
			String s2 = "hello";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken for creation of 500000000 String literals : " + (endTime - startTime) + " milli seconds");
		
		System.out.println("Free Memory after String Literals : " + Runtime.getRuntime().freeMemory());

		long startTime1 = System.currentTimeMillis();
		for (int i = 0; i < 500000000; i++) {
			String s3 = new String("hello");
			String s4 = new String("hello");
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("Time taken for creation of 500000000 String objects : " + (endTime1 - startTime1) + " milli seconds");
		
		System.out.println("Free Memory after Object : " + Runtime.getRuntime().freeMemory());
		
		Runtime.getRuntime().gc();

		System.out.println("Total Memory after calling gc() : " + Runtime.getRuntime().totalMemory());
		
	}
}
