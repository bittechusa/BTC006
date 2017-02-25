package com.Loop.doubledimention;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.NotConnectedException;
import org.testng.annotations.Test;

public class ExceptionTest 
{
	
	
	//Arithmetic exception
	//No such element exception
	//no matter try pass or fail finally block will always execute
	
	
	FirefoxDriver dr = new FirefoxDriver();
	@Test
	public void m1() throws FileNotFoundException, NotConnectedException
	{
		try{
		System.out.println(10/0);
		System.setProperty("webdriver.gecko.driver", "C:/Users/moin/Downloads/geckodriver.exe");
		dr.get("https://www.facebook.com/");
		dr.findElement(By.xpath("email")).sendKeys("moin");
		dr.findElement(By.xpath("sdfgh")).click();
		//FileInputStream f =new FileInputStream(new File("log.xml"));
		
		
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("it will throws an exception");
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch(NoSuchElementException e)
		{
			System.out.println("it will throws an exception");
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		/*finally
		{
			System.out.println("always run");
		}*/
		System.out.println("hi");
	}
	

}
