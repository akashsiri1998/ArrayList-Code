package raj;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Properties;

public class propertiesFileDemo {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\IT TECH\\eclipse-workspace\\Demo\\src\\configue.properties");
			Properties p=new Properties();
			p.load(fis);
			
			String username=p.getProperty("username");
			String password=p.getProperty("password");
			
			System.out.println("User Name:= "+username);
			System.out.println("User Password:= "+password);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
