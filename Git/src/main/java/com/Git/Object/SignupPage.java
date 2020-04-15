package com.Git.Object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Git.Base.BaseTest;

public class SignupPage extends BaseTest {

	public SignupPage() {
		PageFactory.initElements(driver, this);
	}

	// PageFcatory Elements

	@FindBy(xpath = "//input[@id='user[login]")
	WebElement Username_txtBox;
	@FindBy(xpath = "//a[@href='/login']")
	WebElement Signin_button;
	@FindBy(xpath = "//a[@class='mr-4']")
	WebElement Git_Logo;

	// Actions
	//finding the driver page title
	public String Signup_Page_Title() {
		return driver.getTitle();
	}
     //finding the SignIN button and clicking
	public LoginPage Click_On_SignIn() {
		Signin_button.click();
		return new LoginPage();
	}
    //Checking the git_logo
	public boolean Git_Logo() {
		return Git_Logo.isDisplayed();
	}

}