package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gettext_getattribute {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");

		String t=driver.findElement(By.linkText("Images")).getText();
		System.out.println(t);
		
		String href=driver.findElement(By.linkText("Images")).getAttribute("href");
		System.out.println(href);
		
		boolean flag=driver.findElement(By.linkText("Images")).isEnabled();
		System.out.println(flag);
		
		String tag=driver.findElement(By.linkText("Images")).getTagName();
		System.out.println(tag);
	}

}
