package com.weather.Test;



import java.util.Arrays;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WeatherTest 
{
	String s2 = "Bangladesh ";
	
	WebDriver dr;
	
	@Test
	public void macys() throws InterruptedException
	{
		 dr = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:/Users/moin/Downloads/geckodriver.exe");
		//dr.get("www.forecast.io");
		
		dr.get("http://www.macys.com/");
		for (int i =0;i<1;i ++)
		{
		Actions a = new Actions (dr);
		a.moveToElement(dr.findElement(By.xpath("//div[@id='globalMastheadCategoryMenu']/ul[1]/li[1]"))).click();
		//dr.findElement(By.xpath("//div[@id='globalMastheadCategoryMenu']/ul[1]/li[1]")).click();
		Thread.sleep(3000);
		dr.quit();
		}
		
	}
	
	
	@Test
	public void weather()
	{
		 dr = new FirefoxDriver();
		//System.setProperty("webdriver.gecko.driver", "C:/Users/moin/Downloads/geckodriver.exe");
		dr.get("http://www.forcast.io/");
		String text =dr.findElement(By.xpath("")).getText();
		System.out.println(text);
		String s =text.replace("", "");
		
				
		
	}
	
	
	@Test
	public void enhancedLoop()
	{
		int a[] =new int[5];
		a[0]=1;
		a[1]=3;
		a[2]=5;
		a[3]=19;
		a[4]=11;
		for(int x:a)
		{
			System.out.println(x);
		}
		
		int max =a[0];
		for(int i =1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			System.out.println(max);
		}
		
		
		
		//last to first
		for(int i = a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
		
		int aa[]={1,2,3,5,6,7};
		int bb[]=new int [aa.length] ;
		int m = aa[0];
		
		for(int i=0;i<aa.length;i++)
		{
			bb[i]=aa[i];
			
			
			System.out.println(bb);
		}
	}
	@Test
	public void maxNumber()
	{
		int a[] ={2,4,6,7,9,21,32};
		int max =a[0];
			for(int i = 1;i<a.length;i++)
			{
				if(a[i]>max)
				{
					max = a[i];
					
				}
			}
			//Arrays.sort(a);
			System.out.println(max);
			
	}
	
	
	
		
}
