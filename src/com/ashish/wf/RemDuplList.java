package com.ashish.wf;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemDuplList {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<String>();
		al.add("Ashish");
		al.add("Tanya");
		al.add("Ashish");
		al.add("Sachin");
		
		Set<String> set = new LinkedHashSet<String>();
		set.addAll(al);
		al.clear();
		al.addAll(set);
		
		for(String value : al){
			System.out.println(value);
		}
	}

}
