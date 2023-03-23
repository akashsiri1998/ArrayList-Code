package inheritance;
class A1{
	public void getDisp() {
		System.out.println("Display method: ");
	}
}
public class Single extends A1{
	
	public void getDisp1() {
		System.out.println("disp1 method");
	}

	public static void main(String[] args) {
		

		
		   Single s=new Single();
		   s.getDisp();
		   s.getDisp1();
	}

}
