package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class UserDefineArrayList {

	int id;
	String name;
	int salary;
	UserDefineArrayList(int id,String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public static void main(String[] args) {
		
		ArrayList <UserDefineArrayList> al=new ArrayList<UserDefineArrayList>();
		al.add(new UserDefineArrayList(104,"akash",35000));
		al.add(new UserDefineArrayList(102,"nayan",29000));
		al.add(new UserDefineArrayList(101,"rutika",39000));
		al.add(new UserDefineArrayList(103,"pooja",10000));
		
		//System.out.println(al);
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

	@Override
	public String toString() {
		return "UserDefineArrayList [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
