package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class ValidatePresneceOfPageElements extends BaseTest {

	@Test
	public void validatePageElements()
	{
		LoginPage loginPage =  PageFactory.initElements(driver,LoginPage.class);
	    
		Assert.assertEquals(driver.getTitle(), "Janitri");
		System.out.println("Title of the page : "+ driver.getTitle());
		
		Assert.assertEquals(loginPage.isDisplayeduseridInput(), "UserId Inputbox is visible");  ;
		Assert.assertEquals(loginPage.isDisplayedpasswordInput(), "Password Inputbox is visible");  ;
		Assert.assertEquals(loginPage.isDisplayedpasswordvisibilitytoggleEyeIcon(), "Password Toggle Eye icon is visible");  ;
		Assert.assertEquals(loginPage.isDisplayedloginButton(), "Login button is visible");  ;
		
		
	}
	
}
