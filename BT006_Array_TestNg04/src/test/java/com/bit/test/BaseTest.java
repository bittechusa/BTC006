package com.bit.test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
FirefoxDriver dr;
	

	
	
	@BeforeMethod 
	 public void openpage() throws InterruptedException{
		 
		 dr = new FirefoxDriver ();
		 dr.manage().window().maximize();
		 dr.get("http://www1.macys.com/");
		 Thread.sleep(3000);
		
		 
	 }
	@AfterMethod
	public void closepage (){
		dr.quit();
		
	}

}
