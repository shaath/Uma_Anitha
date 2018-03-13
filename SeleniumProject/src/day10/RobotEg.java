package day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotEg {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download/");
		
		driver.findElement(By.linkText("3.9.1")).click();
		Thread.sleep(5000);
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(5000);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(5000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}
