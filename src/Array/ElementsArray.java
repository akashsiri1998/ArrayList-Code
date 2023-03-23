package Array;

import java.util.Scanner;

public class ElementsArray {

	public static void main(String[] args) {
	 int a[]=new int[5];
	 Scanner sc=new Scanner(System.in);
	 System.out.println("ENter Any Number");
	 for(int i=0;i<a.length;i++) {
	
	        a[i]=sc.nextInt();
	}
	 for(int i=0;i<a.length;i++) {
		 
	 
	 System.out.println("Elements Ofarray is:= "+a[i]);
	}
	 
	 }

}
