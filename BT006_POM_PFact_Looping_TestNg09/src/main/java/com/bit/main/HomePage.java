package com.bit.main;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.bit.support.DBank;
import com.bit.support.Shared;

public class HomePage {
	WebDriver dr;
	Shared sh;
	DBank db = new DBank();
	public String url ="";
	public HomePage(WebDriver dr) {
		this.dr= dr;
		sh = new Shared(dr);
		//PageFactory.initElements(dr, this);
	}
/*	@FindBy(xpath="html/body/div[1]/main/div/div[1]/div[1]/div[1]/div[2]/div[4]/a")
	WebElement eleSingUp;
	@FindBy(xpath="html/body/div[1]/div[2]/div/div/form/fieldset/div/div[2]/input")
	WebElement eleLast;
	@FindBy(xpath="html/body/div[1]/div[2]/div/div/form/fieldset/div/div[1]/input")
	WebElement eleFirst;
	@FindBy(xpath="html/body/div[1]/div[2]/div/div/form/div[1]/div[1]/input")
	WebElement eleUser;
	@FindBy(xpath="html/body/div[1]/div[2]/div/div/form/div[2]/input[1]")
	WebElement elePass;
	@FindBy(xpath="html/body/div[1]/div[2]/div/div/form/div[3]/div[3]/input")
	WebElement elePhone;
	@FindBy(xpath="html/body/div[1]/div[2]/div/div/form/div[4]/div[1]/select")
	WebElement eleMonth;
	@FindBy(xpath="html/body/div[1]/div[2]/div/div/form/div[4]/div[2]/select")
	WebElement eleDate;
	@FindBy(xpath="html/body/div[1]/div[2]/div/div/form/div[4]/div[3]/select")
	WebElement eleYear;*/
	@FindBy(id="email")
	WebElement eleemail;
	@FindBy(id="pass")
	WebElement elepass;
	@FindBy(id="u_0_q")
	WebElement button;
	

/*	public void signUpForNewAccount (){
		sh.action(eleSingUp).click();
	}
	public void typeLastName (){
		sh.action(eleLast).sendKeys("Razor");
		
	}
	public void typeFirstName (){
		sh.action(eleFirst).sendKeys("shanii");
	}
	public void typeUserName (){
		sh.action(eleUser).sendKeys("user");
	
	}
	public void typePassWord (){
		sh.action(elePass).sendKeys("pass");
	
	}
	public void typePhoneNo (){
		sh.action(elePhone).sendKeys("2096249592");
	}
	public void selectFromDrop1(){
		sh.select(eleMonth, "January");
		
	}
	public void selectFromDrop2(){
		sh.select(eleDate, "24");
		
	}
	public void selectFromDrop3(){
		sh.select(eleYear, "1996");
		
	}*/
	
	/*public  void pickUser_PassWord_signinFB(String user,String pass){
		String [][]a =db.array;
		
		for (int i=0;i<a.length;i++){
			if(a[i][0].equals(user)){ 
				for(int j=0;j<a.length;j++){
					if(a[j][1].equals(pass)){
						sh.loginFcaebook(eleemail, elepass, button, a[i][0], a[j][1]);
						System.out.println(a[i][0]);
						System.out.println(a[j][1]);
					}
					else{
						continue;
					}   }	}else{
						continue;}	
					}
	}*/
	

}
