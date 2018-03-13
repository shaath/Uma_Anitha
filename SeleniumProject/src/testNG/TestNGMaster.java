package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGMaster 
{
	public static WebDriver driver;
	public static String url="http://opensource.demo.orangehrmlive.com";
	public static String expval,actval;
	public static String u="Admin",p="admin";
	public static String f="Vignan",l="Kumar",eId="Emp5486";
	public static String ename=f+" "+l,uname=f+l+"1234",pswd=f+l+"1234",cpswd=f+l+"1234";
	@BeforeSuite
	public void org_Launch()
	{
		driver=new FirefoxDriver();
		expval="LOGIN";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		 Assert.assertEquals(actval, expval,"Launch Failed");	
	}
	@AfterSuite
	public void org_Close()
	{
		driver.close();
	}
	@BeforeTest
	public void org_Login()
	{
		expval="welcome";
		driver.findElement(By.id("txtUsername")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnLogin")).click();
		Sleeper.sleepTightInSeconds(3);
		actval=driver.findElement(By.id("welcome")).getAttribute("id");
		Assert.assertEquals(actval, expval,"Login Failed");
	}
	@AfterTest
	public void org_Logout()
	{
		Sleeper.sleepTightInSeconds(3);
		expval="LOGIN";
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(actval, expval,"Logout Failed");
	}
}
