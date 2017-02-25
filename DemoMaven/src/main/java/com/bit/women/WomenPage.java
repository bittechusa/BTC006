package com.bit.women;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bit.support.Shared;
import com.bit.test.BaseTest;

public class WomenPage 
{
	public WebDriver driver;
	//Logger log=Logger.getLogger(WomenPage.this);
	Shared share;
	public WomenPage(WebDriver driver)
	{
		this.driver=driver;
		share=new Shared(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=".//*[@id='COMPONENT-73362']/ul/li[1]/a/figure/img")
	WebElement firstProductMenu;

}
