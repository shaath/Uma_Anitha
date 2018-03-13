package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxEg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Dell/Desktop/Test.html");
		
//		List<WebElement> checks=driver.findElements(By.xpath("html/body/form/input"));
//		for (int i = 0; i < checks.size()-1; i++) 
//		{
//			if (!checks.get(i).isSelected()) 
//			{
//				checks.get(i).click();
//			}
//		}
		
		List<WebElement> checks=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checks.size());
		for (int i = 0; i < checks.size(); i++)
		{
			if (!checks.get(i).isSelected())
			{
				checks.get(i).click();
			}
		}

	}

}
