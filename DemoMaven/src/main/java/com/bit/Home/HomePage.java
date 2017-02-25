package com.bit.Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bit.support.Shared;

public class HomePage 
{
	public WebDriver driver;
	Shared share;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		share=new Shared(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=".//*[@id='js-toggleLeftNavLg']")
	WebElement catagoryMenu;
	@FindBy(xpath=".//*[@id='5xtd3']/a")
	WebElement clothinSubmenu;
	
	
	
	public void clickOnCatagorymenu()
	{
		share.click(catagoryMenu);
		
	}
	public ClothingPage clickOnClothingSubmenu()
	{
		share.click(clothinSubmenu);
		return new ClothingPage(driver);
		
	}
	
	
	

}
