package org.test;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitFbAssert 
{
	static WebDriver driver;
	
	@BeforeClass
	public static void launchBrowser()
	{
   System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\MavenProjectP\\chromedriver\\chromedriver.exe");
    driver= new ChromeDriver();
    driver.get("https://www.facebook.com/");
    }
	
	@AfterClass
	public static void quitBrowser()
	{
		driver.quit();
	}
	@Before
	public void startTime()
	{
		Date d = new Date();
		System.out.println("Start time " + d);
	}
	@After
	public void endTime()
	{
		Date d = new Date();
		System.out.println("Start time " + d);
	}
	
	@Test
	public void Test1() {
		 WebElement textbx = driver.findElement(By.id("email"));
		    textbx.sendKeys("arunuvan@gmail.com");
		    Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
	}
	
	@Test
	public void Test2() {
		
	WebElement textpass = driver.findElement(By.id("pass"));
    textpass.sendKeys("selenium");
    Assert.assertEquals("selenium",textpass.getAttribute("value"));
driver.findElement(By.id("loginbutton")).click();
		    
	}
	
	
	

}
