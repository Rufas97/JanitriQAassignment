package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginUisngRandomCredentials extends BaseTest {

	@Test
	public void loginUisngRandomCredentials() throws InterruptedException
	{
		LoginPage loginPage =  PageFactory.initElements(driver,LoginPage.class);
		
        Thread.sleep(3000);
		
		loginPage.useridInput("Janatri1234");
		
		loginPage.passwordInput("Janatri@1234");
		
		loginPage.loginButton();
		
		Thread.sleep(3000);
		
		Assert.assertEquals(loginPage.errorMessage(), "Invalid Credentials");
		
		System.out.println( "Error message is :" +loginPage.errorMessage());
		
	}
	
}
