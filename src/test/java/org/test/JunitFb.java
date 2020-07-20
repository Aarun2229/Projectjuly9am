package org.test;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitFb 
{
	static WebDriver driver;
	
	@BeforeClass
	public static void launchBrowser()
	{
   System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\MavenProjectP\\chromedriver\\chromedriver.exe");
    driver= new ChromeDriver();
	}
	
	@AfterClass
	public static void quitBrowser()
	{
		driver.quit();
	}
	
	@Test
	public void login()
	{
		driver.get("https://www.facebook.com/");
	    WebElement textbx = driver.findElement(By.id("email"));
	    textbx.sendKeys("arunuvan@gmail.com");
	    
	    WebElement textpass = driver.findElement(By.id("pass"));
	    textpass.sendKeys("12345");
	}
	
	@Before
	public void startTime()
	{
		Date d = new Date();
		System.out.println("Start time : " + d);
	}
	
	@After
	public void endTime()
	{
		Date d = new Date();
		System.out.println("End time : " + d);	
	}
	
	
}
