package com.bit.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	
	public WebDriver dr;
	
	
	@BeforeMethod
	public void openBrowser (){
		dr = new FirefoxDriver ();
		dr.get("http://www.facebook.com");
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeBrowser ()
	{
		dr.quit();
	}
	

}
