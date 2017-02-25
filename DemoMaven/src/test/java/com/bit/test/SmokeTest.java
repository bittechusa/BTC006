package com.bit.test;

import org.testng.annotations.Test;

import com.bit.Home.ClothingPage;
import com.bit.Home.HomePage;
import com.bit.support.Shared;
import com.bit.women.WomenPage;

public class SmokeTest extends BaseTest{
	Shared share;
	HomePage homePage;
	ClothingPage cl;
	WomenPage wp;
	private String homeUrl="http://www.target.com/";
	@Test
	public void test1()
	{
		
		share=new Shared(driver);
		System.out.println(share.verifyUrl(homeUrl));
		homePage=new HomePage(driver);
		homePage.clickOnCatagorymenu();
		cl=homePage.clickOnClothingSubmenu().get();
		wp=cl.clickOnWomenMenu();
	}
}
