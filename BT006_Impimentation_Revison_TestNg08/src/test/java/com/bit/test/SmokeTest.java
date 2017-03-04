package com.bit.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.bit.main.HomePage;
import com.bit.support.Shared;

public class SmokeTest extends BaseTest {
	
	
	
	Shared sh;
	HomePage hp;
	@Test
	public void test1 () throws InterruptedException{
		hp = new HomePage (dr);
		hp.dateMenu();
		hp.scrollToClick();
		hp.rightClickElement();Thread.sleep(4000);
		hp.reverseText();
	}
	
	

}
