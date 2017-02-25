package com.bit.support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Shared {
	
	
	public WebDriver dr;
	DBank db = new DBank();
	
	public Shared(WebDriver dr){
		
		this.dr =dr;	
	}
	
	public WebElement action (WebElement element){
		
		return waitForElement(element);
	}
	public WebElement  waitForElement (WebElement element){
		
		WebDriverWait wait = new WebDriverWait(dr,15);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}
	
	public void user_passSelector (String username, String userpass){
		String a[][]=db.array;
		 for (int i=0;i<a.length;i++){
			 if(a[i][0].equals(username)){
				 for(int j=0;j<a.length;j++){
					 if(a[j][1].equals(userpass)){
						  String pass=a [j][1];
						  action(dr.findElement(By.id("pass"))).sendKeys(pass);
						  String user= a[i][0];
						  action(dr.findElement(By.id("email"))).sendKeys(user);
						  System.out.println(a [j][1]);
						  System.out.println(a [i][0]);
				break;	 }
					 else{
						 continue;
					 }
			 }
				 
			 }
			 else{
				 continue;
			 }
		 }
	
	
	}
}
