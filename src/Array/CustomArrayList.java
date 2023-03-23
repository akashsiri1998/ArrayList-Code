package Array;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomArrayList {

	int id;
	String name;
	@Override
	public String toString() {
		return "CustomArrayList [id=" + id + ", name=" + name + "]";
	}

	CustomArrayList (int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(new CustomArrayList(101,"Akash"));
		al.add(new CustomArrayList(102,"Raj"));
	
	
		Iterator i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		 

	}

}
