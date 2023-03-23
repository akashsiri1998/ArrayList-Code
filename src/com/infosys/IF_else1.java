package com.infosys;

import java.util.Scanner;

public class IF_else1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:= ");
		int num=sc.nextInt();
		
		String nm=(num>0)? "number is greter": "number is not greter";
		System.out.println(nm);
		
		
		  
	}

}
