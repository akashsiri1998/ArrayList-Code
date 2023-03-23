package CollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class DemonstrateArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter The Number");
		int num=sc.nextInt();
		ArrayList al=new ArrayList ();
		al.add(20);
		al.add(30);
		al.add(20);
		al.add(50);
		
		System.out.print(al.contains(num));
		System.out.println(al.size());
		}

}
