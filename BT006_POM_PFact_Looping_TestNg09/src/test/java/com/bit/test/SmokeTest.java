package com.bit.test;

import org.testng.annotations.Test;

import com.bit.main.HomePage;
import com.bit.support.Shared;

public class SmokeTest extends BaseTest {
	HomePage hp;
	Shared sh;
	String user ="akashanii";
	String pass ="shani3412";
	
	@Test
	public void tes1 (){
		hp = new HomePage(dr);
		//hp.signUpForNewAccount();
		//hp.typeLastName();
		//hp.typeFirstName();
		//hp.typeUserName();
		//hp.typePassWord();
		//hp.typePhoneNo();
		//hp.selectFromDrop1();
		//hp.selectFromDrop2();
		//hp.selectFromDrop3();
		//hp.pickUser_PassWord_signinFB(user, pass);
		
		
	}
	

}
