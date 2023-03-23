package inheritance;

import java.util.Scanner;

class C1{
	
	int a,b;
	public void add() {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter 1st Number: ");
	 a=sc.nextInt();
	 System.out.println("Enter 2nd Number:= ");
	  b=sc.nextInt();
	 
	}
}
class C2 extends C1{
	public void mul() {
		System.out.println("Multiplcation is:= "+(a*b));
	}
}
public class hire_1 extends C1{
                   
	 public void div() {
		 System.out.println("Division is:= "+(a/b));
	 }
	 
	public static void main(String[] args) {
		
		C2 c=new C2();
		c.add();
		c.mul();
		 hire_1 h=new hire_1();
		 h.add();
		 h.div();
		 

	}

}
