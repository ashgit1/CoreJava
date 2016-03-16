package com.ashish.interfaceDemo;

public class CommandLine2 {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{

		System.out.println("Total arguments: " + args.length);
		for(String arg : args){
			System.out.println(arg);
		}
		
		try{
			System.out.println(args[5]); //My name is Ashishkumar Gupta
			throw new ArrayIndexOutOfBoundsException();
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		
	}

}
