package com.bit.test;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest 
{
	WebDriver driver;
	Logger log=Logger.getLogger(BaseTest.class);
	@BeforeMethod
	public void openBrowser()
	{
		DOMConfigurator.configure("log4j.xml");
		System.setProperty("webdriver.gecko.driver", "/Users/Ashan/Downloads/geckodriver");
		 
		  driver = new FirefoxDriver();
		  log.info("opened firefox browser");
		  driver.get("http://www.target.com");
		  log.info("nevigate to url");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
	}
	@AfterMethod
	public void close()
	{
		driver.quit();
		log.info("browser closed");
	}
	

}
