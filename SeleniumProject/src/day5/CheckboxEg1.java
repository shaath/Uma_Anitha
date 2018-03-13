package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxEg1 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Dell/Desktop/Test.html");
		
		WebElement check2=driver.findElement(By.xpath("html/body/form/input[2]"));
		
		if (check2.isSelected()) 
		{
			check2.click();
		}
		else
		{
			System.out.println("It is already in unselected position");
		}

	}

}
