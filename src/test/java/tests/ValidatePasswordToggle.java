package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class ValidatePasswordToggle extends BaseTest {

	@Test
	public void testPasswordMaskedbutton() throws InterruptedException
	{
		LoginPage loginPage =  PageFactory.initElements(driver,LoginPage.class);
		
		Thread.sleep(3000);
		
		loginPage.passwordInput("Janitri@123");
		    
		loginPage.passwordvisibilitytoggleEyeIcon();
		
		 Assert.assertEquals( loginPage.passwordInputText(), "Janitri@123");
		 
		System.out.println("Password text :" +loginPage.passwordInputText());
		
		
	}
}
