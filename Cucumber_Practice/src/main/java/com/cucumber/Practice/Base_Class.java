package com.cucumber.Practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String launch) {
		if(launch.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\eclipse-workspace-Cucumber\\Cucumber_Practice\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(launch.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\Admin\\eclipse-workspace-Cucumber\\Cucumber_Practice\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		return driver;
		}
	 
	//webdriver methods
	public static void getURL(String link) {
		driver.get(link);
	}
	
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public static void getCurrentURL() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	//navigation method
	
	public static void navigateTo(String link) {
		driver.navigate().to(link);
	}
	
	public static void navigateBack() {
		driver.navigate().back();
	}
	
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}
	
	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void close() {
		driver.close();

	}
	public static void quit() {
		driver.quit();

	}
	
	//webElement method
	
	public static void inputValues(WebElement element, String value) {
		element.sendKeys(value);
		
	}
	
	public static void click(WebElement element) {
		element.click();
	}
	
	public static String getText(String value) {
		WebElement e = driver.findElement(By.xpath(value));
		return e.getText();
	}
	
	public static String getAttributes(String xpath, String value) {
		WebElement e = driver.findElement(By.xpath(xpath));
		return e.getAttribute(value);
	}
	
	public static boolean isDisplayed(String value) {
		WebElement e = driver.findElement(By.xpath(value));
		return e.isDisplayed();
	}
	
	public static boolean isEnabled(String value) {
		WebElement e = driver.findElement(By.xpath(value));
		return e.isEnabled();
	}
	
	public static boolean isSelected(String value) {
		WebElement e = driver.findElement(By.xpath(value));
		return e.isDisplayed();
	}
	
	public static void clear(WebElement element) {
		element.clear();
	}
	
	//wait
	
	public static void waitexplicit(long value, WebElement value1) {
		WebDriverWait wait = new WebDriverWait(driver,value);
		wait.until(ExpectedConditions.invisibilityOf(value1));
	}
	
	public static void waitimplicit(long value) {
		driver.manage().timeouts().implicitlyWait(value, TimeUnit.SECONDS);
	}
	
	
	//TakesScreenShot
	
	public static void screenShot (String filename) throws IOException {//doubt
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Admin\\eclipse-workspace-Cucumber\\Cucumber_Practice\\ScreenShots\\"+filename+".png");
		FileUtils.copyFile(sourcefile, destination);
		
	}
	
	//Alert Method
	
	public static void alertOk() {
		Alert a = driver.switchTo().alert();
		a.accept();		
	}
	
	public static void alertCancel() {
		Alert a = driver.switchTo().alert();
		a.dismiss();	
	}
	
	public static void alertInput(String value) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(value);
		String text = a.getText();
		System.out.println(text);
	}
	
	//Action Method
	
	public static void clickAction(WebElement element) {
		Actions a = new Actions (driver);
		a.click().build().perform();		
	}
	
	public static void contextClick(WebElement element) {
		Actions a = new Actions (driver);
		a.contextClick(element).build().perform();		
	}
	
	public static void doubleClick(WebElement element) {
		Actions a = new Actions (driver);
		a.doubleClick(element).build().perform();		
	}
	
	public static void moveToElement(WebElement element) {
		Actions a = new Actions (driver);
		a.moveToElement(element).build().perform();		
	}
	
	public static void dragAndDrop(WebElement element1, WebElement element2) {
		Actions a = new Actions (driver);
		a.dragAndDrop(element1, element2).build().perform();		
	}
	
	//Select Method
	
	public static void selectBy(WebElement element, String type, String value, int index, String visibletext) {
		if(type.equalsIgnoreCase("value")) {
			Select s = new Select (element);
			s.selectByValue(value);
		}
		else if(type.equalsIgnoreCase("index")) {
			Select s = new Select (element);
			s.selectByIndex(index);
		}
		else if (type.equalsIgnoreCase("visibletext")){
			Select s = new Select (element);
			s.selectByVisibleText(visibletext);
		}
		else {
			System.out.println("Invalid Type");
		}
	}
	
	public static void deselectBy(WebElement element, String type, String value, int index, String visibletext) {
		if(type.equalsIgnoreCase("value")) {
			Select s = new Select (element);
			s.deselectByValue(value);
		}
		else if(type.equalsIgnoreCase("index")) {
			Select s = new Select (element);
			s.deselectByIndex(index);
		}
		else if (type.equalsIgnoreCase("visibletext")){
			Select s = new Select (element);
			s.deselectByVisibleText(visibletext);
		}
		else {
			System.out.println("Invalid Type");
		}
	}
	
	public static boolean isMultiple(String value) {
		WebElement multiple = driver.findElement(By.xpath(value));
		Select s = new Select (multiple);
		return s.isMultiple();
		
	}
	
	//robot method
	
	public static void keyfunction() throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
	
	public static void keyfunctionEnter() throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	//Java Script Method
	
	public static void javascript(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoview(true)", element);
	}
	
	public static void javascriptClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", element);
	}
	public static void scrollUpAndDown(int num1, int num2) {//doubt
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(num1,num2)", "");
	}
	
	//Frame
	
	public static void frameIndex(String value) {
		driver.switchTo().frame(value);
	}
	
	public static void frameId(String value) {
		driver.switchTo().frame(value);
	}
	
	public static void frameWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public static void defaultFrame() {
		driver.switchTo().defaultContent();
	}
	
	public static void parenttFrame() {
		driver.switchTo().parentFrame();
	}

}
