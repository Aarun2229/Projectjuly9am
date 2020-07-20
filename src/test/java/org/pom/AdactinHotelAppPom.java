package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class AdactinHotelAppPom extends BaseClass 
{
	public AdactinHotelAppPom()	
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(className="login_register")
	
	private WebElement logBtn;

	public WebElement getLogBtn() 
	{
		return logBtn;
	}

}
