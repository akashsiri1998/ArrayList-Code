package Array;

import java.util.ArrayList;

public class mergeArrayList {

	public static void main(String[] args) {
		
		
		ArrayList al=new ArrayList();
		al.add(20);
		al.add(50);
		al.add(50);
		al.add(12);
		
		ArrayList a=new ArrayList();
		a.add(50);
		a.add(125);
		
		al.addAll(a);
		System.out.println(al);
		

	}

}
