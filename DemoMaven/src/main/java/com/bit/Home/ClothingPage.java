package com.bit.Home;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.bit.support.Shared;
import com.bit.women.WomenPage;

public class ClothingPage extends LoadableComponent<ClothingPage>
{
	public WebDriver driver;
	Shared share;
	public ClothingPage(WebDriver driver)
	{
		this.driver=driver;
		share=new Shared(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=".//*[@id='COMPONENT-73362']/ul/li[1]/a/figure/img")
	WebElement firstProductMenu;
	public WomenPage clickOnWomenMenu()
	{
		share.click(firstProductMenu);
		return new WomenPage(driver);
	}
	@Override
	protected void load() {
		// TODO Auto-generated method stub
		driver.get("http://www.target.com/c/clothing/-/N-5xtd3");
	}
	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		Assert.assertTrue(driver.getCurrentUrl().equals("http://www.target.com/c/clothing/-/N-5xtd3"));
	}
	

}
