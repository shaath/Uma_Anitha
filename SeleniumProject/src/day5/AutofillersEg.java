package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class AutofillersEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("spiderman");
		Sleeper.sleepTightInSeconds(5);
		
		List<WebElement> childs=driver.findElements(By.xpath(".//*[@id='suggestions']/div"));
		System.out.println(childs.size());
		for (int i = 0; i < childs.size(); i++) 
		{
			String text=childs.get(i).getText();
			System.out.println(text);
			if (text.equalsIgnoreCase("spiderman pencil box"))
			{
				childs.get(i).click();
				break;
			}
		}

	}

}
