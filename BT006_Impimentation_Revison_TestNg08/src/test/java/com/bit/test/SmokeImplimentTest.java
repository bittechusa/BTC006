package com.bit.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class SmokeImplimentTest {
	
	
	public WebDriver dr;
	 BaseImplimentTest bit = new BaseImplimentTest();
	
	
	@Test
	public void openBrowser (){
	
	
		bit.getDriver().get("http://www.facebook.com");
		//dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void openBrowser2 (){
		bit.startBrowser().get("http://www.googel.com");
	}
	

}
