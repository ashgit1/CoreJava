package com.ashish.mmt;

import java.util.Arrays;

public class Median {

	public static void main(String[] args) {
		
		int array[] = {1, 5, 8, 2, 3, 9, 45, 32, 12, 23};
		Arrays.sort(array);
		
		System.out.print("Sorted Array : ");
		for(int i=0; i<array.length; i++){
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		int middle = (array.length)/2;
		int median;
		
		if(array.length % 2 == 1){
			median = array[middle];
		}else{
			median = (array[middle-1] + array[middle])/2;
		}
		System.out.println("Meidan is " + median);
	}

}
