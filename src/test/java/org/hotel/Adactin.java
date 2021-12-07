package org.hotel;
import java.util.Date;
import org.ho.Base;
import org.hot.Pomhotel;
import org.junit.*;
public class Adactin extends Base {
@BeforeClass
public static void beforeclass() {
	launchBrowser("Chrome");
	impicitWait(20);
	System.out.println("Beforeclass");
}
@AfterClass
public static void afterClass() {
//	driver.quit();
	System.out.println("Afterclass");
}
@Test
public void test() throws Exception {
	launchUrl("https://adactinhotelapp.com/");
	String url1 = driver.getCurrentUrl();
	boolean ct = url1.contains("adactin");
	Assert.assertTrue("verify url1", ct);
	Pomhotel p=new Pomhotel();
	//click(p.getnewuser());
	fillTextBox(p.getenterusername(),  dataDriven("sat", "satdetails", 1, 0));
	String atuser = getAttribute(p.getenterusername());
	Assert.assertEquals("atuser", "Sathish14", atuser);
	fillTextBox(p.getenterpass(),  dataDriven("sat", "satdetails", 3, 2));
//	fillTextBox(p.getenterconpass(),  dataDriven("sat", "satdetails", 3, 2));
//	fillTextBox(p.getenterfulname(),  dataDriven("sat", "satdetails", 3, 0));
//	fillTextBox(p.getenteremail(),  dataDriven("sat", "satdetails", 1, 2));
//	Thread.sleep(20000);
//	click(p.getbtncheck());
//	click(p.getsubmit());
//	click(p.getclicklogin());
//	fillTextBox(p.getenterusername(),  dataDriven("sat", "satdetails", 1, 0));
//	fillTextBox(p.getenterpass(),  dataDriven("sat", "satdetails", 3, 2));
	click(p.getlogin());
	String url2 = getCurrentUrl();
	boolean contains = url2.contains("SearchHotel");
	Assert.assertTrue("verify search page", contains);
	selectByValue(p.getlocation(), "Brisbane");
	selectByValue(p.gethotel(), "Hotel Creek");
	selectByValue(p.getroom(), "Standard");
	//selectByValue(p.getno(), "2 - Two");
	click(p.getSubmit());
	String url3 = getCurrentUrl();
	boolean contain = url3.contains("com");
	Assert.assertTrue("verify select page", contain);
	click(p.getradio());
	click(p.getcontinue());
	fillTextBox(p.getfrstname(),  dataDriven("sat", "satdetails", 1, 0));
	fillTextBox(p.getlastname(),  dataDriven("sat", "satdetails", 1, 1));
	fillTextBox(p.getaddress(), "20/6, kalyan lane, Panruti");
	fillTextBox(p.getcard(), "8907654345678906");
	selectByValue(p.getentertype(), "VISA");
	Thread.sleep(10000);
	selectByVisibleText(p.getenterexpmonth(), "February");
	selectByVisibleText(p.getenterexpyear(), "2022");
	fillTextBox(p.getentercvv(), "907");
	click(p.getentersearch());
	String attribute = p.getenterorder().getAttribute("value");
	System.out.println(attribute);
	//System.out.println("Testdone");
}
@Before
public void before() {
	Date d=new Date();
	System.out.println("Test starts at.."+d);
}
@After
public void after() {
	Date d=new Date();
	System.out.println("Test ends at.."+d);
}
}
