package String;

import java.util.Scanner;

public class NumberOfChar {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any NAme");
		String s=sc.nextLine();
		
		for(int i=0;i<s.length();i++) {
		
			if(s.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("Number of Character:= "+count);

	}

}
