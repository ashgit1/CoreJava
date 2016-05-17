package com.ashish.wf;

public class Employee {

	int eid;
	String fname;
	String lname;
	
	public Employee(int id, String fname, String lname){
		this.eid = id;
		this.fname = fname;
		this.lname = lname;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	@Override
	public boolean equals(Object obj){
		
		if(obj == null){
			return false;
		}
		if(!(obj instanceof Employee)){
			return false;
		}
		
		Employee other = (Employee) obj;
		if((this.eid == other.eid) && 
			(this.fname == other.fname) && 
			(this.lname == other.lname)){
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode(){
		return eid * fname.hashCode() * lname.hashCode();
	}
}

/*
 * Since we are overriding equals() by eid, fname and lname, therefore while overriding hashCode()
 * include mathematics of eid, fname and lname(all). Whatever you use for equals() same use it for hachCode().
*/