package com.bit.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Shared extends BaseTest {
	
	public FirefoxDriver dr;
	
	Shared (FirefoxDriver dr){
		this.dr = dr;
		
	
		

	}
	
	public void menuloop(String b[],List<WebElement> ele){
		System.out.println(ele.size());
		for (int i = 0;i<ele.size(); i++){
			System.out.println(ele.get(i).getText());
		Assert.assertTrue(ele.get(i).getText().equals(b[i]));
		System.out.println(b[i]);
		
			 
		}
		
	}
 	public  List<WebElement> allelements(){
 		
		
		 
		 List<WebElement> ele = dr.findElements(By.xpath(".//*[@id='globalMastheadCategoryMenu']/ul/li"));
		 
	 return ele;
 }
 	
}
