package com.infosys;

import java.util.Scanner;

public class Encapsul {

	  private int salary;
	  public void getSal(int sal) {
		  
		  if(sal>0) {
			  salary=sal;
		  }
		  else {
			  salary=0;
			  System.out.println("Sorry invalid salary");
		  }
	  }
	  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter anu number:= ");
		int num=sc.nextInt();
		
		Encapsul e=new Encapsul();
		e.getSal(num);
	
		
	

	}

}
