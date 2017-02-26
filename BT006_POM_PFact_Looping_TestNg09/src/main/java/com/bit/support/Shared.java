package com.bit.support;

import java.util.concurrent.TimeUnit;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bit.main.HomePage;

public class Shared //extends LoadableComponent {
{	
	//Logger log=Logger.getLogger(Shared.class);
	public WebDriver dr;
	HomePage hp;
	public Shared(WebDriver dr)
	{
		this.dr=dr;
		hp = new HomePage(dr);
	}
	
	public WebElement action(WebElement element){
		return waitForElement(element);
	}
		
/*		try {waitForElement(element);
		
		}
		catch (Exception e){
			
		}
		finally {
			return element;
		}
	}*/
	
	public void verifyUrl (String url){
		
	Assert.assertTrue(url.equals(dr.getCurrentUrl()));
		
		
	}
	public WebElement waitForElement (WebElement element){
		
		WebDriverWait wait = new WebDriverWait(dr, 20);
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
/*
	@Override
	protected void isLoaded() throws Error {
		dr.get("");
		
	}

	@Override
	protected void load() {
		verifyUrl("");
		
	}
	public void select(WebElement element,String selected){
		
		Select s = new Select(element);
		s.selectByVisibleText(selected);
	}*/
/*	public void loginFcaebook (WebElement eleemail,WebElement elepass,WebElement button,String user,String password){
		
		dr.get("http://www.facebook.com");
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action(eleemail).sendKeys(user);
		action(elepass).sendKeys(password);
		action(button).click();
		
		
	}
	*/
	
	
	
	
}


	
