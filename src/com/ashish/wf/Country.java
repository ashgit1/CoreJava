package com.ashish.wf;

public class Country extends Object{
	
	int code;
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	@Override
	public boolean equals(Object obj){
		
		if(obj == null){
			return false;
		}
		if(!(obj instanceof Country)){
			return false;
		}
		
		Country other = (Country)obj;
		if(this.code == other.code){
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		return (code*prime);
	}
}

/*
 * Since we are overriding equals() by code, therefore while overriding hashCode()
 * include mathematics of code only.
*/