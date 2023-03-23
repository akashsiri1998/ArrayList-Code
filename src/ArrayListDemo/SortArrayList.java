package ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(60);
		
		Collections.sort(al);
		System.out.println(al);
	}

}
