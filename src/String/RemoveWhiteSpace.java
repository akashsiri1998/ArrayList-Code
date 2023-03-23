package String;

import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
	  
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter any String:= ");
		String s=sc.nextLine();
		s=s.replaceAll("\\s+", "");
		System.out.println(s);

	}

}
