package com.Loop.doubledimention;

import org.testng.annotations.Test;

public class SmokeTest 
{
	
	
	@Test
	public void m1()
	{
		Animal[]a = new Animal[2];
		
		a[0]= new Dog();
		a[1]= new Cow();
		
		
		for(int i = 0;i<a.length;i++)
		{
			a[i].eat();
			
			//System.out.println(a);
		}
	}
}
