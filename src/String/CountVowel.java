package String;

import java.util.Scanner;

public class CountVowel {

	public static void main(String[] args) {
		int count=0; int countC=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String nAMe:= ");
		String name=sc.nextLine();
		
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(ch=='a' || ch=='A' ||  ch=='e' ||  ch=='E' ||  ch=='i' ||  ch=='i' ||  ch=='o' ||  ch=='O' ||  ch=='u' ||  ch=='U' ) {
				count++;
			}
			else {
				countC++;
			}
		}
		System.out.println("Number of Vowel Count is:= "+count);
		System.out.println("Number of the Consunent is:= "+countC);

	}

}
