package Array;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		int[]a=new int[5];
		int[]b=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements:= ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();

	}

		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		System.out.println(a[i]);
	
	
		}
	}

}
