package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gooogle.com");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));

		System.out.println("The number of links available in google page is "+links.size());
		
		for (int i = 0; i < links.size(); i++) 
		{
			String text=links.get(i).getText();
			
			if (!text.equalsIgnoreCase("")) 
			{
				System.out.println(text);
				
			}
			
		}

	}

}
