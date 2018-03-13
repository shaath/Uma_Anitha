package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidationEg {

	public static void main(String[] args) 
	{
		String Expval="Google";
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
		String actval=driver.getTitle();
		
		if (Expval.equalsIgnoreCase(actval))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
