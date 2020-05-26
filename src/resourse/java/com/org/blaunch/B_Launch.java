package com.org.blaunch;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.org.xpath.Register;

public class B_Launch {
	
   public static WebDriver driver;
	public static WebDriver BLaunch(String browser) throws InterruptedException
	{   if(browser.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver_win32/chromedriver.exe");
	    driver= new ChromeDriver();
	        }
	else if(browser.equals("firefox")){
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/geckodriver.exe");
	    driver= new FirefoxDriver();
	}
	else{
		System.out.println("Not into correct browser");
		}
	driver.get("https://www.naukri.com/");
	
	Thread.sleep(3000);
	String parent=driver.getWindowHandle();
    Set<String> s=driver.getWindowHandles();
    Iterator<String> i=s.iterator();
    while(i.hasNext()){
    	String child=i.next();
    	if(!child.equals(parent)){
    		driver.switchTo().window(child);
    		driver.close();
    }
    }
    driver.switchTo().window(parent);
    driver.manage().window().maximize();
   
	return driver;
	}
}
