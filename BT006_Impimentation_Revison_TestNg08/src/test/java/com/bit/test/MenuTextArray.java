package com.bit.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bit.main.BlueFlyHome;

public class MenuTextArray {
	
	WebDriver dr;
	
	
	@BeforeClass
	public void openBrower(){
		dr = new FirefoxDriver();
		dr.get("http://www.bluefly.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		
	}
	
	@Test
	public void compaireMenu(){
		BlueFlyHome bf = new BlueFlyHome(dr);
		bf.matchTestResult();
		
	}
	@AfterClass
	public void closeBrowser(){
		dr.close();
		
	}

}
