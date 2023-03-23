package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Assending {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add(20);
		al.add(10);
		al.add(50);
		al.add(5);
		Collections.sort(al);  // assending logic;
	Collections.sort(al,Collections.reverseOrder());  //  desending logic
	System.out.println(al);

	}

}
