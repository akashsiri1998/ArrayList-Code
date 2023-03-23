package ArrayListDemo;

import java.util.ArrayList;

public class IntGeneric {

	public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("Akash");
	al.add("Kalpesh");
	al.add("RAj");
	
	System.out.println(al.size());
	System.out.println(al.remove(2));
	System.out.println(al.contains("Akash"));

	}

}
