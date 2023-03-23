package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class CopyArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		ArrayList <Integer>al1=new ArrayList();
		
		al1.add(50);
		al1.add(60);
		
		al.addAll(al1);
		System.out.println(al);
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
