package com.bit.support;




import java.sql.Array;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shared {
	
	public WebDriver dr;
	
	public Shared (WebDriver dr2)
	{
		this.dr = dr2;
	}
	
	public void waitForElement(WebElement ele){
		WebDriverWait wait = new WebDriverWait(dr,20);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public List<WebElement> dropeDownMenu (WebElement ele, int date){
		
		Select dd = new Select(ele);
		waitForElement(ele);
		List<WebElement> list = dd.getAllSelectedOptions();
		
		//System.out.println(n);
		dd.selectByIndex(date);
		return list;
	}
	public void click (WebElement element){
		element.click();
		Actions a = new Actions(dr);
		a.moveToElement(element).perform();
		
		//scrollDown();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void scrollDown (){
		
		((JavascriptExecutor)dr).executeScript("scroll (1,-25);)");
		
	}
	public String getText (WebElement ele){
		return ele.getText();
	}
	public void rightClick (WebElement ele){
		Actions a = new Actions(dr);
		a.contextClick(ele).build().perform();
		
	}
	
	
/*	public WebElement findElement (WebElement ele){
	
	return ele;
	}
	*/

}
