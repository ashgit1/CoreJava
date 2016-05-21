package com.ashish.wf;

import java.util.ArrayList;
import java.util.List;

public class RemDuplList2 {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<String>();
		al.add("Ashish");
		al.add("Tanya");
		al.add("Ashish");
		al.add("Sachin");
		
		System.out.println("Before deletion : ");
		for(String value : al){
			System.out.println(value);
		}
		
		long startTime = System.currentTimeMillis();
		al.remove("Ashish");
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken in ms to remove duplicates : " + (endTime-startTime) + " ms");
		
		System.out.println("After deletion : ");
		for(String value : al){
			System.out.println(value);
		}
	}

}
