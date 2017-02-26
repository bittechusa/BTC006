package com.bit.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Main extends BaseTest  {
	
	
	
	Shared sh = new Shared (dr);
	Arrayy ar;

	@Test
	public void test1(){
		sh = new Shared (dr);
		ar = new  Arrayy();
		sh.menuloop(ar.menunames, sh.allelements());
		
		}
	
	
}
