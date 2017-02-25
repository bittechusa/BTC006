package com.bit.test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class BaseTest {
	
	public WebDriver dr;
	public String givenURL ="http://www.facebook.com";
	
	@Parameters("browser")
	@BeforeMethod
	public void openBrowser(String browser){
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","/Users/Ashan/Downloads/chromedriver");
			
			dr = new ChromeDriver ();	
		}
		else if (browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gekodriver.driver","/Users/Ashan/Downloads/chromedriver");
			dr = new FirefoxDriver();
		}
		/*else if (browser.equalsIgnoreCase("safari")){
			System.setProperty("webdriver.safari.noinstall", "true"); 
			dr = new SafariDriver();
			
		}*/
		dr.manage().window().maximize();
		dr.get(givenURL);
		dr.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}

	@AfterMethod
	public void closeBrowser (){
		
		dr.quit();
		
	}


}
