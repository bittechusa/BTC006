package com.Loop;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Loop.LoopAndArrayPractic;



@Test
public class CheckMenue 
{
	
	LoopAndArrayPractic aa = new LoopAndArrayPractic();
	
	public void compiare(String x,List<WebElement> ele)
	{
		aa.getActualValue();
		aa.getExpectedValue();
		for(int i = 0;i<ele.size();i++)
		{
			ele.get(i).getText().equals(x);
		}
	}
		

}
