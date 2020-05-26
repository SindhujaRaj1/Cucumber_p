package com.org.step;

import java.util.Set;

import com.org.blaunch.B_Launch;
import com.org.xpath.Login;
import com.org.xpath.Register;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends B_Launch {
	B_Launch b;
	Register r;
	Login l;
	
	@Given("^nakuri home page$")
	public void nakuri_home_page() throws Throwable {
		BLaunch("chrome");
	    r=new Register();
	    Thread.sleep(3000);
	    r.getNotif().click();
	    Thread.sleep(3000);
	    r.getCooki().click();
	}


	@When("^Enter Details$")
	public void enter_details() throws Throwable {
	  r.getReg().click();
	  Thread.sleep(3000);
	  r.getExp().click();
	  Thread.sleep(3000);
	  r.setTextfname("Janaki");
	  r.setTextemail("Janaki2121@gmail.com");
	  r.setTextpass("Janaki2121");
	  r.setTextnum("9666655555");
	  r.getTextexpyr().click();
	  r.getTextyr().click();
	  r.getTextexpmth().click();
	  r.getTextmth().click();
	
	 
	  
	}

	@Then("^submit$")
	public void submit() throws Throwable {
		 Thread.sleep(50000);
		  r.getSubmit().click();
	}
	
	@When("^Enter uname and pword$")
	public void enter_uname_and_pword() throws Throwable {
	    l=new Login();
	    l.getLogin().click();
	    Thread.sleep(3000);
	    l.setLuname("Janaki2121@gmail.com");
	    l.setLpass("Janaki2121");
	   
	}

	@Then("^Login$")
	public void login() throws Throwable {
	    l.getLog().click();
	    Thread.sleep(3000);
	  
	}


}
