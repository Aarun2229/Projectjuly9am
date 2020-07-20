package org.test;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass 
{
	public static WebDriver driver;
	static Actions a;
	static Select s;
	static Robot r;
	static JavascriptExecutor jk;
	static Alert al;

	
	public static void launchBrowser()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\MavenProjectP\\chromedriver\\chromedriver.exe");
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
	driver = new ChromeDriver();
	}
	
	public static void loadurl(String url)
	{
		driver.get(url);
	}
	
	public static void geturl()
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	
	public static void getTitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public static void  insert(WebElement e, String value)
	{
		e.sendKeys(value);
	}
	
	public static void click(WebElement e)
	{
		e.click();
	}
	
	public static void  moveTo(WebElement e)
	{
		a= new Actions(driver);
		a.moveToElement(e).perform();	
	}
	
	public static void dragDrope(WebElement src, WebElement des)
	{
		a.dragAndDrop(src, des).perform();
	}
	
	public static void  SBI(WebElement e,int index)
	{
		s= new Select(e);
		s.selectByIndex(index);
	}
	
	public static void quiteBrowser()
	{
		driver.quit();
	}
	//
	public static void maxmize()
	{
	driver.manage().window().maximize();
	
	}
	
	public static void getText(WebElement e)
	{
		String txtName = e.getText();
		System.out.println(txtName);
	}
	
	public static void getAttribute(WebElement e, String str)
	{
		String textValue = e.getAttribute("value");
		System.out.println(textValue);
	}
	
	public static void doubleclk (WebElement e)
	{
		a.doubleClick(e).perform();
	}
	
	public static void contexteclk (WebElement e)
	{
		a.contextClick(e).perform();
	}
	
	public static void keyUp(WebElement element, String key) {
		a.keyUp(element, key).perform();
	}
	
	public static void keyDown(WebElement element, String key) {
		a.keyDown(element, key).perform();
	}
	
	public static void keyPress(int key) throws AWTException {
		r = new Robot();
		r.keyPress(key);
		
	}
	
	public static void keyRelease(int key) throws AWTException {
		r = new Robot();
		r.keyRelease(key);
		
	}
	
	public static void execScript(String script, WebElement element) {
		jk.executeScript(script, element);
	}
	
	public static void acceptAlert() {
		al = driver.switchTo().alert();
		al.accept();
	}
	
	public static void dismissAlert() {
		al = driver.switchTo().alert();
		al.dismiss();
	}
	
	public static void promptAlertAccept(String text) {
		al = driver.switchTo().alert();
		al.sendKeys(text);
		al.accept();
	}
	
	public static void promptAlertDismiss(String text) {
		al = driver.switchTo().alert();
		al.sendKeys(text);
		al.dismiss();
	}
	
	public static void getCssVal(WebElement element, String value) {
		String val = element.getCssValue(value);
		System.out.println(val);
	}
	
	public static void frameByIndex(int index) {
		driver.switchTo().frame(index);
	}
	
	public static void frameById(String id) {
		driver.switchTo().frame(id);
	}
	
	public static void frameByElement(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public static void window(String str) {
		driver.switchTo().window(str);
	}
	
	public static void deselByIndex(WebElement element, int index) {
		s = new Select(element);
		s.deselectByIndex(index);
	}
	
	public static void deselByValue(WebElement element, String value) {
		s = new Select(element);
		s.deselectByValue(value);
	}
	
	public static void deselByVisibleText(WebElement element, String text) {
		s = new Select(element);
		s.deselectByVisibleText(text);
	}
	
	public static void selByIndex(WebElement element, int index) {
		s = new Select(element);
		s.selectByIndex(index);
	}
	
	public static void selByValue(WebElement element, String value) {
		s = new Select(element);
		s.selectByValue(value);
	}
	
	public static void selByVisibleText(WebElement element, String text) {
		s = new Select(element);
		s.selectByVisibleText(text);
	}
	
	public static void driverClose() {
		driver.close();
	}
	
	public static void driverQuit() {
		driver.quit();
	}
	
	
	
}

	
	
    
	
	
	
	
	
	
