package String;

import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String nAMe:= ");
		String name=sc.nextLine();
		
		String s=name.replaceAll("\\s+", "");
		
		System.out.println("Remove Blank Space:= "+s);

	}

}
