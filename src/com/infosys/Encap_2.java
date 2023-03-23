package com.infosys;
import java.util.*;
public class Encap_2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employe id:= ");
		int id=sc.nextInt();
		System.out.println("Enter Employee Salary:= ");
		int sal=sc.nextInt();
		System.out.println("Enter Employee City:= ");
		String ct=sc.next();
		
		Encap_1 e=new Encap_1();
		e.setEmpid(id);
		e.setSalary(sal);
		e.setCity(ct);
		
		System.out.println("Employee id := "+e.getEmpid());
		System.out.println("Employee Salary:= "+e.getSalary());
		System.out.println("Employee city := "+e.getCity());

	}

}
