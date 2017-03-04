package com.bit.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bit.support.Shared;

public class HomePage {
	
	public WebDriver dr;
	Shared sh;

	
	public HomePage (WebDriver dr)
	{
		this.dr = dr;
		sh =new Shared (dr);
		PageFactory.initElements(dr, this);
	}
	@FindBy(xpath ="html/body/div[1]/div[2]/div[1]/div/div/div/div/div[2]"
	+ "/div[2]/div/div/div/div[1]/form/div[1]/div[6]/div[2]/span/span/select[2]")WebElement ele1;
	@FindBy(xpath ="html/body/div[1]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/"
	+ "div/div/div/div[1]/form/div[1]/div[6]/div[2]/span/span/select[3]")WebElement ele2;
	@FindBy(xpath ="html/body/div[1]/div[2]/div[1]/div/div/div/div/div[2]/div[1]")WebElement ele3;
	
	
	public void dateMenu ()
	{
		sh.dropeDownMenu(ele1,25);
	}
	
	public void scrollToClick (){
		sh.click(ele2);
		
		
	}
	public void rightClickElement (){
		sh.rightClick(ele3);
	}
	public void reverseText (){
		String text = sh.getText(ele3);
		 String b = new StringBuffer(text).reverse().toString(); 
		 System.out.println(b);
	}
}
