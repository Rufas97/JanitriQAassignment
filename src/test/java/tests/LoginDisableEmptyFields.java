package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginDisableEmptyFields extends BaseTest {

	
	@Test
	public void loginDisableEmptyFields() throws InterruptedException
	{
		LoginPage loginPage =  PageFactory.initElements(driver,LoginPage.class);
		    
			loginPage.useridInput("");
		
			loginPage.passwordInput("");
		
		  Assert.assertFalse(loginPage.loginButtonEnabled());
	}
	
}
