package com.bit.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	public WebDriver dr;
	
	
	
	@BeforeMethod
	public  void openBrowser (){
		dr = new FirefoxDriver();
		dr.get("http://www.googel.com");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
	}
	
	
	
	@AfterMethod
	public void closeBrowser (){
		dr.quit();
	}
}



