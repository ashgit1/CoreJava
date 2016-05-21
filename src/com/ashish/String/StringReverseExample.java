package com.ashish.String;

public class StringReverseExample {

	public static void main(String[] args) {
		String string = "abcdef";
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println("\nString before reverse: " + string);
		System.out.println("String after reverse: " + reverse);
		
		int len = string.length();
		StringBuffer strbuf = new StringBuffer();
		
		for(int i = len-1; i >=0  ; i--){
			strbuf.append(string.charAt(i));
		}
		
		System.out.println("Reverse of " + string + " is " + strbuf.toString());
	}
}
