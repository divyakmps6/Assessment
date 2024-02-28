package org.utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BaseClass {

	public static WebDriver driver;
	public static Properties p;
	public static FileReader reader;
	public static Actions a;
	public static Select s;
	public static JavascriptExecutor js;

	public static String readProperty(String propertyName) {

		try {
			reader = new FileReader("Config.properties");
			p = new Properties();
			p.load(reader);
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p.getProperty(propertyName);
	}

	public static void loadDriver(String browserType) {
		if (browserType.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserType.equals("edge")) {
			driver = new EdgeDriver();
		}
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void applyWaitToAllElements() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void maxWindow() {
		driver.manage().window().maximize();

	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void verifyPageUrl(String text) {
		Assert.assertTrue(driver.getCurrentUrl().contains(text));

	}

	public static void selectFromDropDown(WebElement element, String text) {
		s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static void deleteCookies() {
		driver.manage().deleteAllCookies();

	}

	public static String findLowestValue() {

		List<WebElement> prices = driver.findElements(By.xpath("//table[@class='table']//tr//td[6]"));

		Map<Integer, String> map = new TreeMap<Integer, String>();

		for (WebElement price : prices) {
			int amt = Integer.parseInt(price.getText().replaceAll("[^0-9]", ""));
			map.put(amt, price.getText());
		}

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			return entry.getValue();
		}
		return null;

	}

	public static void chooseFlightWithLowestPrice(String price) {

		WebElement btnChooseFlight = driver.findElement(By.xpath("//td[contains(text(),'" + price
				+ "')]//preceding-sibling::td[5]//input[@value='Choose This Flight']"));
		btnChooseFlight.click();
	}

	public static void verifyCostFormat(WebElement element) {

		String text = element.getText();
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);

			if (i == 3) {
				Assert.assertTrue(c == '.');
			} else {
				Assert.assertTrue(Character.isDigit(c));
			}

		}

	}

	public static void enterText(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void getAndPrintOrderId(WebElement element) {

		System.out.println(element.getText());

	}

	public static void clickElement(WebElement element) {
		element.click();
	}

	public static void pauseExecution(long milliseconds) {

		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void verifyPresenceOfAnElement(WebElement element) {
		Assert.assertTrue(element.isDisplayed());
	}

	public static void verifyPresenceOfText(WebElement element, String text) {
		Assert.assertTrue(element.getText().contains(text));

	}

	public static void closeBrowser() {
		driver.quit();
	}
	
	public static void  clicksscript(WebElement ele) {
		
		 js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click()", ele );
	}
	
	public static void sendKeysJavascript(WebElement ele, String text) {
		
		
        js = (JavascriptExecutor) driver;
        
        js.executeScript("arguments[0].setAttribute('value',"+text+")", ele);
	}

}
