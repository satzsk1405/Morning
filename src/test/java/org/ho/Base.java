package org.ho;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;

	public static WebDriver launchBrowser(String browser) {	
		switch (browser) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		default:
			System.out.println("invalid");
			break;
		}
//		 System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\Locators\\Webdrivers\\chromedriver.exe");
//		 new ChromeDriver();
		 return driver;
	}
    public static void launchUrl(String url) {
	driver.get(url);
	driver.manage().window().maximize();
}
    public static void click(WebElement e) {
	e.click();

	}
    public static void impicitWait(long a) {
		driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
	}
    public static void fillTextBox(WebElement b, String value) {
		b.sendKeys(value);

	}
    public static String dataDriven(String name, String sheet, int i, int j) throws Exception  {
    	File location=new File("C:\\Users\\USER\\eclipse-workspace\\Junit\\src\\test\\resources\\"+name+".xls.xlsx");
		FileInputStream fis=new FileInputStream(location);
		Workbook w=new XSSFWorkbook(fis);
		Sheet s=w.getSheet(sheet);
		Row r=s.getRow(i);
		Cell c=r.getCell(j);
		int type = c.getCellType();
		String value=null;
		if(type==1) {
			 value = c.getStringCellValue();
			System.out.println(value);
		}
		else {
			if(DateUtil.isCellDateFormatted(c)) {
				Date d = c.getDateCellValue();
				SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yyyy");
				 value = sf.format(d);
				System.out.println(value);
			}
		else {
			double db = c.getNumericCellValue();
			long ln=(long) db;
			 value=String.valueOf(ln);
			System.out.println(value);
		}}
		return value;
	}
    public static void getWindowHandle() {
		String w = driver.getWindowHandle();
		Set<String> wh = driver.getWindowHandles();
		for (String id : wh) {
			if(!w.equals(wh)) {
				driver.switchTo().window(id);
			}
		}
		
	}
//    public static void btnClick(WebElement c) {
//    	c.click();
//    }
    public static String getCurrentUrl() {
    	  String url=driver.getCurrentUrl();
    	  return url;
    }
    public static String getAttribute(WebElement d) {
	return d.getAttribute("value");
	}
    public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}
    public static void moveToElement(WebElement g) {
		Actions e=new Actions(driver);
		e.moveToElement(g).perform();
	}
    public static void dragAndDrop(WebElement source, WebElement target) {
    	Actions e=new Actions(driver);
    	e.dragAndDrop(source, target).perform();
	}
    public static void contextClick(WebElement txtuser) {
    	Actions e=new Actions(driver);
		e.contextClick(txtuser).perform();
	}
    public static void doubleClick(WebElement txtuse) {
    	Actions e=new Actions(driver);
		e.doubleClick(txtuse).perform();
	}
    public static void selectByValue(WebElement g, String i) {
		Select s=new Select(g);
		s.selectByValue(i);
	}
    public static void selectByIndex(WebElement g, int i) {
		Select s=new Select(g);
		s.selectByIndex(i);
	}
    public static void selectByVisibleText(WebElement g, String i) {
		Select s=new Select(g);
		s.selectByVisibleText(i);
	}
    public static void getOptions(WebElement g) {
		Select s=new Select(g);
		s.getOptions();
	}
    public static void getAllSelectedOptions(WebElement g) {
		Select s=new Select(g);
		s.getAllSelectedOptions();
	}
    public static void isMultiple(WebElement g) {
		Select s=new Select(g);
		s.isMultiple();
	}
    public static void deselectByIndex(WebElement g,int i) {
		Select s=new Select(g);
		s.deselectByIndex(i);
	}
    public static void deselectByValue(WebElement g,String i) {
		Select s=new Select(g);
		s.deselectByValue(i);
	}
    public static void deselectAll(WebElement g) {
		Select s=new Select(g);
		s.deselectAll();
	}
    public static void getText(WebElement g) {
		Alert a=driver.switchTo().alert();
		a.getText();
	}
    public static void getScreenshotAs(String path) throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src=tk.getScreenshotAs(OutputType.FILE);
		File des= new File(path);
	    FileUtils.copyFile(src, des);
	}
    public static void execute(WebElement j, String i) {
    	JavascriptExecutor js=(JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView("+i+")", j);
    }
}
