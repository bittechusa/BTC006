package com.bit.test;



import org.testng.annotations.Test;

import com.bit.main.HomePage;

public class SmokeTest extends BaseTest {
	
	HomePage hp;
	@Test
	public void paralalsininFB() throws InterruptedException{
		
		hp = new HomePage(dr);
		hp.test();
		Thread.sleep(5000);
		hp.fbSinginTypeUser();
		hp.fbSinginTypePass();
		hp.fbSinginButton();
		
	}

}
