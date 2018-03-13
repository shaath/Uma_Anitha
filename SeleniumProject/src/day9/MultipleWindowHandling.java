package day9;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		
		String gmail_WID=driver.getWindowHandle();
		
//		System.out.println(gmail_WID);
		driver.findElement(By.linkText("Privacy")).click();
		
		Set<String> Wids=driver.getWindowHandles();
		
		Iterator<String> it=Wids.iterator();
		while (it.hasNext()) 
		{
			String wId=it.next();
			System.out.println(wId);
			driver.switchTo().window(wId);
			System.out.println(driver.getTitle()+"---"+driver.getCurrentUrl());
			
			try 
			{
				driver.findElement(By.linkText("Terms of Service")).click();
			}
			catch (Exception e) 
			{
				System.out.println("The expected link not available in "+driver.getTitle()+" page ");
			}
			
		}
		driver.switchTo().window(gmail_WID);
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(5000);
//		driver.close();
		driver.quit();

	}

}
