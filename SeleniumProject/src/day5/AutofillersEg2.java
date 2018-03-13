package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AutofillersEg2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("s");
		Sleeper.sleepTightInSeconds(3);
		
//		List<WebElement> list=driver.findElements(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li"));
		WebElement block=driver.findElement(By.xpath(".//ul[@class='autoFill']"));
		List<WebElement> list=block.findElements(By.tagName("li"));
		
		
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) 
		{
			String city=list.get(i).getText();
			if (city.equalsIgnoreCase("surat")) 
			{
				list.get(i).click();
				break;
			}
		}

	}

}
