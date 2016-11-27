package com.ashish.acl;

class Employee {
    public static int empid;
    public static String empname;

    public static void main(String[] args) {
        System.out.println("print employe details:" + empid + " " + empname);
    }
    
    public String toString(){
    	return empid + empname;
    }
}

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e = new Employee();
        e.empid = 20;
        e.empname = "jerry";
        
        Employee.empid = 10;
        Employee.empname = "tom";
        Employee.main(null);
        
        e.main(null);
        System.out.println(e.toString());

	}
}
