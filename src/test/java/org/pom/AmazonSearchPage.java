package org.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class AmazonSearchPage extends BaseClass
{
public  AmazonSearchPage()
{
	PageFactory.initElements(driver,this);
}
  @FindBys({@FindBy(id="twotabsearchtextbox"),@FindBy(xpath="//input[@type='text']")})
  private WebElement txtSearch;
  
  @FindBys({@FindBy(className="nav-input"),@FindBy(xpath="//input[@type='submit']")})
  private List<WebElement> btnSearch;

public WebElement getTxtSearch() {
	return txtSearch;
}

public List<WebElement> getBtnSearch() {
	return btnSearch;
}
  







}
