package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTC {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.id("identifierId"));
		//Entering the text into email textbox
		email.sendKeys("testingtoolstrainer449");
		
//		email.clear();
		//clicking on next button
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
//		Thread.sleep(10000);
		//Enter the password
		driver.findElement(By.name("password")).sendKeys("123456789");
		//clicking on next button
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
		
		

	}

}
