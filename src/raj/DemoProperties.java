package raj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DemoProperties {

	public static void main(String[] args) {
	  
		   try {
			FileInputStream fis=new FileInputStream("C:\\Users\\IT TECH\\eclipse-workspace\\Demo\\src\\configue.properties");
		    Properties p=new Properties();
		    p.load(fis);
		    
		    String user=p.getProperty("username");
		    String pass=p.getProperty("Password");
		    
		    
		    System.out.println("User Name is:= "+user);
		    System.out.println("Password is:= "+pass);
		    
		   
		   } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		        

	}

}
