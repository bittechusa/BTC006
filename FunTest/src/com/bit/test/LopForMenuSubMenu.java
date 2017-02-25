package com.bit.test;

import org.junit.Test;

public class LopForMenuSubMenu 
{
	@Test
	public void test2()
	{
		
		for(int menu =1; menu<=5; menu++)
		{
			System.out.println("menu"+ menu);
			for(int submenu=1; submenu<=6; submenu++ )
			{
				System.out.println(submenu + "submenu");
			}		
		
		}
		
	}
	@Test
	public void test3()
	{
		
		for(int menu =5; menu>=1; menu--)
		{
			System.out.println("menu"+ menu);
			for(int submenu=6; submenu>=1; submenu--)
			{
				System.out.println(submenu + "submenu");
			}		
		
		}
		
		
	}
	


}
