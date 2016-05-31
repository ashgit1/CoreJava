package com.ashish.wf;

import java.util.HashMap;
import java.util.Map;

public class HashMapCount {

	public static void main(String[] args) {

		Map<Employee, String> mapCount = new HashMap<Employee, String>();
		
		mapCount.put(new Employee(1, "Ashish", "Gupta"), "Object 1");
		mapCount.put(new Employee(2, "Ashish", "Gupta"), "Object 1");
		mapCount.put(new Employee(3, "Ashish", "Gupta"), "Object 1");
		
		System.out.println("Size of Map: " + mapCount.size());
	}

}
