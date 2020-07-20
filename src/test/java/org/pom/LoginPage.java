package org.pom;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;
public class LoginPage extends BaseClass
{
public LoginPage()
	{
PageFactory.initElements(driver,this);
	}

@FindBy(id="email")
private WebElement txtEmail;

@FindBy(id="pass")
private WebElement txtPass;

@FindBy(xpath = "//input[@value='Log In']")
private List<WebElement> btnLogin;

public WebElement getTxtEmail() 
{
return txtEmail;
	}

public WebElement getTxtPass() {
		return txtPass;
	}

public List<WebElement> getBtnLogin() {
		return btnLogin;
	}
	
	}
