package Demo;

public class A {
      int x=10;
      static int y=10;
	

	public static void main(String[] args) {
		A a=new A();
	      y=100;
		
		System.out.println(y++); //100
	 System.out.println(a.x++); //10
		
	 A a1=new A();
	 System.out.println(y++); //101
	 System.out.println(a.x++); //10
	}

}
