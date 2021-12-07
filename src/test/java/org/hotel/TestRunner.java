package org.hotel;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(Adactin.class)
public class TestRunner {
	@BeforeClass
	public static void beforeclass() {
//		launchBrowser("Chrome");
//		impicitWait(20);
		System.out.println("Beforeclass");
	}
	@AfterClass
	public static void afterClass() {
//		driver.quit();
		System.out.println("Afterclass");
	}
}
