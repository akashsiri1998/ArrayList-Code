package inheritance;
class A2{
	int a=10, b=20;
	public void getAddi() {
		int c=a+b;
		System.out.println("Addition is:= "+(c));
	}
}
class B2 extends A2{
	public void getSub() {
		System.out.println("Substraction is:= "+(a-b));
	}
	
}
public class mul_lev1 extends B2 {
     
	     public void getMul() {
	    	 System.out.println("Multiplication is:= "+(a*b));
	     }
	public static void main(String[] args) {
		
		mul_lev1  m=new mul_lev1 ();
		m.getAddi();
		m.getSub();
		m.getMul();
	}

}
