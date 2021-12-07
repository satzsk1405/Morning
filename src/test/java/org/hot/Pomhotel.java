package org.hot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.ho.Base;
public class Pomhotel extends Base{
	public Pomhotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='New User Register Here']")
	private WebElement newuser;
	@FindBy(id="username")
	private WebElement enterusername;
	@FindBy(id="password")
	private WebElement enterpass;
	@FindBy(id="re_password")
	private WebElement enterconpass;
	@FindBy(id="full_name")
	private WebElement enterfulname;
	@FindBy(id="email_add")
	private WebElement enteremail;
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement btncheck;
	@FindBy(id="Submit")
	private WebElement submit;
	@FindBy(xpath="//a[text()='Click here to login']")
	private WebElement clicklogin;
	@FindBy(id="login")
	private WebElement login;
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotel;
	@FindBy(id="room_type")
	private WebElement room;
	@FindBy(id="room_nos")
	private WebElement no;
	@FindBy(id="Submit")
	private WebElement submit2;
	@FindBy(xpath="//input[@type='radio']")
	private WebElement radio;
	@FindBy(id="continue")
	private WebElement continu;
	@FindBy(id="first_name")
	private WebElement frstname;
	@FindBy(id="last_name")
	private WebElement lastname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement card;
	@FindBy(id="cc_type")
	private WebElement entertype;
	@FindBy(name="cc_exp_month")
	private WebElement enterexpmonth;
	@FindBy(id="cc_exp_year")
	private WebElement enterexpyear;
	@FindBy(id="cc_cvv")
	private WebElement entercvv;
	@FindBy(id="book_now")
	private WebElement entersearch;
	@FindBy(xpath="(//input[@type='text'])[16]")
	private WebElement enterorder;
	public WebElement getnewuser() {
		return newuser;
	}
	public WebElement getenterusername() {
		return enterusername;
	}
	public WebElement getenterpass() {
		return enterpass;
	}
	public WebElement getenterconpass() {
		return enterconpass;
	}

	public WebElement getenterfulname() {
		return enterfulname;
	}
	public WebElement getenteremail() {
		return enteremail;
	}
	public WebElement getbtncheck() {
		return btncheck;
	}
	public WebElement getsubmit() {
		return submit;
	}
	public WebElement getclicklogin() {
		return clicklogin;
	}
	public WebElement getlogin() {
		return login;
	}
	public WebElement getlocation() {
		return location;
	}
	public WebElement gethotel() {
		return hotel;
	}
	public WebElement getroom() {
		return room;
	}
	public WebElement getno() {
		return no;
	}
	public WebElement getSubmit() {
		return submit2;
	}
	public WebElement getradio() {
		return radio;
	}
	public WebElement getcontinue() {
		return continu;
	}
	public WebElement getfrstname() {
		return frstname;
	}
	public WebElement getlastname() {
		return lastname;
	}
	public WebElement getaddress() {
		return address;
	}
	public WebElement getcard() {
		return card;
	}
	public WebElement getentertype() {
		return entertype;
	}
	public WebElement getenterexpmonth() {
		return enterexpmonth;
	}
	public WebElement getenterexpyear() {
		return enterexpyear;
	}
	public WebElement getentercvv() {
		return entercvv;
	}
	public WebElement getentersearch() {
		return entersearch;
	}
	public WebElement getenterorder() {
		return enterorder;
	}
}
