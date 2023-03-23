package com.infosys;

import java.util.Scanner;

public class encp_2 {
          
	
	 
	public static void main(String[] args) {
	

	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter Your Name:= ");
	      String name=sc.next();
	      System.out.println("Enter your Salary:= ");
	      int salary=sc.nextInt();
	      System.out.println("Enter your Emp-id:= ");
	      int empid=sc.nextInt();
	     
	       encp_1 e=new encp_1();
	       
	       e.setName(name);
	       e.setSalary(salary);
	       e.setEmpid(empid);
	       
	       System.out.println("User name:= "+e.getName());
	       System.out.println("User salary:= "+e.getSalary());
	       System.out.println("User Emp-id:= "+e.getEmpid());
	       System.out.println("User Country:= "+e.getCountry());
	       
		
	
		     
		
		
	}

}
