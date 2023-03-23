package inheritance;

public class Single_inheritance {

	public static void main(String[] args) {
		 
		System.out.println("Start");
		Single_inheritance s=new Single_inheritance ();
		
		Single_inheritance.m1(10);
		Single_inheritance.m1(10,10);
		Single_inheritance.m1(10,50,50);
		                                     // can we overload in main method   yes ;
	}
		public  static void m1(int a) {
			System.out.println("method");
		}
		public static void m1(int a,int b) {
			System.out.println("sl");
		}
		public static void m1(int a,int b,int c) {
			System.out.println("ak");
		}

	}


