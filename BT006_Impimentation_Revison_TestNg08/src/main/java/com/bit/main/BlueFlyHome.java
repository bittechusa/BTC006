package com.bit.main;

import java.sql.Array;
import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlueFlyHome {
	
	WebDriver dr;
	
	public BlueFlyHome(WebDriver dr){
		
		this.dr = dr;
		
	}
	
	public String b []= {"Designers","Women","Shoes","Handbags & Accessories",
			"Jewelry","Beauty","Men","Kids","Home","Clearance"};
	
	public ArrayList arrangeArrayList (){
		ArrayList menugiven = new ArrayList();
		for (int h=0;h<b.length;h++){
			menugiven.add(b[h]);
			
		}	
	return menugiven;	
	}
	
	public ArrayList getMenuName(){
		
		ArrayList menulisted = new ArrayList();
		
		for (int i=1;i<b.length+1;i++){
			String menuname =dr.findElement(By.xpath("html/body/div[1]/header/div/nav/ul/li["+i+"]/a")).getText();
			menulisted.add(menuname);	
			}
			

	return menulisted;	
	}
	
		
	
	
	public void matchTestResult (){
		ArrayList l1= getMenuName();
		ArrayList l2= arrangeArrayList();
		
		for (int i=0;i<b.length;i++){
			if(l2.get(i).equals(l1.get(i))){
				System.out.println("Menu given as "+ l2.get(i)+ "matches with menu from the web"+l1.get(i));
			}
			else{ System.out.println("Menu did't match as given");
			System.out.println(l2.get(i));
			System.out.println(l1.get(i));
			
		}
		
		
		
	}
	}

}