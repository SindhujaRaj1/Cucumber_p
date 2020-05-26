package com.org.xpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.blaunch.B_Launch;

public class Register extends B_Launch{
 public Register(){
	 PageFactory.initElements(driver, this);
 }
 @FindBy(xpath="//span[@id='block']")
 private WebElement notif;
 @FindBy(xpath="//button[text()='GOT IT']")
 private WebElement cooki; 
 @FindBy(xpath="//div[@class='wdgt-register-upload-btn']//div[@class='wdgt-register-btn']")
 private WebElement Reg; 
 @FindBy(xpath="//form[@name='bifurcation']//div//div[2]//button[@value='exp']")
 private WebElement exp; 
 @FindBy(xpath="//input[@name='fname']")
 private WebElement textfname;
 @FindBy(xpath="//input[@name='email']")
 private WebElement textemail;
 @FindBy(xpath="//input[@name='password']")
 private WebElement textpass;
 @FindBy(xpath="//input[@name='number']")
 private WebElement textnum;
 @FindBy(xpath="//input[@name='expYear']")
 private WebElement textexpyr;
 
 @FindBy(xpath="//li[@ng-repeat-done-notification='4']")
 private WebElement textyr;
 @FindBy(xpath="//input[@name='expMonth']")
 private WebElement textexpmth;
 @FindBy(xpath="//li[@ng-repeat-done-notification='1']")
 private WebElement textmth;
 @FindBy(xpath="//input[@name='uploadCV']")
 private WebElement upload;
 @FindBy(xpath="//button[@name='basicDetailSubmit']")
 private WebElement submit;
 

 public WebElement getSubmit() {
	return submit;
}
public void setSubmit(WebElement submit) {
	this.submit = submit;
}
public WebElement getUpload() {
	return upload;
}
public void setUpload(WebElement upload) {
	this.upload = upload;
}
public WebElement getTextyr() {
	return textyr;
}
public void setTextyr(WebElement textyr) {
	this.textyr = textyr;
}
public WebElement getTextexpmth() {
	return textexpmth;
}
public void setTextexpmth(WebElement textexpmth) {
	this.textexpmth = textexpmth;
}
public WebElement getTextmth() {
	return textmth;
}
public void setTextmth(WebElement textmth) {
	this.textmth = textmth;
}

public WebElement getTextfname() {
	return textfname;
}
public void setTextfname(String textfname) {
	this.textfname.sendKeys(textfname);
}
public WebElement getTextemail() {
	return textemail;
}
public void setTextemail(String textemail) {
	this.textemail.sendKeys(textemail);
}
public WebElement getTextpass() {
	return textpass;
}
public void setTextpass(String textpass) {
	this.textpass.sendKeys(textpass);
}
public WebElement getTextnum() {
	return textnum;
}
public void setTextnum(String textnum) {
	this.textnum.sendKeys(textnum);
}
public WebElement getTextexpyr() {
	return textexpyr;
}
public void setTextexpyr(WebElement textexpyr) {
	this.textexpyr = textexpyr;
}
public WebElement getExp() {
	return exp;
}
public void setExp(WebElement exp) {
	this.exp = exp;
}
public WebElement getReg() {
	return Reg;
}
public void setReg(WebElement reg) {
	Reg = reg;
}
public WebElement getCooki() {
	return cooki;
}
public void setCooki(WebElement cooki) {
	this.cooki = cooki;
}
public WebElement getNotif() {
	return notif;
}
public void setNotif(WebElement notif) {
	this.notif = notif;
}
 
 
}
