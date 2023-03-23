package Array;

import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) { 
		
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Elements Array ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
	
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println("Reverse is:= "+a[i]);
		}
	}


}
