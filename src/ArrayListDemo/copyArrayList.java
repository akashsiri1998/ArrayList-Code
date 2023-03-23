package ArrayListDemo;

import java.util.ArrayList;

public class copyArrayList {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
	
		al.add(20);
		al.add(30);
		al.add(40);
		
		ArrayList a=new ArrayList();
		
		a.add(50);
		a.add(60);
		a.add(70);
		
		al.addAll(a);
		System.out.println("Copy of the ArrayList is:= "+al);
	}

}
