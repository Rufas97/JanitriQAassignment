package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class LoginPage extends BaseTest {

	@FindBy(xpath="//input[@id='formEmail']")
	WebElement useridInput;
	
	@FindBy(xpath="//input[@id='formPassword']")
	WebElement passwordInput;
	
	@FindBy(xpath="//button[text()='Log In']")
	WebElement loginButton;
	
	@FindBy(xpath="//div/input[@id='formPassword']/following::img[1]")
	WebElement passwordvisibilitytoggleEyeIcon;
	
	@FindBy(xpath="//p[text()='Invalid Credentials']")
	WebElement errorMessage;
	
	
	public void useridInput(String usename)
	{
		useridInput.sendKeys(usename);
	}
	public void passwordInput(String password)
	{
		passwordInput.sendKeys(password);
	}
	public void loginButton()
	{
		loginButton.click();
	}
	public void passwordvisibilitytoggleEyeIcon()
	{
		passwordvisibilitytoggleEyeIcon.click();
	}
	
	public String errorMessage()
	{
		return errorMessage.getText();
	}
	public boolean loginButtonEnabled()
	{
		return  loginButton.equals(null);
	}
	public String  passwordInputText()
	{
		return passwordInput.getAttribute("value");
	}

	
	
	public boolean isDisplayeduseridInput()
	{
		return useridInput.isDisplayed();
	}
	
	public boolean isDisplayedpasswordInput()
	{
		return passwordInput.isDisplayed() ;
	}
	
	public boolean isDisplayedloginButton()
	{
		return loginButton.isDisplayed();
	}
	public boolean isDisplayedpasswordvisibilitytoggleEyeIcon()
	{
		return passwordvisibilitytoggleEyeIcon.isDisplayed();
	}
	
}
