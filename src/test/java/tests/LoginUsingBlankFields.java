package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginUsingBlankFields  extends BaseTest{
	
	@Test
	public void LoginUsingBlankFieldsTest() throws InterruptedException
	{
		LoginPage loginPage =  PageFactory.initElements(driver,LoginPage.class);
		
		Thread.sleep(6000);
		
		loginPage.useridInput("");
		
		loginPage.passwordInput("");
		
		loginPage.loginButton();
		
		Thread.sleep(3000);
		
		Assert.assertEquals(loginPage.errorMessage(), "Invalid Credentials");
		
		System.out.println( "Error message is :" +loginPage.errorMessage());
		
		
		
		
	}
	

	
	
	
}
