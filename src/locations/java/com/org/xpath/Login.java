package com.org.xpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.blaunch.B_Launch;

public class Login extends B_Launch {
	
	public Login(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[text()='Login']")
	 private WebElement Login;
	@FindBy(xpath="//input[@placeholder='Enter your active Email ID / Username']")
	private WebElement Luname;
	@FindBy(xpath="//form[@name='skip']")
	private WebElement skip;
	
	public WebElement getSkip() {
		return skip;
	}

	public void setSkip(WebElement skip) {
		this.skip = skip;
	}

	public WebElement getLuname() {
		return Luname;
	}

	public void setLuname(String luname) {
		this.Luname.sendKeys(luname);
	}

	public WebElement getLpass() {
		return Lpass;
	}

	public void setLpass(String lpass) {
		this.Lpass.sendKeys(lpass);
	}

	public WebElement getLog() {
		return Log;
	}

	public void setLog(WebElement log) {
		Log = log;
	}
	@FindBy(xpath="//input[@placeholder='Enter your password']")
	 public WebElement Lpass;
	@FindBy(xpath="//button[text()='Login']")
	 public WebElement Log;
	public WebElement getLogin() {
		return Login;
	}

	public void setLogin(WebElement login) {
		Login = login;
	}
}
