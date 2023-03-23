package String;

import java.util.Scanner;

public class TotalCountOfCharacter {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String nAMe:= ");
		String name=sc.nextLine();
		for(int i=0;i<name.length();i++) {
		char ch=name.charAt(i);
		
		if(ch!=' ') {
			count++;
		}
		}
		System.out.println(count +" =:Number of char Present In String:");
	}

}
