package com.bit.support;

import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bit.test.BaseTest;

public class Shared 
{
	Logger log=Logger.getLogger(Shared.class);
	public WebDriver driver;
	public Shared(WebDriver driver)
	{
		this.driver=driver;
	}
	public boolean verifyUrl(String url)
	{
		return driver.getCurrentUrl().equals(url);
	}
	public WebElement waitForElement(WebElement element)
	{
		WebDriverWait wait =new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}
	public void click(WebElement element)
	{
		try
		{
			waitForElement(element).click();
			log.info("element clicked");
			//element.click();
		}catch(NoSuchElementException e)
		{
			log.error("element not found");
		}
	}
	public void type(WebElement element,String text)
	{
		try
		{
			waitForElement(element).sendKeys(text);;
			//element.click();
		}catch(NoSuchElementException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
