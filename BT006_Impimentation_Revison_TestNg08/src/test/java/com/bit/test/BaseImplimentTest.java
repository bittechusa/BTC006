package com.bit.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseImplimentTest {

private static FirefoxDriver dr;



public static FirefoxDriver getDriver (){
	dr = new FirefoxDriver ();
	//dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

return dr;	
}
 public FirefoxDriver startBrowser (){
	 
	 
	 return new FirefoxDriver();
 }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}