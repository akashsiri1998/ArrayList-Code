package inheritance;

public class test_rbi_sbi {

	public static void main(String[] args) {
		 
		 RBI r=new RBI();
		 
		System.out.println(r.a); //10
		System.out.println(r.b);  //20
		
		r.m1();  //rbi
		r.m2();  //rbi
		
		SBI s=new SBI();
		
		System.out.println(s.c); //80
		System.out.println(s.b); //52
		System.out.println(s.a);   //10
		
		s.m2(); //sbi
		s.m3(); //sbi
		s.m1(); //rbi
		

	}

}
