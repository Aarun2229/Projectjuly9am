package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Facebook extends BaseClass
{
	public static void main(String[] args) throws InterruptedException
	{
		launchBrowser();
		loadurl("https://www.facebook.com/");
		maxmize();
		
		geturl();
		getTitle();
		
		WebElement textEmail = driver.findElement(By.id("email"));
		insert(textEmail,"arunuvan@gmail.com");
		Thread.sleep(3000);
		
		WebElement text = driver.findElement(By.xpath("//span[text()='Create an account']"));
		getText(text);
		
		
		
		WebElement txtValue = driver.findElement(By.id("email"));
		getAttribute(txtValue,"arunuvan@gmail.com");
		
		
		
		
		
		WebElement pass = driver.findElement(By.id("pass"));
		doubleclk(pass);
		
		WebElement pass1 = driver.findElement(By.id("pass"));
		contexteclk(pass1);
		
		
		
		
		
		
		
		
		WebElement btnlogin = driver.findElement(By.id("u_0_b"));
		click(btnlogin);
		
		
		
		

        // quiteBrowser();
		
		
		
		
	}

}
