package Array;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
	
		int[]a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements:= ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;i++) {
				if(a[i]==a[j]) {
					System.out.println("Duplicate is:= "+a[j]);
				}
			}
		
		}
	}

}
