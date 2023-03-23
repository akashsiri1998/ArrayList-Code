package String;

import java.util.Scanner;

public class StringToChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String nAMe:= ");
		String name=sc.nextLine();
		
		char ch[]=name.toCharArray();
        for(int i=0;i<name.length();i++) {
        	System.out.println("String To Char:= "+ch[i]);
        }
	}

}
