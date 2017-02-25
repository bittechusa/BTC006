package com.bit.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bit.support.Shared;

public class HomePage {
	
	public WebDriver dr;
	Shared sh;
	String username="akashanii";
	String userpass="shani3412";
	public HomePage(WebDriver dr){
		
		this.dr =dr;
		sh = new Shared (dr);
	}
	public void test(){
		sh.user_passSelector(username, userpass);
		
	}
	
	public void fbSinginTypeUser (){
		sh.action(dr.findElement(By.id("email"))).clear();
		sh.action(dr.findElement(By.id("email"))).sendKeys("shan");
	}
	
	public void fbSinginTypePass (){
		sh.action(dr.findElement(By.id("pass"))).sendKeys("fas662");
	}
	
	public void fbSinginButton (){
		sh.action(dr.findElement(By.id("u_0_q"))).click();
	}
	

}
