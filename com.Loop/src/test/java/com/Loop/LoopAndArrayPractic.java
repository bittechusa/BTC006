package com.Loop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoopAndArrayPractic 
{
	
	@Test
	public void loopTest()
	{
		for(int menu = 0;menu<=4;System.out.println(menu))
		{
			
			menu++;
		
		for(int submenu = 5;submenu>1;submenu --)
		
		{
			System.out.println("submenu");
		
		}
		}
		
	}
		
		
		
		 WebDriver dr;
	public static String expectedValue[]={"menue","men","women","kids"};
	
	public  String[] x = new String[5];
		public List <WebElement> getExpectedValue()
		{
		
			
			return dr.findElements(By.xpath(""));
		}	
		
		
	public String[] getActualValue()
		{
			
			List<WebElement> ele=dr.findElements(By.xpath(""));
			for(int i = 0;i<ele.size();i++)
			{
				x[i]=ele.get(i).getText();
			}
			return x;
		
		}
	
	
	@Test
	public void mm()
	{
		int a[] ={2,3};
		try
		{
			a[2]=a[0]+a[1];
			System.out.println(1);
		}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(1);
			}
			catch(Exception ee)
			{
			System.out.println(2);	
			}
			finally
			{
				System.out.println(3);
			}
			System.out.println(4);
		}
	
		
	
	@Test
	public void m4()
	{
		for(int i = 0;i<3;i++)
		{
			for(int j=3;j>=0;j--)
			{
				if(i==j)//if condition match that loop cycle will skip because of "continue"
				{
					continue;
					//break;//if condition match 2nd loop cycle will skip because of "break"
				}
				System.out.println(i+" "+j);
			}
		}
	}
	
	public void hashCodeValue()
	{
		String s="hello";
		String s1 = new String("hello");
	}
	
	
	
		
		
		
		
		
	}




