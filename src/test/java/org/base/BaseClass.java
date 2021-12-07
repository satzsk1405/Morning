package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;

	public static void browserlaunch() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium2\\Webdrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	public static void launchUrl(String url) {
		driver.get(url);

	}

	public static String getCurrentUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	public static void sendKeys(WebElement et, String value) {
		et.sendKeys(value);
	}

	public static void btnClick(WebElement e) {
		e.click();
	}

	public static void quit() {
		driver.quit();
	}

	public static void moveToElement(WebElement target) {
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();
	}

	public static void selectByIndex(WebElement e, int index) {
		Select s = new Select(e);
		s.selectByIndex(index);
	}
}
